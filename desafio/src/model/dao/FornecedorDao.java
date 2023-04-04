package model.dao;

import java.util.List;

import model.entities.Fornecedor;

public interface FornecedorDao {

	void insert(Fornecedor obj);
	void update(Fornecedor obj);
	void deleteByChave(String chave);
	Fornecedor findByChave(String chave);
	List<Fornecedor> findAll();	
}
