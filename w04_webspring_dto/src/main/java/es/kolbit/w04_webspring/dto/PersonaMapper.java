package es.kolbit.w04_webspring.dto;

import es.kolbit.w04_webspring.model.Persona;

public class PersonaMapper {

	public PersonaDto getPersonaDto(Persona p) {
		return new PersonaDto(p.getId(), p.getNombre(), p.getApellidos());
	}
	
	public Persona getPersona(PersonaDto p) {
		return new Persona(p.getId(), p.getNombre(), p.getApellidos());
	}
}
