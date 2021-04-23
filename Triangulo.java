
package edd42021;

/**
 *
 * @author Raul Vera
 */
public class Triangulo {
    int base,altura,lado;

    public Triangulo(int base, int altura, int lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    //metodo permita calcular el area
    public int calcularArea(){
        return (base*altura)/2;
    }
    
    /*calcular el perimetro*/
    public int calcularPerimetro(){
        return lado*3;
    }
    
    
}
