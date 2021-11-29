package br.com.botidev;

public class TesteCliente {
	
	public static void main(String[] args) {
	
		Conta contaCorrente = new Conta(111,850.50,333);
		
		 contaCorrente.c.nome = "Renato";
		 contaCorrente.c.cpf = 1111111111;
		 contaCorrente.c.data_nasc = "16/08/1985";
		 
		 System.out.println("*************************");
		 System.out.println("Bem Vindo! ao Banco Mais");
		 System.out.println("*************************");
		 
		 System.out.println("Dados Do Cliente:");
		 System.out.println("Nome:"+contaCorrente.c.nome);
		 System.out.println("CPF: "+contaCorrente.c.cpf);
		 System.out.println("Data Nascimento:"+contaCorrente.c.data_nasc);
		 
		 System.out.println("Saldo da Sua Conta:R$"+ contaCorrente.consultaSaldo());
		 
		 contaCorrente.depositar(400);
		 System.out.println("Saldo da Sua Conta atualizado :R$"+ contaCorrente.consultaSaldo());
		  
		 contaCorrente.retirar(800);
		 
		 System.out.println("Saldo da Sua Conta atualizado :R$"+ contaCorrente.consultaSaldo());
		 
		
			}

}
