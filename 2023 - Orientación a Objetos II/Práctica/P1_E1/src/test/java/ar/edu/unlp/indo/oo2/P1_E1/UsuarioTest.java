package ar.edu.unlp.indo.oo2.P1_E1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UsuarioTest {
	
	Usuario valido;
	
	@BeforeEach
	void setUp() throws Exception {
		valido = new Usuario("usuario");
		valido.crearTweet("este es el tweet");
		valido.crearTweet("");
		valido.crearTweet("ultimo tweet");
	}
    @Test
    public void testGetNombre() {
        assertEquals("usuario", valido.getScreenName());
        
    }
    @Test
    public void testCrearTweet() {
    	assertEquals("ultimo tweet", valido.getUltimoTweet());
    	
    }
  

}
