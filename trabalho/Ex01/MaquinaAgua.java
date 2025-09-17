package Ex01;

class MaquinaAgua {
    int aguaMl = 0;
    int copos200 = 0;
    int copos300 = 0;

    public int agua() {
        return aguaMl;
    }

    // System.out.println(maq.copos200() == 0);
    public int copos200() {
        return copos200;
    }

    // System.out.println(maq.copos300() == 0);
    public int copos300() {
        return copos300;
    }

    public void servirCopo200() {
        if (aguaMl >= 200 && copos200 > 0) {
            aguaMl-=200;
            copos200--;
        }
    }

    public void servirCopo300() {
        if (aguaMl >= 300 && copos300 > 0) {
            aguaMl-=300;
            copos300--;
        }
    }

    public void abastecerCopo200() {
        copos200 = 100;
    }

    public void abastecerCopo300() {
        copos300 = 100;
    }

    public void abastecerAgua() {
        aguaMl = 20000;
    }

}