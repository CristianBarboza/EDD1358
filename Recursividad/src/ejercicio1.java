/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBR19
 */
public class ejercicio1 {
    public static void main(String[] args) {
        ejercicio1 er=new ejercicio1();
        ;
        System.out.println(er.Cuenta_regresiva(1)+" BOOMMMMM !!!.");
              
    }
    public int Cuenta_regresiva(int x){
       int resultado;//                                                     
    if(x==11){                          
     return 0;
 }else resultado=x-Cuenta_regresiva(x+1);
        System.out.print(resultado+"..");
    return 0;
    }
}
