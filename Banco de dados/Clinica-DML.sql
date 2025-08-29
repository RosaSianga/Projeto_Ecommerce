SET SEARCH_PATH TO CLINICA;

INSERT INTO CLINICA.MEDICO(NOME, CRM, ESPECIALIDADE) VALUES('RICARDO MENDONÇA', '203564', 'ORTOPEDIA');
INSERT INTO CLINICA.MEDICO(NOME, CRM, ESPECIALIDADE) VALUES('MARIA DE FATIMA DA SILVA', '896478', 'PEDIATRIA');
INSERT INTO CLINICA.MEDICO(NOME, CRM, ESPECIALIDADE) VALUES('JOÃO PAULO DE FARIAS', '970346', 'DERMATOLOGIA');
INSERT INTO CLINICA.MEDICO(NOME, CRM, ESPECIALIDADE) VALUES('GIOVANA MARTINS', '9654302', 'CLINICA GERAL');

INSERT INTO CLINICA.MEDICO (NOME, CRM, ESPECIALIDADE) 
VALUES	('Dr. Marcos Vinícius Oliveira', '123456-SP', 'Cardiologia'),
		('Dra. Fernanda Ribeiro Souza', '234567-RJ', 'Dermatologia'),
		('Dr. Rafael Almeida Castro', '345678-MG', 'Ortopedia'),
		('Dra. Juliana Costa Lima', '456789-BA', 'Ginecologia'),
		('Dr. Lucas Henrique Torres', '567890-RS', 'Pediatria'),
		('Dra. Camila Nogueira Pinto', '678901-PE', 'Oftalmologia'),
		('Dr. André Luiz Martins', '789012-PR', 'Neurologia'),
		('Dra. Beatriz Carvalho Mendes', '890123-CE', 'Endocrinologia'),
		('Dr. Thiago Rocha Fernandes', '901234-DF', 'Psiquiatria'),
		('Dra. Aline Marques Ferreira', '012345-SP', 'Reumatologia'),
		('Dr. Bruno Henrique Silva', '102345-SP', 'Cardiologia'),
		('Dra. Larissa Gomes Ferreira', '203456-RJ', 'Pediatria'),
		('Dr. Marcelo Augusto Lima', '304567-MG', 'Ortopedia'),
		('Dra. Carolina Souza Rocha', '405678-BA', 'Ginecologia'),
		('Dr. Felipe Andrade Nunes', '506789-PR', 'Dermatologia'),
		('Dra. Amanda Castro Almeida', '607890-RS', 'Neurologia'),
		('Dr. Rodrigo Teixeira Pinto', '708901-CE', 'Oftalmologia'),
		('Dra. Isabela Martins Cunha', '809012-DF', 'Endocrinologia'),
		('Dr. Gustavo Ramos Vieira', '901123-PE', 'Urologia'),
		('Dra. Renata Carvalho Mendes', '112234-AM', 'Psiquiatria');		

INSERT INTO CLINICA.CLINICA(NOME, DESCRICAO, ENDERECO) 
VALUES('DR. CONSULTA', ' ', 'RUA NITEROI'),
	  ('TECNOLAB', 'LABORATÓRIO ', 'RUA JAPÃO'),
	  ('BENEFICIÊNCIA PORTUGUESA', 'HOSPITAL', 'AV. PORTUGUAL');

INSERT INTO CLINICA.CLINICA(NOME, DESCRICAO, ENDERECO) 
VALUES	('Clinica São Caetano', 'A clinica do ABC', 'Rua Niterói, 123'),
		('Clínica Nova Vida', 'Cuide de sua saúde com carinho', 'Avenida Paulista, 1500'),
		('Clínica ABC Saúde', 'Excelência em atendimento médico', 'Rua das Palmeiras, 45'),
		('Clínica MedLife', 'Saúde e bem-estar para você', 'Rua São João, 678'),
		('Clínica do Futuro', 'Tecnologia de ponta em saúde', 'Rua da Liberdade, 234'),
		('Clínica Nossa Senhora', 'Atendimento especializado', 'Avenida Brasil, 120'),
		('Clínica da Família', 'Saúde para todos', 'Rua dos Três Irmãos, 9'),
		('Clínica Bem Estar', 'Cuidando do seu bem-estar', 'Rua Maringá, 300'),
		('Clínica Vida Plena', 'Sinta-se em casa, em boas mãos', 'Rua das Flores, 101'),
		('Clínica Med Center', 'Referência em serviços médicos', 'Rua Santa Terezinha, 45'),
		('Clínica Sorriso Feliz', 'Cuidando da sua saúde dental', 'Rua João Pessoa, 567'),
		('Clínica Saúde Total', 'Sua saúde, nossa prioridade', 'Avenida das Nações, 900'),
		('Clínica Horizonte', 'Cuidando de você em cada detalhe', 'Rua Rio de Janeiro, 123'),
		('Clínica Prime Care', 'Saúde e bem-estar para você e sua família', 'Rua das Américas, 45'),
		('Clínica São João', 'Profissionais qualificados para te atender', 'Rua Maranhão, 222'),
		('Clínica Vida Nova', 'Transformando sua saúde com carinho', 'Avenida São Carlos, 10'),
		('Clínica Esperança', 'Cuidando de você com confiança', 'Rua Amazonas, 678'),
		('Clínica Coração Alegre', 'Atendimento com amor e dedicação', 'Rua do Sol, 300'),
		('Clínica Saúde e Vida', 'Aqui, você encontra cuidados completos', 'Avenida Central, 700'),
		('Clínica Boa Saúde', 'Medicina de qualidade e atendimento humanizado', 'Rua do Comércio, 140');	  

INSERT INTO CLINICA.PACIENTE (NOME, CPF, IDADE, DAT_NASC)
VALUES('ANA CAROLINA SOUZA', '12345678909', 28, '1997-03-15'),
('BRUNO HENRIQUE SILVA', '98765432100', 35, '1990-11-22'),
('CARLOS EDUARDO LIMA', '32165498712', 42, '1983-06-10'),
('DANIELA MOURA RIBEIRO', '65498732198', 30, '1995-09-05'),
('EDUARDO PEREIRA GOMES', '74185296320', 25, '2000-08-28'),
('FERNANDA MARTINS ALVES', '85274136966', 33, '1992-12-01'),
('GUSTAVO NUNES FERREIRA', '96325874130', 38, '1987-04-18'),
('HELENA CASTRO MENEZES', '15975348644', 27, '1998-07-09'),
('ISABELA ROCHA SANTOS', '75315984211', 22, '2003-01-12'),
('JOÃO VICTOR ALMEIDA', '36925814777', 31, '1994-10-03');

INSERT INTO CLINICA.PACIENTE (NOME, CPF, IDADE, DAT_NASC) 
VALUES  ('Ana Paula Ribeiro', '12345678901', 32, '1993-08-14'),
		('Bruno Henrique Silva', '98765432120', 45, '1980-05-22'),
		('Carla Mendes Lima', '32165498782', 29, '1996-11-03'),
		('Diego Santos Oliveira', '65498732998', 38, '1987-04-17'),
		('Elaine Souza Ferreira', '74185296380', 26, '1999-12-30'),
		('Fábio Castro Menezes', '85274137966', 41, '1984-07-09'),
		('Gisele Rocha Nogueira', '96325874160', 34, '1991-09-21'),
		('Henrique Lima Duarte', '15975348674', 53, '1972-03-12'),
		('Isadora Martins Costa', '75315984911', 22, '2003-06-01'),
		('João Pedro Almeida', '36925814707', 31, '1994-10-03');

		

INSERT INTO CLINICA.CONSULTA (ID_PACIENTE, ID_MEDICO, ID_CLINICA, DATA_CONSULTA, VALOR_CONSULTA)
VALUES(1, 4, 1, '2025-07-25 09:30:00-03', 150.00),
	  (10, 4, 1, '2025-07-25 10:30:00-03', 150.00),
	  (8, 4, 1, '2025-07-25 11:30:00-03', 150.00),
	  (3, 2, 3, '2025-07-28 09:30:00-03', 120.00),
	  (8, 1, 3, '2025-07-29 12:30:00-03', 180.00),
	  (4, 3, 1, '2025-07-20 15:45:00-03', 250.00),
	  (4, 4, 1, '2025-07-24 16:00:00-03', 250.00)

INSERT INTO CLINICA.CONSULTA (ID_PACIENTE, ID_MEDICO, ID_CLINICA, DATA_CONSULTA, VALOR_CONSULTA)
VALUES 	( 4, 15, 7, '2025-09-01 09:30:00-03', 200.00),
		(15, 3, 18, '2025-09-02 14:00:00-03', 250.00),
		( 9, 7, 5, '2025-09-03 08:45:00-03', 180.00),
		(17, 10, 12, '2025-09-04 10:15:00-03', 220.00),
		( 2, 19, 1, '2025-09-05 11:00:00-03', 190.00),
		( 6, 4, 16, '2025-09-06 13:30:00-03', 210.00),
		(24, 2, 9, '2025-09-07 15:00:00-03', 230.00),
		( 1, 20, 3, '2025-09-08 07:45:00-03', 170.00),
		( 8, 11, 6, '2025-09-09 16:30:00-03', 260.00),
		(20, 5, 14, '2025-09-10 12:00:00-03', 195.00),
		( 5, 12, 3, '2025-09-02 09:30:00-03', 250.00),
		( 8, 7, 15, '2025-09-05 11:30:00-03', 180.00),
		(23, 4, 10, '2025-08-28 12:30:00-03', 300.00),
		( 3, 16, 8, '2025-09-10 13:30:00-03', 220.00),
		(10, 2, 1, '2025-09-12 16:30:00-03', 150.00),
		(17, 19, 5, '2025-09-04 17:30:00-03', 200.00),
		( 1, 1, 2, '2025-09-15 09:30:00-03', 180.00),
		( 9, 6, 6, '2025-08-30 10:30:00-03', 275.00),
		( 6, 11, 14, '2025-09-01 11:30:00-03', 320.00),
		(20, 8, 18, '2025-09-07 12:30:00-03', 210.00);

INSERT INTO CLINICA.CONSULTA (ID_PACIENTE, ID_MEDICO, ID_CLINICA, DATA_CONSULTA, VALOR_CONSULTA)
VALUES	(3, 15, 7, '2025-09-01 09:30:00', 250.00),
		(22, 1, 5, '2025-09-02 14:15:00', 180.00),
		(9, 20, 8, '2025-09-03 11:00:00', 220.00),
		(6, 14, 3, '2025-09-04 16:45:00', 195.00),
		(1, 9, 12, '2025-09-05 10:30:00', 210.00),
		(18, 5, 10, '2025-09-06 13:00:00', 230.00),
		(16, 2, 6, '2025-09-07 08:45:00', 175.00),
		(7, 19, 7, '2025-09-08 15:20:00', 260.00),
		(20, 11, 14, '2025-09-09 12:00:00', 240.00),
		(4, 3, 1, '2025-09-10 09:15:00', 200.00);


SELECT * FROM CLINICA.MEDICO  --24
SELECT * FROM CLINICA.CLINICA --23
SELECT * FROM CLINICA.PACIENTE --20
SELECT * FROM CLINICA.CONSULTA

==================================================================================================

SELECT  P.NOME, P.CPF, 
		M.NOME AS NME_MEDICO,
		M.ESPECIALIDADE,
		CLI.NOME AS CLINICA,
		C.DATA_CONSULTA, C.VALOR_CONSULTA		
FROM 	CLINICA.PACIENTE P,
		CLINICA.CONSULTA C,
		CLINICA.MEDICO M,
		CLINICA.CLINICA CLI
WHERE 	P.ID_PACIENTE = C.ID_PACIENTE
AND 	C.ID_MEDICO = M.ID_MEDICO
AND 	C.ID_CLINICA = CLI.ID_CLINICA;