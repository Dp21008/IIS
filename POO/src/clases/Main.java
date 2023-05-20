package clases;
public class Main {
	public static void main(String[] args) {
		Proyecto proyecto = new Proyecto();
		Empleado empleado1 = new Empleado("Julio", "Jardines del palmar", 20, 675.00);
		Empleado empleado2 = new Empleado("Mishel", "San Miguelito", 20, 675.00);
		proyecto.agregarEmpleado(empleado1);
		proyecto.agregarEmpleado(empleado2);
		proyecto.verEmpleados();
		System.out.println("");
		proyecto.eliminarEmpleado(empleado1);
		proyecto.verEmpleados();
	}
}
