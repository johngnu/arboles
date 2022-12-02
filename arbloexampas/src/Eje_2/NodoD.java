package Eje_2;

public class NodoD {
	private String nombreDep;
	private LDobleA lisA;
	private NodoD sig;
	public NodoD() {
		sig=null;
	}
	
	public NodoD(LDobleA lisA,String nombreDep) {
		super();
		this.lisA = lisA;
		this.nombreDep=nombreDep;
		sig=null;
	}
	public String getNombreDep() {
		return nombreDep;
	}

	public void setNombreDep(String nombreDep) {
		this.nombreDep = nombreDep;
	}

	public LDobleA getLisA() {
		return lisA;
	}
	public void setLisA(LDobleA lisA) {
		this.lisA = lisA;
	}
	public NodoD getSig() {
		return sig;
	}
	public void setSig(NodoD sig) {
		this.sig = sig;
	}
	public void mostrar() {
		System.out.println("\nDEPARTAMENTO: "+nombreDep+"\n");
		lisA.mostrar();
	}
}
