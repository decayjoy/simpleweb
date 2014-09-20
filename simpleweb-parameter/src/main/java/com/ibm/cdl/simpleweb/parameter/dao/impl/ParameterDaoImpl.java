package com.ibm.cdl.simpleweb.parameter.dao.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.ibm.cdl.simpleweb.parameter.dao.ParameterDao;
import com.ibm.cdl.simpleweb.parameter.entity.Parameter;

@Repository("parameterDao")
public class ParameterDaoImpl implements ParameterDao {

	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public void deleteInBatch(Iterable<Parameter> arg0) {
		// TODO Auto-generated method stub
		
	}

	public List<Parameter> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Parameter> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Parameter> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public Parameter getOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Parameter> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Parameter> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Parameter> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Parameter arg0) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends Parameter> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Parameter findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Parameter> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
