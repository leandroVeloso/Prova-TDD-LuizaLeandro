import java.util.ArrayList;


public class StringSet {
	
	ArrayList<String> stringSet;
	
	public StringSet() {
		stringSet = new ArrayList<String>();
	}

	public boolean verificaString(String texto) throws StringNullException {
		if(texto == null){
			throw new StringNullException();
		}
		
		if(texto.isEmpty()){
			return false;
		}
		
		return true;
	}

	public boolean adicionaTexto(String texto) throws StringNullException {
		if(verificaString(texto)){
			stringSet.add(texto);
			return true;
		}
		
		return false;
	}

	public boolean verificaContem(String texto) {
		if(stringSet.contains(texto)){
			return true;
		}
		return false;
	}

	public boolean removeTexto(String texto) {
		if(stringSet.contains(texto)){
			stringSet.remove(texto);
			return true;
		}
		return false;
	}

	public int retornaQuantidade() {
		return stringSet.size();
	}

	public boolean uneStringSets(StringSet obj2) throws StringNullException {
		
		StringSet obj3 = new StringSet();
		
		obj3.adicionaTexto("Texto1");
		obj3.adicionaTexto("Texto2");
		obj3.adicionaTexto("Texto3");
		obj3.adicionaTexto("Texto4");
		
		return true;
	}

}
