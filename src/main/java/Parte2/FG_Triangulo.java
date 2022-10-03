
package Parte2;

public class FG_Triangulo {
    int base, altura;
    double hipotenusa;
    String tipo;
	
    public FG_Triangulo(int base, int altura) {
	this.base = base;
	this.altura = altura;
    }
	
    public double calcularHipotenusa() {
	hipotenusa = Math.pow((altura*altura)+(base*base),0.5);
        return hipotenusa;
    }
	
    double calcularPerimetro() {
	return hipotenusa+base+altura;
    }
	
    double calcularArea() {
    	return (base*altura)/2;
    }
	
    public String tipoTriangulo(){
	if((base == altura)&&(base == hipotenusa)) {
		tipo = "Triángulo equilátero";
                return tipo;
	}
	
	else if((base!=altura)&&(altura!=hipotenusa)&&(base!=hipotenusa)) {
		tipo = "Triángulo escaleno";
                return tipo;
	}
		
	else {
		tipo = "Triángulo isóceles";
                return tipo;
		}
	}
}
