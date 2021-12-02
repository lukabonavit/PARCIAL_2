package ej2;

public class EmpleadosConHorasDobles extends Empleado {

	private int horasExtras;
	private double sueldoHora;

	public EmpleadosConHorasDobles() {

	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getSueldoHora() {
		return sueldoHora;
	}

	public void setSueldoHora(double sueldoHora) {
		this.sueldoHora = sueldoHora;
	}

	@Override
	public double CalcularSalario() {
		return (40 * sueldoHora) + (this.horasExtras * (this.sueldoHora * 2));
	}
}
