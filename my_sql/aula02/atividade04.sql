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
id bigint auto_increment primary key,
nome varchar(255) not null,
preco float not null,
qtProduto int not null,
categoria_id bigint,
foreign key(categoria_id) references tb_categoria (id)
);

insert tb_produto(preco,nome,qtProduto,categoria_id) values (36.97,"Bife de contra filé",9,1);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (39.93,"Carne moida patinho",6,1);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (15.96,"Linguiça toscana",10,2);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (26.60,"Bisteca suina",8,2);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (14.96,"Sobrecoxa temperada",8,3);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (15.96,"Filezinho sassami",10,3);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (8.99,"Salsicha hot dog",20,4);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (79.98,"Filé de salmão",5,5);

select * from tb_produto;
select * from tb_produto where preco >=50;
select * from tb_produto where preco between 3.00 and 60.00;
select * from tb_produto where nome like "%C%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select tb_produto.nome, tb_produto.qtProduto, tb_produto.preco from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where categoria_id = 3;