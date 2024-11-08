package br.com.felipe.encapsulamento.main;

import br.com.felipe.encapsulamento.conta.ContaBancaria;


public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Felipe", 1000000);


        System.out.println("Titular: " + conta.visualizarTitular());
        System.out.println("Saldo: " + conta.visualizarSaldo());
        System.out.println();


        conta.depositar(2);
        System.out.println("Novo saldo: " + conta.visualizarSaldo());
        System.out.println();


        conta.sacar(1500);
        System.out.println("Novo saldo: " + conta.visualizarSaldo());
        System.out.println();

        // Alterando o titular
        conta.alterarTitular("Ana Leticia");
        System.out.println("Novo titular: " + conta.visualizarTitular());
        System.out.println();


        System.out.println("Saldo final: " + conta.visualizarSaldo());
    }
}


