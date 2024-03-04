package ejercicio01;

public class Palabra {

	private int id;
	private String nombreIngles;
	private String significadoEspayol;
	
	public Palabra(int id, String nombreIngles, String significadoEspayol) {
		super();
		this.id = id;
		this.nombreIngles = nombreIngles;
		this.significadoEspayol = significadoEspayol;
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

	public String getSignificadoEspayol() {
		return significadoEspayol;
	}

	public void setSignificadoEspayol(String significadoEspayol) {
		this.significadoEspayol = significadoEspayol;
	}

	@Override
	public String toString() {
		return "Palabra [id=" + id + ", nombreIngles=" + nombreIngles + ", significadoEspayol=" + significadoEspayol
				+ "]";
	}
	
	
}
