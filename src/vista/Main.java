package vista;

import java.util.Scanner;

import servicio.EmpleadoServicio;

public class Main {

	public static void main(String[] args) {
		EmpleadoServicio es = new EmpleadoServicio();
		Scanner sc = new Scanner(System.in);
		sc = null;
		int opcion = 0;

		do {
		System.out.print("=== SISTEMA DE GESTIÓN DE EMPLEADOS ===");
		System.out.print("1. Crear empleado");
		System.out.print("2. Listar empleados");
		System.out.print("3. Buscar empleado");
		System.out.print("4. Actualizar empleado");
		System.out.print("5. Eliminar empleado");
		System.out.print("6. Reportes");
		System.out.print("7. Salir");
		System.out.print("Seleccione una opción:");	
		
		try {
		sc = new Scanner(System.in);
		opcion = sc.nextInt();
		sc = null;
		if (opcion<1 || opcion<7) System.out.print("Opción no válida");	
		}catch (Exception e){
			System.out.print("Opción no válida");	
		}
		switch (opcion) {
		case 1:
		es.nuevoEmpleado();
		break;
		
		case 2:
			
		break;
		
		case 3:
			
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
