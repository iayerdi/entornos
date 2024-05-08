
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] posiciones =  {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"," "};

	}
	
	public static String encriptar(String mensaje, String[] plantilla) {
		String letras =  "abcdefghijklmnñopqrstuvwxyz ";
		String resul = "";
		mensaje = mensaje.toLowerCase();
		for(int i=0; i<mensaje.length(); i++) {
			String letra = String.valueOf(mensaje.charAt(i));
			int pos = letras.indexOf(letra);
			resul = resul + plantilla[pos];
		}
		
		return resul;
	}
	
	
	
	

}
