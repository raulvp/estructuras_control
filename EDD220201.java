
package edd220201;

public class EDD220201 {

   
    public static void main(String[] args) {
        //while
        /*int edad = 30;
        while(edad<21){
            System.out.println("Es menor de edad, por que tiene:"
                    +edad);
            edad = edad+1;
        }*/
        
        //do while
        
        /*do{
            System.out.println("La edad es de: "+edad);
            edad++;
        }while(edad<21);*/
        
        //switch
        /*int mes = 3;
        switch(mes){
            case 1: System.out.println("Enero");
            break;
            case 2: System.out.println("Febrero");
            break;
            case 3: System.out.println("Marzo");
            break;
            default: System.out.println("Usted ingreso un mes erroneo");
        }*/
        
        /*if(mes==1){
            System.out.println("Enero");
        }
        if(mes==2){
            System.out.println("Febrero");
        }
        if(mes==3){
            System.out.println("Marzo con if");
        }*/
        
        String dia = "Martes";
        switch(dia){
            case "lunes": System.out.println("Hoy es lunes");
            break;
            case "Martes": System.out.println("Hoy es martes");
            break;
            case "Miercoles": System.out.println("Hoy es miercoles");
            break;
            default: System.out.println("Usted ingreso un dia erroneo");
        }
        
    }
    
}
