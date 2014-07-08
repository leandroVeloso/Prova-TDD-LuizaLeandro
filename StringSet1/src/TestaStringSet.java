import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestaStringSet {

	StringSet obj1;

	@Before
	public void setUp() throws Exception {
		obj1 = new StringSet();
	}

	@Test
	public void naoDeveSerVazia() throws StringNullException {
		assertFalse(obj1.verificaString(""));
	}
	
	@Test (expected = StringNullException.class)
	public void deveLancarExcecaoQuandoNulo() throws StringNullException {
		obj1.verificaString(null);
	}
	
	@Test
	public void deveAdicionarString() throws StringNullException {
		assertTrue(obj1.adiciona("Texto1"));
		assertFalse(obj1.adiciona(""));
	}

	@Test
	public void verificaSeContemString() throws StringNullException {
		obj1.adiciona("Texto1");
		assertTrue(obj1.verificaContem("Texto1"));
	}

}