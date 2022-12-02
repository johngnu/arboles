package Clases;

public class NodoC {
	private String ci;
	private int puntaje;
	private NodoC sig;
	public NodoC() {
		// TODO Auto-generated constructor stub
	}
	public NodoC(String ci, int puntjae) {
		super();
		this.ci = ci;
		this.puntaje = puntjae;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntjae) {
		this.puntaje = puntjae;
	}
	public NodoC getSig() {
		return sig;
	}
	public void setSig(NodoC sig) {
		this.sig = sig;
	}
	public void mostrar() {
		System.out.println("Calificacion [ci=" + ci + ", puntaje=" + puntaje + "]");
	}
}
