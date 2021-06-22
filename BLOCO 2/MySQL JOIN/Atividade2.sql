CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
id_cat int AUTO_INCREMENT,
nome VARCHAR(240) NOT NULL, 
tamanho VARCHAR(240) NOT NULL,
PRIMARY KEY (id_cat)
);

CREATE TABLE tb_pizza (
id_pizza int AUTO_INCREMENT,
sabor VARCHAR(240),
preco DECIMAL (5,2),
promocao BOOLEAN,
fk_categoria INT,
PRIMARY KEY (id_pizza),
FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id_cat)
);

INSERT INTO tb_categoria (nome, tamanho) VALUES ("Pizza", "Grande");
INSERT INTO tb_categoria (nome, tamanho) VALUES ("Pizza", "Media");
INSERT INTO tb_categoria (nome, tamanho) VALUES ("Esfirra", "Grande");
INSERT INTO tb_categoria (nome, tamanho) VALUES ("Fogazza", "Grande");
INSERT INTO tb_categoria (nome, tamanho) VALUES ("Fogazza", "Media");

INSERT INTO tb_pizza (sabor, preco, promocao, fk_categoria) VALUES ("Mussarela", 35.99, true, 1);
INSERT INTO tb_pizza (sabor, preco, promocao, fk_categoria) VALUES ("Calabresa", 35.99, true, 1);
INSERT INTO tb_pizza (sabor, preco, promocao, fk_categoria) VALUES ("Palmito", 45.99, false, 2);
INSERT INTO tb_pizza (sabor, preco, promocao, fk_categoria) VALUES ("Portuguesa", 45.99, false, 2);
INSERT INTO tb_pizza (sabor, preco, promocao, fk_categoria) VALUES ("Carne", 5.99, true, 3);
INSERT INTO tb_pizza (sabor, preco, promocao, fk_categoria) VALUES ("Brigadeiro", 7.99, false, 3);
INSERT INTO tb_pizza (sabor, preco, promocao, fk_categoria) VALUES ("4 Queijos", 20.99, true, 4);
INSERT INTO tb_pizza (sabor, preco, promocao, fk_categoria) VALUES ("Frango com Catupiry", 20.99, true, 5);

select * from tb_categoria;
select * from tb_pizza;

select * from tb_pizza where preco > 45;
select * from tb_pizza where preco > 29 and preco < 60;

select * from tb_pizza WHERE sabor LIKE "%C%";

SELECT sabor AS Pizza, nome AS Categoria  
	FROM tb_pizza AS P
	INNER JOIN tb_categoria AS C
	ON P.fk_categoria = C.id_cat;
    
    SELECT sabor AS Pizza, nome AS Categoria  
		FROM tb_pizza AS P
		INNER JOIN tb_categoria AS C
		ON P.fk_categoria = C.id_cat
        WHERE nome = "Pizza"; 
