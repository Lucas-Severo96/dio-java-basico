
public abstract class Conta implements IConta {
	
	//atributos visiveis apenas na classe Conta
	private static final int AGENCIA_PADRAO = 100;
	private static int SEQUENCIAL = 1;
	
	//atributos visiveis dentro do pacote (default)
	protected int agencia;
	protected int numConta;
	protected double saldo;
	protected Cliente cliente;
	
	/*Construtor que cria contas bancarias usando sequencial*/
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	//Sobrescrevendo Metodo da Interface IConta
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	//Sobrescrevendo Metodo da Interface IConta
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	
	//Sobrescrevendo Metodo da Interface IConta
	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInformacoesConta() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero da Conta: %d", this.numConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
