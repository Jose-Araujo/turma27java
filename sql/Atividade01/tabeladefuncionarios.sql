use db_rh;

create table tb_funcionarios(
	id bigint(10) auto_increment,
    nome varchar(50) not null,
    idade int(3)  not null,
    funcao varchar(50)  not null,
    salario double(10, 2)  not null,
    estadocivil varchar(10)  not null,
    primary key(id)
);