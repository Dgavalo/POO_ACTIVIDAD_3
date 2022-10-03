package Parte1;

public class Ecucuadratica {
    
    double X1,X2,A,B,C;
    
    public double ecu1(double A, double B, double C){
        X1 = (-B+Math.sqrt((B*B)-(4*A*C)))/(2*A);
        return X1;
    }
    
    public double ecu2(double A, double B, double C){
        X2 = (-B-Math.sqrt((B*B)-(4*A*C)))/(2*A);
        return X2;
    }
}
