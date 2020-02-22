/**
 * 
 */
package br.lrestoque.application;

import java.util.Set;

import br.lrestoque.entites.Produto;
import br.lrestoque.ex.MyException;
import br.lrestoque.service.ProdutoService;

/**
 * @author Lucas_Rodrigues 21 de fev de 2020
 */
public class Program {

	/**
	 * Metodo para teste
	 * 
	 * @param args
	 * @throws MyException
	 */
	public static void main(String[] args) throws MyException {
		ProdutoService service = new ProdutoService();
		Set<Produto> todosP = service.listarProdutos();
		Set<Produto> produtoC = service.listProdutosCriteria(p -> p.getCodigo() == 2);
		Set<Produto> produtoF = service.filtrarProdutos(todosP, p -> p.getDescricao().toUpperCase().charAt(0) == 'C');

		System.out.println("\n Todos os produtos\n");
		todosP.forEach(p -> System.out.println(p));
		System.out.println("\n------------------------\n");

		System.out.println("\n Produto Por criterio\n");
		produtoC.forEach(p -> System.out.println(p));
		System.out.println("\n------------------------\n");

		System.out.println("\n Produtos filtrados\n");
		produtoF.forEach(p -> System.out.println(p));
		System.out.println("\n------------------------\n");

		service.gerarDescontoProduto(produtoF, 30.0);
		System.out.println("\n Produtos filtrados com desconto\n");
		produtoF.forEach(p -> System.out.println(p));
		System.out.println("\n------------------------\n");

		System.out.println("\n dados dos produtos: \n");
		System.out.println(service.dadosProdutos(produtoF));
		System.out.println("\n------------------------\n");

		System.out.println("\n dados do produto: \n");
		System.out.println(service.gerarRelatorio(service.listarProdutoCodigo(2)));
		System.out.println("\n------------------------\n");

	}

}
