package es.joseluisg.dam;

import es.joseluisg.dam.fraccion.Relacional;
import es.joseluisg.dam.ordenadores.Aula;
import es.joseluisg.dam.ordenadores.Ordenador;
import es.joseluisg.dam.ordenadores.OrdenadorPro;
import es.joseluisg.dam.reloj.Reloj;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Ejemplo Reloj");
        Reloj r = new Reloj(22,30,27);
        System.out.println(r);
        System.out.println(r.getHora(true) + " Formato 24h");
        System.out.println(r.getHora(false) + " Formato 12h");
        r.recargarPila();

        System.out.println("Ejemplo Relacional");
        Relacional r1 = new Relacional();
        r1.setNumerador(3);
        r1.setDenominador(4);
        System.out.println(r1);
        Relacional r2 = new Relacional(5,4);
        System.out.println(r2);
        System.out.println("SUMA");
        System.out.println(r1.sumar(r2));
        System.out.println(Relacional.sumar(r1,r2));
        System.out.println("MULTIPLICACION");
        System.out.println(r1.multiplicar(r2));
        System.out.println(Relacional.multiplicar(r1,r2));

        System.out.println("Ejemplo Ordenadores");
        Aula a = Aula.getInstance("DAM", 1, 20);
        System.out.println(a);
        Ordenador o1 = new Ordenador("i7",8,500);
        Ordenador o2 = new Ordenador("i5",4,250);
        Ordenador o3 = new Ordenador("i7",8,750);
        Ordenador o4 = new Ordenador("i3",4,500);
        // Insertar
        a.insertarOrdenador(o1);
        a.insertarOrdenador(o2);
        a.insertarOrdenador(o3);
        a.insertarOrdenador(o4);
        // Mostrar todo
        a.mostrarOrdenadores();
        // Buscar por id
        Ordenador b = a.buscarOrdenador(2);
        if (b != null) {
            System.out.println("Ordenador encontrado: " + b);
        } else {
            System.out.println("Ordenador no encontrado");
        }
        // Actualizar por id
        o1.setProcesador("i5");
        o1.setRam(16);
        a.actualizarOrdenador(o1);
        System.out.println("Ordenador Actualizado: " + o1);
        // Buscar por procesador
        a.buscarPorProcesador("i5");
        // Eliminamos ordenador
        a.eliminarOrdenador(o4);
        // Mostrar todo
        System.out.println("Mostrar todo");
        a.mostrarOrdenadores();
        System.out.println("Ordenar por procesador");
        a.ordenarPorProcesador();
        a.mostrarOrdenadores();
        System.out.println("Ordenar por Memoria");
        a.ordenarPorMemoria();
        a.mostrarOrdenadores();

        a = Aula.getInstance("DAM2", 3, 200);
        System.out.println("Ordenar por Memoria");
        a.ordenarPorMemoria();
        a.mostrarOrdenadores();

        Aula a1 = Aula.getInstance("DAM3", 14, 24);
        System.out.println("Ordenar por Memoria");
        a1.ordenarPorMemoria();
        a1.mostrarOrdenadores();
        System.out.println("Ordenar con compareTo");
        a1.ordenarOrdenadores();
        a1.mostrarOrdenadores();
        System.out.println("Interfaz fluida");
        OrdenadorPro p1 = new OrdenadorPro();
        p1.setProcesador("i7");
        p1.setRam(16);
        p1.setBus("Pepe");
        System.out.println(p1);
        OrdenadorPro p2 = new OrdenadorPro()
                .setProcesador("i5")
                .setRam(4)
                .setBus("Pepa");
        System.out.println(p2);
        OrdenadorPro p3 = new OrdenadorPro()
                .procesador("i7")
                .ram(8)
                .bus("Pepa");
        System.out.println(p3); 
    }
}
