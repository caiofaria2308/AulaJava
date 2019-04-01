create database aulajava;
use aulajava;
create table aluno
(
	id int not null auto_increment primary key,
	nome varchar (40)
);
create table professor 
(
	id int not null auto_increment primary key,
	nome varchar (40)
);
create table curso
(
	id int not null auto_increment primary key,
	nome varchar (40)
);
create table disciplina
(
	id int not null auto_increment primary key,
	curso int not null,
	FOREIGN KEY (curso) REFERENCES curso(id)
);
create table turma 
(
	id int not null auto_increment primary key,
	prof_id int not null,
	disciplina_id int not null,
	foreign key (prof_id) references professor(id),
	foreign key (disciplina_id) references disciplina(id)
);
create table turmadealunos
(
	id int not null auto_increment primary key,
	turma int not null,
	aluno_id int not null,
	foreign key (turma) references turma(id),
	foreign key (aluno_id) references aluno (id)
);