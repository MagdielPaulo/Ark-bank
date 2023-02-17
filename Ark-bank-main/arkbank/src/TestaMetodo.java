package arkbank.src;

public class TestaMetodo {
	public static void main(String[] args) {
		// Cria uma instância da classe Conta e atribui o valor 100 ao seu saldo
		Conta contaBank = new Conta();
		contaBank.saldo = 100;
		
		// Chama o método deposita passando o valor 20 como parâmetro
		contaBank.deposita(50);
		
		// Imprime o saldo da conta após o depósito
		System.out.println(contaBank.saldo);
	}
}
