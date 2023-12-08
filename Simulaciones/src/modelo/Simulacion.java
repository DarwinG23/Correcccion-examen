/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.colas.QueueUltimate;

/**
 *
 * @author darwin
 */
public class Simulacion {
    private Integer id;
    private Integer nro_personas;
    private Integer tiempo_total;
    private QueueUltimate<Persona> v1;
    private QueueUltimate<Persona> v2;
    private QueueUltimate<Persona> v3;

    public Simulacion(Integer id, Integer nro_personas, Integer tiempo_total, QueueUltimate<Persona> v1, QueueUltimate<Persona> v2, QueueUltimate<Persona> v3) {
        this.id = id;
        this.nro_personas = nro_personas;
        this.tiempo_total = tiempo_total;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    

   

    public Simulacion() {
        this.id  = null;
        this.nro_personas = null;
        this.tiempo_total = null;
        this.v1 = null;
        this.v2 = null;
        this.v3 = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNro_personas() {
        return nro_personas;
    }

    public void setNro_personas(Integer nro_personas) {
        this.nro_personas = nro_personas;
    }

    public Integer getTiempo_total() {
        return tiempo_total;
    }

    public void setTiempo_total(Integer tiempo_total) {
        this.tiempo_total = tiempo_total;
    }

    public QueueUltimate<Persona> getV1() {
        return v1;
    }

    public void setV1(QueueUltimate<Persona> v1) {
        this.v1 = v1;
    }

    public QueueUltimate<Persona> getV2() {
        return v2;
    }

    public void setV2(QueueUltimate<Persona> v2) {
        this.v2 = v2;
    }

    public QueueUltimate<Persona> getV3() {
        return v3;
    }

    public void setV3(QueueUltimate<Persona> v3) {
        this.v3 = v3;
    }

    

    @Override
    public String toString() {
        return "" + id + "";
    }   
}
