# ExercicioMVC
O exercício foi desenvolvido com base no código de um banco de dados de uma loja online, desenvolvido em aula.

## Database code
*CREATE DATABASE dh_loja_online;

*USE dh_loja_online;

CREATE TABLE cliente (
	id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR (70) NOT NULL,
	cpf VARCHAR (14) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE telefone (
	id_telefone INT PRIMARY KEY AUTO_INCREMENT,
    pais VARCHAR(4) NOT NULL,
    ddd VARCHAR (4) NOT NULL,
	telefone VARCHAR (11) NOT NULL,
    fk_id_cliente INT NOT NULL,
    FOREIGN KEY (fk_id_cliente) REFERENCES cliente(id_cliente)
);

CREATE TABLE endereco (
	id_endereco INT PRIMARY KEY AUTO_INCREMENT,
    cep VARCHAR(9) NOT NULL UNIQUE,
    rua_numero VARCHAR (45) NOT NULL,
    complemento VARCHAR (45),
    bairro VARCHAR (45) NOT NULL,
    cidade VARCHAR (45) NOT NULL,
    estado VARCHAR (45) NOT NULL,
    pais VARCHAR (45) NOT NULL,
	fk_id_cliente INT NOT NULL,
    FOREIGN KEY (fk_id_cliente) REFERENCES cliente(id_cliente)
);

CREATE TABLE produto (
	cod_produto VARCHAR(15) PRIMARY KEY NOT NULL UNIQUE,
    nome VARCHAR(45) NOT NULL,
    descricao VARCHAR(100) NOT NULL,
    quantidade_estoque INT NOT NULL,
    preco DOUBLE NOT NULL
);

CREATE TABLE pedido (
	cod_pedido INT PRIMARY KEY AUTO_INCREMENT,
    nota_fiscal VARCHAR(45) NOT NULL,
    data_pedido DATE NOT NULL,
    valor_total DOUBLE NOT NULL,
    status_pedido VARCHAR(25) NOT NULL,
    fk_id_cliente INT NOT NULL,
    FOREIGN KEY (fk_id_cliente) REFERENCES cliente(id_cliente)
);

CREATE TABLE produto_pedido(
    fk_cod_pedido INT NOT NULL,
    fk_cod_produto VARCHAR(45) NOT NULL,
    quantidade INT NOT NULL,
	FOREIGN KEY (fk_cod_pedido) REFERENCES pedido(cod_pedido),
    FOREIGN KEY (fk_cod_produto) REFERENCES produto(cod_produto)
);

ALTER TABLE cliente ADD COLUMN data_nascimento DATE;*
