use db_farmacia_do_bem;

create table tb_categoria(
	id bigint auto_increment not null,
    nome varchar(100) not null,
    manipulado boolean not null,
    usocontrolado boolean not null,
    primary key(id)
);

-- select * from tb_categoria;