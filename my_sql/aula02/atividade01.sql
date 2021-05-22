create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
classe varchar(30) not null,
descricao varchar(60) not null,
raca varchar(20) not null,
primary key(id)
);

insert into tb_classe(classe,descricao,raca) value ("Mago","Bom com magias e ataques a longa distância.","Bruxo");
insert into tb_classe(classe,descricao,raca) value ("Atirador","Precisamente preciso com ataques a distância","Humano");
insert into tb_classe(classe,descricao,raca) value ("Guerreiro","Combate corpo a corpo, um bom guerreiro!","Humano");
insert into tb_classe(classe,descricao,raca) value ("Curandeiro","Otimo para dar assistência ao time.","Bruxo");
insert into tb_classe(classe,descricao,raca) value ("Tanque","Agueta porrada!","Ork");

select * from tb_classe;
describe tb_classe;

create table tb_personagem(
id bigint auto_increment primary key,
nick varchar(30) not null,
lvl int,
xp float not null,
pdAtaque int not null,
pdDefesa int not null,
classe_id bigint,
foreign key(classe_id) references tb_classe (id)
);

insert into tb_personagem(nick, lvl, xp,pdAtaque,pdDefesa,classe_id) value ("JJGamer",3,100,1400,1200,1);
insert into tb_personagem(nick, lvl, xp,pdAtaque,pdDefesa,classe_id) value ("xDantex",4,120,1750,1200,2);
insert into tb_personagem(nick, lvl, xp,pdAtaque,pdDefesa,classe_id) value ("Xibalaia",3,100,2200,1000,3);
insert into tb_personagem(nick, lvl, xp,pdAtaque,pdDefesa,classe_id) value ("PingCrazy",5,150,1600,1000,4);
insert into tb_personagem(nick, lvl, xp,pdAtaque,pdDefesa,classe_id) value ("LetoCrazy",6,180,1750,2050,5);
insert into tb_personagem(nick, lvl, xp,pdAtaque,pdDefesa,classe_id) value ("Newbagameplay",2,60,2200,1000,3);
insert into tb_personagem(nick, lvl, xp,pdAtaque,pdDefesa,classe_id) value ("ccAzulão",1,30,1750,2050,5);
insert into tb_personagem(nick, lvl, xp,pdAtaque,pdDefesa,classe_id) value ("Ownd9",6,180,1750,1200,2);

describe tb_personagem;

select * from tb_personagem;
select * from tb_personagem where pdAtaque >= 2000;
select * from tb_personagem where pdDefesa between 1000 and 2000;
select * from tb_personagem where nick like "%C%";

select * from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id;

select tb_personagem.nick, tb_personagem.lvl, tb_classe.classe from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.classe_id
where tb_classe.classe = "Atirador";