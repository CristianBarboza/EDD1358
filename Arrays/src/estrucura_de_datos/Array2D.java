/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrucura_de_datos;

public class Array2D {

    private int renglon, columna;
    private String matriz[][];

    public Array2D(int renglon, int columna) {
        this.renglon = renglon;
        this.columna = columna;
        matriz = new String[renglon][columna];
    }

    public void setItem(int num_renglon, int num_columna, String dato) {

        matriz[num_renglon][num_columna] = dato;
    }

    public void clean(String valor) {

        for (int i = 0; i < renglon; i++) {

            for (int j = 0; j < columna; j++) {

                matriz[i][j] = valor;
            }
        }
    }

    public void to_string() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void set_item( int renglon , int columna ,String dato){
    
    matriz[renglon][columna]=dato;
    
    }
    public int getrowsize() {
        return renglon;
    }

    public int getcolsize() {
        return columna;
    }

    public static void main(String[] args) {
        Array2D matriz1 = new Array2D(4, 7);
        matriz1.clean(null);
        matriz1.to_string();
        System.out.println("");
        matriz1.set_item(2, 1, "Pablo");
        matriz1.setItem(3, 6,"ruby");
        matriz1.to_string();
        System.out.println(matriz1.getrowsize());
        System.out.println(matriz1.getcolsize());

    }

   

}
