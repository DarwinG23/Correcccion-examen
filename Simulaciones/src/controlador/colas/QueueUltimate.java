/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.colas;

import exeption.EmptyException;

/**
 *
 * @author darwi
 * @param <E>
 */
public class QueueUltimate<E> {
    private  Queue<E> tail;

    public QueueUltimate(Integer length){
        this.tail = new Queue<>(length);
    }
    
    public void push(E info) throws EmptyException{
        tail.queue(info);
    }
    
    public E dequeue() throws EmptyException{
        return  tail.dequeue();
    }
    
    public Integer length(){
        return tail.getLength();
    }
    
    public Boolean isFull(){
        return tail.isFull();
    }
    
    public void print(){
        System.out.println("Stack");
        System.out.println(tail.toString());
    }

    public Queue<E> getTail() {
        return tail;
    }

    public void setTail(Queue<E> tail) {
        this.tail = tail;
    }
    
    
    
}
