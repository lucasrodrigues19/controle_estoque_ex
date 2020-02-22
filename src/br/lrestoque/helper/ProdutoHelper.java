package br.lrestoque.helper;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import br.lrestoque.entites.Produto;

/**
 * @author Lucas Rodrigues 17/02/2020
 */
public class ProdutoHelper {

	public static String gerarRelatorio(Produto produto) {
		StringBuilder sb = null;
		if (produto != null) {
			sb = new StringBuilder();
			sb.append("Produto [" + produto.getCodigo() + "]:\n");
			sb.append("Descrição: " + produto.getDescricao() + ", ");
			sb.append("Valor: " + produto.getValorFormatted() + ", ");
			sb.append("Grupo: " + produto.getGrupo() + ", ");
			sb.append("Quantidade em estoque: " + produto.getQtdEstoque() + ", ");
			sb.append("Quantidade Maxima em extoque: " + produto.getEstoqueMax() + "\n");
			return sb.toString();
		}

		return null;
	}

	/**
	 * Retorna os produtos de acordo com o criterio
	 * 
	 * @param produtos lista dos produtos
	 * @param critirea criterio para queima de estoque
	 * @return
	 */
	public static Set<Produto> listProdutosCriteria(Set<Produto> produtos, Predicate<Produto> critirea) {
		Set<Produto> result = new HashSet<>();
		if (produtos != null && produtos.size() > 0) {
			produtos.forEach(p -> {
				if (critirea.test(p)) {
					result.add(p);
				}
			});
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	/**
	 * gera o desconto para produtos
	 * 
	 * @param produto
	 * @param desconto
	 */
	public static void gerarDescontoProduto(Set<Produto> produto, Double desconto) {
		if (produto != null && produto.size() > 0) {
			produto.forEach(p -> {
				double valor = (p.getValor() / 100) * desconto;
				p.setValor(p.getValor() - valor);
			});
		}
	}

	/**
	 * Retorna os dados dos produtos
	 * 
	 * @param produtos
	 * @return
	 */
	public static String dadosProdutos(Set<Produto> produtos) {
		StringBuilder sb = new StringBuilder();
		if (produtos != null && produtos.size() > 0) {
			sb.append("Produtos: ");
			produtos.forEach(p -> sb.append(gerarRelatorio(p) + "\n"));
			return sb.toString();
		}
		return null;
	}

	/**
	 * Retorna uma lista de produto filtrada a partir da lista de entrada.
	 * 
	 * @param produtos lista de produtos de entrada
	 * @param criteria criterio para o filtro
	 * @return lista filtrada
	 */
	public static Set<Produto> filtrarProdutos(Set<Produto> produtos, Predicate<Produto> criteria) {
		Set<Produto> result = null;
		if (produtos != null && produtos.size() > 0 && criteria != null) {
			result = produtos.stream().filter(criteria).collect(Collectors.toSet());
		}
		return result;
	}

}
