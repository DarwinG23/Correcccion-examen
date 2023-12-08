/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.tablas;

import controlador.colas.QueueUltimate;
import controlador.listas.DynamicList;
import exeption.EmptyException;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import modelo.Persona;

/**
 *
 * @author darwi
 */
public class ModeloTablaVentanilla extends AbstractTableModel{
    private DynamicList<Persona> personas;
    private QueueUltimate<Persona> personasCola;
    
    
    @Override
    public int getRowCount() {
        return personas.getLength();
    }

    @Override
    public int getColumnCount() { //Agregar columnas
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Persona v;
       try {
           v = (Persona)personas.getInfo(rowIndex);
           switch (columnIndex) {
            case 0:
                return (v != null) ? v.getId(): " ";
            case 1:
                return (v != null) ? v.getNombreTramite(): " ";
            case 2:
                return (v != null) ? v.getDuracionTramite(): "";
            default:
                return null;
        }
       } catch (EmptyException e) {
           JOptionPane.showMessageDialog(null, "Ocurrió un error al obtener la información. Por favor, inténtelo de nuevo o contacte al soporte.", "Error", JOptionPane.ERROR_MESSAGE);
           return null;
       }
        
    }
    
    public void colaToLista(QueueUltimate<Persona> cola, int numero) { 
    DynamicList<Persona> lista = new DynamicList<>();
    try {
        for(int i = 0 ; i < numero; i++ ){
          lista.add(cola.dequeue());
          setPersonas(lista);          
        }
    } catch (EmptyException e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error al transferir los elementos. Por favor, inténtelo de nuevo o contacte al soporte.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "TRAMITE";
            case 2:
                return "DURACIÓN";
            default:
                return null;
        }
    }
   
    /**
     * @return the personas
     */
    public DynamicList getPersonas() {
        return personas;
    }

    /**
     * 
     * @param personas
     */
    public void setPersonas(DynamicList personas) {
        this.personas = personas;
    }
    
}
