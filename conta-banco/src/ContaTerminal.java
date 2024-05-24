import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // criação do objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Seja bem-vindo ao seu Banco!");
            System.out.println("\nPor favor, digite o número da Conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("\nPor favor, digite o número da Agência: ");
            String agencia = scanner.next();

            System.out.println("\nPor favor, digite o nome do Usuário: ");
            String nomeCliente = scanner.next();

            Double saldoConta = 237.48;

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque!");

            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
    }
}
