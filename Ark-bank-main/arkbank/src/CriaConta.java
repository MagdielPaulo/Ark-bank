package arkbank.src;


public class CriaConta {

	public static void main(String[] args) {

		// Cria uma instância da classe Conta e a referencia com o nome "primeiraConta"
		Conta primeiraConta = new Conta();

		// Atribui o valor 200 ao saldo da primeiraConta
		primeiraConta.saldo = 200;

		// Exibe o saldo da primeiraConta na tela
		System.out.println(primeiraConta.saldo);

		// Adiciona 100 ao saldo da primeiraConta
		primeiraConta.saldo += 100;

		// Exibe o novo saldo da primeiraConta na tela
		System.out.println(primeiraConta.saldo);

		// Cria uma instância da classe Conta e a referencia com o nome "segundaConta"
		Conta segundaConta = new Conta();

		// Atribui o valor 150 ao saldo da segundaConta
		segundaConta.saldo = 150;

		// Exibe a mensagem "A primeira conta tem X" na tela, onde X é o saldo da
		// primeiraConta
		System.out.println("A primeira conta tem " + primeiraConta.saldo);

		// Exibe a mensagem "Já a segunda conta tem Y" na tela, onde Y é o saldo da
		// segundaConta
		System.out.println("Já a segunda conta tem " + segundaConta.saldo);

		// Exibe o valor da agência da primeiraConta na tela
		System.out.println(primeiraConta.agencia);

		// Exibe o valor do número da segundaConta na tela
		System.out.println(segundaConta.numero);
		
		// Exibe o valor da agencia da segundaConta na tela
		System.out.println(segundaConta.agencia);
		
		// Exibe um valor pra agencia da segundaConta na tela
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta esta"
				+ "na agencia " + segundaConta.agencia);
		
		//Testando as referencias da segunda conta!
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma coisa ");
		}
		else {
			System.out.println("São diferentes");
		}

	} 
}
