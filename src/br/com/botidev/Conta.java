package br.com.botidev;

public class Conta {
	
	public int numero;
	public double saldo;
	public double deposito;
	public double sacar;
	
	public Conta (int numero, double saldo,double deposito,double sacar)	{
		
		this.numero = numero;
		this.saldo = saldo;
		this.deposito = deposito;
		this.sacar = sacar;
	}
	
	public void consultaSaldo() {
		System.out.println(saldo);
	}
	
	public void depositar() {
		saldo += deposito;
	}
	
	public void sacarDinheiro() {
		saldo -= sacar;
	}
	
}
