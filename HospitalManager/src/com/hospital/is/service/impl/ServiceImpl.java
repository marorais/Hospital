package com.hospital.is.service.impl;

import java.util.Map;

import com.hospital.is.dao.DAO;
import com.hospital.is.dao.impl.DAOImpl;
import com.hospital.is.service.Service;

public class ServiceImpl<T> implements Service<T> {

	private DAO<T> dao;

	public ServiceImpl(Class<T> clazz) {
		dao = new DAOImpl<T>(clazz);
	}

	@Override
	public T create(T t) {
		return null;
	}

	@Override
	public Map<Long, T> getAll() {
		return dao.getAll();
	}

	@Override
	public T getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T update(T t, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
