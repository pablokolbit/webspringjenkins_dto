package es.kolbit.w04_webspring.dto;

import es.kolbit.w04_webspring.model.Persona;

public class PersonaMapper {

	public static PersonaDto getPersonaDto(Persona p) {
		return new PersonaDto(p.getId(), p.getNombre(), p.getApellidos());
	}
	
	public static Persona getPersona(PersonaDto p) {
		return new Persona(p.getId(), p.getNombre(), p.getApellidos());
	}
}
