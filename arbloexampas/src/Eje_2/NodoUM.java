package Eje_2;

public class NodoUM {
	private int idTipoM,nroViviendas;
	private NodoUM izq,der;
	public NodoUM() {
		izq=der=null;
	}
	public NodoUM(int idTipoM, int nroViviendas) {
		super();
		this.idTipoM = idTipoM;
		this.nroViviendas = nroViviendas;
		izq=der=null;
	}
	public int getIdTipoM() {
		return idTipoM;
	}
	public void setIdTipoM(int idTipoM) {
		this.idTipoM = idTipoM;
	}
	public int getNroViviendas() {
		return nroViviendas;
	}
	public void setNroViviendas(int nroViviendas) {
		this.nroViviendas = nroViviendas;
	}
	public NodoUM getIzq() {
		return izq;
	}
	public void setIzq(NodoUM izq) {
		this.izq = izq;
	}
	public NodoUM getDer() {
		return der;
	}
	public void setDer(NodoUM der) {
		this.der = der;
	}
	@Override
	public String toString() {
		return "NodoMPar [idTipoM=" + idTipoM + ", nroViviendas=" + nroViviendas + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}

}
