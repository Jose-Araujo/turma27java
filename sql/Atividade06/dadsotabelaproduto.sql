use db_farmacia_do_bem;

insert into tb_produto(nome, preco, quantidade, desconto, comprimido, categoria_id) values ("Azitromicina", 23.63, 1, true, true, 1);
insert into tb_produto(nome, preco, quantidade, desconto, comprimido, categoria_id) values ("Norfloxacino", 17.78, 5, false, true, 1);
insert into tb_produto(nome, preco, quantidade, desconto, comprimido, categoria_id) values ("Ciprofloxacino", 20.00, 2, false, true, 1);
insert into tb_produto(nome, preco, quantidade, desconto, comprimido, categoria_id) values ("Dipirona", 12.50, 1, false, true, 2);
insert into tb_produto(nome, preco, quantidade, desconto, comprimido, categoria_id) values ("Losartana", 3.80, 10, false, true, 3);
insert into tb_produto(nome, preco, quantidade, desconto, comprimido, categoria_id) values ("Benalet Mel-Limão", 14.98, 3,true, true, 4);
insert into tb_produto(nome, preco, quantidade, desconto, comprimido, categoria_id) values ("Ciflogex Sparey Mel", 8.19, 6,false, false, 4);
insert into tb_produto(nome, preco, quantidade, desconto, comprimido, categoria_id) values ("Oscal D", 77.14, 2, false, true,5);

select * from tb_categoria;
select * from tb_produto;