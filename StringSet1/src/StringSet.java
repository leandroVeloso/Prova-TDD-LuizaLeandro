import java.util.*;


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

	public String adicionaTexto(String texto) throws StringNullException {
		if(verificaString(texto)){
			stringSet.add(texto);
			return texto;
		}
		
		return "";
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
	
	public String retornaElemento(int indice){
		if(stringSet.size() > indice){
			return stringSet.get(indice).toString();
		}else{
			return "";
		}
	}

	public void uneStringSets(StringSet obj2) throws StringNullException {
		
		for(int i=0; i<obj2.retornaQuantidade(); i++ ){
			stringSet.add(obj2.retornaElemento(i));
		}
	}

	public void retornaInterseccao(StringSet obj2) {
		ArrayList<String> stringSetTemp = new ArrayList<String>() ;
		for(int i=0; i<stringSet.size(); i++ ){
			for(int j=0; j<obj2.retornaQuantidade(); j++ ){
				if(stringSet.get(i).equals(obj2.retornaElemento(j))){
					stringSetTemp.add(obj2.retornaElemento(j));
					
				}
			}
		}
		stringSet = stringSetTemp;
		
	}

}
