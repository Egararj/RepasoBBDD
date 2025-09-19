package servicio;

import java.time.LocalDate;
import java.util.Scanner;

import excepciones.CampoVacioExcepcion;
import excepciones.NumeroExcepcion;
import interfaces.IEmpleado;
import modelo.Empleado;

public class EmpleadoServicio implements IEmpleado{

	public EmpleadoServicio() {
		
	}

	@Override
	public void nuevoEmpleado() throws Exception {
		Scanner sc = new Scanner(System.in);
		sc = null;
		
		String nombre;
		String apellidos;
		String email;
		double salario;
		String departamento;
		long telefono;
		
		String doubleString;
		String longString;
		boolean valido = true;
		
		while(valido) {
		System.out.print("Ingrese el nombre:");
		sc = new Scanner(System.in);
		nombre = sc.nextLine();
		sc = null;
		if (nombre.length() == 0) throw new CampoVacioExcepcion();
		else {
		valido = false;
		}
		}
		valido = true;
		
		while(valido) {
		System.out.print("Ingrese los apellidos:");
		sc = new Scanner(System.in);
		apellidos = sc.nextLine();
		sc = null;
		if (apellidos.length() == 0) throw new CampoVacioExcepcion();
		else {
		valido = false;
		}
		}
		valido = true;
		
		while(valido){
		System.out.print("Ingrese el email:");
		sc = new Scanner(System.in);
		email = sc.nextLine();
		sc = null;
		if (email.length() == 0) throw new CampoVacioExcepcion();
		else {
		valido = false;
		}
		}
		valido = true;
		
		while(valido){
		System.out.print("Ingrese el salario:");
		sc = new Scanner(System.in);
		doubleString = sc.nextLine();
		try {
			salario = Double.parseDouble(doubleString);
		}catch (Exception e) {
			throw new NumeroExcepcion();
		}
		sc = null;
		if (salario <= 0) throw new NumeroExcepcion();
		else {
		valido = false;
		}
		}
		valido = true;
		
		while(valido) {
		System.out.print("Ingrese el departamento:");
		sc = new Scanner(System.in);
		departamento = sc.nextLine();
		sc = null;
		if (departamento.length() == 0) throw new CampoVacioExcepcion();
		else {
		valido = false;
		}
		}
		valido = true;
		
		while(valido) {
		System.out.print("Ingrese el telefono:");
		sc = new Scanner(System.in);
		longString = sc.nextLine();
		sc = null;
		if (longString.length() == 0) throw new CampoVacioExcepcion();
		else {
			try {
				telefono = Long.parseLong(longString);
			}catch (Exception e) {
				throw new NumeroExcepcion();
			}
		}
		valido = false;
		}
		valido = true;
	}

}
