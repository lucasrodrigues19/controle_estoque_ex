package br.lrestoque.entites;

import java.util.Date;

/**
 * @author Lucas Rodrigues
 *	17/02/2020
 */
public class MetaMensal {

	private Date mesAno;
	private Integer qtdVendido;
	private Integer qtdExigida;
	private String descricao;
	private Vendedor vendedor;
	
	public MetaMensal(Date mesAno, Integer qtdVendido, Integer qtdExigida, String descricao, Vendedor vendedor) {
		super();
		this.mesAno = mesAno;
		this.qtdVendido = qtdVendido;
		this.qtdExigida = qtdExigida;
		this.descricao = descricao;
		this.vendedor = vendedor;
	}
	public MetaMensal() {
		
	}
	public Date getMesAno() {
		return mesAno;
	}
	public void setMesAno(Date mesAno) {
		this.mesAno = mesAno;
	}
	public Integer getQtdVendido() {
		return qtdVendido;
	}
	public void setQtdVendido(Integer qtdVendido) {
		this.qtdVendido = qtdVendido;
	}
	public Integer getQtdExigida() {
		return qtdExigida;
	}
	public void setQtdExigida(Integer qtdExigida) {
		this.qtdExigida = qtdExigida;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	@Override
	public String toString() {
		return "MetaMensal [mesAno=" + mesAno + ", qtdVendido=" + qtdVendido + ", qtdExigida=" + qtdExigida + ", descricao=" + descricao + ", vendedor=" + vendedor + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mesAno == null) ? 0 : mesAno.hashCode());
		result = prime * result + ((vendedor == null) ? 0 : vendedor.hashCode());
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
		MetaMensal other = (MetaMensal) obj;
		if (mesAno == null) {
			if (other.mesAno != null)
				return false;
		} else if (!mesAno.equals(other.mesAno))
			return false;
		if (vendedor == null) {
			if (other.vendedor != null)
				return false;
		} else if (!vendedor.equals(other.vendedor))
			return false;
		return true;
	}
	
	
}
