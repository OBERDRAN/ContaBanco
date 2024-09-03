import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //declaracão de variáveis
        int Numero;
        String Agencia;
        String NomeCliente;
        float Saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Conta:");
        Numero = sc.nextInt();
        
        System.out.print("Agencia: ");
        Agencia = sc.next();

        System.out.print("Nome Cliente:");
        NomeCliente = sc.next();
        
        System.out.print("Saldo Conta:");
        Saldo = sc.nextFloat();
        //concat para concatenação de strings,
        //toUpperCase() para mostrar o nome em maiúsculo
        System.out.println("Olá ".concat(NomeCliente.toUpperCase()).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(Agencia).concat(", conta ").concat(String.valueOf(Numero).concat(" e seu saldo ").concat(String.valueOf(Saldo))));

    }
}
