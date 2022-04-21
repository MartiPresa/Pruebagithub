package modelo;

public class Animal  {
	private String nombre;
	private String edad;
	protected boolean adoptado;
	
	public String getNombre() {
		return nombre;
	}
	public String getEdad() {
		return edad;
	}
	public Animal(String nombre, String edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.adoptado=false;
	}
	System.out.println("ahre");
	

}
