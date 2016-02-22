drop database if exists mysqlTest;
create database mysqlTest;
use mysqlTest;

create table user(
user_id varchar(255),
password varchar(255),
address varchar(255)
);


insert into user values("taro","123","東京都千代田区霞が関3-6-15 霞ヶ関MHタワーズ7階");
insert into user values("jiro","123","東京都千代田区霞が関3-6-15 霞ヶ関MHタワーズ7階");
insert into user values("hanako","123","東京都千代田区霞が関3-6-15 霞ヶ関MHタワーズ7階");