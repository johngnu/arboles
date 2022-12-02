package Eje_1;

public class LDobleE {

	private NodoE p;
	public LDobleE()
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
    public void adiFinal(String nombre,String actividad){
        NodoE nuevo=new NodoE(nombre,actividad);
        if(getP()==null)
            setP(nuevo);
        else
        {
            NodoE r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }
    public void adiPrincipio(String nombre,String actividad){
        NodoE nuevo=new NodoE(nombre,actividad);
        if(getP()==null)
            setP(nuevo);
        else
        {
            nuevo.setSig(getP());
            getP().setAnt(nuevo);
            setP(nuevo);
        }
	}
    public void leer2(int n)
    {
        for(int i=1;i<=n;i++){
        	//Leer
        }
    }
    public void leer1(int n)
    {
        for(int i=1;i<=n;i++){
        	//Leer
        }
    } 
	public void mostrar()
    {
        System.out.println("Paginas : ");
        NodoE r=getP();
        while(r!=null){
        	r.mostrar();
            r=r.getSig();
        }
    }
	public void mostrar2()
    {
        System.out.println("Paginas : ");
        NodoE r=getP();
        while(r.getSig()!=null)
        	r = r.getSig();
        while(r!=null){
        	r.mostrar();
            r=r.getAnt();
        }
    }
	public void leer2() {
		
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
