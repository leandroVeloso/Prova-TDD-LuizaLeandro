import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestaStringset {

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

}
