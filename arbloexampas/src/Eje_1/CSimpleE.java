package Eje_1;

public class CSimpleE {
	private int max=40;
    private Escenario v[] = new Escenario[max+1];
    private int ini,fin;
	public CSimpleE(){
	        ini=fin=0;
    }
	public boolean esvacia (){
	if (ini == 0 && fin == 0)
	    return (true);
	return (false);
    }
    public boolean esllena (){
		if (fin == max)
		    return (true);
		return (false);
	}
	public int nroelem (){
		return (fin - ini);
    }
	public void adicionar (Escenario elem) {
		if (!esllena ()) {
		    fin++;
		    v [fin] = elem;
		}
		else
		    System.out.println ("Cola Simple llena");
    }
	public Escenario eliminar (){
		Escenario elem = new Escenario();
		if (!esvacia ()){
		    ini++;
		    elem = v [ini];
		    if (ini == fin)
		    	ini = fin = 0;
		}
		else
		    System.out.println ("Cola Simple vacia");
		return (elem);
    }
	public void mostrar (){
		Escenario elem;
		if (esvacia ())
		    System.out.println ("Cola vacia");
		else{
		    System.out.println ("Datos de la Cola ESCENARIOS: ");
		    CSimpleE aux = new CSimpleE();
		    while (!esvacia ()){
				elem = eliminar ();
				aux.adicionar (elem);
				elem.mostrar ();
		    }
		    while (!aux.esvacia ()){
				elem = aux.eliminar ();
				adicionar (elem);
		    }
		}
	 }
	 public void vaciar (CSimpleE a){
		while (!a.esvacia ())
		    adicionar (a.eliminar ());
	 }
	 public void llenar2() {
		
		 
		
	 }
}

