package application;

import java.sql.Connection;

import db.DB;


public class Programa {
	boolean opcao = true;

	public static void main(String[] args) {

		Connection conn = DB.pegaConexao();
		
		DB.fechaConexao();
	}
}
