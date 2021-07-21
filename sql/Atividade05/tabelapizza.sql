use db_pizzaria_legal;

create table tb_pizza(
	id bigint auto_increment,
    tamanho varchar(20) not null,
    tempoentrega_minutos int not null,
    quantidadepedacos int not null,
    bordacomcatupiry boolean,
    refrigerante boolean,
    categoria_id bigint,
    primary key(id),
    foreign key(categoria_id) references tb_categoria(id)
);