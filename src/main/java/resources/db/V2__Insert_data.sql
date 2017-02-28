--Insert ROLE
INSERT INTO role values (null,"administrateur");
INSERT INTO role values (null,"paricipant");

--Insert SALARIE
INSERT INTO salarie values(null,"badouch","mohamed","badouch","mohamed",2);
INSERT INTO salarie values(null,"saoud","amine","saoud","amine",2);
INSERT INTO salarie values(null,"el merrouni","merouane","merrouni","marouane",2);

INSERT INTO salarie values(null,"administrateur","administrateur","admin","admin",1);




--Insert COMPETITION
INSERT INTO `COMPETITION` (`NOM`, `ANNEE`) VALUES ('Coupe D\'Afrique Des Nations', '2016-12-1');

--Insert POULE 

INSERT INTO `POULE` (`NOM`, `ID_COMPETITION`) VALUES ('A', '1');
INSERT INTO `POULE` (`NOM`, `ID_COMPETITION`) VALUES ('B', '1');
INSERT INTO `POULE` (`NOM`, `ID_COMPETITION`) VALUES ('C', '1');
INSERT INTO `POULE` (`NOM`, `ID_COMPETITION`) VALUES ('D', '1');



--Insert PAYS


--Insert MATCHE