package Parte2;

public class FG_Circulo {
	int radio;

	public FG_Circulo(int radio) {
		this.radio = radio;
	}

	double calcularArea() {
		return Math.PI*Math.pow(radio,2);
	}

	double calcularPerimetro() {
		return 2*Math.PI*radio;
	}

}

