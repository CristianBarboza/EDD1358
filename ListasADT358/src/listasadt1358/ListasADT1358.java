package listasadt1358;

import fes.aragon.unam.adts.DoubleLinkedList;
import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.LinkedListADT;

public class ListasADT1358 {

    public static void main(String[] args) {
        /* LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("Marco"));
        lsl.append(new String("Diana"));
        lsl.append(new String("x"));
        lsl.append(new String("y"));
        lsl.append(new String("j"));
        lsl.append(new String("j"));
        lsl.append(new String("z"));
        lsl.append(new String("t"));
        System.out.println("");
        lsl.transversal();
        LinkedListADT lsl2 = new LinkedListADT();
        lsl2.append(new Empleado(1, "Marco", "Pérez","García", 1850.5f, 2015,3));
        lsl2.append(new Empleado(1, "Rodrigo", "Pérez","García", 2860.5f, 2011,4));
        lsl2.append(new Empleado(1, "Diana", "Pérez","García", 1550.5f, 2007,8));
        lsl2.transversal();*/
        DoubleLinkedList ldl = new DoubleLinkedList();
        ldl.append(new Integer(30));
        ldl.append(new Integer(20));
        ldl.transversal();
        ldl.append(new Integer(30));
        ldl.transversal();
        ldl.append(new Integer(40));
        ldl.transversal();
        DoubleLinkedList ldl2 = new  DoubleLinkedList();
        ldl2.append(new Empleado(1, "Marco", "Pérez","García", 1850.5f, 2015,3));
        System.out.println(ldl.getSize());
        ldl2.transversal();
        System.out.println(ldl2.getSize());
    }

}
