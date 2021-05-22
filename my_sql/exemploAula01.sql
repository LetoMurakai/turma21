-- criar banco de dados
create database db_ecommerce;

-- acessar banco de dados
use db_quitanda;

-- criar tabela
create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco float not null,
primary key(id)
);

-- mostrar tabela
select * from tb_produtos;

-- inserindo dados
insert into tb_produtos(nome,preco) value ("Suco de abacaxi",12.99);

-- modificando dados