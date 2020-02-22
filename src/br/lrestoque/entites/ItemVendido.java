package br.lrestoque.entites;
/**
 * @author Lucas Rodrigues
 *	17/02/2020
 */
public class ItemVendido {
	
	private Integer codigo;
	private Integer quantidade;
	private Double valor;
	private Produto produto;
	private Venda venda;
	
	
	public ItemVendido(Integer codigo, Integer quantidade, Double valor, Produto produto, Venda venda) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.valor = valor;
		this.produto = produto;
		this.venda = venda;
	}
	public ItemVendido() {
		
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	@Override
	public String toString() {
		return "ItemVendido [codigo=" + codigo + ", quantidade=" + quantidade + ", valor=" + valor + ", produto=" + produto + ", venda=" + venda + "]";
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
		ItemVendido other = (ItemVendido) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
}
