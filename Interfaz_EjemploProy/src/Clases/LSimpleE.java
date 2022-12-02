package Clases;


public class LSimpleE {

	private NodoE p;
    public LSimpleE()
    {
        p=null;
    }
    public NodoE getP() {
        return p;
    }
    public void setP(NodoE p) {
        this.p = p;
    }
    public boolean esvacia() {
    	return p==null;
    }
    public void adiFinal(String ci,String nom,String ap,String am){
        NodoE nuevo=new NodoE();
        nuevo.setCi(ci);
        nuevo.setNombre(nom);
        nuevo.setPat(ap);
        nuevo.setMat(am);
        if(getP()==null)
            setP(nuevo);
        else
        {
            NodoE r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void adiFinal_2(NodoE nuevo){
        if(getP()==null)
            setP(nuevo);
        else
        {
            NodoE r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void adiPrincipio(String ci,String nom,String ap,String am){
        NodoE nuevo=new NodoE();
        nuevo.setCi(ci);
        nuevo.setNombre(nom);
        nuevo.setPat(ap);
        nuevo.setMat(am);
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
		System.out.println("ESTUDIANTES:");
        NodoE r=getP();
        while(r!=null){
        	r.mostrar();
        	r=r.getSig();
        }
    }
	public void leer2() {
		adiFinal("111", "pedro", "aguilar", "roque");
		adiFinal("222", "maria", "roque", "flores");
		adiFinal("333", "lucas", "lopez", "flores");
		adiFinal("444", "juana", "diaz", "flores");
		adiFinal("555", "elian", "ligia", "roque");
		adiFinal("666", "emily", "flores", "diaz");
		adiFinal("777", "david", "camacho", "roque");
	}
	public int nroNodos() {
		int c=0;
		NodoE w=getP();
		while(w!=null) {
			c++;
			w=w.getSig();
		}
		return c;
	}

}
