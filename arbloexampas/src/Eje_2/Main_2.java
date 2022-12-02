package Eje_2;

public class Main_2 {

    public static void main(String[] args) {
        LSimpleD d = new LSimpleD();
        d.crear();
        //a) Lectura de datos
        //observacion: Se utiliza el mismo constructor para todos los Arboles(techo, pared, piso)
        System.out.println("------DEPARTAMENTOS------");
        d.mostrar();
        PilaTipoMaterial m = new PilaTipoMaterial();
        m.crear();
        System.out.println("------MATERIAL------");
        m.mostrar();
//		b) De cada departamento, mostrar el nombre de los materiales que se usaron en lugar X (techo, pared, piso) en el
//		a�o Y
        SolucionB(d, m, "techo", 2016);
        System.out.println("Deparatamentos con mayor material 'madera' en la pared");
//		c) En el a�o X, determinar los departamentos con el mayor nnumero de viviendas que usaron �madera� en la Pared.
        SolucionC(d, m, 2016);

    }

    private static void SolucionC(LSimpleD d, PilaTipoMaterial m, int anio) {
        NodoD d1 = d.getP();
        int may = MayorNumeroViviendas_MaderaEnPared(d, m, anio);
        while (d1 != null) {
            if (NumeroViviendas_MaderaEnPared(d1.getLisA(), m, anio) == may) {
                System.out.println(d1.getNombreDep());
            }
            d1 = d1.getSig();
        }
    }

    private static int MayorNumeroViviendas_MaderaEnPared(LSimpleD d, PilaTipoMaterial m, int anio) {
        int may = 0;
        NodoD d1 = d.getP();
        while (d1 != null) {
            if (NumeroViviendas_MaderaEnPared(d1.getLisA(), m, anio) > may) {
                may = NumeroViviendas_MaderaEnPared(d1.getLisA(), m, anio);
            }
            d1 = d1.getSig();
        }
        return may;
    }

    private static int NumeroViviendas_MaderaEnPared(LDobleA lisA, PilaTipoMaterial m, int anio) {
        int cont = 0;
        NodoA a1 = lisA.getP();
        while (a1 != null) {
            if (a1.getAnio() == anio) {
                cont += ContadorViviendas(a1.getPared().getR(), m);
            }
            a1 = a1.getSig();
        }
        return cont;
    }

    private static int ContadorViviendas(NodoUM r, PilaTipoMaterial m) {
        if (r != null) {
            if (VerificaTipoMadera(r.getIdTipoM(), m)) {
                return r.getNroViviendas() + ContadorViviendas(r.getIzq(), m) + ContadorViviendas(r.getDer(), m);
            } else {
                return ContadorViviendas(r.getIzq(), m) + ContadorViviendas(r.getDer(), m);
            }
        }
        return 0;
    }

    private static boolean VerificaTipoMadera(int idTipoM, PilaTipoMaterial m) {
        PilaTipoMaterial aux = new PilaTipoMaterial();
        boolean sw = false;
        while (!m.esvacia()) {
            TipoMaterial x = m.eliminar();
            if (x.getIdTipoM() == idTipoM && x.getNombre().equals("madera")) {
                sw = true;
            }
            aux.adicionar(x);
        }
        m.vaciar(aux);
        return sw;
    }

    private static void SolucionB(LSimpleD d, PilaTipoMaterial m, String lugar, int anio) {
        NodoD d1 = d.getP();
        while (d1 != null) {
            System.out.println('\t' + d1.getNombreDep());
            RecorrerAnios(d1.getLisA(), m, lugar, anio);
            d1 = d1.getSig();
        }
    }

    private static void RecorrerAnios(LDobleA lisA, PilaTipoMaterial m, String lugar, int anio) {
        NodoA a1 = lisA.getP();
        while (a1 != null) {
            if (a1.getAnio() == anio) {
                if (lugar.equals("techo")) {
                    RecorrerArbol(a1.getTecho().getR(), m);
                } else if (lugar.equals("pared")) {
                    RecorrerArbol(a1.getPared().getR(), m);
                } else if (lugar.equals("piso")) {
                    RecorrerArbol(a1.getPiso().getR(), m);
                } else {
                    System.out.println("Lugar erroneo");
                }
            }
            a1 = a1.getSig();
        }
    }

    private static void RecorrerArbol(NodoUM r, PilaTipoMaterial m) {
        if (r != null) {
            MostrarMateria(r.getIdTipoM(), m);
            RecorrerArbol(r.getIzq(), m);
            RecorrerArbol(r.getDer(), m);
        }
    }

    private static void MostrarMateria(int idTipoM, PilaTipoMaterial m) {
        PilaTipoMaterial aux = new PilaTipoMaterial();
        while (!m.esvacia()) {
            TipoMaterial x = m.eliminar();
            if (x.getIdTipoM() == idTipoM) {
                x.mostrar();
            }
            aux.adicionar(x);
        }
        m.vaciar(aux);
    }

}
