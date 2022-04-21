package modelo;

public class Perro extends Animal implements Adoptable {
	
	private String raza;
	
	public Perro(String nombre, String edad,String raza) {
		super(nombre, edad);
		
	}

	@Override
	public void Adoptar() {
		this.adoptado=true;
		
	}
	
	
	
}
