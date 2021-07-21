use db_pizzaria_legal;

insert into tb_pizza(tamanho, tempoentrega_minutos, quantidadepedacos, bordacomcatupiry, refrigerante, categoria_id) 
	values("Grande", 30, 4, true, false, 3);
insert into tb_pizza(tamanho, tempoentrega_minutos, quantidadepedacos, bordacomcatupiry, refrigerante, categoria_id) 
	values("Média", 24, 4, false, true, 3);
insert into tb_pizza(tamanho, tempoentrega_minutos, quantidadepedacos, bordacomcatupiry, refrigerante, categoria_id) 
	values("Grande", 30, 4, true, false, 2);
insert into tb_pizza(tamanho, tempoentrega_minutos, quantidadepedacos, bordacomcatupiry, refrigerante, categoria_id) 
	values("Grande", 30, 4, false, false, 1);
insert into tb_pizza(tamanho, tempoentrega_minutos, quantidadepedacos, bordacomcatupiry, refrigerante, categoria_id) 
	values("Pequena", 15, 4, true, true, 1);
insert into tb_pizza(tamanho, tempoentrega_minutos, quantidadepedacos, bordacomcatupiry, refrigerante, categoria_id) 
	values("Grande", 30, 4, false, true, 3);
insert into tb_pizza(tamanho, tempoentrega_minutos, quantidadepedacos, bordacomcatupiry, refrigerante, categoria_id) 
	values("Média", 24, 4, false, true, 4);
insert into tb_pizza(tamanho, tempoentrega_minutos, quantidadepedacos, bordacomcatupiry, refrigerante, categoria_id) 
	values("Pequena", 15, 4, false, false, 2);

-- update tb_pizza set quantidadepedacos = 8 where id = 1;
-- update tb_pizza set quantidadepedacos = 8 where id = 6;
-- update tb_pizza set quantidadepedacos = 8 where id = 4;
-- update tb_pizza set quantidadepedacos = 8 where id = 3;

select * from tb_pizza;