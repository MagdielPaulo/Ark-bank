
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaBank = new Conta();
		contaBank.saldo = 100;
		contaBank.deposita(20);
		
		System.out.println(contaBank.saldo);
	}
}
