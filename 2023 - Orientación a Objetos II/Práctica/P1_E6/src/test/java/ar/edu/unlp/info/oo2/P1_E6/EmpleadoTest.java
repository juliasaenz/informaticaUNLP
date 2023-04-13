package ar.edu.unlp.info.oo2.P1_E6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	
	@BeforeEach
	void setUp() throws Exception {
		
	}
	
	@Test
    public void testSueldoPasante() {
		Pasante pasanteNada = new Pasante("juan",false,0,0);
		Pasante pasanteExamenes = new Pasante("juan",false,0,2);
		
		assertEquals(17400,pasanteNada.sueldo());
		assertEquals(21200,pasanteExamenes.sueldo());  
    }
	
	@Test
    public void testSueldoPlanta() {
		Planta plantaNuevo = new Planta("juan",false,0,0);
		Planta plantaViejo = new Planta ("juana",false,0,10);
		Planta plantaCasado = new Planta("juanito",true,0,0);
		Planta plantaHijos = new Planta("juanita",false,5,0);
		Planta plantaTodo = new Planta ("julian",true,2,5);
		
		
		assertEquals(43500,plantaNuevo.sueldo());
		assertEquals(62500,plantaViejo.sueldo());
		assertEquals(48250,plantaCasado.sueldo());
		assertEquals(53000,plantaHijos.sueldo());
		assertEquals(61550,plantaTodo.sueldo());
    }
	
	@Test
	public void testSueldoTemporario() {
		Temporario sinHoras = new Temporario ("juan",0,false,0);
		Temporario conHoras = new Temporario ("juan",10,false,0);
		Temporario casado = new Temporario ("juan",0,true,0);
		Temporario hijos = new Temporario ("juan",0,false,5);
		Temporario conTodo = new Temporario("juan",10,true,1);
	}

}
