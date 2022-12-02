package Clases;

public class NodoE {
	private String ci, nombre, pat, mat;
	private NodoE sig;
	public NodoE() {
		// TODO Auto-generated constructor stub
	}
	public NodoE(String ci, String nombre, String pat, String mat) {
		super();
		this.ci = ci;
		this.nombre = nombre;
		this.pat = pat;
		this.mat = mat;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPat() {
		return pat;
	}
	public void setPat(String pat) {
		this.pat = pat;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public NodoE getSig() {
		return sig;
	}
	public void setSig(NodoE sig) {
		this.sig = sig;
	}
	public void mostrar() {
		System.out.println("Estudiante [ci=" + ci + ", nombre=" + nombre + ", pat=" + pat + ", mat=" + mat + "]");
	}
}
