/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas.modelo;

import controlador.listas.ListaEnlazada;
import controlador.listas.excepciones.ListaNullException;
import controlador.listas.excepciones.PosicionNoEncontradaException;
import javax.swing.table.AbstractTableModel;
import modelo.Avion;

/**
 *
 * @author DEEPIN
 */
public class ModeloTablaAvion extends AbstractTableModel {

    private ListaEnlazada<Avion> aviones = new ListaEnlazada<>();

    public ListaEnlazada<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(ListaEnlazada<Avion> aviones) {
        this.aviones = aviones;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return aviones.getSize();
    }

    @Override
    public String getColumnName(int column) {

        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "Modelo";
            case 2:
                return "Nombre";
            case 3:
                return "Tipo";

            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Avion a = null;
        try {
            a = aviones.obtener(rowIndex);
        } catch (ListaNullException | PosicionNoEncontradaException e) {
            System.out.println(e.getMessage());
        }
        switch (columnIndex) {
            case 0:
                return (rowIndex + 1);
            case 1:
                return (a != null) ? a.getModelo() : "No registrado";
            case 2:
                return (a != null) ? a.getNombre() : "No registrado";
            case 3:
                return (a != null) ? a.getTipo() : "No registrado";
            default:
                return null;
        }
    }
}
