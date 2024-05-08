import java.util.ArrayList;
import java.util.Arrays;

public class Encriptado {

	private String[] plantilla;
	
		
	/**
	 * 
	 */
	public Encriptado() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @param plantilla
	 */
	public Encriptado(String[] plantilla) {
		super();
		this.plantilla = plantilla;
	}


	/**
	 * @return the plantilla
	 */
	public String[] getPlantilla() {
		return plantilla;
	}



	/**
	 * @param plantilla the plantilla to set
	 */
	public void setPlantilla(String[] plantilla) {
		this.plantilla = plantilla;
	}
	



	@Override
	public String toString() {
		return "Encriptado [plantilla=" + Arrays.toString(plantilla) + "]";
	}



	public String mostrarDatos() {
		return "plantilla=" + Arrays.toString(plantilla) + "\n**************************************";
	}



	public  String[] plantillaCodificacion(String [] letras) {
		String [] nuevasLetras = new String[28];
		ArrayList<Integer> posiciones = new ArrayList<Integer>();
		
		for (int i = 0; i<letras.length; i++) {
			int numero = (int) (Math.random()*28)+1;
			
			posiciones.add(numero);
			if(i+numero<28) {
				nuevasLetras[i] = letras[i + numero];
			}else {
				nuevasLetras[i] = letras[i + numero - 28];
			}
		}
		
		return nuevasLetras;
	}
	
	
	
	
}






