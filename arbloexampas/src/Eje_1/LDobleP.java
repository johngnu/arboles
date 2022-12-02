package Eje_1;

public class LDobleP {

	private NodoP p;
	public LDobleP()
    {
        p=null;
    }
    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }
    public boolean esvacia() {
    	return p==null;
    }
    public void adiFinal(String nombre,String hora,String grup){
        NodoP nuevo=new NodoP(nombre,hora, grup);
        if(getP()==null)
            setP(nuevo);
        else
        {
            NodoP r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }
    public void adiPrincipio(String nombre,String hora,String grup){
        NodoP nuevo=new NodoP(nombre,hora, grup);
        if(getP()==null)
            setP(nuevo);
        else
        {
            nuevo.setSig(getP());
            getP().setAnt(nuevo);
            setP(nuevo);
        }
	}
	public void mostrar()
    {
        System.out.println("PRESENTACIONES : ");
        NodoP r=getP();
        while(r!=null){
        	r.mostrar();
            r=r.getSig();
        }
    }
	public void leer2() {
		
	}
	public int nroNodos() {
		int c=0;
		NodoP w=getP();
		while(w!=null) {
			c++;
			w=w.getSig();
		}
		return c;
	}

}
