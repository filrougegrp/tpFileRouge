--Insert ROLE
INSERT INTO `ROLE` (`NOM`) VALUES ( 'ROLE_ADMIN');
INSERT INTO `ROLE` ( `NOM`) VALUES ( 'ROLE_USER');

--Insert SALARIE
INSERT INTO `SALARIE` ( `NOM`, `PRENOM`, `USERNAME`, `PASSWORD`, `ID_ROLE`) VALUES ('Badouch', 'mohamed', 'badouch', 'password', '2');
INSERT INTO `SALARIE` ( `NOM`, `PRENOM`, `USERNAME`, `PASSWORD`, `ID_ROLE`) VALUES ('el merrouni', 'marouane', 'marouane', 'password', '2');
INSERT INTO `SALARIE` ( `NOM`, `PRENOM`, `USERNAME`, `PASSWORD`, `ID_ROLE`) VALUES ('saoud', 'amine', 'saoud', 'password', '2');

INSERT INTO `SALARIE` ( `NOM`, `PRENOM`, `USERNAME`, `PASSWORD`, `ID_ROLE`) VALUES ('akouz', 'mohamed', 'admin', 'admin', '1');





--Insert COMPETITION
INSERT INTO `COMPETITION` (`NOM`, `ANNEE`) VALUES ('Coupe D\'Afrique Des Nations', '2016-12-1');

--Insert POULE 

INSERT INTO POULE (NOM, ID_COMPETITION) VALUES ('A', '1');
INSERT INTO POULE (NOM, ID_COMPETITION) VALUES ('B', '1');
INSERT INTO POULE (NOM, ID_COMPETITION) VALUES ('C', '1');
INSERT INTO POULE (NOM, ID_COMPETITION) VALUES ('D', '1');



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
				
				
--Insert POUL PAYS

INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('1', '9');
INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('1', '10');
INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('1', '11');
INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('1', '12');

INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('2', '13');
INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('2', '14');
INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('2', '15');
INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('2', '16');

INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('3', '1');
INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('3', '2');
INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('3', '3');
INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('3', '4');

INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('4', '8');
INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('4', '5');
INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('4', '6');
INSERT INTO `POULE_PAYS` (`ID_POULE`, `ID_PAYS`) VALUES ('4', '7');

				

--Insert MATCHE


INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-01 16:00:00', NULL, NULL, '9', '10', '1');
INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-01 19:00:00', NULL, NULL, '11', '12', '1');

INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-02 16:00:00', NULL, NULL, '13', '14', '2');
INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-02 19:00:00', NULL, NULL, '15', '16', '2');

INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-03 16:00:00', NULL, NULL, '1', '2', '3');
INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-03 19:00:00', NULL, NULL, '4', '3', '3');

INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-04 16:00:00', NULL, NULL, '5', '6', '4');
INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-04 19:00:00', NULL, NULL, '7', '8', '4');


INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-05 16:00:00', NULL, NULL, '9', '11', '1');
INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-05 19:00:00', NULL, NULL, '10', '12', '1');

INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-06 16:00:00', NULL, NULL, '14', '15', '2');
INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-06 19:00:00', NULL, NULL, '13', '16', '2');

INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-07 16:00:00', NULL, NULL, '1', '3', '3');
INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-07 19:00:00', NULL, NULL, '4', '2', '3');

INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ('2016-12-08 16:00:00', NULL, NULL, '5', '8', '4');
INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-08 19:00:00', NULL, NULL, '6', '7', '4');


INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-09 16:00:00', NULL, NULL, '9', '12', '1');
INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-09 19:00:00', NULL, NULL, '11', '10', '1');

INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-10 16:00:00', NULL, NULL, '14', '16', '2');
INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-10 19:00:00', NULL, NULL, '13', '15', '2');

INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-11 16:00:00', NULL, NULL, '1', '4', '3');
INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ('2016-12-11 19:00:00', NULL, NULL, '2', '3', '3');

INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-12 16:00:00', NULL, NULL, '5', '7', '4');
INSERT INTO `MATCH` ( `DATE`, `BUT_1`, `BUT_2`, `ID_PAYS_1`, `ID_PAYS_2`, `ID_POULE`) VALUES ( '2016-12-12 19:00:00', NULL, NULL, '6', '8', '4');





-- PRONOSTIC

INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('1', '0', '0', '1', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('5', '4', '0', '2', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('0', '4', '0', '3', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('4', '6', '0', '4', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('2', '0', '0', '5', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('1', '4', '0', '6', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('0', '6', '0', '7', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('4', '2', '0', '8', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('1', '2', '0', '9', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('2', '6', '0', '10', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('0', '6', '0', '11', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('2', '0', '0', '12', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('2', '6', '0', '13', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('5', '0', '0', '14', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('5', '5', '0', '15', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('4', '1', '0', '16', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('3', '5', '0', '17', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('2', '6', '0', '18', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('4', '3', '0', '19', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('4', '0', '0', '20', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('2', '6', '0', '21', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('6', '0', '0', '22', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('1', '0', '0', '23', '2');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('6', '6', '0', '24', '2');

INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('0', '0', '0', '1', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('5', '5', '0', '2', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('4', '1', '0', '3', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('0', '5', '0', '4', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('0', '5', '0', '5', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('3', '0', '0', '6', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('0', '2', '0', '7', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('0', '6', '0', '8', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('4', '4', '0', '9', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('6', '1', '0', '10', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('1', '2', '0', '11', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('5', '0', '0', '12', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('3', '2', '0', '13', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('2', '4', '0', '14', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('2', '5', '0', '15', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('5', '5', '0', '16', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('5', '0', '0', '17', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('0', '4', '0', '18', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('0', '1', '0', '19', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('2', '0', '0', '20', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('0', '5', '0', '21', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('6', '4', '0', '22', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('0', '1', '0', '23', '3');
INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('1', '1', '0', '24', '3');
























