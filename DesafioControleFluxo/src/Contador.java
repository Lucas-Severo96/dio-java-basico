import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro par�metro:");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o Segundo par�metro:");
		int parametroDois = terminal.nextInt();
		
		try{
			
			contar(parametroUm, parametroDois);
				
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
		terminal.close();
		
		
	}
	
	static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O par�metro 1 n�o pode ser maior que o par�metro 2.");
		}
		else {
			System.out.println("Par�metro 1 � menor ou igual ao Par�metro 2... Imprimindo a diferen�a:");
			System.out.println("");
			
			int contagem = parametroDois - parametroUm;
			
			for(int i = 1; i <= contagem; i++ ) {
				
				System.out.println("Imprimindo n�mero " + i);
			}
			
		}
		
	}
	
	public static class ParametrosInvalidosException extends Exception {
		
		private static final long serialVersionUID = 1L; //Variavel default

		public ParametrosInvalidosException(String message) {
	    	
	        super(message);
	    }
	}

}
