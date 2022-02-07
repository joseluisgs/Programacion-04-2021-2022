package es.joseluisg.dam.ordenadores;

public class Ordenador {
    private String procesador;
    private int ram;
    private int hd;
    private int id;
    private static int contadorID =1;

    public Ordenador() {
        this.id = contadorID ++;
    }

    public Ordenador(String procesador, int ram, int hd) {
        this.procesador = procesador;
        this.ram = ram;
        this.hd = hd;
        this.id = contadorID++;
    }

    public int getId() {
        return id;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "procesador='" + procesador + '\'' +
                ", ram=" + ram +
                ", hd=" + hd +
                ", id=" + id +
                '}';
    }

    public int compareTo(Ordenador o) {
        return this.getId() - o.getId();
    }
}
