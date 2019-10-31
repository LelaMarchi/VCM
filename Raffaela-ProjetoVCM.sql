create database VCM;
use VCM;

create table usuario (
nome varchar  (50) not null,
email varchar  (50) not null,
primary key (nome)
)engine InnoDB;

create table endereco(
lougradouro char (100) not null, 
nome varchar (50) not null,
nomeCidade varchar (100)not null,
nomeEstado varchar (50) not null,
primary key (lougradouro),
foreign key (nome) references usuario (nome)
)engine InnoDB;

create table violencia(
tipo varchar(50),
primary key (tipo)
)engine InnoDB;


create table chat(
usuario1 varchar (100) not null, 
usuario2 varchar(100)not null,
imagens char not null,
primary key (usuario1)
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

insert into usuario values 
("Raffaela","raffaela-elena@outlook.com"),
("valériaa","vava.01@hotmail.com"),
("juliana","julia_marchi@hotmail.com"),
("salete","saly.rossetti@hotmail.com"),
("cristiane","cris.xavier@outlook.com");

select * from usuario;

insert into endereço  values 
("rua alamedas das aroeira n°63","Raffaela","Bragança Paulista","São Paulo"),
("rua francisco morato n°10","valéria","Bragança Paulista","São Paulo"),
("rua 13 n°455","juliana","Bragança Paulista","São Paulo"),
("rua francisco rodrigues dias n°100 ap 23","salete","Bragança Paulista","São Paulo"),
("rua jorano buzzato n° 45","cristiane","Bragança Paulista","São Paulo");

select * from endereco;


insert into delegacia (lougradouro,endereco,usuario) values ("n°6798, Av. dos Imigrantes, 6656 - Jardim America, Bragança Paulista - SP","Jardim America","pm-valéria");
select * from endereco;


insert into violencia (tipo) values ("Violencia fisica- estupro");
select * from violencia;



-- quantos usuarios tem?
select count(*) as usuario from usuario; 
select count(*) as lagradouro from endereco;

-- visualiza campos da tabela,usuario e campos da tabela endereço
select endereco.lougradouro,usuario.nome from usuario,endereco
where usuario.nome = endereco.nome;


-- visualiza campos das duas tabelas, ordenado por usuario e por lougradouro
select usuario.nome,endereco.lougradouro,endereco.nomeCidade from usuario, endereco
where usuario.nome = endereco.lougradouro
ORDER BY usuario.nome,lougradouro;


 -- visualizar campos de 2 tabelas onde o nome inicie por JCME
 select usuario.nome, endereco.lougradouro from usuario,endereco
 where usuario.nome = endereco.lougradouro and usuario.nome like 'JCME%';
 
 

 -- exemplo de junçao com group by
select usuario.nome, count(*) from usuario,endereco
where cliente.codcli = endereco.lougradouro
group by usuario.nome;


select usuario.nome, count(*), sum (endereco.nomeCidade)
from usuario, nomeCidade
where usuario.nome = endereco.lougradouro
group by usuario.nome;



-- junção de tabela com inner join
 select lougradouro,nome
 from usuario inner join endereco
 on usuario.nome = endereco.lougradouro;
 


