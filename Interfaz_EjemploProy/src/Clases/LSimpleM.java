package Clases;

public class LSimpleM {

	private NodoM p;
    public LSimpleM()
    {
        p=null;
    }
    public NodoM getP() {
        return p;
    }
    public void setP(NodoM p) {
        this.p = p;
    }
    public boolean esvacia() {
    	return p==null;
    }
    public void adiFinal(String nombre, String sigla, LSimpleC cal){
        NodoM nuevo=new NodoM();
        nuevo.setNombre(nombre);
        nuevo.setSigla(sigla);
        nuevo.setCal(cal);
        if(getP()==null)
            setP(nuevo);
        else
        {
            NodoM r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void adiFinal_2(NodoM nuevo){
        if(getP()==null)
            setP(nuevo);
        else
        {
            NodoM r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void adiPrincipio(String nombre, String sigla, LSimpleC cal){
        NodoM nuevo=new NodoM();
        nuevo.setNombre(nombre);
        nuevo.setSigla(sigla);
        nuevo.setCal(cal);
        if(getP()==null)
            setP(nuevo);
        else
        {
            nuevo.setSig(getP());
            setP(nuevo);
        }
	}
    public void leer2(int n)
    {
        for(int i=1;i<=n;i++){

        }
    }
    public void leer1(int n)
    {
        for(int i=1;i<=n;i++){

        }
    } 
	public void mostrar()
    {
		System.out.println("---------MATERIAS------");
        NodoM r=getP();
        while(r!=null){
        	r.mostrar();
        	r=r.getSig();
        }
    }
	public void leer2() {
		LSimpleC cal1 = new LSimpleC();
		cal1.adiFinal("111", 85);
		cal1.adiFinal("222", 65);
		cal1.adiFinal("333", 70);
		cal1.adiFinal("555", 45);
		adiFinal("I. Algoritmos", "INF111", cal1);
		LSimpleC cal2 = new LSimpleC();
		cal2.adiFinal("111", 90);
		cal2.adiFinal("222", 40);
		cal2.adiFinal("333", 0);
		cal2.adiFinal("555", 30);
		adiFinal("O. Computadoras", "INF112", cal2);
		LSimpleC cal3 = new LSimpleC();
		cal3.adiFinal("111", 40);
		cal3.adiFinal("222", 40);
		cal3.adiFinal("333", 0);
		cal3.adiFinal("555", 30);
		cal3.adiFinal("444", 0);
		cal3.adiFinal("666", 30);
		cal3.adiFinal("777", 30);
		cal3.adiFinal("888", 0);
		cal3.adiFinal("999", 30);
		adiFinal("Calculo I", "MAT115", cal3);
		LSimpleC cal4 = new LSimpleC();
		cal4.adiFinal("111", 40);
		cal4.adiFinal("222", 40);
		cal4.adiFinal("333", 0);
		cal4.adiFinal("555", 30);
		cal4.adiFinal("444", 0);
		cal4.adiFinal("666", 30);
		adiFinal("Estadistica I", "EST133", cal4);
	}
	public int nroNodos() {
		int c=0;
		NodoM w=getP();
		while(w!=null) {
			c++;
			w=w.getSig();
		}
		return c;
	}

}
