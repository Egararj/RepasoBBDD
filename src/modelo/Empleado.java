package modelo;

import java.time.LocalDate;

public class Empleado {
	private int id;
	private String nombre;
	private String apellidos;
	private String email;
	private double salario;
	private LocalDate fecha_ingreso;
	private boolean activo;
	private String departamento;
	private long telefono;
	
	public Empleado() {
	}

	public Empleado(String nombre, String apellidos, String email, double salario, String departamento, long telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.salario = salario;
		this.departamento = departamento;
		this.telefono = telefono;
	}
	
	

	public Empleado(int id, String nombre, String apellidos, String email, double salario, LocalDate fecha_ingreso,
			boolean activo, String departamento, long telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.salario = salario;
		this.fecha_ingreso = fecha_ingreso;
		this.activo = activo;
		this.departamento = departamento;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(LocalDate fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email
				+ ", salario=" + salario + ", fecha_ingreso=" + fecha_ingreso + ", activo=" + activo + ", departamento="
				+ departamento + ", telefono=" + telefono + "]";
	}

	
}
