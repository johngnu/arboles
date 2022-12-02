package Eje_2;

public class TipoMaterial {
	private int idTipoM;
	private String nombre;
	public TipoMaterial() {
	}
	public TipoMaterial(int idTipoM, String nombre) {
		super();
		this.idTipoM = idTipoM;
		this.nombre = nombre;
	}
	public int getIdTipoM() {
		return idTipoM;
	}
	public void setIdTipoM(int idTipoM) {
		this.idTipoM = idTipoM;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "TipoMaterial [idTipoM=" + idTipoM + ", nombre=" + nombre + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
	public void leer() {
		// TODO Auto-generated method stub
		
	}
}
