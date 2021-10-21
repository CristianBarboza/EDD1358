/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBR19
 */
public class ejercicio_3 {

    public static void main(String[] args) {
        String arreglo[] = {"1", "2", "3", "4", "5", "6", "7", "8","9","10"};
        ejercicio_3 o = new ejercicio_3();
        o.eliminar(arreglo);

    }

    public void eliminar(String[] arreglo) {
        if (arreglo.length % 2 == 0) {
            arreglo[(arreglo.length / 2) - 2] = "";
            for (String i : arreglo) {
                System.out.print(i + " , ");
            }
        }

    }
}
