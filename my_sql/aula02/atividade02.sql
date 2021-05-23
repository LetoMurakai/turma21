create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id_catg bigint auto_increment primary key,
tamanho varchar(6),
tipo varchar(7),
borda boolean
);

insert tb_categoria(tamanho,tipo,borda) values ("Grande","Salgada",true);
insert tb_categoria(tamanho,tipo,borda) values ("Média","Salgada",true);
insert tb_categoria(tamanho,tipo,borda) values ("Broto","Salgada",true);
insert tb_categoria(tamanho,tipo,borda) values ("Média","Doce",true);
insert tb_categoria(tamanho,tipo,borda) values ("Broto","Doce",false);

select * from tb_categoria;

create table tb_pizza(
id_pizza bigint auto_increment primary key,
preco decimal(10,2) not null,
sabor varchar(20) not null,
qtd int not null,
delivery boolean,
categoria bigint,
foreign key (categoria) references tb_categoria(id_catg)
);

insert tb_pizza(preco,sabor,qtd,delivery,categoria) values (17.99,"Mussarela",1,true,3);
insert tb_pizza(preco,sabor,qtd,delivery,categoria) values (17.99,"Calabresa",1,true,2);
insert tb_pizza(preco,sabor,qtd,delivery,categoria) values (29.99,"Calamussa",2,true,2);
insert tb_pizza(preco,sabor,qtd,delivery,categoria) values (29.99,"Frango Catupiry",3,false,1);
insert tb_pizza(preco,sabor,qtd,delivery,categoria) values (37.99,"Brigadeiro",1,true,5);
insert tb_pizza(preco,sabor,qtd,delivery,categoria) values (47.99,"Lombo Canadense",2,false,1);
insert tb_pizza(preco,sabor,qtd,delivery,categoria) values (52.99,"Sushi",1,true,1);
insert tb_pizza(preco,sabor,qtd,delivery,categoria) values (52.99,"Nutella",2,true,4);

select * from tb_pizza;
select * from tb_pizza where preco > 45.00;
select * from tb_pizza where preco between 29.00 and 60.00;
select * from tb_pizza where sabor like "%C%";
select * from tb_pizza inner join tb_categoria;
select * from tb_pizza inner join tb_categoria where tb_pizza.categoria = tb_categoria.id_catg;

select tb_pizza.preco, tb_pizza.sabor, tb_pizza.qtd from tb_pizza 
 inner join tb_categoria on tb_pizza.categoria = tb_categoria.id_catg
 where tb_categoria.tipo = "Doce";