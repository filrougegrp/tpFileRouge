--init requetes











-- select les pays de tous les poules
select po.NOM, pa.NOM from POULE po 
	inner join POULE_PAYS pp on po.ID_POULE = pp.ID_POULE 
	inner join PAYS pa on pa.ID_PAYS = pp.ID_PAYS;
	