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

if __name__ == "__main__":
    soup = get_page("1")

    movie_arr = soup.find_all("a", href=re.compile(".*/btdy/.*"))
    movie_info_arr = []

    for item in movie_arr:
        movie_info_item = {}

        # 获取评分
        if item.get("class") is None:
            movie_info_item["movie_score"] = item.next_sibling.string
        else:
            movie_info_item["movie_id"] = re.split("\.|/", item["href"])[2]
            movie_info_item["movie_name"] = item["title"]
            movie_info_item["movie_poster"] = item.contents[0].get("data-src")
            item_info = get_info(item["href"])
            info = item_info.find("div",class_="c05")
            movie_info_item["movie_detail"] = info
            movie_type = item_info.find("a",href=re.compile("^/screen/0-%.*$"))
            print(item_info.text)
            print(movie_type.text)
            bt_html = get_info("/downlist/"+movie_info_item["movie_id"][2:]+"-0-0.html")
            bt_arr = bt_html.find("a",href=re.compile("^thunder.*$"))
            movie_info_item["movie_bt"] = bt_arr.get("href")

        movie_info_arr.append(movie_info_item)


    print(movie_info_arr)

#get_info("/btdy/dy13279.html")
    #get_info("13279-0-0.html")

    db = service.connect("localhost", 3306, "root", "root", "BT_MOVIE")
