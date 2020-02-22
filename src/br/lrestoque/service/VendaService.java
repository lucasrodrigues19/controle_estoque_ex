package br.lrestoque.service;

import br.lrestoque.ex.MyException;

/**
 * @author Lucas Rodrigues
 *	17/02/2020
 */
public class VendaService implements IVendaService{

	@Override
	public String gerarRelatorio(int CodigoVenda) throws MyException{
		StringBuilder sb = new StringBuilder();
		sb.append("Codigo da venda");
		return null;
	}

	
	

}
