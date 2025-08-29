
INSERT INTO ECOMMERCE.CLIENTE (NOME_COMPLETO, EMAIL, SENHA, TELEFONE, DATA_CADASTRO) 
VALUES
('ANA PAULA RIBEIRO', 'ANA.RIBEIRO@EXAMPLE.COM', 'SENHA123', '(11) 98765-4321', '2024-05-10'),
('BRUNO HENRIQUE SILVA', 'BRUNO.SILVA@EXAMPLE.COM', 'ABC@1234', '(21) 99876-5432', '2023-12-01'),
('CARLA MENDES LIMA', 'CARLA.LIMA@EXAMPLE.COM', 'CARLA2024', '(31) 91234-5678', '2025-01-15'),
('DIEGO SANTOS OLIVEIRA', 'DIEGO.OLIVEIRA@EXAMPLE.COM', 'DIEG0!2023', '(41) 93456-7890', '2023-11-20'),
('ELAINE SOUZA FERREIRA', 'ELAINE.FERREIRA@EXAMPLE.COM', 'EFERREIRA!', '(51) 97654-3210', '2024-02-25'),
('FÁBIO CASTRO MENEZES', 'FABIO.MENEZES@EXAMPLE.COM', 'FABI0CASTRO', '(61) 98712-3456', '2025-04-10'),
('GISELE ROCHA NOGUEIRA', 'GISELE.NOGUEIRA@EXAMPLE.COM', 'GISELE#2023', '(71) 91234-9876', '2023-10-05'),
('HENRIQUE LIMA DUARTE', 'HENRIQUE.DUARTE@EXAMPLE.COM', 'HDUARTE22', '(81) 99887-6655', '2024-08-18'),
('ISADORA MARTINS COSTA', 'ISADORA.COSTA@EXAMPLE.COM', 'ISAMAR123', '(91) 97654-8877', '2025-03-30'),
('JOÃO PEDRO ALMEIDA', 'JOAO.ALMEIDA@EXAMPLE.COM', 'JP_ALMEIDA!', '(31) 93456-7788', '2024-06-22'),
('LUCAS ALMEIDA PEREIRA', 'LUCAS.PEREIRA@EXAMPLE.COM', 'LUCASP@123', '(11) 91234-5678', '2024-07-10 10:30:00'),
('MARIANA SILVA COSTA', 'MARIANA.COSTA@EXAMPLE.COM', 'MARIANA!456', '(21) 99876-4321', '2023-09-15 14:45:00'),
('PEDRO HENRIQUE SOUZA', 'PEDRO.SOUZA@EXAMPLE.COM', 'PEDRO789', '(31) 93456-1234', '2025-02-20 09:10:00'),
('AMANDA OLIVEIRA ROCHA', 'AMANDA.ROCHA@EXAMPLE.COM', 'AMANDA@2024', '(41) 98765-4321', '2023-11-05 18:20:00'),
('FELIPE SANTOS LIMA', 'FELIPE.LIMA@EXAMPLE.COM', 'FELIPE#321', '(51) 97654-2109', '2024-03-25 07:50:00'),
('BIANCA MARTINS NUNES', 'BIANCA.NUNES@EXAMPLE.COM', 'BIANCA$2023', '(61) 99887-6543', '2025-05-15 13:40:00'),
('GUSTAVO ROCHA MENDES', 'GUSTAVO.MENDES@EXAMPLE.COM', 'GUSTAVO999', '(71) 91234-8765', '2023-10-10 12:05:00'),
('JULIANA CASTRO FERNANDES', 'JULIANA.FERNANDES@EXAMPLE.COM', 'JULIANA@789', '(81) 98765-4320', '2024-08-18 15:55:00'),
('RENATO CARVALHO ALVES', 'RENATO.ALVES@EXAMPLE.COM', 'RENATO#111', '(91) 97654-4433', '2025-01-30 10:15:00'),
('SABRINA LIMA TORRES', 'SABRINA.TORRES@EXAMPLE.COM', 'SABRINA123', '(31) 93456-7788', '2024-06-22 16:45:00');

select * from ecommerce.cliente

INSERT INTO ecommerce.categoria (nome_categoria, descricao) 
VALUES
('Eletrônicos', 'Produtos eletrônicos como celulares, computadores e acessórios.'),
('Moda', 'Roupas, calçados e acessórios de moda para todas as idades.'),
('Beleza', 'Produtos de cuidados pessoais, maquiagem e cosméticos.'),
('Alimentos', 'Produtos alimentícios frescos, congelados e enlatados.'),
('Móveis', 'Móveis para casa, escritório e decoração.'),
('Esportes', 'Equipamentos e acessórios esportivos para diversas modalidades.'),
('Brinquedos', 'Brinquedos e jogos para crianças de várias idades.'),
('Livros', 'Livros de diversos gêneros e para todas as idades.'),
('Automotivo', 'Peças, acessórios e produtos para veículos automotores.'),
('Informática', 'Computadores, periféricos, softwares e acessórios.'),
('Jardinagem', 'Ferramentas e produtos para jardinagem e paisagismo.'),
('Saúde', 'Produtos para saúde, bem-estar e cuidados médicos.'),
('Casa e Cozinha', 'Utensílios domésticos, eletrodomésticos e artigos para cozinha.'),
('Papelaria', 'Materiais de escritório, escolar e papelaria em geral.'),
('Telefonia', 'Aparelhos telefônicos, smartphones e acessórios relacionados.');

select * from ecommerce.categoria

INSERT INTO ecommerce.endereco_de_entrega (cliente_id, logradouro, numero, complemento, bairro, cidade, estado, cep) 
VALUES
(1, 'Rua das Flores', 123, 'Apto 101', 'Jardim Primavera', 'São Paulo', 'SP', '01001-000'),
(2, 'Avenida Brasil', 456, 'Casa', 'Centro', 'Rio de Janeiro', 'RJ', '20010-020'),
(3, 'Travessa da Paz', 789, '', 'Vila Nova', 'Belo Horizonte', 'MG', '30120-030'),
(4, 'Rua das Palmeiras', 321, 'Bloco B', 'Centro', 'Curitiba', 'PR', '80020-040'),
(5, 'Alameda Santos', 654, 'Sala 5', 'Jardins', 'São Paulo', 'SP', '01419-001'),
(6, 'Praça Sete', 987, '', 'Centro', 'Belo Horizonte', 'MG', '30110-050'),
(7, 'Rua das Acácias', 135, 'Casa', 'Vila Mariana', 'São Paulo', 'SP', '04110-060'),
(8, 'Avenida Atlântica', 246, 'Apto 502', 'Copacabana', 'Rio de Janeiro', 'RJ', '22070-070'),
(9, 'Rua das Orquídeas', 357, '', 'Jardim América', 'São Paulo', 'SP', '01449-080'),
(10, 'Travessa dos Jasmins', 468, 'Apto 201', 'Centro', 'Fortaleza', 'CE', '60010-090'),
(11, 'Rua das Hortênsias', 579, '', 'Lourdes', 'Belo Horizonte', 'MG', '30140-100'),
(12, 'Avenida dos Bandeirantes', 680, 'Bloco C', 'Moema', 'São Paulo', 'SP', '04532-110'),
(13, 'Rua do Sol', 791, '', 'Centro', 'Porto Alegre', 'RS', '90010-120'),
(14, 'Rua das Rosas', 802, 'Casa', 'Jardim Botânico', 'Curitiba', 'PR', '80210-130'),
(15, 'Avenida Paulista', 913, 'Sala 101', 'Bela Vista', 'São Paulo', 'SP', '01311-140'),
(16, 'Rua do Comércio', 124, '', 'Centro', 'Recife', 'PE', '50010-150'),
(17, 'Rua da Praia', 235, 'Apto 303', 'Boa Viagem', 'Recife', 'PE', '51020-160'),
(18, 'Travessa do Carmo', 346, '', 'Centro', 'Salvador', 'BA', '40010-170'),
(19, 'Rua das Laranjeiras', 457, 'Casa', 'Laranjeiras', 'Rio de Janeiro', 'RJ', '22240-180'),
(20, 'Avenida Ipiranga', 568, '', 'Centro', 'Porto Alegre', 'RS', '90020-190'),
(21, 'Rua dos Andradas', 679, 'Apto 404', 'Centro Histórico', 'Porto Alegre', 'RS', '90030-200');


INSERT INTO produto	 (categoria_id, nome_produto, descricao, estoque_disponivel) VALUES
(1, 'Smartphone Galaxy S21', 'Smartphone com tela AMOLED de 6.2", 128GB, 8GB RAM', 50),
(1, 'Notebook Dell Inspiron 15', 'Notebook com processador Intel i7, 16GB RAM, SSD 512GB', 30),
(1, 'Fone de Ouvido Bluetooth JBL', 'Fone sem fio com cancelamento de ruído e bateria de longa duração', 100),
(1, 'Smart TV Samsung 55"', 'Smart TV 4K UHD com HDR e Alexa integrada', 20),
(1, 'Tablet Apple iPad Air', 'Tablet com tela Retina de 10.9", 64GB, chip A14 Bionic', 25),
(1, 'Caixa de Som Bluetooth Sony', 'Caixa portátil com som estéreo potente e bateria de 12h', 75),
(1, 'Monitor LG 27" 4K', 'Monitor UHD 4K com conexão HDMI e DisplayPort', 40),
(1, 'Câmera Digital Canon EOS', 'Câmera DSLR com sensor CMOS de 24.1MP e lente 18-55mm', 15),
(1, 'Smartwatch Xiaomi Mi Band 6', 'Pulseira inteligente com monitoramento de saúde e notificações', 80),
(1, 'Roteador Wi-Fi TP-Link', 'Roteador dual band com velocidade até 1200Mbps e 4 antenas', 60);


--preciso de 10 exemplos de produtos com os dados categoria_id, nome de produto, descricao, estoque_disponivel, onde o id_categoria seja um relacionado a eletronicos
