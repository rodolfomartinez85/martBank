package application;

public class Conta {
	private Integer numeroConta;
	private String nome;
	private Integer numeroCartao;
	private Double saldo;
	
	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Integer numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public boolean validarCartaoContaCorrente(Integer numeroCartao) {
		if(this.numeroCartao == numeroCartao) {
			return true;
		} else {
			return false;
		}
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}