package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		List <Palabra> listaPalabra = new ArrayList<Palabra>();
		String palabraIngles, significado, nombreBus, nuevoSigni, significadoBus;
		int id=4, opcion, cero=0;
		Diccionario d;
		Palabra p;
		
		d= new Diccionario (listaPalabra);
		
		d.cargarLista();
		
		do{
			System.out.println("---------------------------------");
			System.out.println("""
					0 - Salir
					1 - Mostrar lista de palabras
					2 - Agregra una palabra
					3 - Buscar una palabra
					4 - Modificar el significado de una palabra
					5 - Borrar una palabra
					6 - Lista  en orden alfabético
					7 - Lista con de palabras con el mismo significado
					""");
			System.out.println("¿Qué desea hacer?");
			opcion=Leer.datoInt();
			System.out.println("-----------------------------------------------------------------");
			switch(opcion){
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				d.mostrarLista();
				break;
				
			case 2:
				System.out.println("Indique la palabra en ingles");
				palabraIngles=Leer.dato();
				System.out.println("Diga el significado");
				significado=Leer.dato();
				p = new Palabra(id, palabraIngles, significado);
				id++;
				d.agregarPalabra(p);
				break;		
				
			case 3:
				System.out.println("Indique la palabra en ingles que desea ver ");
				nombreBus=Leer.dato();
				System.out.println(d.findById(nombreBus));
				break;
				
			case 4:
				
				System.out.println("Indique la palabra en ingles que cambiar su significado");
				nombreBus=Leer.dato();
				System.out.println("Indique el nuevo significado");
				nuevoSigni=Leer.dato();
				d.modificarSig(nuevoSigni, nombreBus);
				break;
				
			case 5:
				System.out.println("Indique la palabra en ingles que desea borrar");
				nombreBus=Leer.dato();
				d.borrarPalabra(nombreBus);
				break;
				
			case 6:
				Collections.sort(listaPalabra, new CompararPorNombre());
				for (Palabra palabra : listaPalabra) {
					System.out.println(palabra);
				}
				break;
				
			case 7:
				System.out.println("Indique el significado que desea buscar");
				significadoBus=Leer.dato();
				
				System.out.println(d.listaPalabrasSigni(significadoBus));
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		
			
		}while(opcion!=cero);
	}

}
