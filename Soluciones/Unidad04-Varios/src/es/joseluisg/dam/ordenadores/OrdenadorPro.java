package es.joseluisg.dam.ordenadores;

import java.time.LocalDate;

public class OrdenadorPro {
    private int id;
    private static int contadorID =1;

    private String procesador;
    private int ram;
    private int hd;
    private String grafica;
    private String bus;
    private String so;
    private String marca;
    private String modelo;
    private float precio;
    private LocalDate revision;
    private String mac;
    private String ip;

    public OrdenadorPro() {
        this.id = contadorID++;
    }
    public int getId() {
        return id;
    }

    public static int getContadorID() {
        return contadorID;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getRam() {
        return ram;
    }

    public int getHd() {
        return hd;
    }

    public String getGrafica() {
        return grafica;
    }

    public String getBus() {
        return bus;
    }

    public String getSo() {
        return so;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public LocalDate getRevision() {
        return revision;
    }

    public String getMac() {
        return mac;
    }

    public String getIp() {
        return ip;
    }

    public OrdenadorPro setProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    public OrdenadorPro setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public OrdenadorPro setHd(int hd) {
        this.hd = hd;
        return this;
    }

    public OrdenadorPro setGrafica(String grafica) {
        this.grafica = grafica;
        return this;
    }

    public OrdenadorPro setBus(String bus) {
        this.bus = bus;
        return this;
    }

    public OrdenadorPro setSo(String so) {
        this.so = so;
        return this;
    }

    public OrdenadorPro setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public OrdenadorPro setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public OrdenadorPro setPrecio(float precio) {
        this.precio = precio;
        return this;
    }

    public OrdenadorPro setRevision(LocalDate revision) {
        this.revision = revision;
        return this;
    }

    public OrdenadorPro setMac(String mac) {
        this.mac = mac;
        return this;
    }

    public OrdenadorPro setIp(String ip) {
        this.ip = ip;
        return this;
    }

    @Override
    public String toString() {
        return "OrdenadorPro{" +
                "id=" + id +
                ", procesador='" + procesador + '\'' +
                ", ram=" + ram +
                ", hd=" + hd +
                ", grafica='" + grafica + '\'' +
                ", bus='" + bus + '\'' +
                ", so='" + so + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", revision=" + revision +
                ", mac='" + mac + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }

    public OrdenadorPro procesador(String procesador) {
        this.procesador = procesador;
        return this;
    }



    public OrdenadorPro ram(int ram) {
        this.ram = ram;
        return this;
    }

    public OrdenadorPro hd(int hd) {
        this.hd = hd;
        return this;
    }

    public OrdenadorPro grafica(String grafica) {
        this.grafica = grafica;
        return this;
    }

    public OrdenadorPro bus(String bus) {
        this.bus = bus;
        return this;
    }

    public OrdenadorPro so(String so) {
        this.so = so;
        return this;
    }

    public OrdenadorPro marca(String marca) {
        this.marca = marca;
        return this;
    }

    public OrdenadorPro modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public OrdenadorPro precio(float precio) {
        this.precio = precio;
        return this;
    }

    public OrdenadorPro revision(LocalDate revision) {
        this.revision = revision;
        return this;
    }

    public OrdenadorPro mac(String mac) {
        this.mac = mac;
        return this;
    }

    public OrdenadorPro ip(String ip) {
        this.ip = ip;
        return this;
    }
}
