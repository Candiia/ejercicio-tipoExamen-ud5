package ejercicio02Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Diccionario {
	
	private Map<Palabra, String> listaDic;

	public Diccionario(Map<Palabra, String> listaDic) {
		super();
		this.listaDic = listaDic;
	}
	
	public Map<Palabra, String> getListaDic() {
		return listaDic;
	}


	public void setListaDic(Map<Palabra, String> listaDic) {
		this.listaDic = listaDic;
	}

	/*agregar palabra*/
	public void agregarPalabra(Palabra p, String significado) {
		listaDic.put(p, significado);
	}
	
	public void cargarLista() {
		agregarPalabra(new Palabra(1, "Park"), "Parque");
		agregarPalabra(new Palabra(2, "For"), "Para");
		agregarPalabra(new Palabra(3, "Find"), "Buscar");
		
	}
	
	public void mostrarLista() {
		Iterator <Entry<Palabra, String>> it = listaDic.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		} 
	}
	
	
	/*Buscar una palabra*/
	public Palabra findById(String nombreBusc) {
		Palabra encontrada = null;
		Set <Palabra> aux = new HashSet<Palabra>();
		for (Palabra palabra : aux) {
			if(palabra.getNombreIngles().equalsIgnoreCase(nombreBusc)) {
				encontrada = palabra;
			}
		}
		return encontrada;
	}
	
	/*modificar el significado*/
	
	public void modificarSig(String sigificadoNuevo, String nombreBus) {
		findById(nombreBus).se;
	}
	
	/*Borrar una palabra*/
	
	public void borrarPalabra(String nombreBus) {
		listaPalabra.remove(findById(nombreBus));
	}
	
	
	/*devolver una lista con mismo significados*/
	public List<Palabra> listaPalabrasSigni(String signiBusca){
		List <Palabra> aux = new ArrayList <Palabra>();
		for (Palabra palabra : listaPalabra) {
			if(palabra.getSignificadoEspayol().equalsIgnoreCase(signiBusca)) {
				aux.add(palabra);
			}
		}
		return aux;
	}


}
