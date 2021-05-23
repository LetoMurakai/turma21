create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
id_catg bigint auto_increment primary key,
tipoProduto varchar(20),
descricao varchar(30),
faixaEtaria varchar(20)
);

insert tb_categoria(tipoProduto,descricao,faixaEtaria) values ("Genérico","Todos os tipos de rémedio.","Culsultar bula");
insert tb_categoria(tipoProduto,descricao,faixaEtaria) values ("Vitamina","Vitaminas em geral.","Aulto e Infantil");
insert tb_categoria(tipoProduto,descricao,faixaEtaria) values ("Suplemento","Suplemento alimentar.","Adulto");
insert tb_categoria(tipoProduto,descricao,faixaEtaria) values ("Cosmético","Maquiagens, cremes.","Consultar bula");
insert tb_categoria(tipoProduto,descricao,faixaEtaria) values ("Preservativo","Preserv.sexuais, mascaras.","Adulto");

select * from tb_categoria;

update tb_categoria set descricao = "Preservativos sexuais." where id_catg = 5;

create table tb_produto(
id_produto bigint auto_increment primary key,
produto varchar(20),
descricao varchar(30),
qtde int,
preco decimal(10,2),
categoria bigint,
foreign key (categoria) references tb_categoria(id_catg)
);

insert tb_produto(preco,produto,descricao,qtde,categoria) values (3.45,"Ibuprofeno","Indicado para dor e febre.",9,1);
insert tb_produto(preco,produto,descricao,qtde,categoria) values (5.21,"Dipirona","Dor de cabeça e febre.",5,1);
insert tb_produto(preco,produto,descricao,qtde,categoria) values (1.99,"Nutry Choco.","Barra de cereais",20,2);
insert tb_produto(preco,produto,descricao,qtde,categoria) values (11.59,"Fortifit Pro","Shake",6,2);
insert tb_produto(preco,produto,descricao,qtde,categoria) values (30.99,"Super Albumin","Sabor baunilha.",4,3);
insert tb_produto(preco,produto,descricao,qtde,categoria) values (119.98,"Whey 100% Pure","900g de puro Whey",3,3);
insert tb_produto(preco,produto,descricao,qtde,categoria) values (36.96,"Mascara para cilios","Prova de água 9,2ml",10,4);
insert tb_produto(preco,produto,descricao,qtde,categoria) values (8.29,"Jontex","Leve 8 pague 6 Lubrificado",8,5);

select * from tb_produto;
select * from tb_produto where preco >=50;
select * from tb_produto where preco between 3.00 and 60.00;
select * from tb_produto where produto like "%B%";

select * from tb_produto inner join tb_categoria on tb_categoria.id_catg = tb_produto.categoria;

select tb_produto.produto, tb_produto.qtde, tb_produto.preco from tb_produto
inner join tb_categoria on tb_categoria.id_catg = tb_produto.categoria
where categoria = 4;