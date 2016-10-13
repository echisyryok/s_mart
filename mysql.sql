create database test;
use world;
select *from city;
use mysql;
show tables;
show databases;
desc db;
desc user;
select * from user;
select password from user where user = 'root';

-- smart table

create database smart;
show databases;
use smart;
show tables;

select * from Employee order by empno limit 1, 10;
select * from Department;

select * from Employee;
drop table  Employee;

select * from customer;
update  Employee set dno=5 where dno=10; -- deno 에서 dno로 변경후 데이터 범위 외에 수정 가능한지 확인

alter table Employee change deno dno int;

select * from Department;
insert into  Department values(1,	'매니져', 100);
insert into  Department values(10,	'카운터', 0);
insert into  Department values(20,	'창고정리', 10)	;
insert into  Department values(30,	'홀 정리', 10);
insert into  Department values(40,	'정육점', 50);
insert into  Department values(50,	'제빵사', null);

select * from Employee;

alter table Employee modify epass varchar(100);
insert into Employee values(1001,password('admin123'),'master',500,1,10,3);
insert into Employee values(2001,password('aa'),'홍길동',200,10,0,1);
insert into Employee values(2002,password('aa'),'임꺽정',180,20,0,1);
insert into Employee values(2003,password('aa'),'안철수',220,20,2,2);

select * from Product;
drop table Product;
insert into Product values(1	,'	한우 설도	',	19000	,	20	,	1	,	0	,	0	,'	images/product/p001.jpg	'	 );
insert into Product values(2	,'	한우 목심	',	19000	,	20	,	1	,	0	,	0	,'	images/product/p002.jpg	'	 );
insert into Product values(3	,'	한우 사태	',	15000	,	20	,	1	,	0	,	0	,'	 images/product/p003.jpg	'	 );
insert into Product values(4	,'	돼지 삽결살	',	16000	,	20	,	1	,	0	,	0	,'	 images/product/p004.jpg	'	 );
insert into Product values(5	,'	돈육 목심	',	13000	,	20	,	1	,	0	,	0	,'	 images/product/p005.jpg	'	 );
insert into Product values(6	,'	닭 가슴살	',	6000	,	20	,	1	,	0	,	0	,'	 images/product/p006.jpg	'	 );
insert into Product values(7	,'	닭다리	',	6000	,	20	,	1	,	0	,	0	,'	 images/product/p007.jpg	'	 );
insert into Product values(8	,'	신선란	',	7000	,	20	,	1	,	0	,	0	,'	 images/product/p008.jpg	'	 );
insert into Product values(9	,'	유정란	',	8000	,	20	,	1	,	0	,	0	,'	 images/product/p009.jpg	'	 );
insert into Product values(10	,'	고등어	',	8000	,	20	,	2	,	0	,	0	,'	 images/product/p010.jpg	'	 );
insert into Product values(11	,'	삼치	',	10000	,	20	,	2	,	0	,	0	,'	 images/product/p011.jpg	'	 );
insert into Product values(12	,'	굴비	',	18000	,	20	,	2	,	0	,	0	,'	 images/product/p012.jpg	'	 );
insert into Product values(13	,'	멸치	',	6800	,	20	,	2	,	0	,	0	,'	 images/product/p013.jpg	'	 );
insert into Product values(14	,'	돌김	',	5500	,	20	,	2	,	0	,	0	,'	 images/product/p014.jpg	'	 );
insert into Product values(15	,'	오징어	',	6000	,	20	,	2	,	0	,	0	,'	 images/product/p015.jpg	'	 );
insert into Product values(16	,'	배추	',	6000	,	20	,	3	,	0	,	0	,'	 images/product/p016.jpg	'	 );
insert into Product values(17	,'	무	',	4000	,	20	,	3	,	0	,	0	,'	 images/product/p017.jpg	'	 );
insert into Product values(18	,'	팽이버섯	',	550	,	20	,	3	,	0	,	0	,'	 images/product/p018.jpg	'	 );
insert into Product values(19	,'	쌀	',	35000	,	20	,	3	,	0	,	0	,'	 images/product/p019.jpg	'	 );
insert into Product values(20	,'	포도	',	9700	,	20	,	3	,	0	,	0	,'	 images/product/p020.jpg	'	 );
insert into Product values(21	,'	토마토	',	4900	,	20	,	3	,	0	,	0	,'	 images/product/p021.jpg	'	 );
insert into Product values(22	,'	초코파이	',	6000	,	20	,	4	,	0	,	0	,'	 images/product/p022.jpg	'	 );
insert into Product values(23	,'	몽쉘	',	6000	,	20	,	4	,	0	,	0	,'	 images/product/p023.jpg	'	 );
insert into Product values(24	,'	델로스	',	8500	,	20	,	4	,	0	,	0	,'	 images/product/p024.jpg	'	 );
insert into Product values(25	,'	초코송이	',	2500	,	20	,	4	,	0	,	0	,'	 images/product/p025.jpg	'	 );
insert into Product values(26	,'	콘푸로스트	',	5500	,	20	,	4	,	0	,	0	,'	 images/product/p026.jpg	'	 );
insert into Product values(27	,'	식빵	',	3000	,	20	,	4	,	0	,	0	,'	 images/product/p027.jpg	'	 );
insert into Product values(28	,'	우유	',	3000	,	20	,	5	,	0	,	0	,'	 images/product/p028.jpg	'	 );
insert into Product values(29	,'	야쿠르트	',	3000	,	20	,	5	,	0	,	0	,'	 images/product/p029.jpg	'	 );
insert into Product values(30	,'	치즈	',	6600	,	20	,	5	,	0	,	0	,'	 images/product/p030.jpg	'	 );
insert into Product values(31	,'	후라이팬	',	35000	,	20	,	6	,	0	,	0	,'	 images/product/p031.jpg	'	 );
insert into Product values(32	,'	고무장갑	',	2200	,	20	,	6	,	0	,	0	,'	 images/product/p032.jpg	'	 );
insert into Product values(33	,'	호일	',	4000	,	20	,	6	,	0	,	0	,'	 images/product/p033.jpg	'	 );
insert into Product values(34	,'	컵라면	',	700	,	20	,	7	,	0	,	0	,'	 images/product/p034.jpg	'	 );
insert into Product values(35	,'	신라면	',	3100	,	20	,	7	,	0	,	0	,'	 images/product/p035.jpg	'	 );
insert into Product values(36	,'	삼양라면	',	2800	,	20	,	7	,	0	,	0	,'	 images/product/p036.jpg	'	 );
insert into Product values(37	,'	햇반	',	10000	,	20	,	7	,	0	,	0	,'	 images/product/p037.jpg	'	 );
insert into Product values(38	,'	스프	',	1500	,	20	,	7	,	0	,	0	,'	 images/product/p038.jpg	'	 );
insert into Product values(39	,'	카레	',	5000	,	20	,	7	,	0	,	0	,'	 images/product/p039.jpg	'	 );
insert into Product values(40	,'	빨래비누	',	4000	,	20	,	8	,	0	,	0	,'	 images/product/p040.jpg	'	 );
insert into Product values(41	,'	바디샴푸	',	3300	,	20	,	8	,	0	,	0	,'	 images/product/p041.jpg	'	 );
insert into Product values(42	,'	샴푸세트	',	32000	,	20	,	8	,	0	,	0	,'	 images/product/p042.jpg	'	 );
insert into Product values(43	,'	쉐이빙폼	',	3500	,	20	,	8	,	0	,	0	,'	 images/product/p043.jpg	'	 );
insert into Product values(44	,'	칫솔	',	10900	,	20	,	8	,	0	,	0	,'	 images/product/p044.jpg	'	 );
insert into Product values(45	,'	휴지	',	24000	,	20	,	8	,	0	,	0	,'	 images/product/p045.jpg	'	 );
insert into Product values(46	,'	가그린	',	7700	,	20	,	8	,	0	,	0	,'	 images/product/p046.jpg	'	 );
insert into Product values(47	,'	스파크	',	13900	,	20	,	8	,	0	,	0	,'	 images/product/p047.jpg	'	 );
insert into Product values(48	,'	유한락스	',	3800	,	20	,	8	,	0	,	0	,'	 images/product/p048.jpg	'	 );
insert into Product values(49	,'	컴배트	',	7600	,	20	,	8	,	0	,	0	,'	 images/product/p049.jpg	'	 );
insert into Product values(50	,'	페브리즈	',	9900	,	20	,	8	,	0	,	0	,'	 images/product/p050.jpg	'	 );




select * from Customer;
delete from Customer where cno=0;
insert into Customer values(0,'aa111','aa','홍길동','서울시 서초구 강남역',
'2016-10-01','010-0011-0001','19:00','aa@aaa.com',sysdate(),null,'n',1,0,0);

create table Customer (cno int primary key, cid varchar(12), cpass varchar(12), cname varchar(12),
caddr varchar(42), cbir date, cphn varchar(14), cdel varchar(6)  default '19:00',  cmail varchar(20),
cjoin date, cout date, outchk varchar(1) default  'n', cgrd int(1) default 1, cmil int(8) default 0, cmils int(8) default 0);
select cpass from customer where cid= 'aa111';

create table Department (dno int primary key, dname varchar(12), dbon int);


create table Employee (empno int primary key, epass varchar(100), ename varchar(12),
sal int default 0, dno int references Department (dno), ecarr int default 0, rank int default 1);

create table Category (prop int, pcat varchar(8));


create table Product (pno  int primary key auto_increment,  pname varchar(20) not null, price int  not null, psto int default 0, prop int  not null,
pre int default 0, pco int default 0, pic varchar(200)  not null);

create table Cart (ctno int primary key,  pname varchar(20), pno int references Product (pno), price int, pget int, cin int default 1);

create table Mark (hpno int primary key,  pname varchar(20), pno int references Product (pno), price int,  hpin int default 1);

create table Board (bdno int primary key default 1, cid varchar(12), bdps varchar(12), bddat date, bdip varchar(20), 
bdtit varchar(20), bdhit int default 0, bdcon varchar(4000), bcnt int default 0);
drop table Board;

create table Comment (cmo int primary key, bdno int references Board (bdno), cid varchar(12), bdps varchar(12), bddat date, 
bdip varchar(20), bdcon varchar(4000));

create table Pboard (pcno int primary key, pno int references Product (pno), cid varchar(12), pcps varchar(12), pcdat date, 
pcip varchar(20), pccon varchar(4000));

create table Delivery (delno int primary key, pno int references Product (pno), cno int references Customer (cno),
 ctno int  references Cart (ctno), cname varchar(12), delar varchar(40), delpn varchar(14), deltm varchar(6), deldat date);




grant all on *.* to kim identified by '1234';
grant all on test.* to park identified by '1234';
grant insert, update on test.* to lee identified by '1234';
revoke all on *.* from kim;
use mysql;
delete from user where user='kim';
select * from user;

create table sawon (num int primary key, name varchar(14), addr varchar(20));
select * from sawon;
desc sawon;
alter table sawon modify addr varchar(60);
alter table sawon add (tel varchar(20));
alter table sawon drop addr;

alter table sawon change tel phone varchar(20);
alter table sawon drop primary key;
alter table sawon add primary key (num);

create table division (dno int primary key, dname varchar(14), phone varchar(20), position varchar(14));

insert into division values(10, '회계', '010-1111-1111','강남');
insert into division values(20, '연구소', '010-2222-2222','인천');
insert into division values(30, '운영', '010-3333-3333','대전');
insert into division values(40, '홍보', '010-4444-4444','대구');
select * from division;
create table personal (pno int not null primary key, pname varchar(20), job varchar(20), manager int, startdate date, 
pay int, bonus int, dno int references division (dno));
desc personal;
select * from personal;

use test;

select * from division;
load data local infile 'C:/java/personal.txt' replace into table personal;

select * from personal;
select * from personal;

desc personal;
select pno, pname, pay from personal where pay between 1500 and 3500 order by pay desc;
select pname, job, pay from personal where job in ('salesman', 'manager');
select dno, sum(pay), max(pay) from personal group by dno;
select dno, sum(pay), count(dno) from personal group by dno having count(dno)>=4;
select pname from personal where pname like 'j%';
select distinct job from personal;
select pname from personal where pname like '%i%';
desc personal;
select pno, pname, pay, bonus from personal where bonus is not null;
select pname, dno, job, pay from personal where pay >=2000 order by dno desc, pay desc;

select pname, substr(pname, 1,3) from personal;

select concat(pname, '(',job,')') from personal;
select abs(-100);

select insert(job, 2, 3, '연습') from personal;

select pname, left(pname, 3) from personal;

select pname, reverse(pname) from personal;

select year(startdate) from personal;
select month(startdate) from personal;
select monthname(startdate) from personal;
select dayname(startdate) from personal;
select day(startdate) from personal;
select dayofmonth(startdate) from personal;

select from_days(367);
select to_days(now())-to_days('1986-10-18');
select pname, startdate, date_format(startdate, '%Y-%m-%d %W %r') from personal;
select * from personal;
select pname, pay/3, round(pay/3,2), truncate(pay/3,2), ceiling(pay/3), floor(pay/3) from personal;
select pno, pname, substr(pname, 1,3) from personal;
select concat(pname, '(', pay, ')') from personal;
select pno, pname, pay, startdate from personal where year(startdate) = 1991;
select pname, date_format(startdate, '%Y/%m/%d %W') from personal;

select pname, dno, if (dno=10, '회계', if(dno=20,'영업', '운영')) as result from personal;

select * from personal;
select pname, dno, pay, pay + bonus from personal;
select pname, dno, pay,bonus,pay + bonus, pay+ ifnull (bonus, 0) from personal;

select pname, pay from personal order by pay desc;
select pname, pay from personal order by pay desc limit 3;
-- limit 2,3 2는 index (0) 2, 즉 3번째부터 
select pname, pay from personal order by pay desc limit 2, 6;

select pname, dno, pay, if(dno=10, pay*0.1+pay, if(dno=20, pay*0.2+pay, pay*0.3+pay)) '인상 후 급여' from personal;
select  pname, pay, bonus, (pay+ifnull(bonus,0))*12 '연봉' from personal;
select pname, pay, startdate from personal order by startdate;
select * from personal;
select pname, pay, startdate from personal order by startdate limit 3;
select pname, pay, startdate from personal order by startdate limit 4,4;

select database();
select password('a');
select pname, format(pay,1) from personal;

select * from personal;
select * from division;
select pname, job, pay, dno from personal order by job;
select pname, pay, dname from personal p, division d where p.dno=d.dno;
-- 3
select pname, pay, p.dno, position from personal p right outer join division d on p.dno=d.dno;
select p.pname, p.pay, s.pname from personal p, personal s where p.manager=s.pno;
-- 5
select p.pname, p.pay, s.pname from personal p left outer join  personal s on p.manager=s.pno order by s.pname;

select pname, startdate from personal order by startdate limit 1;
-- 7
select pname, pay, dno from personal p where pay > 
(select avg(pay) from personal where p.dno=dno) ;
select pname, pay, dno from personal p where pay > 
(select avg(pay) from personal where p.dno=dno) ;
select avg(pay) from personal ;
select pname, pay, dno from personal p where pay >
(select min(pay) from personal where p.dno=dno);
select avg(pay) from personal group by dno;
select * from personal order by dno;
-- 8
select pname, pay, dno from personal p where pay < all (select avg(pay) from personal where p.dno=dno) ;
select pname, pay, avg_pay, p.dno from personal p, (select dno, avg(pay) avg_pay from personal group by dno) a where p.dno=a.dno
and pay<=avg_pay order by avg_pay;
select dno, avg(pay) avg_pay from personal group by dno;

select pname, pay, bonus, (pay+ifnull(bonus,0))*12 '연봉' ,dname from personal p, division d where p.dno=d.dno;
select pname, pay, bonus, (pay+ifnull(bonus,0))*12 '연봉' ,dname from personal p, division d where p.dno=d.dno order by 연봉 desc limit 5;
select distinct job, sum(pay), max(pay), min(pay), count(job) from personal group by (job);
select p.pname, p.pay, dname, s.pname from personal p, personal s, division d where p.manager=s.pno and p.dno=d.dno order by pay limit 1;

select * from division;

drop table sawon;
drop table personal;
drop table division;
select * from division;
select * from personal;



drop procedure if exists division_insert;
delimiter //
create procedure division_insert
(vdno int, vdname varchar(20), vphone varchar(20), vposition varchar(20))
begin
insert into division values (vdno, vdname, vphone, vposition);
end; 
//
delimiter ;
call division_insert(50, '먹자팀', '010-4545-1111','광주');
select * from division;
select * from personal;
use test;


create table schoolbase (rankno int, classname varchar(20), classno int, charger varchar(20));
desc schoolbase;
select * from schoolbase;
create table teacherbase(tno int, tname varchar(20), tel varchar(20), addr varchar(50));
desc teacherbase;
select * from teacherbase;
alter table teacherbase add (charger varchar(20));
create table studentbase (sno int, sname varchar(20), addr varchar(20), lang_c int, math_c int, gymn_c int, art_c int, mor_c int);
desc studentbase;
select * from studentbase;

insert into teacherbase values(1011, 'Brook', '0342-119-3842', 'canada', 'lang_c');
insert into teacherbase values(1012, 'challcy', '0112-7523-993', 'swith', 'math_c');
insert into teacherbase values(1062, 'dine', '0540-33-122-09', 'taiwan', 'gymn_c');
insert into teacherbase values(1078, 'keil', '0333-87-2987', 'spain', 'art_c');
insert into teacherbase values(1105, 'andola', '7533-3644-3512', 'italy', 'mor_c');
