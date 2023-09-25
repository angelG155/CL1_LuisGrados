package org.cibertec.edu.pe.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empleado")
public class Empleado {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdEmpleado")
	private int IdEmpleado;
	
	@Column(name = "Apellidos")
	private String apellidos;
	
	@Column(name = "Nombres")
	private String nombres;
	
	@Column(name = "Edad")
	private int edad;
	
	@Column(name = "Sexo")
	private String sexo;
	
	@Column(name = "Salario")
	private int salario;
	
	
	public Empleado() {
		
	}
	
	public Empleado(int IdEmpleado, String apellidos, String nombres, int edad, String sexo, int salario) {
		IdEmpleado = IdEmpleado;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}

	public int getIdEmpleado() {
		return IdEmpleado;
	}

	public void setIdEmpleado(int IdEmpleado) {
		IdEmpleado = IdEmpleado;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	


}
