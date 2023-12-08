/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.tablas;

import controlador.listas.DynamicList;
import exeption.EmptyException;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import modelo.Simulacion;

/**
 *
 * @author darwi
 */
public class ModeloTablaSimulacion extends AbstractTableModel{
    private DynamicList<Simulacion> simulaciones;
    
    
    @Override
    public int getRowCount() {
        return simulaciones.getLength();
    }

    @Override
    public int getColumnCount() { //Agregar columnas
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Simulacion v;
       try {
           v = (Simulacion)simulaciones.getInfo(rowIndex);
           switch (columnIndex) {
            case 0:
                return (v != null) ? v.getId(): " ";
            case 1:
                return (v != null) ? v.getNro_personas(): " ";
            case 2:
                return (v != null) ? v.getTiempo_total(): "";
            default:
                return null;
        }
       } catch (EmptyException e) {
           JOptionPane.showMessageDialog(null, "Ocurrió un error al obtener la información. Por favor, inténtelo de nuevo o contacte al soporte.", "Error", JOptionPane.ERROR_MESSAGE);
           return null;
       }
        
    }
    

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "NRO PERSONAS";
            case 2:
                return "TIEMPO";
            default:
                return null;
        }
    }
   
    /**
     * @return the personas
     */
    public DynamicList getSimulaciones() {
        return simulaciones;
    }

    /**
     * 
     * @param simulaciones
     */
    public void setSimulaciones(DynamicList simulaciones) {
        this.simulaciones = simulaciones;
    }
    
}
