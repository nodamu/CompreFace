CREATE domain IF NOT EXISTS jsonb AS other;

drop table if exists face cascade;
drop table if exists model cascade;
drop table if exists trained_model cascade;
drop sequence if exists model_id_seq;
drop sequence if exists trained_model_id_seq;
create sequence model_id_seq start 1 increment 1;
create sequence trained_model_id_seq start 1 increment 1;

create table face (
	id varchar(255) not null,
	api_key varchar(255),
	embeddings jsonb,
	face_img_fs bytea,
	face_name varchar(255),
	raw_img_fs bytea,
	primary key (id));

create table model (
	id int8 not null,
	api_key varchar(255),
	name varchar(255),
	primary key (id));

create table trained_model (id int8 not null, calculator_version varchar(255), classifier bytea, model_key varchar(255), primary key (id));
