package ejercicio02Map;

public class Palabra {
	
	private int id;
	private String nombreIngles;


	public Palabra(int id, String nombreIngles) {
	super();
	this.id = id;
	this.nombreIngles = nombreIngles;
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreIngles() {
		return nombreIngles;
	}

	public void setNombreIngles(String nombreIngles) {
		this.nombreIngles = nombreIngles;
	}

	@Override
	public String toString() {
		return "Palabra [id=" + id + ", nombreIngles=" + nombreIngles + "]";
	}

	
	

}
