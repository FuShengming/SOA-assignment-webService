create database if not exists soa;
use soa;
create table if not exists student_info(
	id int auto_increment primary key,
	student_id varchar(9) not null,
	name varchar(16) not null,
	gender varchar(8) not null,
	birthday timestamp default CURRENT_TIMESTAMP,
	phone varchar(11) not null,
	email varchar(64) not null,
	apartment_id varchar(6) not null,
	apartment_name varchar(16) not null,
	address varchar(128) not null,
	grade varchar(32) not null,
	student_status varchar(16) not null,
	political_status varchar(16) not null

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

create table if not exists course_score(
	id int auto_increment primary key,
	student_id varchar(9) not null,
	score_value int not null,
	course_id varchar(16),
	score_character varchar(8)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

create table if not exists  student_user(
	id int auto_increment primary key,
	student_id varchar(9) not null,
	pwd varchar(32) not null
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

create table if not exists student_authority(
	id int auto_increment primary key,
	student_id varchar(9) not null,
	authority_character varchar(32) not null,
	authority_id varchar(32) not null

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
insert into student_user values(null,'171250640','123456');
insert into student_authority values(null,'171250640','门禁编号','000001');
insert into student_authority values(null,'171250640','门禁编号','000002');
insert into student_authority values(null,'171250640','书籍编号','123456789');
insert into student_authority values(null,'171250640','书籍编号','123457890');