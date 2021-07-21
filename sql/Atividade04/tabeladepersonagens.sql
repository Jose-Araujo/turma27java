use db_generation_game_online;

create table tb_personagem(
	id bigint(5) auto_increment,
    vida int not null,
    poderataque int not null,
    poderdefesa int not null,
    velocidade int not null,
    forca int not null,
    classe_id bigint not null,
    primary key (id),
    foreign key (classe_id) references tb_classe(id)
);