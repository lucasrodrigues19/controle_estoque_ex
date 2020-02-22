/**
 * 
 */
package br.lrestoque.dao;

import java.util.Set;

import br.lrestoque.ex.MyException;

/**
 * @author Lucas_Rodrigues 21 de fev de 2020
 */
public interface Crud<T> {

	public Set<T> listarTodos() throws MyException;

	public T listarCodigo(int codigo) throws MyException;

}
