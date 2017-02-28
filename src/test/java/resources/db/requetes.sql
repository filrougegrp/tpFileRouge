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
	
/*nombre d'equipe d'une tournoi*/
SELECT pa.COUNT(*) FROM PAYS pa
	INNER JOIN POULE_PAYS pp on pp.ID_PAYS = pa.ID_PAYS 
    INNER JOIN POULE po on po.ID_POULE = pp.ID_POULE;

-- AMINE


--MOHAMED