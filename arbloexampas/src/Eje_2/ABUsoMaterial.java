package Eje_2;

public class ABUsoMaterial {
	private NodoUM r;
	public ABUsoMaterial() {
		r=null;
	}
	public NodoUM getR() {
		return r;
	}
	public void setR(NodoUM r) {
		this.r = r;
	}
	
	void preorden(NodoUM r) {
		if(r!=null) {
			r.mostrar();
			preorden(r.getIzq());
			preorden(r.getDer());
		}
	}
	void inorden(NodoUM r) {
		if(r!=null) {
			inorden(r.getIzq());
			r.mostrar();
			inorden(r.getDer());
		}
	}
	void posorden(NodoUM r) {
		if(r!=null) {
			posorden(r.getIzq());
			posorden(r.getDer());
			r.mostrar();
		}
	}
	public void crear() {
		NodoUM p = new NodoUM(55, 3);
		NodoUM p1 = new NodoUM(555, 3);
		NodoUM p2 = new NodoUM(444, 1);
		NodoUM p3= new NodoUM(111, 2);
		setR(p);
		p.setIzq(p1);
		p.setDer(p2);
		p1.setIzq(p3);
	}
}