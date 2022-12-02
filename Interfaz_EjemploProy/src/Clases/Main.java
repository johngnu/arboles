package Clases;

public class Main {

	public static void main(String[] args) {
		LSimpleM m = new LSimpleM();
		m.leer2();	m.mostrar();
		LSimpleE e = new LSimpleE();
		e.leer2();  e.mostrar();
		//a) Mostrar los datos de los estudiantes que hayan reprobado en la materia X
//		SolucionA(m,e,"I. Algoritmos");
		//b) Calcular el promedio de todos los estudiantes aprobados de cada materia
//		SolucionB(m,e);
		
	}
	private static void SolucionB(LSimpleM m, LSimpleE e) {
		NodoM m1 = m.getP();
		while(m1 != null) {
			System.out.println("Materia: "+m1.getNombre()+" promedio(aprobados): "+GeneraPromedio(m1.getCal()));
			m1 = m1.getSig();
		}
	}

	private static double GeneraPromedio(LSimpleC cal) {
		int cc = 0;
		double sumaNotas = 0;
		NodoC c1 = cal.getP();
		while(c1 != null) {
			if(c1.getPuntaje()>50) {
				cc++;
				sumaNotas += c1.getPuntaje();
			}
			c1 = c1.getSig();
		}
		if(cc != 0)
			return sumaNotas/cc;
		return 0;
	}
	private static void SolucionA(LSimpleM m, LSimpleE e, String matX) {
		System.out.println("Estudiantes reprobados");
		NodoE e1 = e.getP();
		while(e1 != null) {
			if(VerificarMateriaReprobada(e1.getCi(),m,matX))
				e1.mostrar();
			e1 = e1.getSig();
		}
	}

	private static boolean VerificarMateriaReprobada(String ci, LSimpleM m, String matX) {
		NodoM m1 = m.getP();
		while(m1 != null) {
			if(m1.getNombre().equals(matX) && VerificaCalificacion(m1.getCal(),ci))
				return true;
			m1 = m1.getSig();
		}
		return false;
	}

	private static boolean VerificaCalificacion(LSimpleC cal, String ci) {
		NodoC c1 = cal.getP();
		while(c1 != null) {
			if(c1.getCi().equals(ci) && c1.getPuntaje() < 51)
				return true;
			c1 = c1.getSig();
		}
		return false;
	}

}
