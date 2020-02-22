/**
 * 
 */
package br.lrestoque.dao;

import java.util.HashSet;
import java.util.Set;

import br.lrestoque.entites.Produto;
import br.lrestoque.ex.MyException;

/**
 * @author Lucas_Rodrigues 21 de fev de 2020
 */
public class ProdutoDAO implements Crud<Produto> {
	Conexao conexao = new Conexao("", "", "");

	@Override
	public Set<Produto> listarTodos() throws MyException {
		try {
//			conexao.Conectar();
//			String sql = "";
//			conexao.ps = (PreparedStatement) conexao.con.prepareStatement(sql);
//			conexao.rs = conexao.ps.executeQuery();

			Set<Produto> result = new HashSet<Produto>();
			// GP 1
			result.add(new Produto(1, "Lapis", 1.98, 1, 50, 100));
			result.add(new Produto(2, "Borracha", 2.90, 1, 70, 120));
			result.add(new Produto(3, "Caneta", 3.55, 1, 120, 90));
			// GP 2
			result.add(new Produto(4, "TV", 990.00, 2, 20, 50));
			result.add(new Produto(5, "Mouse", 30.40, 2, 90, 80));
			result.add(new Produto(6, "celular", 700.20, 2, 100, 90));
			// GP 3
			result.add(new Produto(7, "Tapete", 20.0, 3, 10, 30));
			result.add(new Produto(8, "Sofa", 500.00, 3, 7, 22));
			result.add(new Produto(9, "rack", 300.20, 3, 30, 20));
			// GP 4
			result.add(new Produto(10, "Chinelo", 10.00, 4, 10, 30));
			result.add(new Produto(11, "bermuda", 100.00, 4, 30, 15));
			result.add(new Produto(12, "cobertor", 80.20, 4, 90, 100));

			return result;
		} catch (Exception e) {
			e.printStackTrace();
			throw new MyException("Erro ao listar produto: " + e.getMessage());

		}
	}

	@Override
	public Produto listarCodigo(int codigo) throws MyException {
		for (Produto p : listarTodos()) {
			if (p.getCodigo().equals(codigo)) {
				return p;
			}
		}
		return null;
	}
}