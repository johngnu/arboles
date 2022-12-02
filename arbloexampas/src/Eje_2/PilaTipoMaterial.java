package Eje_2;


public class PilaTipoMaterial {

	private int max=100;
	private TipoMaterial v[]=new TipoMaterial[max+1];
	private int tope;
	
	public PilaTipoMaterial() {
		tope=0;
	}
    boolean esvacia (){
		if (tope == 0)
		    return (true);
		return (false);
    }
    boolean esllena (){
		if (tope == max)
		    return (true);
		return (false);
    }
    int nroelem (){
    	return (tope);
    }
	void adicionar (TipoMaterial elem){
		if (!esllena ()){
		    tope++;
		    v [tope] = elem;
		}
		else
		    System.out.println ("Pila llena");
	}
	TipoMaterial eliminar (){
		TipoMaterial elem = new TipoMaterial();
		if (!esvacia ()){
		    elem = v [tope];
		    tope--;
		}
		else
		    System.out.println ("Pila vacia");
		return (elem);
	    }
	void mostrar (){
		TipoMaterial elem;
		if (esvacia ())
		    System.out.println ("Pila vacia");
		else {
		    System.out.println ("\n Datos de la Pila ");
		    PilaTipoMaterial aux = new PilaTipoMaterial();
		    while (!esvacia ()){
				elem = eliminar ();
				aux.adicionar (elem);
				elem.mostrar();
		    }
		    while (!aux.esvacia ()){
				elem = aux.eliminar ();
				adicionar (elem);
		    }
			}
	    }
	void llenar (int n){
		int i;
		for (i = 1 ; i <= n ; i++){
			TipoMaterial x=new TipoMaterial();
            x.leer();
            adicionar(x);
	        }
	    }
	void vaciar (PilaTipoMaterial a){
		while (!a.esvacia ())
		    adicionar (a.eliminar ());
	    }
	void crear() {
		adicionar(new TipoMaterial(66, "hierro"));
		adicionar(new TipoMaterial(333, "plastico"));
		adicionar(new TipoMaterial(222, "madera"));
		adicionar(new TipoMaterial(555, "metal"));
		adicionar(new TipoMaterial(111, "madera"));
		adicionar(new TipoMaterial(55, "madera"));
		adicionar(new TipoMaterial(444, "metal"));
		adicionar(new TipoMaterial(99, "madera"));
		adicionar(new TipoMaterial(000, "metal"));
	}

}
