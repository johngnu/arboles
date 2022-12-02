package Eje_2;
public class LSimpleD {
	private NodoD p;
	public LSimpleD() {
		// TODO Auto-generated constructor stub
	}
	public NodoD getP() {
		return p;
	}
	public void setP(NodoD p) {
		this.p = p;
	}
	public void adifinal(NodoD nuevo) {
		if (getP()==null) 
			setP(nuevo);
		else {
			NodoD y = getP();
			while (y.getSig()!=null) 
				y=y.getSig();//recorrido
			y.setSig(nuevo);//enlace ultimo con el primero
		}
	}
	public void mostrar() {
		NodoD f= getP();
		while(f!=null) {
			f.mostrar();
			f=f.getSig();
		}
	}
	void crear(){
		
		ABUsoMaterial pa = new ABUsoMaterial();
		pa.crear();
		ABUsoMaterial t = new ABUsoMaterial();
		t.crear();
		ABUsoMaterial pi = new ABUsoMaterial();
		pi.crear();
		LDobleA l = new LDobleA();
		l.adifinal(new NodoA(2016, pa, t, pi));
		adifinal(new NodoD(l,"La Paz"));
		
		ABUsoMaterial pa1 = new ABUsoMaterial();
		pa1.crear();
		ABUsoMaterial t1= new ABUsoMaterial();
		t1.crear();
		ABUsoMaterial pi1 = new ABUsoMaterial();
		pi1.crear();
		LDobleA l1 = new LDobleA();
		l1.adifinal(new NodoA(2016, pa1, t1, pi1));
		adifinal(new NodoD(l1,"Chuquisaca"));
		
	}
}
