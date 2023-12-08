/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author darwi
 */
public class Persona {
    private Integer id;
    private String nombre_tramite;
    private Integer duracion;

    public Persona(Integer id, String nombre, Integer duracion) {
        this.id = id;
        this.nombre_tramite = nombre;
        this.duracion = duracion;
    }

    public Persona() {
        this.id = null;
        this.nombre_tramite = null;
        this.duracion = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreTramite() {
        return nombre_tramite;
    }

    public void setNombreTramite(String nombre) {
        this.nombre_tramite = nombre;
    }

    public Integer getDuracionTramite() {
        return duracion;
    }

    public void setDuracionTramite(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre_tramite;
    }    
}
