use db_generation_game_online;

create table tb_classe(
	id bigint(5) auto_increment,
    mago boolean,
    guerreiro boolean,
    curandeiro boolean,
    nome varchar(25) ,
    primary key(id)
);
