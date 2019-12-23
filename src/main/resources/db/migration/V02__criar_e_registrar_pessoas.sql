CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo VARCHAR(1) NOT NULL,
	logradouro VARCHAR(50),
	numero VARCHAR(6),
	complemento VARCHAR(20),
	bairro VARCHAR(20),
	cep VARCHAR(11),
	cidade VARCHAR(20),
	estado VARCHAR(2)	
)ENGINE=InnoDB DEFAULT CHARSET=utf8;	

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Valdeci Alves', 'S', 'Rua Machado de Assis', '299', 'Casa','Capibaribe', '54.705-280', 'São Lourenço da Mata', 'PE');
INSERT INTO pessoa (nome, ativo) VALUES ('Moisés Alves', 'S');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Flávio Alves', 'S', 'Rua do Sol', '99', 'Apto','Cordeiro', '40.705-280', 'Recife', 'PE');
INSERT INTO pessoa (nome, ativo) VALUES ('Klara Alves', 'N');