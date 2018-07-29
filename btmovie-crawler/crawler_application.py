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
    info_resp = movie_info = requests.get("http://www.btbtdy.net" + info_sub_url, headers=header)

if __name__ == "__main__":
    soup = get_page("1")

    movie_arr = soup.find_all("a", href=re.compile(".*/btdy/.*"))
    movie_info_arr = []

    for item in movie_arr:
        print(item)
        # movie_info_item = {
        #     "movie_id": re.split("\.|/", item["href"])[2],
        #     "movie_name": item["title"],
        #     "movie_poster": item.contents[0].get("data-src"),
        # }


    #get_info("/btdy/dy13279.html")
    #get_info("/downlist/13279-0-0.html")

    db = service.connect("localhost", 3306, "root", "root", "BT_MOVIE")
