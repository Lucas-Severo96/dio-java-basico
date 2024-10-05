import java.util.Locale;
import java.util.Scanner;

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

        System.out.println("Digite o saldo da sua Conta Bancária:");
        double saldoConta = scanner.nextDouble();

        System.out.printf("Olá " + primeiroNome + " " + segundoNome + 
        " obrigado por criar uma conta em nosso banco, " + 
        "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
        numAgencia, numConta, saldoConta);

        scanner.close();
        
    }
}
