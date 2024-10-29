
public class Main {

	public static void main(String[] args) {
		
		//Instanciando o primeiro cliente do tipo Conta Corrente
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Lucas");
		cliente1.setCpf("001.003.004-22");
		cliente1.setcidade("Campina Grande");
		
		Conta cc = new ContaCorrente(cliente1); /*Cria conta e agencia para o cliente passado como parametro*/
		cc.depositar(150.25);
		cc.sacar(0.25);
		cc.imprimirExtrato();

		//Instanciando o segundo cliente do tipo Conta Poupanca
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Francisco");
		cliente2.setCpf("005.002.003-00");
		cliente2.setcidade("Sao Paulo");
		
		Conta cp = new ContaPoupanca(cliente2);
		cp.sacar(50);
		cp.imprimirExtrato();
	}

}
