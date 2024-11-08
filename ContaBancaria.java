package br.com.felipe.encapsulamento.conta;

public class ContaBancaria {

    //ENCAPSULAMENTO
    private double saldo;
    private String titular;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial não pode ser negativo.");
        }
    }

    //metodo para modificar o atributo encapsulado
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    //metodo para modificar o atributo encapsulado
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado!!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }


    public double visualizarSaldo() {
        return saldo;
    }


    public void alterarTitular(String novoTitular) {
        if (novoTitular != null && !novoTitular.trim().isEmpty()) {
            titular = novoTitular;
            System.out.println("Titular alterado para: " + novoTitular);
        } else {
            System.out.println("Nome do titular nao encontrado.");
        }
    }

    public String visualizarTitular() {
        return titular;
    }
}
