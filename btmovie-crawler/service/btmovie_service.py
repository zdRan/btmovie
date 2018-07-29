import pymysql.cursors

def connect(host, port,username, password, database):
    db = pymysql.connect(host=host,
                         port=port,
                         user=username,
                         password=password,
                         db=database,
                         charset='utf8mb4',
                         cursorclass=pymysql.cursors.DictCursor)
    return db

def insert_movie_info(db,movie_info):

    try:
        with db.cursor() as cursor:
            sql = "INSERT INTO 'movie_info' (" \
                  "'movie_id'," \
                  "'movie_name'," \
                  "'movie_bt'," \
                  "'movie_poster'," \
                  "'movie_detail'," \
                  "'movie_score'," \
                  "'movie_type'," \
                  "'movie_Starring'," \
                  "'movie_area') VALUES (%s,%s,%s,%s,%s,%s,%s,%s,%s);"
            cursor.execute(sql, (moiv_info["id"],moiv_info[""]))
        db.commit()
    finally:
        db.close()
