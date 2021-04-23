
package edd42021;


public class EDD42021 {

    public static void main(String[] args) {
        /*Triangulo tri1 = new Triangulo(10, 12, 15);
        Triangulo tri2 = new Triangulo(20, 24, 30);
        
        System.out.println("La base del triangulo 1 es: "
                +tri1.getBase());
        
        System.out.println("---Areas----");
        System.out.println("El area del triangulo 1 es: "
                +tri1.calcularArea());
        System.out.println("El area del triangulo 2 es: "
                +tri2.calcularArea());
        System.out.println("---Perimetros----");
        System.out.println("El perimetro del triangulo 1 es: "
                +tri1.calcularPerimetro());
        System.out.println("El perimetro del triangulo 2 es: "
                +tri2.calcularPerimetro());

        */
        
        Estudiante est1 = new Estudiante("Julia", "Perez", "Sistemas");
        Estudiante est2 = new Estudiante("Ramiro", "Olarte", "Marketing");
        Estudiante est3 = new Estudiante("Oscar", "Rojas", "Sistemas");
        Estudiante est4 = new Estudiante("Maribel", "Guitierrez", "Secretariado");
        Estudiante est5 = new Estudiante("Pedro", "Mendez", "Contaduria");
        Estudiante est6 = new Estudiante("Alicia", "Mamani", "Marketing");
        Estudiante est7 = new Estudiante("Elmer", "Hinojosa", 25, "masculino", "Sistemas", "SIS-001");
        
        System.out.println("La lista de estudiantes registrados");
        int inicio=1;
        while(inicio<=7){
            if(inicio==1){
            est1.mostrarDatos();
            }
            if(inicio==2){
            est2.mostrarDatos();
            }
            if(inicio==3){
            est3.mostrarDatos();
            }
            if(inicio==4){
            est4.mostrarDatos();
            }
            if(inicio==5){
            est5.mostrarDatos();
            }
            if(inicio==6){
            est6.mostrarDatos();
            }
            if(inicio==7){
            est7.mostrarDatos();
            }
            inicio++;
        }
    }
    
}
