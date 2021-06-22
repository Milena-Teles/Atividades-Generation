CREATE DATABASE db_cidade_das_frutas;

USE db_cidade_das_frutas;

CREATE TABLE tb_categoria (
id INT AUTO_INCREMENT, 
nome VARCHAR(250),
disponivel BOOLEAN,
PRIMARY KEY (id)
);

CREATE TABLE tb_produto(
id_produto INT AUTO_INCREMENT,
nome_produto VARCHAR(240) NOT NULL,
preco DECIMAL(5.2) NOT NULL,
vendas INT NOT NULL,
fk_categoria INT,
PRIMARY KEY (id_produto),
FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id)
);

INSERT INTO tb_categoria (nome, disponivel) VALUES ("Frutas", true);
INSERT INTO tb_categoria (nome, disponivel) VALUES ("Vegetais", true);
INSERT INTO tb_categoria (nome, disponivel) VALUES ("Grãos", true);
INSERT INTO tb_categoria (nome, disponivel) VALUES ("Doces", true);
INSERT INTO tb_categoria (nome, disponivel) VALUES ("Importação", false);

INSERT INTO tb_produto (nome_produto, preco, vendas, fk_categoria) VALUES ("Maçã", 4.99, 84, 1); 
INSERT INTO tb_produto (nome_produto, preco, vendas, fk_categoria) VALUES ("Amora", 7.99, 23, 1); 
INSERT INTO tb_produto (nome_produto, preco, vendas, fk_categoria) VALUES ("Pepino", 6.99, 82, 2); 
INSERT INTO tb_produto (nome_produto, preco, vendas, fk_categoria) VALUES ("Alface", 4.99, 93, 2); 
INSERT INTO tb_produto (nome_produto, preco, vendas, fk_categoria) VALUES ("Arroz", 19.99, 45, 3); 
INSERT INTO tb_produto (nome_produto, preco, vendas, fk_categoria) VALUES ("Lentilha", 9.99, 53, 3); 
INSERT INTO tb_produto (nome_produto, preco, vendas, fk_categoria) VALUES ("Doce de Abobora", 14.99, 84, 4); 
INSERT INTO tb_produto (nome_produto, preco, vendas, fk_categoria) VALUES ("Romã", 60.99, 0, 5); 

SELECT * FROM tb_categoria;
SELECT * FROM tb_produto;

select * from tb_produto where preco > 50;
select * from tb_produto where preco > 3 and preco < 60;

select * from tb_produto WHERE nome_produto LIKE "%C%";

SELECT nome_produto AS Nome, nome AS Categoria  
	FROM tb_produto AS P
	INNER JOIN tb_categoria AS C
	ON P.fk_categoria = C.id;
    
    SELECT nome_produto AS Nome, nome AS Categoria  
	FROM tb_produto AS P
	INNER JOIN tb_categoria AS C
	ON P.fk_categoria = C.id
    WHERE nome = "Frutas";