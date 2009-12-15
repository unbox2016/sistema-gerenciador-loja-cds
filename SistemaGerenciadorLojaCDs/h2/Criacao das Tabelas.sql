CREATE TABLE Conta (
  codigo INTEGER UNSIGNED NOT NULL,
  saldoTotal BIGINT NOT NULL,
  PRIMARY KEY(codigo)
);

CREATE TABLE Funcionario (
  Login VARCHAR(20) NOT NULL,
  Senha VARCHAR(20) NOT NULL,
  Nome VARCHAR(45) NOT NULL,
  CPF VARCHAR(20) NOT NULL,
  RG VARCHAR(20) NOT NULL,
  DNascimento DATE NOT NULL,
  Sexo VARCHAR(20) NOT NULL,
  Telefone VARCHAR(20) NOT NULL,
  Estado_civil VARCHAR(20) NOT NULL,
  isAdm BOOL NULL,
  PRIMARY KEY(Login)
);

CREATE TABLE Genero (
  Nome VARCHAR(20) NOT NULL,
  PRIMARY KEY(Nome)
);

CREATE TABLE Administrador (
  Funcionario_Login VARCHAR(20) NOT NULL,
  PRIMARY KEY(Funcionario_Login),
  FOREIGN KEY(Funcionario_Login)
    REFERENCES Funcionario(Login)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE Vendedor (
  Funcionario_Login VARCHAR(20) NOT NULL,
  Administrador_Funcionario_Login VARCHAR(20) NOT NULL,
  PRIMARY KEY(Funcionario_Login),
  FOREIGN KEY(Funcionario_Login)
    REFERENCES Funcionario(Login)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Administrador_Funcionario_Login)
    REFERENCES Administrador(Funcionario_Login)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE CD (
  ID INTEGER UNSIGNED NOT NULL,
  Funcionario_Login VARCHAR(20) NOT NULL,
  Genero_Nome VARCHAR(20) NOT NULL,
  Titulo VARCHAR(45) NOT NULL,
  Ano INTEGER UNSIGNED NOT NULL,
  Artista VARCHAR(45) NOT NULL,
  Duracao INTEGER UNSIGNED NOT NULL,
  NFaixas INTEGER UNSIGNED NOT NULL,
  Quantidade INTEGER UNSIGNED NOT NULL,
  Disponibilidade BOOL NOT NULL,
  Lançamento BOOL NOT NULL,
  Preco FLOAT NOT NULL,
  PRIMARY KEY(ID),
  FOREIGN KEY(Genero_Nome)
    REFERENCES Genero(Nome)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Funcionario_Login)
    REFERENCES Funcionario(Login)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE Cliente (
  CPF VARCHAR(20) NOT NULL,
  Conta_codigo INTEGER UNSIGNED NOT NULL,
  Funcionario_Login VARCHAR(20) NOT NULL,
  RG VARCHAR(20) NOT NULL,
  Nome VARCHAR(45) NOT NULL,
  Sexo VARCHAR(20) NOT NULL,
  Telefone VARCHAR(20) NOT NULL,
  Estado_civil VARCHAR(20) NOT NULL,
  DNascimento DATE NOT NULL,
  PRIMARY KEY(CPF),
  FOREIGN KEY(Funcionario_Login)
    REFERENCES Funcionario(Login)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Conta_codigo)
    REFERENCES Conta(codigo)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE Venda (
  Vendedor_Funcionario_Login VARCHAR(20) NOT NULL,
  Cliente_CPF VARCHAR(20) NOT NULL,
  CD_ID INTEGER UNSIGNED NOT NULL,
  QuantidadeCDSVendidos INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Vendedor_Funcionario_Login, Cliente_CPF, CD_ID),
  FOREIGN KEY(Vendedor_Funcionario_Login)
    REFERENCES Vendedor(Funcionario_Login)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Cliente_CPF)
    REFERENCES Cliente(CPF)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(CD_ID)
    REFERENCES CD(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE Pedidos (
  Codigo INTEGER UNSIGNED NOT NULL,
  Cliente_CPF VARCHAR(20) NOT NULL,
  Conteudo VARCHAR(255) NOT NULL,
  PRIMARY KEY(Codigo, Cliente_CPF),
  FOREIGN KEY(Cliente_CPF)
    REFERENCES Cliente(CPF)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE Reclamacoes (
  Codigo INTEGER UNSIGNED NOT NULL,
  Cliente_CPF VARCHAR(20) NOT NULL,
  Conteudo VARCHAR(255) NOT NULL,
  PRIMARY KEY(Codigo, Cliente_CPF),
  FOREIGN KEY(Cliente_CPF)
    REFERENCES Cliente(CPF)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE Faturamento (
  ID INTEGER UNSIGNED NOT NULL,
  Venda_CD_ID INTEGER UNSIGNED NOT NULL,
  Venda_Cliente_CPF VARCHAR(20) NOT NULL,
  Venda_Vendedor_Funcionario_Login VARCHAR(20) NOT NULL,
  QuantidadeCDS INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(ID, Venda_CD_ID, Venda_Cliente_CPF, Venda_Vendedor_Funcionario_Login),
  FOREIGN KEY(Venda_Vendedor_Funcionario_Login, Venda_Cliente_CPF, Venda_CD_ID)
    REFERENCES Venda(Vendedor_Funcionario_Login, Cliente_CPF, CD_ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE Relatorio (
  Data_2 DATE NOT NULL,
  Hora TIME NOT NULL,
  Administrador_Funcionario_Login VARCHAR(20) NOT NULL,
  Faturamento_Venda_Vendedor_Funcionario_Login VARCHAR(20) NOT NULL,
  Faturamento_Venda_Cliente_CPF VARCHAR(20) NOT NULL,
  Faturamento_Venda_CD_ID INTEGER UNSIGNED NOT NULL,
  Faturamento_ID INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Data_2, Hora),
  FOREIGN KEY(Faturamento_ID, Faturamento_Venda_CD_ID, Faturamento_Venda_Cliente_CPF, Faturamento_Venda_Vendedor_Funcionario_Login)
    REFERENCES Faturamento(ID, Venda_CD_ID, Venda_Cliente_CPF, Venda_Vendedor_Funcionario_Login)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Administrador_Funcionario_Login)
    REFERENCES Administrador(Funcionario_Login)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

