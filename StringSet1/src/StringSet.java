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

	public boolean adiciona(String texto) throws StringNullException {
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

}
