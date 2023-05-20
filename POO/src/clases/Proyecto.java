package clases;

public class Proyecto {
	private Departamento departamento = new Departamento();
	public Proyecto() {
	}
	public Proyecto(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		this.departamento.agregarEmpleado(empleado);
	}
	
	public void eliminarEmpleado(Empleado empleado) {
		this.departamento.eliminarEmpleado(empleado);
	}
	
	public void verEmpleados() {
		this.departamento.verEmpleados();
	}
	
}
