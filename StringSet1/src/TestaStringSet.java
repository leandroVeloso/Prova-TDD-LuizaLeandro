import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestaStringSet {

	StringSet obj1;
	StringSet obj2;
	StringSet obj3;

	@Before
	public void setUp() throws Exception {
		obj1 = new StringSet();
		obj2 = new StringSet();
		obj3 = new StringSet();
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
		assertTrue(obj1.adicionaTexto("Texto1"));
		assertFalse(obj1.adicionaTexto(""));
	}

	@Test
	public void verificaSeContemString() throws StringNullException {
		obj1.adicionaTexto("Texto1");
		assertTrue(obj1.verificaContem("Texto1"));
		assertFalse(obj1.verificaContem("Texto2"));
	}
	
	@Test
	public void deveRemoverString() throws StringNullException {
		obj1.adicionaTexto("Texto1");
		assertTrue(obj1.removeTexto("Texto1"));
		assertFalse(obj1.removeTexto("Texto1"));
	}
	
	@Test
	public void deveRetornarQuantidadeDeStrings() throws StringNullException {
		obj1.adicionaTexto("Texto1");
		obj1.adicionaTexto("Texto2");
		obj1.adicionaTexto("Texto3");
		assertEquals(3, obj1.retornaQuantidade());
		obj1.adicionaTexto("Texto4");
		assertEquals(4, obj1.retornaQuantidade());
	}
	
	@Test
	public void deveUnirStringSets() throws StringNullException{
		obj1.adicionaTexto("Texto1");
		obj1.adicionaTexto("Texto2");
		obj2.adicionaTexto("Texto3");
		obj2.adicionaTexto("Texto4");
		obj3.adicionaTexto("Texto1");
		obj3.adicionaTexto("Texto2");
		obj3.adicionaTexto("Texto3");
		obj3.adicionaTexto("Texto4");
		
		assertTrue(obj1.uneStringSets(obj2));
	}

}
