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
        Scanner edy = new Scanner(System.in);
        Cola niv = new Cola();
        Cola desc = new Cola();
        setRaiz(new NodoP());

        System.out.print("Ingrese Nombre: ");
        getRaiz().setNom(edy.next());
        System.out.print("Ingrese Con: ");
        getRaiz().setCon(edy.next());
        System.out.print("Ingrese Con: ");
        getRaiz().setExt(edy.nextInt());

        niv.adicionar(getRaiz());
        while (!niv.esvacio()) {//paso de nivel

            while (!niv.esvacio()) {
                NodoP r = niv.eliminar();
                System.out.print(r.getNom() + "tendra izq? s/n:  ");
                String resp = edy.next();
                if (resp.equals("s")) {
                    NodoP nue = new NodoP();
                    System.out.print("Ingrese Nombre: ");
                    getRaiz().setNom(edy.next());
                    System.out.print("Ingrese Con: ");
                    getRaiz().setCon(edy.next());
                    System.out.print("Ingrese Con: ");
                    getRaiz().setExt(edy.nextInt());
                    r.setIzq(nue);
                    desc.adicionar(r.getIzq());
                }
                System.out.print(r.getNom() + "tendra der? s/n:  ");
                resp = edy.next();
                if (resp.equals("s")) {
                    NodoP nue = new NodoP();
                    System.out.print("Ingrese Nombre: ");
                    getRaiz().setNom(edy.next());
                    System.out.print("Ingrese Con: ");
                    getRaiz().setCon(edy.next());
                    System.out.print("Ingrese Con: ");
                    getRaiz().setExt(edy.nextInt());
                    r.setDer(nue);
                    desc.adicionar(r.getDer());
                }

            }
            niv.vaciar(desc);
        }
    }

    public void niveles() {
        Cola niv = new Cola();
        Cola desc = new Cola();
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
    {
        Cola niv = new Cola();
        Cola desc = new Cola();
        niv.adicionar(getRaiz());
        while (!niv.esvacio()) {
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
            System.out.println("");
        }
    }

}
