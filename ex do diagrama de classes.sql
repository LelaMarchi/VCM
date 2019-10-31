create database teste;
use teste;

create table usuario (
nome varchar  (50) not null,
email varchar  (50) not null,
primary key (nome)
)engine InnoDB;

create table endereco(
lougradouro char (100) not null, 
nomeCidade varchar (100)not null,
nomeEstado varchar (50) not null,
primary key (lougradouro)
)engine InnoDB;

create table violencia(
tipo varchar(50),
primary key (tipo)
)engine InnoDB;


create table chat(
usuario1 varchar (100) not null, 
usuario2 varchar(100)not null,
imagens char not null,
primary key (usuario1),
primary key (usuario2)
)engine InnoDB;


create table textosMotivadores(
usuario varchar (100) not null, 
imagens char not null,
primary key (usuario)
)engine InnoDB;


create table delegacia(
lougradouro char (100) not null, 
endereco varchar (100)not null,
usuario varchar (50) not null,
primary key (lougradouro)
)engine InnoDB;

insert into usuario (nome,email) values (Raffaela,"raffaela-elena@outlook.com");
select * from usuario;

insert into endereço (lougradouro,nomeCidade,nomeEstado) values ("rua alamedas das aroeira n°63","Bragança Paulista","São Paulo");
select * from endereco;

insert into violencia (tipo) values ("Violencia fisica");
select * from violencia;