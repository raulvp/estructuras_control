
package edd42021;


public class Estudiante {
    String nombre, apellidos;
    int edad;
    String sexo;
    String carrera;
    String codEst;

    public Estudiante(String nombre, String apellidos, String carrera) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
    }

    public Estudiante(String nombre, String apellidos, int edad, String sexo, String carrera, String codEst) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.carrera = carrera;
        this.codEst = codEst;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCodEst() {
        return codEst;
    }

    public void setCodEst(String codEst) {
        this.codEst = codEst;
    }
   
    public void mostrarDatos(){
        System.out.println("El nombre del estudiante es: "
                +nombre+" "+apellidos+" esta en la carrera"+carrera);
    }
    
}
