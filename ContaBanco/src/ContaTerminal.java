import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
    
        System.out.println("Informe o numero da agencia");
        numero = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Informe o codigo da agencia ");
        agencia = scan.nextLine();
        
        System.out.println("Informe o seu nome");
        nomeCliente = scan.nextLine();
        
        System.out.println("Informe o seu saldo");
        saldo = scan.nextDouble();
        scan.nextLine();
        
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta "+nomeCliente+" e seu saldo "+saldo+" já está disponível para saque");
        
    }
       
    
}
