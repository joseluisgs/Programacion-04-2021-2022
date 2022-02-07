package es.joseluisg.dam.ordenadores;

public class Aula {
    private static Aula instancia = null;

    private String nombre;
    private int numero;
    private int capacidad;
    private Ordenador[] ordenadores;

    public static Aula getInstance(String nombre, int numero, int capacidad) {
        if (instancia == null) {
            instancia = new Aula("Aula 1", 1, 20);
        }
        return instancia;
    }

    private Aula(String nombre, int numero, int capacidad) {
        this.nombre = nombre;
        this.numero = numero;
        this.capacidad = capacidad;
        this.ordenadores = new Ordenador[capacidad];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Ordenador[] getOrdenadores() {
        return ordenadores;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", capacidad=" + capacidad +
                '}';
    }

    public boolean insertarOrdenador(Ordenador ordenador) {
        for (int i = 0; i < ordenadores.length; i++) {
            if (ordenadores[i] == null) {
                ordenadores[i] = ordenador;
                return true;
            }
        }
        return false;
    }

    public void mostrarOrdenadores() {
        for (int i = 0; i < ordenadores.length; i++) {
            if (ordenadores[i] != null) {
                System.out.println(ordenadores[i]);
            }
        }
    }

    public Ordenador buscarOrdenador(int id) {
        for (Ordenador ordenador : ordenadores) {
            if (ordenador != null && ordenador.getId() == id) {
                return ordenador;
            }
        }
        return null;
    }

    public boolean actualizarOrdenador(Ordenador ordenador) {
        for (int i = 0; i < ordenadores.length; i++) {
            if (ordenadores[i] != null && ordenadores[i].getId() == ordenador.getId()) {
                ordenadores[i] = ordenador;
                return true;
            }
        }
        return false;
    }

    public void buscarPorProcesador(String procesador) {
        for (Ordenador ordenador : ordenadores) {
            if (ordenador != null && ordenador.getProcesador().equals(procesador)) {
                System.out.println(ordenador);
            }
        }
    }
    public boolean eliminarOrdenador(Ordenador ordenador) {
        for (int i = 0; i < ordenadores.length; i++) {
            if (ordenadores[i] != null && ordenadores[i].getId() == ordenador.getId()) {
                ordenadores[i] = null;
                return true;
            }
        }
        return false;
    }

    public void ordenarPorProcesador() {
        Ordenador aux;
        for (int i = 0; i < ordenadores.length; i++) {
            for (int j = i + 1; j < ordenadores.length; j++) {
                if (ordenadores[i] != null && ordenadores[j] != null &&
                        ordenadores[i].getProcesador().compareTo(ordenadores[j].getProcesador()) > 0) {
                    aux = ordenadores[i];
                    ordenadores[i] = ordenadores[j];
                    ordenadores[j] = aux;
                }
            }
        }
    }

    public void ordenarPorMemoria() {
        Ordenador aux;
        for (int i = 0; i < ordenadores.length; i++) {
            for (int j = i + 1; j < ordenadores.length; j++) {
                if (ordenadores[i] != null && ordenadores[j] != null &&
                        ordenadores[i].getRam() > ordenadores[j].getRam()) {
                    aux = ordenadores[i];
                    ordenadores[i] = ordenadores[j];
                    ordenadores[j] = aux;
                }
            }
        }
    }

    public void ordenarOrdenadores() {
        Ordenador aux;
        for (int i = 0; i < ordenadores.length; i++) {
            for (int j = i + 1; j < ordenadores.length; j++) {
                if (ordenadores[i] != null && ordenadores[j] != null &&
                        ordenadores[i].compareTo(ordenadores[j]) > 0) {
                    aux = ordenadores[i];
                    ordenadores[i] = ordenadores[j];
                    ordenadores[j] = aux;
                }
            }
        }
    }

}
