create table todo(
    num int primary key auto_increment,
    content varchar(200) not null,
    userid varchar(12),
    sdate datetime default now(),
    edate datetime,
    done char(1)
);

insert into todo(content,userid,edate,done)values('메리 산책시키기','dada',date_add(now(),interval+7 day),'N');
insert into todo(content,userid,edate,done)values('메리 목욕시키기','dada',date_add(now(),interval+7 day),'N');
insert into todo(content,userid,edate,done)values('메리 대학 보내기','dada',date_add(now(),interval+7 day),'N');
insert into todo(content,userid,edate,done)values('메리 숙제 시키기','dada',date_add(now(),interval+7 day),'N');
insert into todo(content,userid,edate,done)values('메리 algo 공부시키기','dada',date_add(now(),interval+7 day),'N');
commit;

-- mapper insert
insert into todo(content, userid, sdate, edate,done) values( #{content}, #{userid}, #{sdate}, #{edate}, 'N');

