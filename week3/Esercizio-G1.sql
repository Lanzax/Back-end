
CREATE TABLE clienti(
	numeclienti serial  NOT NULL PRIMARY KEY,
	nome varchar NOT NULL ,
	cognome varchar NOT NULL ,
	datanascita date NOT NULL,
	regioneresidenza varchar NOT NULL
)
DROP TABLE clienti;
CREATE TABLE fatture(
	numfattura serial  NOT NULL PRIMARY KEY,
	tipologia varchar NOT NULL ,
	imp int NOT NULL,
	impiva int NOT NULL  ,
	idcliente int NOT NULL,
	datafattura date NOT NULL,
	numfornitore int NOT NULL
)
DROP TABLE fatture;
CREATE TABLE prodotti(
	idprodotto serial  NOT NULL PRIMARY KEY,
	descrizione varchar NOT NULL ,
	inproduzione bool NOT NULL ,
	incommercio bool NOT NULL,
	dataattivazione date NOT NULL,
	datadisattivazione date NOT NULL
)

CREATE TABLE fornitori(
	numfornitore serial  NOT NULL PRIMARY KEY,
	denominazione varchar NOT NULL ,
	regioneresidenza varchar NOT NULL 
)

INSERT INTO clienti (nome,cognome,datanascita,regioneresidenza)
VALUES ('FLAVIO','FERRANTE','2002-01-30','LAZIO')
INSERT INTO clienti (nome,cognome,datanascita,regioneresidenza)
VALUES ('LUIGI','FOSSIANI','1985-09-30','POLONIA')
INSERT INTO clienti (nome,cognome,datanascita,regioneresidenza)
VALUES ('PROMI','ABU','1966-09-30','RUSSIA')

select * from clienti;

INSERT INTO fatture (tipologia,imp,impiva,idcliente,datafattura,numfornitore)
VALUES ('ELETTRONICA',20,20,962662,'2000-03-06',4562456)
INSERT INTO fatture (tipologia,imp,impiva,idcliente,datafattura,numfornitore)
VALUES ('ELETTRONICA',44,44,455445,'1980-03-06',7474477)
INSERT INTO fatture (tipologia,imp,impiva,idcliente,datafattura,numfornitore)
VALUES ('ELETTRONICA',12,12,455554,'1960-03-06',7574477)

select * from fatture;

INSERT INTO prodotti (descrizione,inproduzione,incommercio,dataattivazione,datadisattivazione)
VALUES ('BUONO',TRUE,FALSE,'2023-03-09','2023-06-09')
INSERT INTO prodotti (descrizione,inproduzione,incommercio,dataattivazione,datadisattivazione)
VALUES ('PESSIMO',TRUE,TRUE,'2023-04-09','2023-10-09')
INSERT INTO prodotti (descrizione,inproduzione,incommercio,dataattivazione,datadisattivazione)
VALUES ('DISCRETO',FALSE,FALSE,'2023-02-09','2023-11-09')

select * from prodotti;

INSERT INTO fornitori (denominazione,regioneresidenza)
VALUES ('BRT','LAZIO')
INSERT INTO fornitori (denominazione,regioneresidenza)
VALUES ('POSTEITALIANE','TOSCANA')
INSERT INTO fornitori (denominazione,regioneresidenza)
VALUES ('DHL','SICILIA')
select * from fornitori;

/*
--esercizio
SELECT nome , cognome FROM clienti WHERE TO_CHAR(datanascita, 'YYYY') = '1985';

--esercizio 2
SELECT numfattura FROM fatture WHERE impiva = 20;

--esercizio 3
SELECT  numfattura , SUM(imp) FROM fatture  WHERE TO_CHAR(datafattura, 'YYYY');
*/