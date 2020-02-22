/**
 * 
 */
package br.lrestoque.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * @author Lucas_Rodrigues
 * 21 de fev de 2020
 */
public class Conexao {

	private String url;
	private String usuario;
	private String senha;
	protected Connection con;
	protected PreparedStatement ps;
	protected ResultSet rs;
	
	/**
	 * @param url
	 * @param usuario
	 * @param senha
	 */
	public Conexao(String url, String usuario, String senha) {
		this.url = url;
		this.usuario = usuario;
		this.senha = senha;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	
	public void Conectar() {
		try {
			con = (Connection) DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexao realizada");
		}catch(SQLException ex) {
			System.out.println("Erro ao conectar: "+ex.getMessage());
		}
	}
	public void fechar() {
		try {
			con.close();
		}catch(SQLException ex) {
			System.out.println("Erro ao fechar: "+ex.getMessage());
		}
	}
}
