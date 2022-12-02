package Clases;


public class LSimpleC {

    private NodoC p;
    public LSimpleC()
    {
        p=null;
    }
    public NodoC getP() {
        return p;
    }
    public void setP(NodoC p) {
        this.p = p;
    }
    public boolean esvacia() {
    	return p==null;
    }
    public void adiFinal(String ci,int puntaje){
        NodoC nuevo=new NodoC();
        nuevo.setCi(ci);
        nuevo.setPuntaje(puntaje);
        if(getP()==null)
            setP(nuevo);
        else
        {
            NodoC r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void adiFinal_2(NodoC nuevo){
        if(getP()==null)
            setP(nuevo);
        else
        {
            NodoC r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void adiPrincipio(String ci,int puntaje){
        NodoC nuevo=new NodoC();
        nuevo.setCi(ci);
        nuevo.setPuntaje(puntaje);
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
		System.out.println("Calificaciones:");
        NodoC r=getP();
        while(r!=null){
        	r.mostrar();
        	r=r.getSig();
        }
    }
	public void leer2() {
		
	}
	public int nroNodos() {
		int c=0;
		NodoC w=getP();
		while(w!=null) {
			c++;
			w=w.getSig();
		}
		return c;
	}

}
