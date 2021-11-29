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
	// Metodo depositar recebendo valor
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("foi depositado em sua conta:"+valor);
	}
	 
	// Metodo retirar recebendo valor
	public void retirar(double valor) {
		this.saldo -= valor;
		System.out.println("foi retirado em sua conta:"+valor);
	}
	
	//Metodo que Consulta o saldo
	public double consultaSaldo() {
		return saldo;
	}
}
