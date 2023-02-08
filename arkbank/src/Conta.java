public class Conta {
	
	// Atributo que representa o saldo disponível na conta.
	double saldo;
	// Atributo que representa o número da agência bancária associada à conta.
	int agencia;	
	// Atributo que representa o número da conta.
	int numero;	
	// Atributo que representa o nome do titular da conta.
	String titular;
	
	//Método criado
	void deposita(double valor) {
		// Adiciona o valor passado como parâmetro ao saldo atual da conta
		this.saldo = this.saldo + valor;
	}
}
	