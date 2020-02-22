package br.lrestoque.ex;
/**
 * @author Lucas Rodrigues
 *	17/02/2020
 */
public class MyException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public MyException(String msg) {
		super(msg);
	}
}
