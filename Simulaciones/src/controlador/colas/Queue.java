/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.colas;

import exeption.EmptyException;
import controlador.listas.DynamicList;

/**
 *
 * @author darwin
 */
class Queue<E> extends  DynamicList<E>{ //Como extiende ya tenemos todo
    private Integer tope;  //lo que tengo en la pila tamanio

    public Queue(Integer tope) {
        this.tope = tope;
    }
      
    public Boolean isFull(){ //Saber si esta llena
        return getLength().intValue() >= tope.intValue();
    }
    
    public void queue(E info) throws EmptyException{
        if(isFull()){
            throw  new EmptyException("Stack Full");
        } else{
            add(info);
        }
    }
    
        public E dequeue() throws EmptyException{
        E info = extractFirst();   
        return info;
    } 
}
