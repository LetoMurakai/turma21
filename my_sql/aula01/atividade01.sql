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
select * from tb_funcionaries order by nome asc;
select * from tb_funcionaries order by salario desc;
select * from tb_funcionaries where salario >= 2000.00;
select * from tb_funcionaries where salario <= 1999.99;

insert into tb_funcionaries(registro, nome, setor, salario, ativo) value (12345,"Katarina","Departamento Geral",2133.33,true);
insert into tb_funcionaries(registro, nome, setor, salario, ativo) value (12849,"Jobson","Programador Web",2199.98,true);
insert into tb_funcionaries(registro, nome, setor, salario, ativo) value (12846,"Ruanei","Gerente",3229.99,true);
insert into tb_funcionaries(registro, nome, setor, salario, ativo) value (12222,"Noemi","Marketing Digital",1899.99,true);
insert into tb_funcionaries(registro, nome, setor, salario, ativo) value (12654,"Tatiane","Assistente Geral",1489.89,true);

update tb_funcionaries set registro = 12846 
where id = 3;