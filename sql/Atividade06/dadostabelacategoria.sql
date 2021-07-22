use db_farmacia_do_bem;

insert into tb_categoria(nome, manipulado, usocontrolado) values ("Alergias e Infecções", false, false);
insert into tb_categoria(nome, manipulado, usocontrolado) values ("Dor e Contusão", false, false);
insert into tb_categoria(nome, manipulado, usocontrolado) values ("Pressão Alta", false, true);
insert into tb_categoria(nome, manipulado, usocontrolado) values ("Gripes e Resfriados", false, false);
insert into tb_categoria(nome, manipulado, usocontrolado) values ("Doença dos Ossos", false, false);

select * from tb_categoria;