
package edd12021;

public class EDD12021 {

    public static void main(String[] args) {
        //System.out.println("Hola Mundo estoy en EDD");
        /*int valor1=9;
        int valor2=10;
        
        if(valor1>valor2){
            //condicion a cumplir
            System.out.println("El valor1="+valor1+" es mayor al valor2");
        }else if(valor1==valor2){
            System.out.println("Los 2 valores son iguales");
        }
        else{   
        //cumplir la condicion si valor 1 no es mayor a valor2
            System.out.println("El valor 2 es mayor");
        }
        
        //estructurtura de control FOR
        
        for(int i=10;i>=0;i--){
            System.out.println("i="+i);
        }*/
        
        /*int dado1=5;
        int dado2=6;
        int dado3=6;
        
        if((dado1==6)&&(dado2==6)&&(dado3==6)){
            System.out.println("Excelente");
        }else if(((dado1==6)&&(dado2==6))||((dado1==6)&&(dado3==6))||((dado2==6)&&(dado3==6))){
            System.out.println("Muy Bien");
        }else if((dado1==6)||(dado2==6)||(dado3==6)){
            System.out.println("Regular");
        }
        else{
            System.out.println("Pesimo");
        }*/
        
        /*****matriz con FOR*********/
        int filas=6;
        int columnas=5;
        for(int i=1;i<=filas;i++){
            for(int j=1;j<=columnas;j++){
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
        
        
    }
    
}
