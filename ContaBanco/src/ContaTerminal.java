import java.util.Locale;
import java.util.Scanner;
/**
 * 
 * @author Lucas Leite Severo
 * @since 05/10/2024
 * @category Classe que recebe informações bancarias passadas pelo usuário no terminal
 * e imprime todas elas ao final da execução
 * 
 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta Bancária!");
        int numConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String numAgencia = scanner.next();

        System.out.println("Por favor, digite o seu primeiro Nome:");
        String primeiroNome = scanner.next();

        System.out.println("Por favor, digite o seu Segundo Nome:");
        String segundoNome = scanner.next();

        // Usando o método concat para juntar os nomes em outra variavel
        String nomeCompleto = primeiroNome.concat(" ").concat(segundoNome);

        System.out.println("Digite o saldo da sua Conta Bancária:");
        double saldoConta = scanner.nextDouble();

        System.out.printf("Olá %s obrigado por criar uma conta em nosso banco, " + 
        "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
        nomeCompleto, numAgencia, numConta, saldoConta);

        scanner.close();
        
    }
}
