import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // criação do objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            //Mensagem de bem-vindo
            System.out.println("Seja bem-vindo ao seu Banco!");
            //registra o valor da variavel e passa para a próxima "pergunta" com Enter
            System.out.println("\nPor favor, digite o número da Conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("\nPor favor, digite o número da Agência: ");
            String agencia = scanner.next();

            System.out.println("\nPor favor, digite o nome do Usuário: ");
            String nomeCliente = scanner.next();

            Double saldoConta = 237.48; //já que o projeto não possui um banco de dados, optei por colocar a variável de Saldo com um valor fixo.

            //Mensagem de retorno com todas as informações informadas pelo cliente.
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque!");

            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
    }
}

/* Depois de desenvolver este código, quando eu executava não aceitava o primeiro import. Tentei resolver o problema reescrevendo o código, mas continuava com o mesmo erro.
 * O que fiz foi salvar as alterações, ainda com o erro desconhecido. Depois fechei IDE e abri novamente e o problema foi resolvido!
 * Esta é a versão final com comentários explicando os processos!
 * 
 * Ingrid santana Rodrigues.
*/