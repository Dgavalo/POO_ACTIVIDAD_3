
package Parte1;

public class Separador {
    
    public int método_mayor(String cadena){
        
        int mayor=0;
        String [] numeros_string = cadena.split(","); //separa el string en , y los mete al array
    
        int[] numeros_enteros = new int[numeros_string.length]; //crea un array para los numeros enteros con el largo de arriba
    
        for(int i=0; i<numeros_string.length; i++){    
        
            numeros_enteros[i] = Integer.parseInt(numeros_string[i]);  //mete los numeros de un array al otro
        }
    
        for( int i=0; i<numeros_enteros.length; i++){
            if(numeros_enteros[i] > mayor){
                mayor = numeros_enteros[i];
            }
        }
        return mayor;
    }
    
    public String método_cuadrado(String cadena){
        
        String salida = "";
        
        String [] numeros_string = cadena.split(","); //separa el string en , y los mete al array
    
        int[] numeros_enteros = new int[numeros_string.length]; //crea un array para los numeros enteros con el largo de arriba
    
        for(int i=0; i<numeros_string.length; i++){    
        
            numeros_enteros[i] = Integer.parseInt(numeros_string[i]);  //mete los numeros de un array al otro
        }
        
        for(int i=0; i<numeros_enteros.length; i++){
            
            numeros_enteros[i]= (numeros_enteros[i]*numeros_enteros[i]);
            salida += String.valueOf(numeros_enteros[i])+", ";
        }
        return salida;
    }
    
    public String método_cubo(String cadena){
        
        String salida = "";
        String [] numeros_string = cadena.split(","); //separa el string en , y los mete al array
    
        int[] numeros_enteros = new int[numeros_string.length]; //crea un array para los numeros enteros con el largo de arriba
    
        for(int i=0; i<numeros_string.length; i++){    
        
            numeros_enteros[i] = Integer.parseInt(numeros_string[i]);  //mete los numeros de un array al otro
        }
        
        for(int i=0; i<numeros_enteros.length; i++){
            
            numeros_enteros[i]= (numeros_enteros[i]*numeros_enteros[i]*numeros_enteros[i]);
            salida += String.valueOf(numeros_enteros[i])+", ";
        }
        return salida;
    }
    
    public String método_raiz(String cadena){
        
        String salida = "";
        String [] numeros_string = cadena.split(","); //separa el string en , y los mete al array
    
        double[] numeros_enteros = new double[numeros_string.length]; //crea un array para los numeros enteros con el largo de arriba
    
        for(int i=0; i<numeros_string.length; i++){    
        
            numeros_enteros[i] = Double.parseDouble(numeros_string[i]);  //mete los numeros de un array al otro
        }
        
        for(int i=0; i<numeros_enteros.length; i++){
            
            numeros_enteros[i] = Math.sqrt(numeros_enteros[i]);
            salida += String.valueOf(numeros_enteros[i])+", ";
        }
        return salida;
    }
    
}    