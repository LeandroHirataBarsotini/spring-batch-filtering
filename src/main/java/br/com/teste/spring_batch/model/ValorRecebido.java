package br.com.teste.spring_batch.model;

public class ValorRecebido {
	
	private int valor;
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Valor " + valor;
	}

}
