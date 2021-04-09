
package edd32021;

import java.util.Scanner;

public class EDD32021 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int valorIngresado;
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre=entrada.nextLine();
        System.out.println("El nombre ingresado es: "+nombre);
       
        
        /*int val1=18;
        int val2=15;
        int suma=sumar(val1,val2);
        System.out.println("El valor de la suma es: "+suma);
        restar(val1,val2);*/
    }
    
    public static int sumar(int val1,int val2){
        return val1+val2;
    }
    
    public static void restar(int val1, int val2){
        System.out.println("El valor de la resta es= "+(val1-val2));
    }
    
}
