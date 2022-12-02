package Clases;

public class NodoM {
	private String nombre, sigla;
	private LSimpleC cal;
	private NodoM sig;
	public NodoM() {
		// TODO Auto-generated constructor stub
	}
	public NodoM(String nombre, String sigla, LSimpleC cal) {
		super();
		this.nombre = nombre;
		this.sigla = sigla;
		this.cal = cal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public LSimpleC getCal() {
		return cal;
	}
	public void setCal(LSimpleC cal) {
		this.cal = cal;
	}
	public NodoM getSig() {
		return sig;
	}
	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	public void mostrar() {
		System.out.println("Materia [nombre=" + nombre + ", sigla=" + sigla + "]");
		cal.mostrar();
	}
}
