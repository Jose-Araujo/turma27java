use db_farmacia_do_bem;

create table tb_produto(
	id bigint auto_increment not null,
    nome varchar(100) not null,
    preco double(5,2) not null,
    quantidade int not null,
    desconto boolean not null,
    comprimido boolean not null,
    categoria_id bigint not null,
    primary key(id),
    foreign key(categoria_id) references tb_categoria(id)
);

select * from tb_produto;