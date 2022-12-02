package Eje_1;

public class NodoP {
	private String nombre, hora, grupoSolista;
	private NodoP ant,sig;
	public NodoP() {
		// TODO Auto-generated constructor stub
	}
	public NodoP(String nombre, String hora, String grupoSolista) {
		super();
		this.nombre = nombre;
		this.hora = hora;
		this.grupoSolista = grupoSolista;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getGrupoSolista() {
		return grupoSolista;
	}
	public void setGrupoSolista(String grupoSolista) {
		this.grupoSolista = grupoSolista;
	}
	public NodoP getAnt() {
		return ant;
	}
	public void setAnt(NodoP ant) {
		this.ant = ant;
	}
	public NodoP getSig() {
		return sig;
	}
	public void setSig(NodoP sig) {
		this.sig = sig;
	}
	public void mostrar() {
		System.out.println("Presentacion [nombre=" + nombre + ", hora=" + hora + ", grupoSolista=" + grupoSolista + "]");
	}
	
}
