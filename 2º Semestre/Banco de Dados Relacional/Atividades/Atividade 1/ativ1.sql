/* Comandos iniciais */
CREATE DATABASE testes;
USE testes;

/* Comandos úteis */

show tables;
select * from Departamento;
select * from Empregado;

/* Criação das tabelas */

CREATE TABLE Departamento (
    IdDepto int NOT NULL,
    NomeDepto varchar(15) NOT NULL,
    Gerente int NOT NULL,
    Divisao varchar(10) NOT NULL,
    Local varchar(15) NOT NULL,
    PRIMARY KEY (IdDepto)
    );
    

CREATE TABLE Empregado (
    IdEmpregado int NOT NULL,
    NomeEmpregado varchar(20) NOT NULL,
    IdDepto int NOT NULL,
    Cargo varchar(6) NOT NULL,
    Tempo_Emp int NULL,
    Salario decimal(10,2) NULL,
    Comissao decimal(10,2) NULL,
    PRIMARY KEY (IdEmpregado)
);

/* --- */

/* Inserts */

DROP TABLE Departamento;
INSERT INTO Departamento 
VALUES (1, 'Ativação IX', 1, 'NORTE', 'São Paulo' ),
	  (2, 'Infraestrutura IX', 2, 'SUL', 'São Paulo'),
	  (3, 'NOC', 3, 'SUL', 'São Paulo'),
	  (4, 'Medições', 1, 'NORTE', 'São Paulo'),
	  (5, 'Data Center', 4, 'SUL', 'São Paulo');

INSERT INTO Empregado 
VALUES	
		( 1, 'Gustavo Oliveira', 3, 'ATEND', 2, 10000, 700),  
		( 2, 'Lukas Rocha', 5, 'ATEND', 6, 2500, 600),
		( 3, 'Giovanni Iannace', 2, 'GER', 5, 7050, 180), 
		( 4, 'Fabiano Oliveira',1, 'ATEND', 1, 2350, 500),  
		( 5, 'Alex William', 5, 'VENDAS', 5, 3600, NULL),  
		( 6, 'Rodrigo Regis', 2, 'RH', 1, 1300, 1020),  
		( 7, 'Leonardo Januário', 3, 'GER', 1, 8000, NULL),  
		( 8, 'Silas Luis', 1, 'GER', 2, 8000, 50),  
		( 9, 'Ademar Almeida', 4, 'RH', 4, 7300, 500),
        ( 10, 'Marcos Moreiras', 2, 'GER', 2, 9000, NULL),
		( 11, 'César Tassis', 1, 'GER', 9, 9000, 200),
		( 12, 'Julimar Linguinho', 2, 'ATEND', 3, 4000, NULL),
		( 13, 'Galvão Rezende', 3, 'VENDAS', 1, 6000, 100),
		( 14, 'Erton Silva', 5, 'RH', 2, 2500, 100),
		( 15, 'Guilherme Freire', 1, 'VENDAS', 1, 3000, 1873),
        ( 16, 'Lucas Assis', 3, 'GER', 3, 1800, 2000,
        ( 17, 'Sabrina Oliveira', 3, 'ATEND', 3, 1900, 2000);
        
/* Necessários para a tabela: GER, VENDAS, ATEND */

/* Questão 1 
Lista Nome e salário de todos os Empregados
*/

SELECT  NomeEmpregado, Salario FROM Empregado;

/* Questão 2
Lista Nome e Local de todos os Departamentos
*/	

SELECT NomeDepto, Local FROM Departamento;

/* Questão 3
Lista Nome, salário e comissão dos Empregados com salario maior que
1.800
*/	

SELECT NomeEmpregado, Salario, Comissao
FROM Departamento
WHERE Salario > 1800.00;

/* Questão 4
Lista Nome, divisão e Local dos Departamentos da divisão SUL 
*/	

SELECT NomeDepto, Divisao, Local
FROM Departamento
WHERE Divisao = 'SUL';

/* Questão 5
Lista Nome, departamento, salario e cargo dos Empregados com cargo
GER e salário menor que 2.000
*/	

SELECT NomeEmpregado, Salario, Cargo
FROM Empregado
WHERE Cargo = 'GER' AND Salario < 2000;

/* Questão 6
Lista todos os dados dos Empregados com cargo ATEND ou salário entre
1.800 e 2.000
*/	

SELECT *
FROM Empregado
WHERE Cargo = 'ATEND' AND Salario BETWEEN 1800 AND 2000;

/* Questão 7
Lista Nome, Salário, comissão e remuneração total (Salário +
Comissão) de todos os empregados
*/	

SELECT NomeEmpregado, Salario, Comissao, Salario+Comissao
FROM Empregado;

/* Questão 8
Lista Nome, Salário, comissão e remuneração total (Salário +
Comissão) de todos os empregados com salário maior que 2.000 ou comissão
maior que 700
*/	

SELECT NomeEmpregado, Salario, Comissao, Salario+Comissao
FROM Empregado
WHERE Salario > 2000 OR Comissao > 700;

/* Questão 9
Lista Nome, Salário, comissão e remuneração total de todos os
empregados com remuneração total menor que 1.800
*/	

SELECT NomeEmpregado, Salario, Comissao, Salario+Comissao
FROM Empregado
WHERE Salario+Comissao < 1800;

/* Questão 10
Lista Nome e cargo dos Empregados que o nome comece com a letra D
*/	

SELECT NomeEmpregado, Cargo
FROM Empregado
WHERE NomeEmpregado LIKE 'D%';

/* Questão 11
Lista Nome e cargo dos Empregados que o nome tenha N como terceira
letra
*/

SELECT NomeEmpregado, Cargo
FROM Empregado
WHERE NomeEmpregado LIKE '__n%';

/* Questão 12
Lista Nome e cargo dos Empregados que o nome tenha N (maiúscula ou
minúscula) como terceira letra
*/

SELECT NomeEmpregado, Cargo
FROM Empregado
WHERE NomeEmpregado LIKE '__N%';

/* Questão 13
Lista Nome, Salário, comissão e remuneração total (Salário +
Comissão) de todos os empregados com salário maior que 2.000 ou comissão
maior que 800. Apresenta o resultado classificado em ordem alfabética de nome
*/

SELECT NomeEmpregado, Salario, Comissao, Salario+Comissao
FROM Empregado
WHERE Salario > 2000 OR Comissao > 800
ORDER BY NomeEmpregado ASC;

/* Questão 14
Lista Nome, Salário, comissão e remuneração total (Salário +
Comissão) de todos os empregados com salário maior que 2.000 ou comissão
maior que 800. Apresenta o resultado classificado em ordem crescente de
salario
*/

SELECT NomeEmpregado, Salario, Comissao, Salario+Comissao
FROM Empregado
WHERE Salario > 2000 OR Comissao > 800
ORDER BY Salario ASC;

/* Questão 15
Lista Nome, Salário, comissão e remuneração total (Salário +
Comissão) de todos os empregados com salário maior que 2.000 ou comissão
maior que 800. Apresenta o resultado classificado em ordem decrescente de
salario
*/

SELECT NomeEmpregado, Salario, Comissao, Salario+Comissao
FROM Empregado
WHERE Salario > 2000 OR Comissao > 800
ORDER BY Salario DESC;

/* Questão 16
Lista Nome, Salário, comissão e remuneração total (Salário +
Comissão) de todos os empregados com salário maior que 2.000 ou comissão
maior que 800. Apresenta o resultado classificado em ordem crescente de
remuneração total
*/

SELECT NomeEmpregado, Salario, Comissao, Salario+Comissao AS Remuneracao
FROM Empregado
WHERE Salario > 2000 OR Comissao > 800
ORDER BY Remuneracao ASC;

/* Questão 17
Lista Nome, Salário, comissão e remuneração total de todos os
empregados com salário maior que 2.000 ou comissão maior que 800.
Apresenta o resultado classificado em ordem crescente de departamento e em
cada departamento, em ordem decrescente de salario
*/

SELECT NomeEmpregado, Salario, Comissao, Salario+Comissao
FROM Empregado
WHERE Salario > 2000 OR Comissao > 800
ORDER BY IdDepto ASC, Salario DESC;

/* Questão 18
Lista o maior salário, o menor salário e a média dos salários de
todos os Empregados
*/

SELECT MAX(Salario), MIN(Salario), AVG(Salario)
FROM Empregado;

/* Questão 19
Lista o maior salário, o menor salário, a média dos salários e a
quantidade dos Empregados com cargo GER ou VENDAS
*/

SELECT MAX(Salario), MIN(Salario), AVG(Salario), COUNT(Cargo)
FROM Empregado
WHERE Cargo = 'GER' OR Cargo = 'VENDAS';

/* Questão 20
Lista o cargo, o maior salário, o menor salário, a média dos
salários e a quantidade dos Empregados para cada cargo
*/

SELECT Cargo, MAX(Salario), MIN(Salario), AVG(Salario), COUNT(Cargo)
FROM Empregado
GROUP BY Cargo;

/* Questão 21
Lista o departamento, o maior salário, o menor salário, a média dos
salários e a quantidade dos Empregados para cada departamento
*/

SELECT IdDepto, MAX(Salario), MIN(Salario), AVG(Salario), COUNT(Cargo)
FROM Empregado
GROUP BY IdDepto;

/* Questão 22
Lista o departamento, o maior salário, o menor salário, a média dos
salários e a quantidade dos Empregados para cada departamento,
considerando somente empregados com salário maior que 1.800
*/

SELECT IdDepto, Cargo, MAX(Salario), MIN(Salario), AVG(Salario), COUNT(Cargo)
FROM Empregado
WHERE Salario > 1800
GROUP BY IdDepto;

/* Questão 23
Lista o departamento, o cargo, o maior salário, o menor salário, a
média dos salários e a quantidade dos Empregados para cada cargo dentro de
cada departamento
*/



/* Questão 24
Lista o departamento, o maior salário, o menor salário, a média dos
salários e a quantidade dos Empregados, apresentando somente departamentos
que tenham pelo menos 5 empregados
*/

SELECT IdDepto, MAX(Salario), MIN(Salario), AVG(Salario), COUNT(IdEmpregado) as sla
FROM Empregado
GROUP BY Cargo
Having count(*) >3;

/* Questão 25
Lista o departamento, o maior salário, o menor salário, a média dos
salários e a quantidade dos Empregados com salário maior que 1.400,
apresentando somente departamentos que tenham pelo menos 3 empregados
nessa condição
*/



/* Questão 26
Lista todos os dados dos Empregados que não tem comissão (ausência de
valor)
*/


/* Questão 27
Lista nome e salário dos empregados com salário menor que a média dos
salários
*/


/* Questão 28
Lista os códigos de departamento que tenham empregados com salário
maior que a média de todos os salários (sem repetir códigos de
departamento)
*/


/* Questão 29
Lista nome e salário dos empregados que tenham o menor salário em seu
departamento 
*/


/* Questão 30
Lista quantos empregados em cada departamento tem salário maior que a
média de todos os salários 
*/