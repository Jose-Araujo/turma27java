use db_generation_game_online;

-- select * from tb_classe;
-- select * from tb_personagem;

-- select tb_classe.nome,  tb_classe.id, vida, forca, classe_id from tb_personagem 
-- inner join tb_classe on tb_classe.id = tb_personagem.classe_id;

select  tb_classe.id, tb_classe.nome, tb_classe.mago, classe_id from tb_personagem
	inner join tb_classe on tb_classe.id = tb_personagem.classe_id
    where tb_classe.mago = true
    order by nome