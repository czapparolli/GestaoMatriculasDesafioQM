CREATE TABLE IF NOT EXISTS ALUNO(
	codigoAluno serial NOT NULL,
	nomeAluno VARCHAR (50) NOT NULL,
	cpf VARCHAR (11) NOT NULL,
	unique (CPF),
	PRIMARY KEY (codigoAluno)
);

CREATE TABLE IF NOT EXISTS PROFESSOR(
	codigoProfessor serial NOT NULL,
	nomeProfessor VARCHAR (50) NOT NULL,
	cpf VARCHAR (11) NOT NULL,
	unique (CPF),
	PRIMARY KEY (codigoProfessor)
	
);

CREATE TABLE IF NOT EXISTS DISCIPLINA(
	codigoDisciplina serial NOT NULL ,
	nomeDisciplina VARCHAR (50) NOT NULL,
	cargaHoraria INT NOT NULL,
	codigoProfessor INT NOT NULL,
	codigoMatricula serial NOT NULL,
	PRIMARY KEY (codigoDisciplina),
	FOREIGN KEY (codigoProfessor) REFERENCES PROFESSOR (codigoProfessor)
	
);

CREATE TABLE IF NOT EXISTS MATRICULA(
	codigoMatricula serial NOT NULL ,
	codigoDisciplina serial NOT NULL ,
	codigoAluno serial NOT NULL ,
	FOREIGN KEY (codigoDisciplina) REFERENCES DISCIPLINA (codigoDisciplina),
	FOREIGN KEY (codigoAluno) REFERENCES ALUNO (codigoAluno),
	PRIMARY KEY (codigoMatricula)
);