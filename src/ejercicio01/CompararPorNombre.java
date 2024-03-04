package ejercicio01;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Palabra>{

	@Override
	public int compare(Palabra p1, Palabra p2) {
		
		return -(p1.getNombreIngles().toLowerCase().compareTo(p2.getNombreIngles().toLowerCase()));
	}

}
