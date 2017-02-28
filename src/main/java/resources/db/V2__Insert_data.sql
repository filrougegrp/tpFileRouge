--Insert ROLE
INSERT INTO ROLE values ("administrateur");
INSERT INTO ROLE values ("paricipant");

--Insert SALARIE
INSERT INTO SALARIE values("badouch","mohamed","badouch","mohamed",2);
INSERT INTO SALARIE values("saoud","amine","saoud","amine",2);
INSERT INTO SALARIE values("el merrouni","merouane","merrouni","marouane",2);

INSERT INTO SALARIE values("administrateur","administrateur","admin","admin",1);




--Insert COMPETITION
INSERT INTO `COMPETITION` (`NOM`, `ANNEE`) VALUES ('Coupe D\'Afrique Des Nations', '2016-12-1');

--Insert POULE 

INSERT INTO `POULE` (`NOM`, `ID_COMPETITION`) VALUES ('A', '1');
INSERT INTO `POULE` (`NOM`, `ID_COMPETITION`) VALUES ('B', '1');
INSERT INTO `POULE` (`NOM`, `ID_COMPETITION`) VALUES ('C', '1');
INSERT INTO `POULE` (`NOM`, `ID_COMPETITION`) VALUES ('D', '1');



--Insert PAYS

insert into PAYS (NOM,LOGO)
				values('Maroc','');
insert into PAYS (NOM,LOGO)
				values('Togo','');
insert into PAYS (NOM,LOGO)
				values('RD Congo','');
insert into PAYS (NOM,LOGO)
				values('Cote d\'Ivoire','');
insert into PAYS (NOM,LOGO)
				values('Ghana','');
insert into PAYS (NOM,LOGO)
				values('Mali','');
insert into PAYS (NOM,LOGO)
				values('Egypte','');
insert into PAYS (NOM,LOGO)
				values('Ouganda ','');
insert into PAYS (NOM,LOGO)
				values('Gabon','');
insert into PAYS (NOM,LOGO)
				values('Burkina Faso','');
insert into PAYS (NOM,LOGO)
				values('Cameroun','');
insert into PAYS (NOM,LOGO)
				values('Guinée Bissau','');
insert into PAYS (NOM,LOGO)
				values('Algérie','');
insert into PAYS (NOM,LOGO)
				values('Tunisie','');
insert into PAYS (NOM,LOGO)
				values('Sénégal','');
insert into PAYS (NOM,LOGO)
				values('Zimbabwe','');

				

--Insert MATCHE