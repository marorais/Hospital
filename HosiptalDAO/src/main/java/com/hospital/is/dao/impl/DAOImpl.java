package com.hospital.is.dao.impl;

import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.DAO;

public class DAOImpl<Entity> implements DAO<Entity> {

	private StaticDatabase<Entity> staticDatabase = new StaticDatabase<>();

	private Class<Entity> clazz;

	public DAOImpl(Class<Entity> clazz) {
		this.clazz = clazz;
	}

	@Override
	public Entity create(Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Long, Entity> getAll() {
		try {
			return staticDatabase.getMap(clazz.newInstance());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Entity getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity update(Entity entity, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
