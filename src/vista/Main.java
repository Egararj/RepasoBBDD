package vista;

import java.util.Scanner;

import excepciones.CampoVacioExcepcion;
import servicio.EmpleadoServicio;

public class Main {

	public static void main(String[] args) {
		EmpleadoServicio es = new EmpleadoServicio();
		Scanner sc = new Scanner(System.in);
		sc = null;
		int opcion = 0;
		int buscar = 0;
		String buscarEmpleado = "";
		boolean valido = true;

		do {
		System.out.println("=== SISTEMA DE GESTIÓN DE EMPLEADOS ===");
		System.out.println("1. Crear empleado");
		System.out.println("2. Listar empleados");
		System.out.println("3. Buscar empleado");
		System.out.println("4. Actualizar empleado");
		System.out.println("5. Eliminar empleado");
		System.out.println("6. Reportes");
		System.out.println("7. Salir");
		System.out.println("Seleccione una opción:");	
		
		try {
		sc = new Scanner(System.in);
		opcion = sc.nextInt();
		sc = null;
		if (opcion<1 || opcion>7) System.out.println("Opción no válida");	
		}catch (Exception e){
			System.out.println("Opción no válida");	
		}
		switch (opcion) {
		case 1:

			try {
				es.nuevoEmpleado();
			} catch (Exception e) {
				
				e.printStackTrace();
			}

		break;
		
		case 2:
			es.listaEmpleado();
		break;
		
		case 3:
			do {
			System.out.println("1.Por Id");
			System.out.println("2.Por nombre");
			System.out.println("3.Por email");
			System.out.println("4.Por departamento");
			try {
				sc = new Scanner (System.in);
				buscar = sc.nextInt();
				sc = null;
				if(buscar <1 || buscar >4) throw new Exception();
			}catch (Exception e) {
				System.out.println("Opcion no valida");
			}
			}while(buscar <1 || buscar >4);
			if (buscar == 1) {
				System.out.println("Escriba el id");
				sc = new Scanner (System.in);
				buscarEmpleado = sc.nextLine();
				sc = null;
				es.buscarPorId(buscarEmpleado);
			}else if(buscar == 2) {
				System.out.println("Escriba el nombre");
				sc = new Scanner (System.in);
				buscarEmpleado = sc.nextLine();
				sc = null;
				es.buscarPorNombre(buscarEmpleado);
			}else if(buscar == 3) {
				System.out.println("Escriba el email");
				sc = new Scanner (System.in);
				buscarEmpleado = sc.nextLine();
				sc = null;
				es.buscarPorEmail(buscarEmpleado);
			}else if(buscar == 4){
				System.out.println("Escriba el departamento");
				sc = new Scanner (System.in);
				buscarEmpleado = sc.nextLine();
				sc = null;
				es.buscarPorDepartamento(buscarEmpleado);
			}
			
		break;
		
		case 4:
			
		break;
		
		case 5:
			
		break;
		
		case 6:
			
		break;
		
		case 7:
			
		break;
		}
		}while(opcion !=7);
	}

}
