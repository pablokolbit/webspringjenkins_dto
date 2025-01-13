package es.kolbit.w04_webspring.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import es.kolbit.w04_webspring.model.Persona;

public class MapperTest {

	@Test
	@DisplayName("Verifica 'getPersonaDto()' de PersonaMapper")
	public void test01() {
		Persona p = new Persona(158, "nom", "ape", "tel", "dom");
		PersonaDto esperado = new PersonaDto(158, "nom", "ape");
		Assertions.assertEquals(esperado, PersonaMapper.getPersonaDto(p));
	}
	
	@Test
	@DisplayName("Verifica 'getPersona()' de PersonaMapper")
	public void test02() {
		PersonaDto p = new PersonaDto(158, "nom", "ape");
		Persona esperado = new Persona(158, "nom", "ape", null, null);
		Persona aTestear = PersonaMapper.getPersona(p);
		Assertions.assertEquals(esperado, aTestear);
		assertEquals(esperado.getId(), aTestear.getId());
		assertEquals(esperado.getNombre(), aTestear.getNombre());
		assertEquals(esperado.getApellidos(), aTestear.getApellidos());
		assertNull(aTestear.getTelefono());
		assertNull(aTestear.getDomicilio());
	}
}
