import re;

import requests;
from bs4 import BeautifulSoup;

from service import btmovie_service as service;


def get_page(index):
    header = {
        "User-Agent":
            "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.75 Safari/537.36",
    }
    page_resp = requests.get("http://www.btbtdy.net/btfl/dy" + index + ".html", headers=header)
    return BeautifulSoup(page_resp.text, "html.parser")


def get_info(info_sub_url):
    header = {
        "User-Agent":
            "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.75 Safari/537.36",
    }
    movie_info = requests.get("http://www.btbtdy.net" + info_sub_url, headers=header)
    return BeautifulSoup(movie_info.text, "html.parser")

def gen_info(movie_arr,movie_type_arr,movie_poster_arr):
    movie_info_arr = []
    movie_index = 0

    movie_score_arr = []

    for item in movie_arr:
        if item.get("class") is None:
            movie_score_arr.append(item.next_sibling.string)
            movie_arr.remove(item)
    for item in movie_arr:

        movie_info_item = {}

        movie_info_item["movie_id"] = re.split("\.|/", item["href"])[2]
        movie_info_item["movie_name"] = item["title"]

        item_info = get_info(item["href"])
        info = item_info.find("div",class_="c05")
        movie_info_item["movie_detail"] = info.text
        # 获取电影类型
        movie_info_item["movie_type"] = \
            ",".join(re.split(" |,",movie_type_arr[movie_index].string))
        movie_info_item["movie_score"] = movie_score_arr[movie_index]
        movie_info_item["movie_poster"] = movie_poster_arr[movie_index].get("data-src")

        movie_index += 1
        # 获取主演
        starring_tag_arr = item_info.find_all("a",href = re.compile("^/search/.*$"))
        starring_arr = []
        for starring_item in starring_tag_arr:
            starring_arr.append(starring_item.text)
        movie_info_item["movie_starring"] = ",".join(starring_arr)
        # 获取下载地址
        bt_html = get_info("/vidlist/"+movie_info_item["movie_id"][2:]+".html")

        bt_arr = bt_html.find("a",href=re.compile("^magnet.*$"),class_="d1")
        movie_info_item["movie_bt"] = bt_arr.get("href")

        movie_info_arr.append(movie_info_item)

    return movie_info_arr
if __name__ == "__main__":
    for i in range(292):
        page = get_page(str(i))
        result = gen_info(page.find_all("a", href=re.compile(".*/btdy/.*")),
                          page.find_all("p",class_ = "des"),
                          page.find_all("img",attrs = {"data-src":re.compile("http://gif-china.cc/")},class_ = "lazy"))
        item_index = 1
        for info_item in result:
            service.insert_movie_info(info_item,"localhost", 3306, "root", "root", "BT_MOVIE")
            service.insert_movie_type(info_item,"localhost", 3306, "root", "root", "BT_MOVIE")
            print("第 {0} 页,第 {1} 条数据".format(i,item_index))
            item_index+=1



