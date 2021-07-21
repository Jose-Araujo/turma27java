use db_pizzaria_legal;

create table tb_categoria(
	id bigint auto_increment,
    nome varchar(20) not null,
    preco double(3, 2) not null,
    quantidade int not null,
    primary key(id)
);