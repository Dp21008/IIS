package clases;

import java.util.ArrayList;

public class Departamento {
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	public Departamento() {
	}
	public Departamento(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public void eliminarEmpleado(Empleado empleado) {
		this.empleados.remove(empleado);
	}
	
	public void verEmpleados() {
		int contador = 0;
		for (Empleado empleado : empleados) {
				contador = contador+1;
				System.out.println("Empleado" + contador + ": " + empleado.toString());
		}
	}
	
}
