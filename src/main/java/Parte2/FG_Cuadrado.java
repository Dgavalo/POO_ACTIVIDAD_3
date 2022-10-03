package Parte2;

public class FG_Cuadrado {
    int lado;
	
	public FG_Cuadrado(int lado){
		this.lado = lado;
	}
	
	int calcularArea() {
		return lado*lado;
	}
	
	int calcularPerimetro() {
		return lado*4;
	}  
}
