package Eje_2;

public class LDobleA {
	private NodoA p;
	public LDobleA() {
		p=null;
	}
	public NodoA getP() {
		return p;
	}
	public void setP(NodoA p) {
		this.p = p;
	}
	public void adifinal(NodoA nue) {
//		NodoA nue = new NodoA();
		if(getP()==null)
			setP(nue);
		else {
			NodoA q = getP();
			while (q.getSig()!=null) {
				q =q.getSig();
			}
			q.setSig(nue);
			nue.setAnt(q);
		}
	}
	public void mostrar() {
		NodoA z = getP();
		while (z!=null) {
			z.mostrar();
			z=z.getSig();
		}
	}
	public void crear() {

	}
}
