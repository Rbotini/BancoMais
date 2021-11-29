package br.com.botidev;

public class Conta {
	
	public int numero;
	public double saldo;
	public int agencia;
	
	
     Cliente c = new Cliente();
	public Conta (int numero, double saldo,int agencia)	{
		
		this.numero = numero;
		this.saldo = saldo;
		this.agencia = agencia;
		
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	public double consultaSaldo() {
		return saldo;
	}
}
