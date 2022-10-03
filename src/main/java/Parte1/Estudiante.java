package Parte1;

public class Estudiante {
    //Atributos
    int estrato,patrimonio;
    double matricula;
    
   //Métodos
   public double metodo_matricula(int estrato,int patrimonio){
        if(estrato>3 && patrimonio>2000000){
            matricula = 50000+(0.03*patrimonio);
            return matricula;
        }
        else{
            matricula = 50000;
            return matricula;
        }
    }
}
