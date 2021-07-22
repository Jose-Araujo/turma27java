use db_pizzaria_legal;

-- select * from tb_personagem where personagemataque > 2000;
-- select * from tb_personagem where personagemdefesa > 1000 and poderdefesa < 2000;
-- select * from tb_classe where nome like "C%";

-- select tb_categoria.id, tb_categoria.nome, tb_categoria.preco, categoria_id, tamanho from tb_pizza 
-- inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id

select tb_categoria.id, tb_categoria.nome, categoria_id, tamanho, tb_pizza.id from tb_pizza
	inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id
    where tb_pizza.tamanho = "Grande"