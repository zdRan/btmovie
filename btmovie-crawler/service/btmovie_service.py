import pymysql.cursors

def insert_movie_info(info,host, port,username, password, database):
    db = pymysql.connect(host=host,
                         port=port,
                         user=username,
                         password=password,
                         db=database,
                         charset='utf8mb4',
                         cursorclass=pymysql.cursors.DictCursor)
    try:
        with db.cursor() as cursor:
            sql = "INSERT INTO movie_info VALUES (\'{}\',\'{}\',\'{}\',\'{}\',\'{}\',\'{}\',\'{}\',\'{}\',\'{}\')"\
                .format(info["movie_id"],info["movie_name"],info["movie_bt"],info["movie_poster"],
                        info["movie_detail"],str(info["movie_score"]),info["movie_type"],
                        info["movie_starring"],info["movie_type"].split(",")[1])
            cursor.execute(sql)
            db.commit()
    finally:
        db.close()


def insert_movie_type(info,host, port,username, password, database):
    db = pymysql.connect(host=host,
                         port=port,
                         user=username,
                         password=password,
                         db=database,
                         charset='utf8mb4',
                         cursorclass=pymysql.cursors.DictCursor)
    try:
        for item in  info["movie_type"].split(","):
            count = select_movie_type(item,host, port,username, password, database)
            if count == 0:
                cursor = db.cursor()
                sql = "INSERT INTO movie_type(type_name) VALUES (\'{}\')".format(item)
                cursor.execute(sql)
                db.commit()
    finally:
        db.close()

def select_movie_type(item,host, port,username, password, database):
    db = pymysql.connect(host=host,
                         port=port,
                         user=username,
                         password=password,
                         db=database,
                         charset='utf8mb4',
                         cursorclass=pymysql.cursors.DictCursor)

    try:
        with db.cursor() as cursor:
            sql = "SELECT type_id FROM movie_type WHERE type_name = \'{}\'".format(item)
            cursor.execute(sql)
            return len(cursor.fetchall())
    finally:
        db.close()