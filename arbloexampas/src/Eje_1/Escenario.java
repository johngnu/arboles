package Eje_1;

public class Escenario {
	private String nombre;
	private LDobleP pre;
	public Escenario() {
		// TODO Auto-generated constructor stub
	}
	public Escenario(String nombre, LDobleP pre) {
		super();
		this.nombre = nombre;
		this.pre = pre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LDobleP getPre() {
		return pre;
	}
	public void setPre(LDobleP pre) {
		this.pre = pre;
	}
	public void mostrar() {
		System.out.println("Escenario [nombre=" + nombre + "]");
		this.pre.mostrar();
	}
	
}
