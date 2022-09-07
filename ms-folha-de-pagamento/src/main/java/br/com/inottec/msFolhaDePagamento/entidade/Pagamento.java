package br.com.inottec.msFolhaDePagamento.entidade;

public class Pagamento {
	
	private String nome;
	private Double diaria;
	private Integer dias;
	
	public Pagamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Pagamento(String nome, Double diaria, Integer dias) {
		super();
		this.nome = nome;
		this.diaria = diaria;
		this.dias = dias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getDiaria() {
		return diaria;
	}

	public void setDiaria(Double diaria) {
		this.diaria = diaria;
	}

	public Integer getDia() {
		return dias;
	}

	public void setDia(Integer dias) {
		this.dias = dias;
	}
	
	public double getTotal() {
		
		return this.dias * this.diaria;
	}
	

}
