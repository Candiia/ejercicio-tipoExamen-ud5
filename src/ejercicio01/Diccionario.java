package ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Diccionario {
	
	private List<Palabra> listaPalabra;

	public Diccionario(List<Palabra> listaPalabra) {
		super();
		this.listaPalabra = listaPalabra;
	}

	public List<Palabra> getListaPalabra() {
		return listaPalabra;
	}

	public void setListaPalabra(List<Palabra> listaPalabra) {
		this.listaPalabra = listaPalabra;
	}

	@Override
	public String toString() {
		return "Diccionario [listaPalabra=" + listaPalabra + "]";
	}
	
	/*agregar palabra*/
	
	public void agregarPalabra(Palabra p) {
		listaPalabra.add(p);
	}
	
	public void cargarLista() {
		agregarPalabra(new Palabra(1, "Hello", "Saludar a una persona"));
		agregarPalabra(new Palabra(2, "Park", "Parque"));
		agregarPalabra(new Palabra(3, "Chocolate", "Chocolate"));	
	}
	
	public void mostrarLista() {
		Iterator <Palabra> it = listaPalabra.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		} 
	}
	
	
	/*Buscar una palabra*/
	public Palabra findById(String nombreBusc) {
		int i=0;
		boolean encontrado=false;
		
		while(i < listaPalabra.size() && !encontrado) {
			Palabra aux = listaPalabra.get(i);
			if(aux.getNombreIngles().equalsIgnoreCase(nombreBusc)) {
				encontrado=true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return listaPalabra.get(i);
		}else {
			return null;
		}
	}
	
	/*modificar el significado*/
	
	public void modificarSig(String sigificadoNuevo, String nombreBus) {
		findById(nombreBus).setSignificadoEspayol(sigificadoNuevo);
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
