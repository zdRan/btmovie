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

## MovieType
| 列名 | 描述 | 类型 |
| --- | --- | --- |
|type_id|主键|int|
|type_name|类型名称|varchar(20)|

## SQL
```$sql

CREATE DATABASE BT_MOVIE CHARACTER SET utf8;

CREATE TABLE movie_info
(
  movie_id       VARCHAR(20)  NOT NULL
    PRIMARY KEY,
  movie_name     VARCHAR(20)  NOT NULL,
  movie_bt       VARCHAR(100) NULL,
  movie_poster   VARCHAR(100) NULL,
  movie_detail   TEXT NULL,
  movie_score    VARCHAR(20)  NULL,
  movie_type     VARCHAR(100) NULL,
  movie_starring VARCHAR(100) NULL,
  movie_area     VARCHAR(20)  NULL
);


CREATE TABLE movie_type
(
  type_id   INT AUTO_INCREMENT
    PRIMARY KEY,
  type_name VARCHAR(50) NULL
)
```