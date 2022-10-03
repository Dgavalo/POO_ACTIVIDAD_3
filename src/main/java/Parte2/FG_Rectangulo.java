
package Parte2;

public class FG_Rectangulo {
    int base; 
    int altura; 
	
    public FG_Rectangulo(int base, int altura) {
	this.base = base;
	this.altura = altura;
    }

    int calcularArea() {
	return base * altura;
    }
	
    int  calcularPerimetro() {
	return (2 * base) + (2 * altura);
    }
    
}
