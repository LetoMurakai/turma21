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

insert into tb_produtos(nome,marca,preco,codigo,qtde) value ("Processador Alimento","Britânia",249.90,12368,4);

select * from tb_produtos where preco >= 500.00;

select * from tb_produtos where preco <= 499.99;

update tb_produtos set marca = "Tramontina" 
	where id = 2;