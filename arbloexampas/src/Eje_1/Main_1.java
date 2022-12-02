package Eje_1;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABinarioF f = new ABinarioF();
		f.crear();
		f.preorden(f.getR());
		// GRUPO 1
		//b) De la fecha X, mostrar cada escenario (mostrar nombre) y la cantidad de “solistas” que se 
		//	presentaron en los mismos.
		System.out.println("---------Solucion_1---------");
		SolucionB(f.getR(),"12/07/22");
		//c) Mostrar las actividades “pintura” que se presentaron en cada feria.
		SolucionC(f.getR());
		//GRUPO 2
		//b) De la Fecha X, mostrar los escenarios (mostrar nombre) donde se presentaron “grupos” (mostrar 
		//nombre y hora)
		SolucionB_2(f.getR(),"12/07/22");
		//c) Cuantas actividades “juegos” se presentaron en cada feria
		SolucionC_2(f.getR());
	}

	private static void SolucionC_2(NodoF r) {
		if(r != null) {
			//proceso
			int c = ContarActividades_Juego(r.getEspacios());
			System.out.println("Feria de fecha: "+r.getFecha()+" Cantidad Juego: "+c);
			SolucionC_2(r.getIzq());
			SolucionC_2(r.getDer());
		}
	}

	private static int ContarActividades_Juego(LDobleE espacios) {
		NodoE e1 = espacios.getP();
		int c = 0;
		while(e1 != null) {
			if(e1.getActividad().equals("juego"))
				c++;
			e1 =e1.getSig();
		}
		return c;
	}

	private static void SolucionB_2(NodoF r, String fechaX) {
		if(r != null) {
			if(r.getFecha().equals(fechaX))
				RecorrerLosEscenarios_2(r.getEscenarios());
			SolucionB_2(r.getIzq(), fechaX);
			SolucionB_2(r.getDer(), fechaX);
		}
	}

	private static void RecorrerLosEscenarios_2(CSimpleE es) {
		CSimpleE aux = new CSimpleE();
		while(!es.esvacia()) {
			Escenario x = es.eliminar();
			if(VerificaGRupo_Nombre(x.getPre())) {
				System.out.println(x.getNombre());
				MostrarNombreHora(x.getPre());
			}
			aux.adicionar(x);
		}
		es.vaciar(aux);
	}

	private static boolean VerificaGRupo_Nombre(LDobleP pre) {
		NodoP p1 = pre.getP();
		while(p1 != null) {
			if(p1.getGrupoSolista().equals("grupo")) {
				return true;
			}
			p1 = p1.getSig();
		}
		return false;
	}

	private static void MostrarNombreHora(LDobleP pre) {
		NodoP p1 = pre.getP();
		while(p1 != null) {
			if(p1.getGrupoSolista().equals("grupo")) {
				System.out.println("\tNombre: "+p1.getNombre()+"Hora: "+p1.getHora());
			}
			p1 = p1.getSig();
		}
	}

	private static void SolucionC(NodoF r) {
		if(r != null) {
			System.out.println("Feria en fecha: "+r.getFecha());
			MostrarActividadesPintura(r.getEspacios());
			SolucionC(r.getIzq());
			SolucionC(r.getDer());
		}
	}

	private static void MostrarActividadesPintura(LDobleE espacios) {
		NodoE e1 = espacios.getP();
		while(e1 != null) {
			if(e1.getActividad().equals("pintura"))
				System.out.println("Nombre: "+e1.getNombre()+" Actividad: pintura");
			e1 = e1.getSig();
		}
	}

	private static void SolucionB(NodoF r, String fechaX) {
		if(r != null) {
			if(r.getFecha().equals(fechaX))
				RecorrerLosEscenarios(r.getEscenarios());
			SolucionB(r.getIzq(), fechaX);
			SolucionB(r.getDer(), fechaX);
		}
	}

	private static void RecorrerLosEscenarios(CSimpleE escenarios) {
		CSimpleE aux = new CSimpleE();
		while(!escenarios.esvacia()) {
			Escenario x = escenarios.eliminar();
			int c = ContarSolistas(x.getPre());
			System.out.println("Nombre: "+x.getNombre()+ "Cantidad solistas:"+c);
			aux.adicionar(x);
		}
		escenarios.vaciar(aux);
	}

	private static int ContarSolistas(LDobleP pre) {
		NodoP p1 = pre.getP();
		int c = 0;
		while(p1 != null) {
			if(p1.getGrupoSolista().equals("solista"))
				c++;
			p1 = p1.getSig();
		}
		return c;
	}

}
