package servicio;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
		if (salario < 15000 || salario > 100000) throw new NumeroExcepcion();
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

	public void buscarPorIdYCambiar(String buscarEmpleado) {
		Scanner sc = new Scanner (System.in);
		sc = null;
		double salario = 0;
		String confirmacion = "";
		int id = 0;
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
			id = emp.getId();
		}
		System.out.println("Escriba el nuevo salario");
		try {
			sc = new Scanner (System.in);
			salario = Long.parseLong(sc.nextLine());
			sc=null;
			if (salario < 15000 || salario > 100000) throw new Exception();
			System.out.println("El nuevo salario sera "+salario+". Escriba 's' para confirmar o cualquier otra tecla para anular");
			sc = new Scanner (System.in);
			confirmacion = sc.nextLine();
			sc=null;
			if(confirmacion.equalsIgnoreCase("s")) {
			er.updateSalario(salario,id);
			confirmacion = "";
			}

		}catch (Exception e) {
			System.out.println("Salario incorrecto");
		}
	}

	public void buscarPorIdYEliminar(String buscarEmpleado) throws SQLException {
		Scanner sc = new Scanner (System.in);
		sc = null;
		String confirmacion = "";
		int id = 0;
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
			id = emp.getId();
		}
		System.out.println("Desea eliminar este empleado? Escriba 's' para confirmar o cualquier otra tecla para anular");
		sc = new Scanner (System.in);
		confirmacion = sc.nextLine();
		sc=null;
		if(confirmacion.equalsIgnoreCase("s")) {
			System.out.println("Seguro? Escriba 's' para confirmar o cualquier otra tecla para anular");
			sc = new Scanner (System.in);
			confirmacion = sc.nextLine();
			sc=null;
			if(confirmacion.equalsIgnoreCase("s")) {
				er.eliminarEmpleado(id);
			}else confirmacion = "";
		}else confirmacion = "";
	}

	public void reporte() {
		EmpleadoRepositorio er = new EmpleadoRepositorio();
		List<Empleado> empleados = new ArrayList<>();
		empleados = er.obtenerEmpleados();
		double salarioTotal = 0;
		int contador = 0;
		LocalDate empleadoMasAntiguoFecha = LocalDate.now();
		Empleado empleadoAntiguo = null;
		Map<String, Integer> cuentaEmpleadosPorDepartamento = new HashMap<>();
		for(Empleado emp : empleados) {
			contador ++;
			salarioTotal += emp.getSalario();
			cuentaEmpleadosPorDepartamento.merge(emp.getDepartamento(), 1, Integer::sum);
			if(emp.getFecha_ingreso().isBefore(empleadoMasAntiguoFecha)) {
				empleadoMasAntiguoFecha = emp.getFecha_ingreso();
				empleadoAntiguo = emp;
			}
		}
		System.out.println("Numerop de empleados en cada departamento: "+cuentaEmpleadosPorDepartamento);
		double salarioMedio = (salarioTotal/contador);
		System.out.println("Salario medio: "+salarioMedio);		
		System.err.println("Empleado mas antiguo");
		System.out.print("Id: "+empleadoAntiguo.getId());
		System.out.print(". Nombre: "+empleadoAntiguo.getNombre());
		System.out.print(". Apellidos: "+empleadoAntiguo.getApellidos());
		System.out.print(". Email: "+empleadoAntiguo.getEmail());
		System.out.print(". Salario: "+empleadoAntiguo.getSalario());
		System.out.print(". Fecha ingreso: "+empleadoAntiguo.getFecha_ingreso());
		if(empleadoAntiguo.isActivo())
			System.out.print(". Activo: Si");
		else
			System.out.print(". Activo: No");
		System.out.print(". Departamento: "+empleadoAntiguo.getDepartamento());
		System.out.println(". Telefono: "+empleadoAntiguo.getTelefono());
		}
		
	}


