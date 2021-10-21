/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.unam.adts;

/**
 *
 * @author CBR19
 */
public class DoubleLinkedList {

    private class NodoDoble<T> {

        T data;
        NodoDoble next;
        NodoDoble prev;

        public NodoDoble() {

        }

        public NodoDoble(T data, NodoDoble next, NodoDoble prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }
    private NodoDoble head;
    private NodoDoble tail;
    private int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        this.size=0;

    }

    public int getSize() {
        return size;
    }
    

    public boolean isEmpty() {
        return this.head == null;

    }

    public void append(Object Valor) {
        if (this.tail == null) {
            this.tail = new NodoDoble(Valor, null, null);
            this.head = this.tail;
        } else {
            this.tail.next = new NodoDoble(Valor, null, this.tail);
            this.tail = this.tail.next;
        }
        this.size++;
    }

    public void transversal() {
        NodoDoble currNode = this.head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("");
    }
    public NodoDoble removeFromHead(Object valor){
    NodoDoble currNode = this.head;
        while (currNode.data !=valor || currNode != null) {            
            
        }
    
    }
    
}
