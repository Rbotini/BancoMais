package br.com.botidev;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta(111,850.50,333);
		
		 contaCorrente.c.nome = "Renato";
		 
		 System.out.println("Bem Vindo! ao BancoMais "+contaCorrente.c.nome);
		 
		 System.out.println("Saldo da Sua Conta:R$"+ contaCorrente.consultaSaldo());
		 
		 contaCorrente.depositar(400);
		 System.out.println("Saldo da Sua Conta atualizado :R$"+ contaCorrente.consultaSaldo());
		  
		 contaCorrente.retirar(800);
		 
		 System.out.println("Saldo da Sua Conta atualizado :R$"+ contaCorrente.consultaSaldo());
		 
		
			}

}
