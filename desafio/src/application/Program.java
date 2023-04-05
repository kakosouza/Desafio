package application;

import model.dao.DaoFactory;
import model.dao.FornecedorDao;
import model.entities.Fornecedor;

public class Program {

	public static void main(String[] args) {

		FornecedorDao fornecedorDao = DaoFactory.createFornecedorDao();
		
		Fornecedor forn = fornecedorDao.findById("00011111111111");
		
		System.out.println(forn);
	}

}
