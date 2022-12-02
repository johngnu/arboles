package Eje_1;

public class NodoF {
	private String fecha;
	private CSimpleE escenarios;
	private LDobleE espacios;
	private NodoF izq,der;
	public NodoF() {
		// TODO Auto-generated constructor stub
	}
	public NodoF(String fecha, CSimpleE escenarios, LDobleE espacios) {
		super();
		this.fecha = fecha;
		this.escenarios = escenarios;
		this.espacios = espacios;
	}
	public NodoF getIzq() {
		return izq;
	}
	public void setIzq(NodoF izq) {
		this.izq = izq;
	}
	public NodoF getDer() {
		return der;
	}
	public void setDer(NodoF der) {
		this.der = der;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public CSimpleE getEscenarios() {
		return escenarios;
	}
	public void setEscenarios(CSimpleE escenarios) {
		this.escenarios = escenarios;
	}
	public LDobleE getEspacios() {
		return espacios;
	}
	public void setEspacios(LDobleE espacios) {
		this.espacios = espacios;
	}
	public void mostrar() {
		System.out.println("Feria [fecha=" + fecha + "]");
		escenarios.mostrar();
		espacios.mostrar();
	}
	
}
