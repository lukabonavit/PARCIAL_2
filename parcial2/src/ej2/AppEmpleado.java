package ej2;

import java.util.Scanner;

public class AppEmpleado {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// PREGUNTAR HORAS Y SUELDO - CON SCANNER

		System.out.println("Ingrese las horas trabajadas");
		int horasTrab = sc.nextInt();

		System.out.println("Ingrese el sueldo por hora");
		double sueldoHora = sc.nextDouble();

		// SIN HORAS EXTRAS

		if (horasTrab <= 40) {
			System.out.println("El sueldo de la jornada es: " + horasTrab * sueldoHora);
		} else if (horasTrab > 40 && horasTrab <= 45) {

			// HORAS EXTRAS DOBLES

			int horasExt = horasTrab - 40;
			EmpleadosConHorasDobles e1 = new EmpleadosConHorasDobles();
			e1.setHorasExtras(horasExt);
			e1.setSueldoHora(sueldoHora);

			System.out.println("El sueldo de la jornada es: " + e1.CalcularSalario());
		} else if (horasTrab > 45) {

			// HORAS EXTRAS TRIPLES

			int horasExt = horasTrab - 40;
			EmpleadoConHorasTriples e2 = new EmpleadoConHorasTriples();
			e2.setHorasExtras(horasExt);
			e2.setSueldoHora(sueldoHora);

			System.out.println("El sueldo de la jornada es: " + e2.CalcularSalario());
		}
	}
}
