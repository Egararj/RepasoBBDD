package repositorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import modelo.Empleado;

public class EmpleadoRepositorio {

	public EmpleadoRepositorio() {
		// TODO Auto-generated constructor stub
	}

	public void nuevoEmpleado(Empleado empleado) throws SQLException {
        String sql = "INSERT INTO empleados (nombre, apellidos, email, salario, fecha_ingreso, activo, departamento, telefono) VALUES (?,?,?,?,?,?,?,?)";
        try (Connection conn = DbConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellidos());
            ps.setString(3, empleado.getEmail());
            ps.setDouble(4, empleado.getSalario());
            LocalDate hoy = LocalDate.now();
            ps.setDate(5, Date.valueOf(hoy));
            ps.setInt(6, 1);
            ps.setString(7, empleado.getDepartamento());
            ps.setString(8, Long.toString(empleado.getTelefono()));

            ps.executeUpdate();
        }
    }

	public List<Empleado> obtenerEmpleados() {

		String sql = "SELECT * FROM empleados";

        List<Empleado> empleados = new ArrayList<>();

        try(Connection conn = DbConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                Double salario = rs.getDouble("salario");
                LocalDate fechaIngreso = rs.getDate("fecha_ingreso").toLocalDate();
                boolean activo = false;
                if(rs.getInt("activo") == 1)
                	activo = true;
                else
                	activo = false;
                String departamento = rs.getString("departamento");
                Long telefono = Long.parseLong(rs.getString("telefono"));

                Empleado empleado = new Empleado(id, nombre, apellidos, email, salario, fechaIngreso, activo, departamento, telefono);
               	empleados.add(empleado);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return empleados;
	}

	public List<Empleado> buscarPorId(String buscarEmpleado) {
		String sql = "SELECT * FROM empleados WHERE id='"+buscarEmpleado+"'";

        List<Empleado> empleados = new ArrayList<>();

        try(Connection conn = DbConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                Double salario = rs.getDouble("salario");
                LocalDate fechaIngreso = rs.getDate("fecha_ingreso").toLocalDate();
                boolean activo = false;
                if(rs.getInt("activo") == 1)
                	activo = true;
                else
                	activo = false;
                String departamento = rs.getString("departamento");
                Long telefono = Long.parseLong(rs.getString("telefono"));

                Empleado empleado = new Empleado(id, nombre, apellidos, email, salario, fechaIngreso, activo, departamento, telefono);
               	empleados.add(empleado);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return empleados;
	}

	public List<Empleado> buscarPorNombre(String buscarEmpleado) {
		String sql = "SELECT * FROM empleados WHERE nombre='"+buscarEmpleado+"'";

        List<Empleado> empleados = new ArrayList<>();

        try(Connection conn = DbConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                Double salario = rs.getDouble("salario");
                LocalDate fechaIngreso = rs.getDate("fecha_ingreso").toLocalDate();
                boolean activo = false;
                if(rs.getInt("activo") == 1)
                	activo = true;
                else
                	activo = false;
                String departamento = rs.getString("departamento");
                Long telefono = Long.parseLong(rs.getString("telefono"));

                Empleado empleado = new Empleado(id, nombre, apellidos, email, salario, fechaIngreso, activo, departamento, telefono);
               	empleados.add(empleado);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return empleados;
	}

	public List<Empleado> buscarPorEmail(String buscarEmpleado) {
		String sql = "SELECT * FROM empleados WHERE email='"+buscarEmpleado+"'";

        List<Empleado> empleados = new ArrayList<>();

        try(Connection conn = DbConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                Double salario = rs.getDouble("salario");
                LocalDate fechaIngreso = rs.getDate("fecha_ingreso").toLocalDate();
                boolean activo = false;
                if(rs.getInt("activo") == 1)
                	activo = true;
                else
                	activo = false;
                String departamento = rs.getString("departamento");
                Long telefono = Long.parseLong(rs.getString("telefono"));

                Empleado empleado = new Empleado(id, nombre, apellidos, email, salario, fechaIngreso, activo, departamento, telefono);
               	empleados.add(empleado);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return empleados;
	}

	public List<Empleado> buscarPorDepartamento(String buscarEmpleado) {
		String sql = "SELECT * FROM empleados WHERE departamento='"+buscarEmpleado+"'";

        List<Empleado> empleados = new ArrayList<>();

        try(Connection conn = DbConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                Double salario = rs.getDouble("salario");
                LocalDate fechaIngreso = rs.getDate("fecha_ingreso").toLocalDate();
                boolean activo = false;
                if(rs.getInt("activo") == 1)
                	activo = true;
                else
                	activo = false;
                String departamento = rs.getString("departamento");
                Long telefono = Long.parseLong(rs.getString("telefono"));

                Empleado empleado = new Empleado(id, nombre, apellidos, email, salario, fechaIngreso, activo, departamento, telefono);
               	empleados.add(empleado);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return empleados;
	}


	}

