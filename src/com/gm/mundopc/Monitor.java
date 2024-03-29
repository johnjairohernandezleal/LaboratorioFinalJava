package com.gm.mundopc;

public class Monitor {
    private final int idMonitores;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    private Monitor(){
        this.idMonitores = ++contadorMonitores;
    }

    public Monitor(String marca, double tamaño) {
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitores=" + idMonitores +
                ", marca='" + marca + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }
}
