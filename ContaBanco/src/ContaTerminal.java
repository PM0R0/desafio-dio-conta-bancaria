import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao Terminal Bancario");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por Favor, digite o seu nome!");
        String nome = scanner.next();

        System.out.println("Por favor "+nome+" ,digite o numero da sua agencia!");
        String agencia = scanner.next();

        System.out.println("Por favor "+nome+", digite o numero da sua conta!");
        int conta = scanner.nextInt();

        System.out.println("Por favor "+nome+", digite o saldo da sua conta!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponivel para saque." );
    }
}
