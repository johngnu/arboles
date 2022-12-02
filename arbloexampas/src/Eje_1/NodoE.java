package Eje_1;

public class NodoE {
	private String nombre, actividad;
	private NodoE ant,sig;
	public NodoE() {
	}
	public NodoE(String nombre, String actividad) {
		super();
		this.nombre = nombre;
		this.actividad = actividad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	public NodoE getAnt() {
		return ant;
	}
	public void setAnt(NodoE ant) {
		this.ant = ant;
	}
	public NodoE getSig() {
		return sig;
	}
	public void setSig(NodoE sig) {
		this.sig = sig;
	}
	public void mostrar() {
		System.out.println("Espacio [nombre=" + nombre + ", actividad=" + actividad + "]");
	}
	
}
