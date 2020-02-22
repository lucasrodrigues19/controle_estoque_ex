/**
 * 
 */
package br.lrestoque.entites;

import java.util.Date;
import java.util.List;

/**
 * @author Lucas Rodrigues
 *	17/02/2020
 */
public class Venda {
private Integer codigo;
private Double valor;
private Date data;
private List<ItemVendido> itens;
private Vendedor vendedor;

public Venda(Integer codigo, Double valor, Date data, List<ItemVendido> itens, Vendedor vendedor) {
	super();
	this.codigo = codigo;
	this.valor = valor;
	this.data = data;
	this.itens = itens;
	this.vendedor = vendedor;
}

public Venda() {
	
}

public Integer getCodigo() {
	return codigo;
}

public void setCodigo(Integer codigo) {
	this.codigo = codigo;
}

public Double getValor() {
	return valor;
}

public void setValor(Double valor) {
	this.valor = valor;
}

public Date getData() {
	return data;
}

public void setData(Date data) {
	this.data = data;
}

public List<ItemVendido> getItens() {
	return itens;
}

public void setItens(List<ItemVendido> itens) {
	this.itens = itens;
}

public Vendedor getVendedor() {
	return vendedor;
}

public void setVendedor(Vendedor vendedor) {
	this.vendedor = vendedor;
}

@Override
public String toString() {
	return "Venda [codigo=" + codigo + ", valor=" + valor + ", data=" + data + ", itens=" + itens + ", vendedor=" + vendedor + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Venda other = (Venda) obj;
	if (codigo == null) {
		if (other.codigo != null)
			return false;
	} else if (!codigo.equals(other.codigo))
		return false;
	return true;
}


	
}
