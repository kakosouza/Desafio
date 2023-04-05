package model.dao;

import java.util.List;

import model.entities.Fornecedor;

public interface FornecedorDao {

	void insert(Fornecedor obj);
	void update(Fornecedor obj);
	void deleteById(String chave);
	
	Fornecedor findById(String chave);
	List<Fornecedor> findAll();	
}
