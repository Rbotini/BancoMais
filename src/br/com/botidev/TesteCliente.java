package br.com.botidev;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta(111,850.80,100.50,500);
		
		contaCorrente.c.nome = "Renato";
		
		System.out.println(contaCorrente.c.nome);
		System.out.println(contaCorrente.numero);
		contaCorrente.consultaSaldo();
	}

}
