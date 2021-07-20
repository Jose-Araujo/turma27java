use db_ecommerce;

create table tb_produtos(
	id bigint(5) auto_increment,
    nomeproduto varchar(20) not null,
    quantidade int(5) not null,
    marca varchar(10) not null,
	preco double (10, 2) not null,
    desconto boolean,
    primary key(id)
);