use db_farmacia_do_bem;

-- select * from tb_produto where preco > 50;
-- select * from tb_produto where preco between 3 and 60;
-- select * from tb_produto where nome like "%B%";

-- select tb_categoria.id, tb_categoria.nome, tb_produto.categoria_id, tb_produto.nome, tb_produto.preco from tb_produto 
-- inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id

select  tb_categoria.id, tb_categoria.nome, tb_produto.categoria_id, tb_produto.nome from tb_produto
    inner join tb_categoria where tb_categoria.id = 1 and tb_produto.categoria_id = 1
    order by tb_categoria.nome
