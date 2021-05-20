use db_rh;

Create table tb_funcionaries(
	id bigint(5) auto_increment,
    registro bigint(5),
    nome varchar(40) not null,
    setor varchar(40) not null,
    salario float,
    ativo boolean,
    primary key (id)
);

select * from tb_funcionaries;

insert into tb_funcionaries(registro, nome, setor, salario, ativo) value (12654,"Tatiane","Assistente Geral",1489.89,true);

select * from tb_funcionaries where salario >= 2000.00;
select * from tb_funcionaries where salario <= 1999.99;

update tb_funcionaries set salario = 2199.98 
where id = 2;