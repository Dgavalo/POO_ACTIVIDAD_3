
package Parte1;

public class Empleado {
    //Atributos
	int horas,vhora, porcentaje_retencion;
	double salario_bruto;
	double salario_neto;
	
	//Métodos
	public double método_salario_bruto(int horas,int vhora) {
		salario_bruto= horas*vhora;
                return salario_bruto;
	}
	
	public double método_salario_neto(double salario_bruto, int porcentaje_retencion) {
		salario_neto = (salario_bruto - ((salario_bruto*porcentaje_retencion)/100));
                return salario_neto;
	}   
}
