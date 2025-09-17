package servicio;

import java.time.LocalDate;
import java.util.Scanner;

import excepciones.CampoVacioExcepcion;
import interfaces.IEmpleado;
import modelo.Empleado;

public class EmpleadoServicio implements IEmpleado{

	public EmpleadoServicio() {
		
	}

	@Override
	public void nuevoEmpleado() throws CampoVacioExcepcion {
		Scanner sc = new Scanner(System.in);
		sc = null;
		String nombre;
		String apellidos;
		String email;
		double salario;
		String departamento;
		long telefono;
		
		System.out.print("Ingrese el nombre:");
		sc = new Scanner(System.in);
		nombre = sc.nextLine();
		sc = null;
		if (nombre.length() == 0) throw new CampoVacioExcepcion();
	}

}
