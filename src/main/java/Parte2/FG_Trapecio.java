package Parte2;

public class FG_Trapecio {
    //Atributos
    int base1, base2, altura;
    double area,perimetro;
    
    //Métodos
    public double método_area(int base1, int base2, int altura ){
        area = ((base1+base2)*altura)/2;
        return area;
    }
    public double método_perimetro(int base1, int base2, int altura){
       perimetro = base1+base2+(Math.sqrt((base1*base1)+(altura*altura))*2);
       return perimetro;
    }
}
