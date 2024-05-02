import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
       
        System.out.println("Digite o Nome do Cliente: ");
        String nomeCliente = scan.nextLine();

        System.out.print("Digite o Número: ");
        int numero = scan.nextInt();

        System.out.println("Digite a Agência:");
        String agencia = scan.next();
        
        
        System.out.println("Digite seu Saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" e seu saldo "+saldo+" já está disponível para saque.");
    

    }
}
