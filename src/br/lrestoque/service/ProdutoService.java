package br.lrestoque.service;

import java.util.Set;
import java.util.function.Predicate;

import br.lrestoque.dao.ProdutoDAO;
import br.lrestoque.entites.Produto;
import br.lrestoque.ex.MyException;
import br.lrestoque.helper.ProdutoHelper;

/**
 * @author Lucas Rodrigues 17/02/2020
 */
public class ProdutoService implements IProdutoService {

	@Override
	public Set<Produto> listProdutosCriteria(Predicate<Produto> critirea) throws MyException {
		try {
			if (critirea == null) {
				throw new MyException("Criterio de queima de estoque invalido");
			}
			if (listarProdutos() != null && listarProdutos().size() > 0) {
				return ProdutoHelper.listProdutosCriteria(listarProdutos(), critirea);
			}
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			System.out.println("Erro inesperado: " + ex.getMessage());
		} catch (MyException ex) {
			ex.printStackTrace();
			throw new MyException("Erro ao listar vendas: " + ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} finally {

		}
		return null;
	}

	@Override
	public Set<Produto> listarProdutos() throws MyException {
		try {
			return getProdutoDAO().listarTodos();

		} catch (RuntimeException ex) {
			ex.printStackTrace();
			System.out.println("Erro inesperado: " + ex.getMessage());
		} catch (MyException ex) {
			ex.printStackTrace();
			throw new MyException("Erro ao listar venda: " + ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} finally {

		}
		return null;
	}

	@Override
	public String dadosProdutos(Set<Produto> produtos) throws MyException {
		if (produtos != null && produtos.size() > 0) {
			return ProdutoHelper.dadosProdutos(produtos);
		}
		return null;
	}

	@Override
	public void gerarDescontoProduto(Set<Produto> produtos, Double desconto) throws MyException {

		try {
			if (produtos == null && produtos.size() <= 0) {
				throw new MyException("não existem produtos para desconto");
			}
			ProdutoHelper.gerarDescontoProduto(produtos, desconto);
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			System.out.println("Erro inesperado: " + ex.getMessage());
		} catch (MyException ex) {
			ex.printStackTrace();
			throw new MyException("Erro ao gerar desconto venda: " + ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} finally {

		}
	}

	@Override
	public Set<Produto> filtrarProdutos(Set<Produto> produtos, Predicate<Produto> criteria) throws MyException {
		try {
			if (produtos == null && produtos.size() <= 0) {
				throw new MyException("não existem produtos filtro");
			}
			if (criteria == null) {
				throw new MyException("criterio para filtro invalido");
			}
			return ProdutoHelper.filtrarProdutos(produtos, criteria);
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			System.out.println("Erro inesperado: " + ex.getMessage());
		} catch (MyException ex) {
			ex.printStackTrace();
			throw new MyException("Erro ao filtrar venda: " + ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} finally {

		}

		return null;

	}

	@Override
	public String gerarRelatorio(Produto produto) throws MyException {

		try {
			if (produto == null)
				throw new MyException("produto não existe");

			return ProdutoHelper.gerarRelatorio(produto);
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			System.out.println("Erro inesperado: " + ex.getMessage());
		} catch (MyException ex) {
			ex.printStackTrace();
			throw new MyException("Erro ao gerar relatorio: " + ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} finally {

		}

		return null;
	}

	@Override
	public Produto listarProdutoCodigo(Integer codigo) throws MyException {
		try {
			if (codigo == null) {
				throw new MyException("Criterio de queima de estoque invalido");
			}

			return getProdutoDAO().listarCodigo(codigo);

		} catch (RuntimeException ex) {
			ex.printStackTrace();
			System.out.println("Erro inesperado: " + ex.getMessage());
		} catch (MyException ex) {
			ex.printStackTrace();
			throw new MyException("Erro ao listar vendas: " + ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} finally {

		}
		return null;
	}

	public ProdutoDAO getProdutoDAO() {
		return new ProdutoDAO();
	}

}
