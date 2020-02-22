package br.lrestoque.entites;

import java.util.List;

/**
 * @author Lucas Rodrigues 17/02/2020
 */
public class Produto {

	private Integer				codigo;
	private String				descricao;
	private Double				valor;
	private Integer				grupo;
	private Integer				qtdEstoque;
	private Integer				estoqueMax;
	private List<ItemVendido>	itens;

	public Produto(Integer codigo, String descricao, Double valor, Integer grupo, Integer qtdEstoque, Integer estoqueMax) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.grupo = grupo;
		this.qtdEstoque = qtdEstoque;
		this.estoqueMax = estoqueMax;
	}

	public Produto() {

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValorFormatted() {
		if(this.valor == null)
			return "";
		
		return String.format("%.2f", this.valor);
	}
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getGrupo() {
		return grupo;
	}

	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}

	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public Integer getEstoqueMax() {
		return estoqueMax;
	}

	public void setEstoqueMax(Integer estoqueMax) {
		this.estoqueMax = estoqueMax;
	}

	public List<ItemVendido> getItens() {
		return itens;
	}

	public void setItens(List<ItemVendido> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + ", grupo=" + grupo + ", qtdEstoque=" + qtdEstoque + ", estoqueMax=" + estoqueMax + ", itens=" + itens + "]";
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
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
