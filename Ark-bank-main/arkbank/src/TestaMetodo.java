package arkbank.src;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaBank = new Conta();
		contaBank.saldo = 100;
		contaBank.deposita(50);
		System.out.println(contaBank.saldo);
		
		
		boolean conseguiuRetirar = contaBank.saca(20);
		System.out.println(contaBank.saldo);
		System.out.println(conseguiuRetirar);
	}
}
