create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
);

insert tb_categoria(descricao,ativo) values ("Bovino",true);
insert tb_categoria(descricao,ativo) values ("Suino",true);
insert tb_categoria(descricao,ativo) values ("Aves",true);
insert tb_categoria(descricao,ativo) values ("Imbutidos",true);
insert tb_categoria(descricao,ativo) values ("Outros",true);

select * from tb_categoria;

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
preco float not null,
qtProduto int not null,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria (id)
);

select * from tb_produto;
-- mostra a tabela
select * from tb_produto where nome like "%A%"; 
-- realiza pesquisa
select * from tb_produto where preco in(20,30,40);
-- pesquisa os dados com esses valores dentro da tabela
select * from tb_produto where preco between 20 and 40;
-- pesquisa os itens que estão entre 20 e 40 reais.

select count(*) from tb_produtos;
-- contagem
select avg(preco) as media from tb_produto;
-- media
select sum(preco) from tb_produto;
-- soma

select * from tb_produto inner join tb_categoria on tb_categoria = tb_produto.categoria_id;

insert tb_produto(nome,preco,qtProduto,categoria_id) values ();