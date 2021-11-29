package br.com.botidev;

/**
 * Classe que Abstrai uma Conta Bancaria
 * @author renato.botini
 * @version 1.0
 */
public class Conta {
	
	public int numero;
	public double saldo;
	public int agencia;
	
	
     Cliente c = new Cliente();
     
    //Construtor de Classe
	public Conta (int numero, double saldo,int agencia)	{
		
		this.numero = numero;
		this.saldo = saldo;
		this.agencia = agencia;
		
	}
	
	/**
	 * Adciona um valor ao saldo da conta
	 * @param valor que esta sendo depositado
	 */
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("foi depositado em sua conta:"+valor);
	}
	 
	/**
	 * Retira um valor do saldo da conta
	 * @param valor que esta sendo retirado
	 */
	
	public void retirar(double valor) {
		this.saldo -= valor;
		System.out.println("foi retirado em sua conta:"+valor);
	}
	
	/**
	 * Verifica o Saldo da Conta
	 * @return Valor do Saldo da Conta
	 */
	public double consultaSaldo() {
		return saldo;
	}
}
