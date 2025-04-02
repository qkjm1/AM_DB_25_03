drop database if exists AM_DB_25_03;
create database AM_DB_25_03;
use AM_DB_25_03;

create table article(
                        id int(10) unsigned not null primary key auto_increment,
                        regDate datetime not null,
                        updateDate datetime not null,
                        title char(100) not null,
                        `body` text not null
);

select *
from article;

select now();

select '제목1';

select concat('제목',' 1');

select substring(RAND() * 1000 from 1 for 2);

insert into article
set regDate = now(),
updateDate = now(),
title = concat('제목',substring(RAND() * 1000 from 1 for 2)),
`body` = concat('내용',substring(RAND() * 1000 from 1 for 2));


//////
USE AM_DB_25_03;

SHOW TABLES;

SELECT *
FROM article;

CREATE TABLE `member`(
                         id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT
    , regDate DATETIME NOT NULL
    , loginId CHAR (200) NOT NULL
    , `password` CHAR (200) NOT NULL
    , `name` CHAR (200)
)

SELECT *
FROM `member`;
