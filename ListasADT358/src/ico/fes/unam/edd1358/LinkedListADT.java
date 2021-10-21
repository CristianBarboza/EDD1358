package ico.fes.unam.edd1358;

public class LinkedListADT {

    private class Nodo<T> {

        T data;
        Nodo next;

        public Nodo(T valor) {
            this.data = valor;
        }

        public Nodo(T valor, Nodo siguiente) {
            this.data = valor;
            this.next = siguiente;

        }

    }

    private Nodo head;

    public LinkedListADT() {
        this.head = null;
    }

    public boolean isEmpty() {

        return this.head == null;
    }

    public Nodo getTail() {
        Nodo currNode = this.head;
        if (!this.isEmpty()) {
            while (currNode.next != null) {
                currNode = currNode.next;
            }
        }
        return currNode;
    }

    public void append(Object valor) {
        if (this.isEmpty()) {
            this.head = new Nodo(valor);
        } else {
            this.getTail().next = new Nodo(valor);
        }
    }

    public void transversal() {
        Nodo currNode = this.head;
        while (currNode != null) {
            System.out.print(currNode.data + "---> ");
            currNode = currNode.next;
        }
        System.out.println("");
    }

    public void prepend(Object dato) {
        Nodo currNode = this.head;
        this.head = new Nodo(dato);
        this.head.next = currNode;
    }

    public void popFirst() {
        this.head = this.head.next;

    }

    public void pop() {
        Nodo currNode = this.head;
       
        while (currNode != null) {
            currNode = currNode.next;
            if (currNode.next.next == null) {
                currNode.next = null;
                break;
            }
        }
    }
    public void remove(Object dato){
    Nodo currNode = this.head;
     Nodo anterior = null;
        if (this.head.data==dato) {
            System.out.println(this.head.data);
            popFirst();
        }else{
            while (currNode.next != null) {                
                anterior = currNode;
                currNode =currNode.next;
                if (currNode.data== dato) {
                    System.out.println(currNode.data);
                    anterior.next = currNode.next;
                    break;
                
                }else if (currNode.next == null) {
                    System.out.println(currNode.data);
                    pop();
                    break;
                }
            }
        
        
        }
    
    }
}
