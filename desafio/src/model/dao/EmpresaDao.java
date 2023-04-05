package model.dao;

import java.util.List;

import model.entities.Empresa;

public interface EmpresaDao {

	void insert(Empresa obj);
	void update(Empresa obj);
	void deleteById(String cnpj);
	
	Empresa findById(String cnpj);
	List<Empresa> findAll();	
}
