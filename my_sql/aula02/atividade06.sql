create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment primary key,
curso varchar(255) not null,
ativo boolean not null
);

insert tb_categoria(curso,ativo) values ("Java",true);
insert tb_categoria(curso,ativo) values ("Python",true);
insert tb_categoria(curso,ativo) values ("HTML5/CSS3",true);
insert tb_categoria(curso,ativo) values ("Inglês Tecnico",true);
insert tb_categoria(curso,ativo) values ("Outros",true);

select * from tb_categoria;

create table tb_produto(
id bigint auto_increment primary key,
nome varchar(255) not null,
preco float not null,
qtdHoras decimal(10,2) not null,
modalidade varchar(30),
categoria_id bigint,
foreign key(categoria_id) references tb_categoria (id)
);

insert tb_produto(preco,nome,qtdHoras,modalidade,categoria_id) values (54.59,"Java completo",560.00,"EAD",1);
insert tb_produto(preco,nome,qtdHoras,modalidade,categoria_id) values (99.90,"Python dominando o mundo",750.00,"EAD",2);
insert tb_produto(preco,nome,qtdHoras,modalidade,categoria_id) values (30.90,"Iniciando com Python",30.50,"EAD",2);
insert tb_produto(preco,nome,qtdHoras,modalidade,categoria_id) values (554.90,"Desenvolvedor Fullstack",1000.00,"Semi-Presencial",1);
insert tb_produto(preco,nome,qtdHoras,modalidade,categoria_id) values (21.90,"Basico HTML5/CSS3",30.00,"Presencial",3);
insert tb_produto(preco,nome,qtdHoras,modalidade,categoria_id) values (389.90,"Inglês Tecnico",100.50,"Presencial",4);
insert tb_produto(preco,nome,qtdHoras,modalidade,categoria_id) values (100.00,"Lógica da Programação",30.00,"EAD",5);
insert tb_produto(preco,nome,qtdHoras,modalidade,categoria_id) values (249.90,"POO com Java",50.30,"EAD",1);

select * from tb_produto;
select * from tb_produto where preco >= 50;
select * from tb_produto where preco between 3.00 and 60.00;
select * from tb_produto where nome like "%J%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select tb_produto.nome, tb_produto.qtdHoras, tb_produto.preco from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where categoria_id = 1;