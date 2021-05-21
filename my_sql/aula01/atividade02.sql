use db_ecommerce;

create table tb_produtos (
	id bigint auto_increment,
	nome varchar (30) not null,
    marca varchar (30) not null,
    preco decimal (10,2),
    codigo int(5),
    qtde int not null,
    
    primary key (id)
);

select * from tb_produtos;
select * from tb_produtos order by nome asc;

insert into tb_produtos(nome,marca,preco,codigo,qtde) value ("Conjunto frigideira","Tramontina",155.32,14789,6);
insert into tb_produtos(nome,marca,preco,codigo,qtde) value ("Panela de pressão","Tramontina",170.29,89654,3);
insert into tb_produtos(nome,marca,preco,codigo,qtde) value ("Fogão","Electrolux",689.79,76255,8);
insert into tb_produtos(nome,marca,preco,codigo,qtde) value ("Geladeira","Electrolux",1569.79,76236,5);
insert into tb_produtos(nome,marca,preco,codigo,qtde) value ("Micro-ondas","LG",529.98,854126,3);
insert into tb_produtos(nome,marca,preco,codigo,qtde) value ("Liquidificador","Oster",1111.98,25896,2);
insert into tb_produtos(nome,marca,preco,codigo,qtde) value ("Kit cozinha","Tramontina",229.98,14852,8);
insert into tb_produtos(nome,marca,preco,codigo,qtde) value ("Processador Alimento","Britânia",249.90,12368,4);

select * from tb_produtos where preco >= 500.00;

select * from tb_produtos where preco <= 499.99;

update tb_produtos set marca = "Tramontina" 
	where id = 2;