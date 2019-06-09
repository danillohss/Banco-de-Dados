create database Loja_DB
default charset UTF8
default collate utf8_general_ci;
use Loja_DB;

Create table Cliente (
CPF_Cliente int(13) not null,
nome varchar(30),
rua varchar(30),
bairro varchar(30),
cidade varchar(20),
constraint PK_Cliente primary key(CPF_Cliente)
);

Create Table Cliente_Telefone(
CPF_Cliente int(13) not null,
telefone int not null,
constraint PK_Cliente_Telefone primary key(CPF_Cliente,Telefone),
constraint FK_Cliente_Cliente_Telefone foreign key (CPF_Cliente) references Cliente (CPF_Cliente)
);

Create Table pedido(
Nº_Pedido int not null,
CPF_Cliente int(13) not null,
constraint PK_Pedido primary key(Nº_Pedido),
constraint FK_Cliente_pedido foreign key(CPF_Cliente) references Cliente (CPF_Cliente)
);

Create table Gerente(
CPF_Gerente int(13) not null,
nome varchar (30),
constraint PK_Gerente primary key (CPF_Gerente)
);

Create Table funcionario(
CPF_Funcionario int(13) not null,
CPF_Gerente int(13) not null,
horas_trabalhadas time,
nome varchar(30),
constraint PK_Funcionario primary key(CPF_Funcionario),
constraint FK_Gerente_Funcionario foreign key(CPF_Gerente) references Gerente (CPF_Gerente)
);

Create Table Cliente_Funcionario(
CPF_Funcionario int(13) not null,
CPF_Cliente int(13) not null,
Constraint PK_Cliente_Funcionario primary key(CPF_Funcionario,CPF_Cliente),
constraint FK_Cliente_Cliente_Funcionario foreign key(CPF_Cliente) references cliente(CPF_Cliente)
);

Create Table gerente_telefone(
CPF_Gerente int(13) not null,
telefone int not null,
constraint PK_Gerente_Telefone primary key(CPF_Gerente,Telefone),
constraint FK_Gerente_Gerente_Telefone foreign key(CPF_Gerente) references gerente(CPF_Gerente)
);

Create Table Funcionario_Telefone(
CPF_Funcionario int(13) not null,
Telefone int not null,
constraint PK_Funcionario_Telefone primary key(CPF_Funcionario,Telefone),
constraint FK_Gerente_Gerente_Telefone foreign key(CPF_Funcionario) references funcionario(CPF_Funcionario)
);

Create Table Vendas(
Nota_Fiscal int not null,
preco decimal (3,2),
constraint PK_Vendas primary key(Nota_Fiscal)
);

Create Table Notas(
Codigo_Fiscal int not null,
Impressao longtext,
DataNota date,
constraint PK_Notas primary key (codigo_fiscal)
);

Create Table Funcionario_Vendas(
CPF_Funcionario int(13) not null,
Nota_Fiscal int,
constraint PK_Funcionario_Vendas primary key(CPF_Funcionario,Nota_Fiscal),
constraint FK_Funcionario_Funcionario_Vendas foreign key(CPF_Funcionario) references funcionario(CPF_Funcionario)
);

Create Table Produto(
Codigo_Roupa int not null,
Nº_Rastreio int,
Constraint PK_Produto primary key(Codigo_Roupa)
);

Create Table Transportadora(
Nº_Pedido int not null,
Marca varchar(30),
Preco_Frete decimal (4,2),
Constraint PK_Transportadora primary key (Nº_Pedido)
);

Create Table Fornecedores(
CNPJ int not null,
Marca varchar(20),
Constraint PK_Fornecedores primary key (CNPJ)
);

Create Table Fornecedores_Produto(
CNPJ_Fornecedor int not null,
Codigo_Roupa int not null,
constraint PK_Fornecedores_Produto primary key(CNPJ_Fornecedores,Codigo_Roupa),
constraint FK_Produto_Fornecedor_Produto foreign key(Codigo_Roupa) references produto(Codigo_Roupa)
);