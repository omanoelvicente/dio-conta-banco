import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta");
        numero = scanner.nextInt();


        System.out.println("Por favor, digite o saldo da conta");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "
                           + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
