--init requetes


-- MAROUANE 

 /*Selectionner les pays avec ses poules*/
SELECT pa.NOM,po.NOM from PAYS pa 
	INNER JOIN POULE_PAYS pp on pp.ID_PAYS = pa.ID_PAYS 
    INNER JOIN POULE po on po.ID_POULE = pp.ID_POULE;
    
/*Selectionner les pays d'un poule donner*/
SELECT pa.NOM,po.NOM from PAYS pa 
	INNER JOIN POULE_PAYS pp on pp.ID_PAYS = pa.ID_PAYS 
	INNER JOIN POULE po on po.ID_POULE = pp.ID_POULE 
	where po.NOM = 'A' 
	
/*lister les equipes d'une tournoi*/
SELECT pa.NOM FROM PAYS pa
	INNER JOIN POULE_PAYS pp on pp.ID_PAYS = pa.ID_PAYS 
    INNER JOIN POULE po on po.ID_POULE = pp.ID_POULE AND po.GROUPE = 1
	INNER JOIN COMPETITION co on co.ID_COMPETITION = po.ID_COMPETITION
    where po.GROUPE = 1;
    
/*nbr des equipes d'un tournoi*/
SELECT count(1) FROM PAYS pa
	INNER JOIN POULE_PAYS pp on pp.ID_PAYS = pa.ID_PAYS 
    INNER JOIN POULE po on po.ID_POULE = pp.ID_POULE AND po.GROUPE = 1
	INNER JOIN COMPETITION co on co.ID_COMPETITION = po.ID_COMPETITION
    where po.GROUPE = 1;

-- AMINE


--MOHAMED











-- select les pays de tous les poules
select po.NOM, pa.NOM from POULE po 
	inner join POULE_PAYS pp on po.ID_POULE = pp.ID_POULE 
	inner join PAYS pa on pa.ID_PAYS = pp.ID_PAYS;
	

