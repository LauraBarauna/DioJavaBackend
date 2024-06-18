package src.edu.laura.bootcamp.modulo1.desafios.contabancaria;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numeroConta, agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor informe o número da conta");
        numeroConta = s.nextInt();

        System.out.println("Por favor informe o número da agência");
        agencia = s.nextInt();

        System.out.println("Por favor informe o seu nome");
        nomeCliente = s.next();

        System.out.println("Por favor informe o saldo da conta");
        saldo = s.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
