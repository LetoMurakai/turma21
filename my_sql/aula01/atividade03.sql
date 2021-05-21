use db_escola;

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
select * from tb_alunos order by nome asc;
select * from tb_alunos order by nota asc;
select * from tb_alunos order by nota desc;

insert into tb_alunos(cadastro,nome,turma,nota,presenca) value (12355,"João", 1, 8, 6);
insert into tb_alunos(cadastro,nome,turma,nota,presenca) value (12348,"Maria", 1, 7, 10);
insert into tb_alunos(cadastro,nome,turma,nota,presenca) value (12359,"José", 2, 9, 6);
insert into tb_alunos(cadastro,nome,turma,nota,presenca) value (12373,"Joana", 2, 10, 2);
insert into tb_alunos(cadastro,nome,turma,nota,presenca) value (12346,"Ana", 2, 8, 3);
insert into tb_alunos(cadastro,nome,turma,nota,presenca) value (12749, "Raquel", 3, 7, 10);
insert into tb_alunos(cadastro,nome,turma,nota,presenca) value (12362,"Rafael", 3, 4, 10);
insert into tb_alunos(cadastro,nome,turma,nota,presenca) value (12333,"Joel", 3, 5, 5);

select * from tb_alunos where nota >= 7;

select * from tb_alunos where nota < 7;

update tb_alunos set cadastro = "12333" 
	where id = 8;