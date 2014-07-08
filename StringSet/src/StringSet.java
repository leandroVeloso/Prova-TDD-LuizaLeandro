
public class StringSet {

	public boolean verificaString(String texto) throws StringNullException {
		if(texto == null){
			throw new StringNullException();
		}
		
		if(texto.isEmpty()){
			return false;
		}
		
		return true;
	}

}
