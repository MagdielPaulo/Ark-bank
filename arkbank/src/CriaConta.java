
public class CriaConta {

		public static void main(String[] args) {
			Conta primeiraConta = new Conta();
			primeiraConta.saldo = 200;
			System.out.println(primeiraConta.saldo);
			
			primeiraConta.saldo += 100;
			System.out.println(primeiraConta.saldo);
			
			Conta segundaConta = new Conta();
			segundaConta.saldo = 150;
			
			System.out.println("A primeira conta tem " + primeiraConta.saldo);
			System.out.println("Já a segunda conta tem " + segundaConta.saldo);
			
			System.out.println(primeiraConta.agencia);
			System.out.println(segundaConta.numero);
			
		}
}
