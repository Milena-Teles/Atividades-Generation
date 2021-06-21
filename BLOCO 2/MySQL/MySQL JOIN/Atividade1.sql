CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe (
id int auto_increment,
nome varchar(240) not null,
raça varchar(240),
tipo varchar(240),
primary key (id)
);

CREATE TABLE tb_personagem (
id_personagem int auto_increment,
nick varchar(240) not null,
sexo varchar(140),
bioma varchar(240),
poder_ataque int,
poder_defesa int,
fk_classe INT,
primary key (id_personagem),
foreign key (fk_classe) references tb_classe (id)
);

insert into tb_classe (nome, raça, tipo) Values ("Mago", "Elfo", "Magico"); 
insert into tb_classe (nome, raça, tipo) Values ("Assassino", "demonio", "Fisico");
insert into tb_classe (nome, raça, tipo) Values ("Guerreiro", "Viking", "Tank");
insert into tb_classe (nome, raça, tipo) Values ("Atirador", "Oriental", "A distancia");
insert into tb_classe (nome, raça, tipo) Values ("Suporte", "Fada", "Cura");

insert into tb_personagem (nick, sexo, bioma, poder_ataque, poder_defesa, fk_classe) Values ("Aurora", "feminino", "Neve", 4829, 2345, 1);
insert into tb_personagem (nick, sexo, bioma, poder_ataque, poder_defesa, fk_classe) Values ("Pedro", "masculino", "Selva", 1748, 1384, 1);
insert into tb_personagem (nick, sexo, bioma, poder_ataque, poder_defesa, fk_classe) Values ("Jin", "masculino", "aldeia", 3283, 2734, 3);
insert into tb_personagem (nick, sexo, bioma, poder_ataque, poder_defesa, fk_classe) Values ("Marcie", "feminino", "Deserto", 4828, 3728, 1);
insert into tb_personagem (nick, sexo, bioma, poder_ataque, poder_defesa, fk_classe) Values ("Bonnie", "feminino", "Floresta", 2718, 1703, 4);
insert into tb_personagem (nick, sexo, bioma, poder_ataque, poder_defesa, fk_classe) Values ("Levi", "masculino", "Nordico", 6903, 4928, 2);
insert into tb_personagem (nick, sexo, bioma, poder_ataque, poder_defesa, fk_classe) Values ("Lorelay", "feminino", "Floresta", 1243, 986, 1);
insert into tb_personagem (nick, sexo, bioma, poder_ataque, poder_defesa, fk_classe) Values ("Yuri", "masculino", "Neve", 2891, 2869, 3);

select * from tb_classe;
select * from tb_personagem;

select * from tb_personagem where poder_ataque > 2000;
select * from tb_personagem where poder_defesa > 1000 and poder_defesa <2000;

select * from tb_personagem WHERE nick LIKE "%C%";

SELECT * FROM tb_personagem INNER JOIN tb_classe ON tb_personagem.id = tb_classe.id;








