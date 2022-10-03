package Parte1;

public class MayoroMenor {
    //Atributos
    int A,B;
    String comparacion;
    
    //Métodos
    public String compa(int A, int B){
        if(A>B){
            comparacion = A+" es mayor que "+B;
            return comparacion;
        }
        else if(A<B){
            comparacion = A+" es menor que "+B;
            return comparacion;
        }
        else{
            comparacion = A+" es igual a "+B;
            return comparacion;
        }
    }
}
