use db_pizzaria_legal;

create table tb_categoria(
	id bigint auto_increment,
    nome varchar(20) not null,
    preco double(10, 2) not null,
    quantidade int not null,
    primary key(id)
);

alter table tb_categoria 
modify  preco double(10, 2) not null