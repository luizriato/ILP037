INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) VALUES
(101, 'Banco do Brasil', 'Av. Dom Aguirre, 123', '12345-67', NULL, 'Centro', 'Sorocaba', 'SP', '18010000', '(15)3333-3333'),
(102, 'Itaú Unibanco', 'Rua São Paulo, 456', '23456-78', NULL, 'Vila Helena', 'Sorocaba', 'SP', '18020000', '(15)4444-4444'),
(103, 'Santander', 'Praça da Independência, 789', '34567-89', 'Sala 10', 'Centro', 'Votorantim', 'SP', '18045000', '(15)5555-5555'),
(104, 'Bradesco', 'Av. 9 de Julho, 101', '45678-90', NULL, 'Jardim São Paulo', 'Sorocaba', 'SP', '18030000', '(15)6666-6666'),
(105, 'Caixa Econômica', 'Rua Silva Jardim, 234', '56789-01', 'Térreo', 'Jardim Vitória', 'Salto de Pirapora', 'SP', '18180000', '(15)7777-7777');

INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) VALUES
(1, 'Luiz Fernando R. Riato', 'Rua da Paz, 11', '98765-43', NULL, 'Centro', 'Sorocaba', 'SP', '18010100', '(15)9999-1111', '12345678901', '15-01-1980', NULL),
(2, 'Ana Clara da Silva', 'Av. das Flores, 22', '87654-32', NULL, 'Jardim Vitória', 'Sorocaba', 'SP', '18030200', '(15)8888-2222', '23456789012', '20-02-2002', NULL),
(3, 'Marcos Paulo Lima', 'Rua das Acácias, 33', '76543-21', 'Casa 3', 'Vila Helena', 'Sorocaba', 'SP', '18020300', '(15)7777-3333', '34567890123', '25-03-1987', NULL),
(4, 'Tatiane Souza', 'Rua das Orquídeas, 44', '65432-10', NULL, 'Jardim São Paulo', 'Votorantim', 'SP', '18045400', '(15)6666-4444', '45678901234', '30-04-1995', NULL),
(5, 'Rafael Almeida', 'Av. João Ribeiro, 55', '54321-09', NULL, 'Jardim Vitória', 'Salto de Pirapora', 'SP', '18180500', '(15)5555-5555', '56789012345', '05-05-1999', NULL);

INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES
(1, 'Depósito'),
(2, 'Saque'),
(3, 'Transferência'),
(4, 'Pagamento'),
(5, 'Consulta Saldo');

INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES
(101, 1234567890, 1, 1500.00),
(102, 2345678901, 2, 3000.50),
(103, 3456789012, 3, 750.00),
(104, 4567890123, 4, 1200.75),
(105, 5678901234, 5, 4500.20);

INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES
('luiz123', 'senhaLuiz', 101, 1234567890),
('ana456', 'senhaAna', 102, 2345678901),
('marcos789', 'senhaMarcos', 103, 3456789012),
('tatiane012', 'senhaTatiane', 104, 4567890123),
('rafael345', 'senhaRafael', 105, 5678901234);

INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO) VALUES
(101, 1234567890, '2023-09-01', 'DOC123', 'D', 1, 'Depósito via app', 500.00, 2000.00),
(102, 2345678901, '2023-09-02', 'DOC456', 'C', 2, 'Saque ATM', 1500.00, 1500.50),
(103, 3456789012, '2023-09-03', 'DOC789', 'D', 3, 'Transferência', 750.00, 1500.00),
(104, 4567890123, '2023-09-04', 'DOC012', 'C', 4, 'Pagamento de conta', 200.00, 1000.75),
(105, 5678901234, '2023-09-05', 'DOC345', 'D', 5, 'Consulta Saldo', 0.00, 4500.20);


