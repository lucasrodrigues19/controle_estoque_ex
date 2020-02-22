package br.lrestoque.service;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import br.lrestoque.entites.Venda;
import br.lrestoque.ex.MyException;

/**
 * @author Lucas Rodrigues 17/02/2020
 */
public interface IVendaService {

	/**
	 * Método responsavel por gerar o relatorio referente a Venda
	 * @param CodigoVenda código da venda
	 * @return
	 */
	public String gerarRelatorio(int CodigoVenda) throws MyException;

	/**
	 * Salva a venda
	 * @param venda
	 * @return
	 */
	default void prepareToSave(Venda venda) throws MyException{
	
		if(venda.getItens() == null || venda.getItens().size() <= 0) {
			throw new MyException("Itens da venda invalida");
		}
		if(venda.getVendedor()==null) {
			throw new MyException("Vendedor da venda invalido");
		}
		
	}
	default String salvar(Venda venda) throws MyException{
		try {
			if (venda == null) {
				throw new MyException("Venda invalida");
			}
			prepareToSave(venda);
			return "Venda salva com sucesso";
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			System.out.println("Erro inesperado: " + ex.getMessage());
		} catch (MyException ex) {
			ex.printStackTrace();
			throw new MyException("Erro ao salvar a venda: " + ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} finally {

		}

		return null;

	}

	/**
	 * Filtra a venda de acordo com o criterio escolhido
	 * 
	 * @param criteria Predicate
	 * @return
	 */
	default Set<Venda> filtrar(Set<Venda> vendas, Predicate<Venda> criteria) throws MyException {
		try {
			if (criteria == null) {
				throw new MyException("Criterio de filtro invalido");
			}
			Set<Venda> result = new HashSet<Venda>();
			if (vendas != null && vendas.size() > 0) {
				vendas.forEach(v -> {
					if (criteria.test(v)) {
						result.add(v);
					}
				});
				return result;
			}
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			System.out.println("Erro inesperado: " + ex.getMessage());
		} catch (MyException ex) {
			ex.printStackTrace();
			throw new MyException("Erro ao filtrar vendas: " + ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} finally {

		}

		return null;

	}
}
