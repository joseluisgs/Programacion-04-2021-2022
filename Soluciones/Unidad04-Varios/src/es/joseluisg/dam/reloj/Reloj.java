package es.joseluisg.dam.reloj;

public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;

    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora(boolean formato24) {
        return formato24 ? hora : hora % 12;
    }

    public void setHora(int hora24) {
        if (hora24 < 0 || hora24 > 23) {
            throw new IllegalArgumentException("Hora no válida");
        } else {
            this.hora = hora24;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Minutos no válidos");
        } else {
            this.minutos = minutos;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Segundos no válidos");
        } else {
            this.segundos = segundos;
        }
    }

    public void recargarPila() {
        System.out.println("Recargando pila...");
        System.out.println("Pila recargada");
    }

    @Override
    public String toString() {
        return "Reloj{" +
                "hora=" + hora +
                ", minutos=" + minutos +
                ", segundos=" + segundos +
                '}';
    }
}
