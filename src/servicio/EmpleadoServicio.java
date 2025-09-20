package servicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import excepciones.CampoVacioExcepcion;
import excepciones.NumeroExcepcion;
import interfaces.IEmpleado;
import modelo.Empleado;
import repositorio.EmpleadoRepositorio;

public class EmpleadoServicio implements IEmpleado{

	public EmpleadoServicio() {
		
	}

	@Override
	public void nuevoEmpleado() throws Exception {
		Scanner sc = new Scanner(System.in);
		sc = null;
		
		String nombre = "";
		String apellidos = "";
		String email = "";
		double salario = 0;
		String departamento = "";
		long telefono = 0;
		
		String doubleString;
		String longString;
		boolean valido = true;
		
		while(valido) {
		System.out.println("Ingrese el nombre:");
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
		System.out.println("Ingrese los apellidos:");
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
		System.out.println("Ingrese el email:");
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
		System.out.println("Ingrese el salario:");
		sc = new Scanner(System.in);
		doubleString = sc.nextLine();
		try {
			salario = Double.parseDouble(doubleString);
		}catch (Exception e) {
			throw new NumeroExcepcion();
		}
		sc = null;
		if (salario <= 15000 || salario >= 100000) throw new NumeroExcepcion();
		else {
		valido = false;
		}
		}
		valido = true;
		
		while(valido) {
		System.out.println("Ingrese el departamento:");
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
		System.out.println("Ingrese el telefono:");
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
		
		Empleado empleado = new Empleado(nombre, apellidos, email, salario, departamento, telefono);
		
		EmpleadoRepositorio er = new EmpleadoRepositorio();
		er.nuevoEmpleado(empleado);
		System.out.println("Empleado agregado");
		
	}

	public void listaEmpleado() {
		EmpleadoRepositorio er = new EmpleadoRepositorio();
		List<Empleado> empleados = new ArrayList<>();
		empleados = er.obtenerEmpleados();
		
		for(Empleado emp : empleados) {
			System.err.println("=========");
			System.out.print("Id: "+emp.getId());
			System.out.print(". Nombre: "+emp.getNombre());
			System.out.print(". Apellidos: "+emp.getApellidos());
			System.out.print(". Email: "+emp.getEmail());
			System.out.print(". Salario: "+emp.getSalario());
			System.out.print(". Fecha ingreso: "+emp.getFecha_ingreso());
			if(emp.isActivo())
				System.out.print(". Activo: Si");
			else
				System.out.print(". Activo: No");
			System.out.print(". Departamento: "+emp.getDepartamento());
			System.out.println(". Telefono: "+emp.getTelefono());
		}
		
	}

	public void buscarPorId(String buscarEmpleado) {
		EmpleadoRepositorio er = new EmpleadoRepositorio();
		List<Empleado> empleados = new ArrayList<>();
		empleados = er.buscarPorId(buscarEmpleado);
		
		for(Empleado emp : empleados) {
			System.err.println("=========");
			System.out.print("Id: "+emp.getId());
			System.out.print(". Nombre: "+emp.getNombre());
			System.out.print(". Apellidos: "+emp.getApellidos());
			System.out.print(". Email: "+emp.getEmail());
			System.out.print(". Salario: "+emp.getSalario());
			System.out.print(". Fecha ingreso: "+emp.getFecha_ingreso());
			if(emp.isActivo())
				System.out.print(". Activo: Si");
			else
				System.out.print(". Activo: No");
			System.out.print(". Departamento: "+emp.getDepartamento());
			System.out.println(". Telefono: "+emp.getTelefono());
		}
	}

	public void buscarPorNombre(String buscarEmpleado) {
		EmpleadoRepositorio er = new EmpleadoRepositorio();
		List<Empleado> empleados = new ArrayList<>();
		empleados = er.buscarPorNombre(buscarEmpleado);
		
		for(Empleado emp : empleados) {
			System.err.println("=========");
			System.out.print("Id: "+emp.getId());
			System.out.print(". Nombre: "+emp.getNombre());
			System.out.print(". Apellidos: "+emp.getApellidos());
			System.out.print(". Email: "+emp.getEmail());
			System.out.print(". Salario: "+emp.getSalario());
			System.out.print(". Fecha ingreso: "+emp.getFecha_ingreso());
			if(emp.isActivo())
				System.out.print(". Activo: Si");
			else
				System.out.print(". Activo: No");
			System.out.print(". Departamento: "+emp.getDepartamento());
			System.out.println(". Telefono: "+emp.getTelefono());
		}
		
	}

	public void buscarPorEmail(String buscarEmpleado) {
		EmpleadoRepositorio er = new EmpleadoRepositorio();
		List<Empleado> empleados = new ArrayList<>();
		empleados = er.buscarPorEmail(buscarEmpleado);
		
		for(Empleado emp : empleados) {
			System.err.println("=========");
			System.out.print("Id: "+emp.getId());
			System.out.print(". Nombre: "+emp.getNombre());
			System.out.print(". Apellidos: "+emp.getApellidos());
			System.out.print(". Email: "+emp.getEmail());
			System.out.print(". Salario: "+emp.getSalario());
			System.out.print(". Fecha ingreso: "+emp.getFecha_ingreso());
			if(emp.isActivo())
				System.out.print(". Activo: Si");
			else
				System.out.print(". Activo: No");
			System.out.print(". Departamento: "+emp.getDepartamento());
			System.out.println(". Telefono: "+emp.getTelefono());
		}		
	}

	public void buscarPorDepartamento(String buscarEmpleado) {
		EmpleadoRepositorio er = new EmpleadoRepositorio();
		List<Empleado> empleados = new ArrayList<>();
		empleados = er.buscarPorDepartamento(buscarEmpleado);
		
		for(Empleado emp : empleados) {
			System.err.println("=========");
			System.out.print("Id: "+emp.getId());
			System.out.print(". Nombre: "+emp.getNombre());
			System.out.print(". Apellidos: "+emp.getApellidos());
			System.out.print(". Email: "+emp.getEmail());
			System.out.print(". Salario: "+emp.getSalario());
			System.out.print(". Fecha ingreso: "+emp.getFecha_ingreso());
			if(emp.isActivo())
				System.out.print(". Activo: Si");
			else
				System.out.print(". Activo: No");
			System.out.print(". Departamento: "+emp.getDepartamento());
			System.out.println(". Telefono: "+emp.getTelefono());
		}		
	}

}
