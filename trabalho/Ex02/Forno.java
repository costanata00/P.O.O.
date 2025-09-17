package Ex02;

class Forno {
    final int volume;
    final int tensao;
    final int potencia;
    final int largura;
    final int altura;
    final int profundidade;
    private float temperatura = 0;
    private boolean ligado = false;
    private int minutos;

    public Forno(int volume, int tensao, int potencia, int largura,
            int altura, int profundidade) {
        this.volume = volume;
        this.tensao = tensao;
        this.potencia = potencia;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    public float temperatura() {
        return temperatura;
    }

    public boolean ligado() {
        return ligado;
    }

    public void aumentarTemperatura() {
        ligado = true;// liga sempre que aumenta
        if (temperatura == 200) {
            temperatura += 20;
        } else if (temperatura == 220) {
            temperatura += 30;
        } else if (temperatura == 300) {
            ;
        } else {
            temperatura += 50;
        }
    }

    public void diminuirTemperatura() {
        if (temperatura < 0) {
            temperatura = 0;
        } else if (temperatura == 250) {
            temperatura -= 30;
        } else if (temperatura == 220) {
            temperatura -= 20;
        } else if (temperatura > 0) {
            temperatura -= 50;
        }

    }

    public void desligar() {
        ligado = false;
        temperatura = 0;
    }

    public void setTimer(int minutos) {
        this.minutos = minutos;
    }

    public int tempoRestante() {
        return minutos;
    }

    public void tick() {
        minutos--;
        if (minutos <= 0) {
            ligado = false;
            temperatura = 0;
        }
    }

}