package ejer1;

import java.util.Scanner;

public class ArbolP {

    private NodoP raiz;

    public NodoP getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoP raiz) {
        this.raiz = raiz;
    }

    ArbolP() {
        raiz = null;
    }

    //algoritmos iterativos, recorridos en amplitud
    public void crear() {
        CSimple niv = new CSimple();
        CSimple desc = new CSimple();
        setRaiz(new NodoP());
        getRaiz().setNom(Leer.dato());//nombre
        getRaiz().setCon(Leer.dato());
        getRaiz().setExt(Leer.datoInt());
        niv.adicionar(getRaiz());
        while (!niv.esvacio()) {
            while (!niv.esvacio()) {
                NodoP r = niv.eliminar();
                System.out.println(r.getNom() + "   tenfra izq? : s/n");
                String resp = Leer.dato();
                if (resp.equals("s")) {
                    NodoP nue = new NodoP();
                    nue.setNom(Leer.dato());
                    nue.setCon(Leer.dato());
                    nue.setExt(Leer.datoInt());
                    r.setIzq(nue);
                    desc.adicionar(r.getIzq());

                }

                System.out.println(r.getNom() + "   tenfra der? : s/n");
                resp = Leer.dato();
                if (resp.equals("s")) {
                    NodoP nue = new NodoP();
                    nue.setNom(Leer.dato());
                    nue.setCon(Leer.dato());
                    nue.setExt(Leer.datoInt());
                    r.setDer(nue);
                    desc.adicionar(r.getDer());
                }

            }
            niv.vaciar(desc);
        }
    }

    public void niveles() {
        CSimple niv = new CSimple();
        CSimple desc = new CSimple();
        niv.adicionar(getRaiz());
        int c = 0;
        while (!niv.esvacio()) {//paso de nivel
            System.out.println("Nivel: " + c + " >>");
            while (!niv.esvacio()) {

                NodoP r = niv.eliminar();
                System.out.println("(" + r.getNom() + " " + r.getCon() + " " + r.getExt() + ")");
                if (r.getIzq() != null) {
                    desc.adicionar(r.getIzq());
                }
                if (r.getDer() != null) {
                    desc.adicionar(r.getDer());
                }
            }
            niv.vaciar(desc);
            c++;
            System.out.println("");
        }
    }

    // aqui me falta a que metodo va este code
    public void niveles(NodoP s) {
        Cola niv = new Cola();
        Cola desc = new Cola();
        niv.adicionar(getRaiz());
        int may = 0;
        while (!niv.esvacio()) { // paso de un nivel a otro
            while (!niv.esvacio()) {  // procesa un nivel
                NodoP r = niv.eliminar();

                System.out.println("(" + r.getNom() + " " + r.getCon() + " " + r.getExt() + ")");
                if (r.getIzq() != null) {
                    desc.adicionar(r.getIzq());
                }
                if (r.getDer() != null) {
                    desc.adicionar(r.getDer());
                }

            }
            niv.vaciar(desc);
            System.out.println("");
        }
    }

    public int mayor(NodoP s) {
        Cola niv = new Cola();
        Cola desc = new Cola();
        niv.adicionar(getRaiz());
        int may = 0;
        while (!niv.esvacio()) { // paso de un nivel a otro
            while (!niv.esvacio()) {  // procesa un nivel
                NodoP r = niv.eliminar();

                if (r.getExt() > may) {
                    may = r.getExt();
                }

                if (r.getIzq() != null) {
                    desc.adicionar(r.getIzq());
                }
                if (r.getDer() != null) {
                    desc.adicionar(r.getDer());
                }

            }
            niv.vaciar(desc);
        }
        return may;
    }
}
