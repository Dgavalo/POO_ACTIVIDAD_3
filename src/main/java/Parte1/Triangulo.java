package Parte1;

public class Triangulo {
    //Atributos
	double lado1, lado2, lado3, perimetro, semiperimetro, area, altura;
	
    //Métodos
    public double método_perímetro(double lado1,double lado2,double lado3) {
	perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
	
    public double método_semiperímetro(double perimetro) {
	semiperimetro = perimetro/2;
        return semiperimetro;
    }
	
    public double método_área(double semiperimetro, double lado1, double lado2, double lado3) {
	area=Math.sqrt(semiperimetro*((semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));
        return area;
    }
    
    public double método_mostrar_altura(double lado1) {
	altura=Math.sqrt(Math.pow(lado1, 2)-Math.pow((lado1)/2,2));
	return altura;
    }
}
