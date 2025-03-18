import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da Agência: ");
        Integer numero = scanner.nextInt();

        System.out.println("Informe a Agência: ");
        String agencia = scanner.next();

        System.out.println("Informe o Nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Informe o saldo: ");
        Double saldo = scanner.nextDouble();

        ContaBanco contaBanco = new ContaBanco(numero, agencia, nomeCliente, saldo);

        System.out.println("Olá " + contaBanco.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaBanco.getAgencia()
        + ", conta " + contaBanco.getNumero() + " e o saldo de " + contaBanco.getSaldo() + " já está diponível para saque");

        System.out.println("Obrigado pela preferência");
        System.out.println("Pressione uma tecla para sair");
        scanner.nextLine();
        scanner.close();
    }
}
