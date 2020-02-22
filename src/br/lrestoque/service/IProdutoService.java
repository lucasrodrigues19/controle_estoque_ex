package br.lrestoque.service;

import java.util.Set;
import java.util.function.Predicate;

import br.lrestoque.entites.Produto;
import br.lrestoque.ex.MyException;

/**
 * @author Lucas Rodrigues 17/02/2020
 */
public interface IProdutoService {

	/**
	 * Método responsavel por gerar o relatorio referente ao produto
	 * 
	 * @param codigo codigo do produto
	 * @return
	 * @throws MyException
	 */
	public String gerarRelatorio(Produto produto) throws MyException;

	/**
	 * Método responsavel por retornar um produto de acordo com o criterio
	 * 
	 * @param critirea criterio
	 * @return
	 * @throws MyException
	 */
	public Set<Produto> listProdutosCriteria(Predicate<Produto> critirea) throws MyException;

	/**
	 * lista todos os produtos
	 * 
	 * @return
	 * @throws MyException
	 */
	public Set<Produto> listarProdutos() throws MyException;

	/**
	 * Método responsavel por gerar os dados do produto de acordo com o criterio
	 * 
	 * @param critirea
	 * @return
	 * @throws MyException
	 */
	public String dadosProdutos(Set<Produto> produtos) throws MyException;

	/**
	 * Método responsavel por gerar o desconto do produto, de acordo com o criterio
	 * 
	 * @param critirea criterio para o desconto
	 * @param desconto valor do desconto
	 * @return
	 * @throws MyException
	 */
	public void gerarDescontoProduto(Set<Produto> produtos, Double desconto) throws MyException;

	/**
	 * Método que retorna uma lista de produto filtrada a partir da lista de
	 * entrada.
	 * 
	 * @param produtos lista de produtos de entrada
	 * @param criteria criterio para o filtro
	 * @return lista filtrada
	 * @throws MyException
	 */
	public Set<Produto> filtrarProdutos(Set<Produto> produtos, Predicate<Produto> criteria) throws MyException;

	/**
	 * Retorna um unio produto de acordo com seu codigo
	 * @param codigo codigo do produto
	 * @return
	 * @throws MyException
	 */
	public Produto listarProdutoCodigo(Integer codigo) throws MyException;
}
