package es.joseluisg.dam.fraccion;

// http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/estatico/fraccion/fraccion.htm

public class Relacional {
    private int numerador;
    private int denominador;

    public Relacional() {}

    public Relacional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Relacional{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }

    public Relacional simplificar(Relacional r) {
            int dividir=mcd();
            r.numerador /= dividir;
            r.denominador /= dividir;
            return this;
    }

    public Relacional sumar(Relacional r) {
        int num = numerador * r.denominador + r.numerador * denominador;
        int den = denominador * r.denominador;
        Relacional resultado = new Relacional(num, den);
        return resultado.simplificar(resultado);
    }

    public static Relacional sumar(Relacional r1, Relacional r2) {
        int num = r1.numerador * r2.denominador + r2.numerador * r1.denominador;
        int den = r1.denominador * r2.denominador;
        Relacional resultado = new Relacional(num, den);
        return resultado.simplificar(resultado);
    }

    public Relacional multiplicar(Relacional r) {
        int num = numerador * r.numerador;
        int den = denominador * r.denominador;
        Relacional resultado = new Relacional(num, den);
        return resultado.simplificar(resultado);
    }

    public static Relacional multiplicar(Relacional r1, Relacional r2) {
        int num = r1.numerador * r2.numerador;
        int den = r1.denominador * r2.denominador;
        Relacional resultado = new Relacional(num, den);
        return resultado.simplificar(resultado);
    }

    private int mcd(){
        int u=Math.abs(numerador);
        int v=Math.abs(denominador);

        if(v==0){
            return u;
        }
        int r;

        while(v!=0){
            r=u%v;
            u=v;
            v=r;
        }
        return u;
    }

}
