package com.ibm.cdl.simpleweb.parameter.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.Repository;

import com.ibm.cdl.simpleweb.parameter.entity.Parameter;

public interface ParameterDao extends Repository<Parameter, String> {

	// public void deleteAllInBatch();

	// public void deleteInBatch(Iterable<Parameter> arg0);

	public List<Parameter> findAll();

	public List<Parameter> findAll(Sort arg0);

	public List<Parameter> findAll(Iterable<String> arg0);

	// public void flush();

	public Parameter getOne(String arg0);

	// public <S extends Parameter> List<S> save(Iterable<S> arg0);

	// public <S extends Parameter> S saveAndFlush(S arg0);

	public Page<Parameter> findAll(Pageable arg0);

	public long count();

	// public void delete(String arg0);

	// public void delete(Parameter arg0);

	// public void delete(Iterable<? extends Parameter> arg0);

	// public void deleteAll();

	public boolean exists(String arg0);

	public Parameter findOne(String arg0);

	public <S extends Parameter> S save(S arg0);

}
