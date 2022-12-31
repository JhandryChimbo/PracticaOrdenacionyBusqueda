/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.listas.ListaEnlazada;
import modelo.Avion;

/**
 *
 * @author DEEPIN
 */
public class AvionControlador {

    private ListaEnlazada<Avion> aviones = new ListaEnlazada<>();
    private Avion avion;

    public AvionControlador() {
    }

    public AvionControlador(Avion avion) {
        this.avion = avion;
    }

    public ListaEnlazada<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(ListaEnlazada<Avion> aviones) {
        this.aviones = aviones;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

}
