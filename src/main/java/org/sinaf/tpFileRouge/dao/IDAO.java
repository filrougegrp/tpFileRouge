package org.sinaf.tpFileRouge.dao;

import org.sinaf.tpFileRouge.exception.TechniqueException;

public interface IDAO<T> {

	T create(T model) throws TechniqueException;

	void update(T model) throws TechniqueException;

	T getById(Long id) throws TechniqueException;

	void delete(T model) throws TechniqueException;

}
