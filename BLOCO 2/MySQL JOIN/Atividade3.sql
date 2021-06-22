CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria (
id_cat int AUTO_INCREMENT,
nome_cat VARCHAR(240) NOT NULL, 
reter_receita BOOLEAN NOT NULL,
PRIMARY KEY (id_cat)
);

CREATE TABLE tb_produto (
id_produto int AUTO_INCREMENT,
nome VARCHAR(240),
preco DECIMAL (5,2),
disponivel BOOLEAN NOT NULL,
fk_categoria INT,
PRIMARY KEY (id_produto),
FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id_cat)
);

INSERT INTO tb_categoria (nome_cat, reter_receita) VALUES ("Tarjado", true);
INSERT INTO tb_categoria (nome_cat, reter_receita) VALUES ("Sem Tarja", false);
INSERT INTO tb_categoria (nome_cat, reter_receita) VALUES ("Higiene", false);
INSERT INTO tb_categoria (nome_cat, reter_receita) VALUES ("Infantil", false);
INSERT INTO tb_categoria (nome_cat, reter_receita) VALUES ("Beleza", false);

INSERT INTO tb_produto (nome, preco, disonivel, fk_categoria) VALUES ("Rivotril", 15.99, true, 1);
INSERT INTO tb_produto (nome, preco, disonivel, fk_categoria) VALUES ("Litio", 43.99, false, 1);
INSERT INTO tb_produto (nome, preco, disonivel, fk_categoria) VALUES ("Dipirona", 10.99, false, 2);
INSERT INTO tb_produto (nome, preco, disonivel, fk_categoria) VALUES ("Neusadina", 5.99, false, 2);
INSERT INTO tb_produto (nome, preco, disonivel, fk_categoria) VALUES ("Kit shampoo e cond.", 73.99, true, 3);
INSERT INTO tb_produto (nome, preco, disonivel, fk_categoria) VALUES ("Escova de Dentes", 24.99, false, 3);
INSERT INTO tb_produto (nome, preco, disonivel, fk_categoria) VALUES ("Chupeta", 19.99, true, 4);
INSERT INTO tb_produto (nome, preco, disonivel, fk_categoria) VALUES ("Delineador", 34.99, true, 5);

select * from tb_categoria;
select * from tb_produto;

select * from tb_produto where preco > 50;
select * from tb_produto where preco > 3 and preco < 60;

select * from tb_produto WHERE nome LIKE "%B%";

SELECT nome AS Produto, nome_cat AS Categoria  
	FROM tb_produto AS P
	INNER JOIN tb_categoria AS C
	ON P.fk_categoria = C.id_cat;
    
SELECT nome AS Produto, nome_cat AS Categoria  
	FROM tb_produto AS P
	INNER JOIN tb_categoria AS C
	ON P.fk_categoria = C.id_cat
        WHERE nome_cat = "Tarjado"; 