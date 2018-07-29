# BtMovie 数据库表结构设计
## MovieInfo

| 列名 | 描述 | 类型 |
| --- | --- | --- |
|MOVIE_ID|主键|varchar(20)|
|MOVIE_NAME|电影名|varchar(40)|
|MOVIE_IMAGE|电影海报地址|varchar(120)|
|MOVIE_BT|电影下载地址|varcahr(120)|
|MOVIE_ABSTRACT|电影简介|text|
|MOVIE_CATEGORY|电影类别|text|

## SQL
```$sql

CREATE DATABASE BT_MOVIE CHARACTER SET utf8;

CREATE TABLE MOVIE_INFO(
    MOVIE_ID VARCHAR(20) PRIMARY KEY,
    MOVIE_NAME VARCHAR(40),
    MOVIE_IMAGE VARCHAR(100),
    MOVIE_BT VARCHAR(100),
    MOVIE_ABSTRACT VARCHAR(500),
    MOVIE_CATEGORY VARCHAR(500)
);
```