package Ex03;

import java.time.LocalDateTime;

public class Transacao {
    private String tipo;
    private double valor;
    private LocalDateTime data;

    public Transacao(String tipo, double valor, LocalDateTime data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    @Override
    public String toString() {
        return tipo + " de " + valor + " em " + data;
    }

}

