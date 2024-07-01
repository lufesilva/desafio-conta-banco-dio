package luiz.dev;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Integer numero;
        String agencia;
        String nome;
        Double saldo;

        System.out.println("Por favor digite o número da conta:");
        numero = sc.nextInt();
        sc.nextLine();


        System.out.println("Por favor digite o número da agência:");
        agencia = sc.nextLine();

        System.out.println("Por favor o seu nome:");
        nome = sc.nextLine();

        System.out.println("Por favor digite o seu saldo:");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo.toString() + " já está disponível para saque.");

        sc.close();
    }
}