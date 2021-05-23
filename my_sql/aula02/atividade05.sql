create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment primary key,
descricao varchar(255) not null,
ativo boolean not null
);

insert tb_categoria(descricao,ativo) values ("Decoração",true);
insert tb_categoria(descricao,ativo) values ("Pisos e Revestimentos",true);
insert tb_categoria(descricao,ativo) values ("Materiais Eletricos",true);
insert tb_categoria(descricao,ativo) values ("Materiais Hidráulicos",true);
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

insert tb_produto(preco,nome,qtProduto,categoria_id) values (44.59,"Quadro Decorativo",5,1);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (99.90,"Manta Decorativa",7,1);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (44.90,"Piso Laminado",30,2);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (554.90,"Nicho para Banheiro",10,2);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (69.90,"Cabo Flexivel 2,5mm",8,3);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (88.90,"Caixa de Distribuição",6,3);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (109.60,"Chuveiro Eletrico Optima",4,4);
insert tb_produto(preco,nome,qtProduto,categoria_id) values (249.90,"Furadeira de Impacto",2,5);

select * from tb_produto;
select * from tb_produto where preco >= 50;
select * from tb_produto where preco between 3.00 and 60.00;
select * from tb_produto where nome like "%C%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select tb_produto.nome, tb_produto.qtProduto, tb_produto.preco from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where categoria_id = 4;