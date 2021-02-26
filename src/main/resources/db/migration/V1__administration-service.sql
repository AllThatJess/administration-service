--
-- Creating user table;
--
create table if not exists tbl_user (
	n_id_user int not null primary key,
	s_username varchar(100) not null,
	s_first_name varchar(100) not null,
	s_last_name varchar(100) not null,
	s_password varchar(50) not null
);

--
--
-- Creating user sequence;
create sequence seq_id_user increment 1 minvalue 1 maxvalue 9223372036854775807 start 1 cache 1;

