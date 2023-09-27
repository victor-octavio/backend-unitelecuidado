CREATE TABLE usuarios (
    id bigint not null auto_increment,
    email varchar(100),
    senha varchar(100),
    cargo varchar(100),
    primary key (id)
);