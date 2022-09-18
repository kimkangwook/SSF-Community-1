drop table if exists member;

create table member (id int primary key auto_increment, uid varchar2(100),
                   pw varchar2(100), email varchar2(100), phone varchar2(100),
                   grade varchar2(1), address varchar2(300),
                   name varchar2(100), role varchar2(1), enabled varchar2(1), date DATE);

