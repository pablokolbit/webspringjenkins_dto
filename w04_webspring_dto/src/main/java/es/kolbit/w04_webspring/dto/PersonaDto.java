package es.kolbit.w04_webspring.dto;

import java.util.Objects;

public class PersonaDto {

	private Integer id;
	private String nombre;
	private String apellidos;
	
	public PersonaDto() {
		
	}
	
	public PersonaDto(Integer id, String nombre, String apellidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaDto other = (PersonaDto) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "[" + id + ", " + nombre + ", " + apellidos + "]";
	}
}
