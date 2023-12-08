/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.colas.QueueUltimate;
import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;
import exeption.EmptyException;
import modelo.Persona; //
import modelo.Simulacion;

/**
 *
 * @author darwi
 */
public class SimulacionControl  extends DaoImplement <Simulacion>{
    private DynamicList<Simulacion> listSimulacion;
    private Simulacion simulacion;

    public SimulacionControl() {
        super(Simulacion.class);
    }
    

    public DynamicList<Simulacion> getListSimulacion() {
        listSimulacion = all();
        return listSimulacion;
    }

    public void setListSimulacion(DynamicList<Simulacion> ListC) {
        this.listSimulacion = ListC;
    }

    public Simulacion getSimulacion() {
        if(simulacion ==null){
            simulacion = new Simulacion();
        }
        return simulacion;
    }

    public void setSimulacion(Simulacion simulacion) {
        this.simulacion = simulacion;
    }
    
    public Boolean persist(){
        simulacion.setId(all().getLength()+1);
        return persist(simulacion);
    }
    
    public Integer obtenerNumeroAleatorio(){
        int numeroAleatorio;
        numeroAleatorio = (int) (Math.random() * 4) + 0;
        return numeroAleatorio;    
    }
    
    public QueueUltimate<Persona>  rellenarVentanilla(int longitud) throws EmptyException{   
        PersonaControl pc = new PersonaControl();
        QueueUltimate<Persona> v = new QueueUltimate<>(longitud);
        int numeroPersona;
        for(int i = 0; i <longitud; i++ ){
            numeroPersona = obtenerNumeroAleatorio();
            System.out.println(numeroPersona);
            Persona p = (Persona) pc.getListPersona().obtenerNodo(numeroPersona).getInfo();
            v.push(p); 
        }     
        return v;
    }
    
        
        
    
    public static void main(String[] args) throws EmptyException {
        SimulacionControl sc = new SimulacionControl();
              
            
        QueueUltimate<Persona> v1 = new QueueUltimate<>(3);
        QueueUltimate<Persona> v2 = new QueueUltimate<>(2);
        QueueUltimate<Persona> v3 = new QueueUltimate<>(1);   
        
        
        
        v1 = sc.rellenarVentanilla(3);
        v2 = sc.rellenarVentanilla(2);
        v3 = sc.rellenarVentanilla(1);
        v1.print();
        v2.print();
        v3.print();
        
        
        
        
        sc.getSimulacion().setId(1);
        sc.getSimulacion().setNro_personas(2);
        sc.getSimulacion().setTiempo_total(8);        
        sc.getSimulacion().setV1(v1);
        sc.getSimulacion().setV2(v2);
        sc.getSimulacion().setV3(v3);
        sc.persist();
        sc.setSimulacion(null);
    }   
}
