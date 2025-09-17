package interfaces;

import excepciones.CampoVacioExcepcion;
import modelo.Empleado;

public interface IEmpleado {
	
	void nuevoEmpleado () throws CampoVacioExcepcion;
}
