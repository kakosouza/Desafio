package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.FornecedorDao;
import model.entities.Empresa;
import model.entities.Fornecedor;
import model.entities.EmprForn;

public class FornecedorDaoJDBC implements FornecedorDao {
	
	private Connection conn;
	
	public FornecedorDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Fornecedor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Fornecedor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String chave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Fornecedor findById(String chave) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
			        "SELECT f.*, e.Nome_Fantasia as Empresa "
			        + "FROM fornecedor f INNER JOIN emprforn a "
			        + "ON f.Chave = a.idforn "
			        + "INNER JOIN empresa e "
			        + "ON e.CNPJ = a.idempr "
			        + "WHERE f.Chave = ?");	
			
			st.setString(1, chave);
			rs = st.executeQuery();
			//Testo para ver se veio algum resultado da query
			if (rs.next()) {
/*				EmprForn emfo = new EmprForn();
				emfo.setEmpresa(rs.getString("idempr"));
				emfo.setFornecedor(rs.getString("idforn"));*/
//			    Empresa empr = new Empresa();	
			    //empr.setCnpj(rs.getString("CNPJ"));
//			    empr.setFantasia(rs.getString("Nome_Fantasia"));
				Fornecedor obj = new Fornecedor();
				obj.setChave(rs.getString("Chave"));
				obj.setNome(rs.getString("Nome"));
				obj.setRg(rs.getInt("RG"));
				obj.setDtNasc(rs.getDate("DtNascimento"));
				obj.setEmail(rs.getString("Email"));
				obj.setCep(rs.getString("CEP"));
				obj.setLograd(rs.getString("Logradouro"));
                obj.setNum(rs.getInt("Numero"));
				obj.setCompl(rs.getString("Complemento")); 
				obj.setCidade(rs.getString("Cidade")); 
				obj.setBairro(rs.getString("Bairro")); 
				obj.setEstado(rs.getString("Estado"));
				return obj;
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			//DB.closestatement(st);
		//	DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Fornecedor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
