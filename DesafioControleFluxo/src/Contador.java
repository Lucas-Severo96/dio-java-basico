import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro parâmetro:");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o Segundo parâmetro:");
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
			throw new ParametrosInvalidosException("O parâmetro 1 não pode ser maior que o parâmetro 2.");
		}
		else {
			System.out.println("Parâmetro 1 é menor ou igual ao Parâmetro 2... Imprimindo a diferença:");
			System.out.println("");
			
			int contagem = parametroDois - parametroUm;
			
			for(int i = 1; i <= contagem; i++ ) {
				
				System.out.println("Imprimindo número " + i);
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
