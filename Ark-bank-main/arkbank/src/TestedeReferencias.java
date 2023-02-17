package arkbank.src;

public class TestedeReferencias {
	public static void main(String[] args) {
		// Cria uma instância da classe Conta e atribui o valor 300 ao seu saldo
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		// Imprime o saldo da primeira conta
		System.out.println("O saldo da primeira conta: " + primeiraConta.saldo);
		
		// Atribui a referência de primeiraConta a segundaConta
		Conta segundaConta = primeiraConta;
		
		// Imprime o saldo da segunda conta
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		// Adiciona 100 ao saldo da segunda conta
		segundaConta.saldo += 100;
		
		// Imprime o saldo da primeira conta, que também foi alterado
		System.out.println("O Saldo da segunda conta agora vai ser: " + primeiraConta.saldo);
		
		// Verifica se primeiraConta e segundaConta são a mesma coisa
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma coisa");
		}
		
		// Imprime as referências de primeiraConta e segundaConta
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}

