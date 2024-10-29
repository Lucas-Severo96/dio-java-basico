
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Lucas");
		
		//Cria cliente com sua respectiva conta e agencia
		Conta cc = new ContaCorrente(cliente1);
		cc.depositar(150.25);
		cc.imprimirExtrato();

	}

}
