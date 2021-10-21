/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBR19
 */
public class ejercicio2 {
    public static void main(String[] args) {

        int[] lista = {1, 2, 3, 4 };
        
        System.out.println(Sumarlista(0, lista.length-1, lista));

    }
    
    public static int Sumarlista(int inicio, int fin, int[] lista){
        
        if(inicio == fin){
            return lista[inicio];
        }else{
            
            int mitad = (inicio+fin)/2;
            
             int x = Sumarlista(inicio, mitad, lista);
            int y = Sumarlista(mitad+1, fin,lista);
            
           
            
            return x + y;
            
        }
        
        
        
    }
}
