package model.dao;

import model.dao.impl.FornecedorDaoJDBC;

public class DaoFactory {

	public static FornecedorDao createFornecedorDao() {
		return new FornecedorDaoJDBC();
	}
}
