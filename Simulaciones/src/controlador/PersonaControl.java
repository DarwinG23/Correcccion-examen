/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;
import modelo.Persona;

/**
 *
 * @author darwi
 */
public class PersonaControl   extends DaoImplement <Persona>{
    private DynamicList<Persona> listPersona;
    private Persona persona;

    public PersonaControl() {
        super(Persona.class);
    }
    

    public DynamicList<Persona> getListPersona() {
        listPersona = all();
        return listPersona;
    }

    public void setListPersona(DynamicList<Persona> ListC) {
        this.listPersona = ListC;
    }

    public Persona getPersona() {
        if(persona ==null){
            persona = new Persona();
        }
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public Boolean persist(){
        persona.setId(all().getLength()+1);
        return persist(persona);
    }
   
    public static void main(String[] args) {
        PersonaControl pc = new PersonaControl();
        
        pc.getPersona().setId(0);
        pc.getPersona().setDuracionTramite(4);
        pc.getPersona().setNombreTramite("cambio de clave");
        pc.persist();
        pc.setPersona(null);
        
        pc.getPersona().setId(1);
        pc.getPersona().setDuracionTramite(7);
        pc.getPersona().setNombreTramite("actualizacion de datos");
        pc.persist();
        pc.setPersona(null);
        
        pc.getPersona().setId(2);
        pc.getPersona().setDuracionTramite(15);
        pc.getPersona().setNombreTramite("asignacion de afiliados");
        pc.persist();
        pc.setPersona(null);
        
        pc.getPersona().setId(3);
        pc.getPersona().setDuracionTramite(3);
        pc.getPersona().setNombreTramite("recuperacion de clave");
        pc.persist();
        pc.setPersona(null);
        
    }
    
}
