package com.ejemplo;

public class Usuario {

    private String nombre;
    private double peso;

    public Usuario(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void actualizarPeso(double nuevoPeso){
        this.peso = nuevoPeso;
    }

    public void mostrarInformacion(){
        System.out.printf("Usuario: %s, Peso: %.2f Kg", nombre, peso);
    }
}
