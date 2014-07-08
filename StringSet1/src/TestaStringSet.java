import static org.junit.Assert.*;

import java.util.Arrays;

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
		assertEquals("Texto1", obj1.adicionaTexto("Texto1"));
		assertEquals("", obj1.adicionaTexto(""));
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
		obj1.uneStringSets(obj2);
		
		assertTrue(obj1.verificaContem("Texto4"));
		assertTrue(obj1.verificaContem("Texto3"));
		
		assertFalse(obj1.verificaContem("Texto5"));
		
	}
	
	@Test
	public void retornaElemento() throws StringNullException{
		obj1.adicionaTexto("Texto1");
		assertEquals("Texto1", obj1.retornaElemento(0));
	}
	
	@Test
	public void deveRetornarInterseccaoDe2StringSet() throws StringNullException{
		obj1.adicionaTexto("Texto1");
		obj1.adicionaTexto("Texto2");
		obj1.adicionaTexto("Texto3");
		
		obj2.adicionaTexto("Texto2");
		obj2.adicionaTexto("Texto3");
		
		obj1.retornaInterseccao(obj2);
		
		assertEquals(2, obj1.retornaQuantidade());
		assertTrue(obj1.verificaContem("Texto2"));
		assertFalse(obj1.verificaContem("Texto1"));
	}
	
	@Test
	public void deveDeletarStringSet() throws StringNullException{
		obj1.adicionaTexto("Texto1");
		obj1.adicionaTexto("Texto2");
		obj1.adicionaTexto("Texto3");
		
		assertTrue(obj1.deletaStringSet());
		assertEquals(0, obj1.retornaQuantidade());
		assertFalse(obj1.verificaContem("Texto1"));
	}
	
	@Test
	public void deveEnumerarStringSet() throws StringNullException{
		String [] enumeracaoEsperada = new String[3];
		enumeracaoEsperada[0] = "0-Texto0";
		enumeracaoEsperada[1] = "1-Texto1";
		enumeracaoEsperada[2] = "2-Texto2";
		
		obj1.adicionaTexto("Texto0");
		obj1.adicionaTexto("Texto1");
		obj1.adicionaTexto("Texto2");
		
		assertTrue(Arrays.toString(enumeracaoEsperada).equals(obj1.enumeraStringSet().toString()));
		
	}

}
