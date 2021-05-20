create table tb_alunos(
	id bigint auto_increment,
	cadastro int(5),
    nome varchar(30) not null,
    turma int(1) not null,
    nota int(10) not null,
    presenca int(10) not null,
    
    primary key(id)
);

select * from tb_alunos;

insert into tb_alunos(cadastro,nome,turma,nota,presenca) value (1278,"Joel",3,5,5);

select * from tb_alunos where nota >= 7;

select * from tb_alunos where nota < 7;

update tb_alunos set cadastro = "12333" 
	where id = 8;