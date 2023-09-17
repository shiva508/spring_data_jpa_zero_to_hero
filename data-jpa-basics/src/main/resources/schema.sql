create table if not exists account (id integer not null, credit float, rate float, interest float, primary key(id));
create table if not exists contact (id integer not null, notes varchar(255), stared boolean, web_site varchar(255), primary key (id));
