package interfaces;

import excepciones.CampoVacioExcepcion;
import excepciones.NumeroExcepcion;
import modelo.Empleado;

public interface IEmpleado {
	
	void nuevoEmpleado () throws CampoVacioExcepcion, NumeroExcepcion, Exception;
	
	void listaEmpleado();
}
