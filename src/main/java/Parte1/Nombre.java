package Parte1;

public class Nombre {
    
    int salario, horas, mensualidad;
    
    public int método_mensualidad(int salario, int horas){
        mensualidad = (salario*horas);
        if(mensualidad>450000){
            return mensualidad;
        }
        return 0;
    }
}