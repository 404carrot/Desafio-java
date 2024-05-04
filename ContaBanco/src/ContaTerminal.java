import java.util.Locale;
import java.util.Scanner;
//import java.util.Locale;

public class ContaTerminal {

    /*
     * int numero = 1021;
     * String agencia = "067-8";
     * String nomeCliente = "Mário";
     * String sobreNome = "Andrade"
     * double saldo = 237.48;
     * 
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor insira seu nome :");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor insira o número da sua agencia :");
        int numero = scanner.nextInt();

        System.out.println("Por favor insira a sua agencia :");
        String agencia = scanner.next();

        System.out.println("Por favor insira seu saldo :");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá, " + nomeCliente + ", Obrigado por criar uma conta em nosso Banco, sua agencia é : " + agencia  + ", conta: " + numero + ", e seu saldo é: " + saldo);
                       

    }
}
