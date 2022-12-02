package Eje_1;

public class ABinarioF {
	private NodoF r;
	public ABinarioF(){
		r=null;
	}
	public NodoF getR() {
		return r;
	}
	public void setR(NodoF r) {
		this.r = r;
	}
	
	//RID
	public void preorden(NodoF r) {
		if(r!=null) {
			System.out.println("\nFERIA:");
			r.mostrar();
			preorden(r.getIzq());
			preorden(r.getDer());
		}
	}
	//IRD
	public void inorden(NodoF r) {
		if(r!=null) {
			inorden(r.getIzq());
			r.mostrar();
			inorden(r.getDer());
		}
	}
	//IDR
	public 	void posorden(NodoF r) {
		if(r!=null) {
			posorden(r.getIzq());
			posorden(r.getDer());
			r.mostrar();
		}
	}
	public void crear() {
		LDobleE es1 = new LDobleE();
		es1.adiFinal("cine", "actividad1");
		es1.adiFinal("teatro", "pintura");
		es1.adiFinal("gastronomico", "juego");
		CSimpleE e1 = new CSimpleE();
		LDobleP pre1 = new LDobleP();
		pre1.adiFinal("musica1", "08:10", "grupo");
		pre1.adiFinal("musica2", "10:10", "grupo");
		pre1.adiFinal("musica3", "11:10", "solista");
		LDobleP pre2 = new LDobleP();
		pre2.adiFinal("musica1", "08:10", "solista");
		pre2.adiFinal("musica1", "08:10", "solista");
		e1.adicionar(new Escenario("Adulto mayor", pre1));
		e1.adicionar(new Escenario("Niñez", pre2));
		NodoF raiz=new NodoF("12/05/22", e1, es1);
		
		LDobleE es2 = new LDobleE();
		es2.adiFinal("gastronomico", "actividad1");
		es2.adiFinal("literatura", "pintura");
		es2.adiFinal("cine", "pintura");
		CSimpleE e2 = new CSimpleE();
		LDobleP pre3 = new LDobleP();
		pre3.adiFinal("musica1", "08:10", "grupo");
		pre3.adiFinal("musica2", "10:10", "grupo");
		pre3.adiFinal("musica3", "11:10", "solista");
		LDobleP pre4 = new LDobleP();
		pre4.adiFinal("musica1", "08:10", "solista");
		pre4.adiFinal("musica1", "08:10", "solista");
		e2.adicionar(new Escenario("Musica", pre3));
		e2.adicionar(new Escenario("Tribus urbanas", pre4));
		NodoF h1=new NodoF("15/08/22", e2, es2);
		
		LDobleE es3 = new LDobleE();
		es3.adiFinal("cine", "actividad1");
		es3.adiFinal("espacio1", "juego");
		es3.adiFinal("literatura", "juego");
		CSimpleE e3 = new CSimpleE();
		LDobleP pre5 = new LDobleP();
		pre5.adiFinal("musica1", "08:10", "grupo");
		pre5.adiFinal("musica2", "10:10", "grupo");
		pre5.adiFinal("musica3", "11:10", "solista");
		LDobleP pre6 = new LDobleP();
		pre6.adiFinal("musica1", "08:10", "solista");
		pre6.adiFinal("musica1", "08:10", "solista");
		e3.adicionar(new Escenario("Danza", pre5));
		e3.adicionar(new Escenario("Niñez", pre6));
		NodoF h2=new NodoF("12/07/22", e3, es3);
		
		setR(raiz);
		raiz.setIzq(h1);
		raiz.setDer(h2);
		
	}
}
