package Ex03;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String titular;
    private String numero;
    private double saldo;

    private List<Transacao> historico = new ArrayList<>();


    public ContaBancaria(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }
    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        historico.add(new Transacao("depósito", valor , LocalDateTime.now()));
    }
    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            historico.add(new Transacao("saque", valor, LocalDateTime.now()));
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
    public List<Transacao> getHistorico() {
        return historico;
    }
}
