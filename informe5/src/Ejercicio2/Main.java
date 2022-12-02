/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author USUARIO
 */
public class Main {

    public static void llenar(ArbolE a) {
        Estudiantes e1 = new Estudiantes(123, "Alejandro", 95);
        Estudiantes e2 = new Estudiantes(234, "Rodolfo", 76);
        Estudiantes e3 = new Estudiantes(345, "Mauricio", 51);
        Estudiantes e4 = new Estudiantes(456, "Rudy", 50);
        Estudiantes e5 = new Estudiantes(567, "Cristofer", 45);
        Estudiantes e6 = new Estudiantes(678, "Israel", 70);
        Estudiantes e7 = new Estudiantes(789, "Alex", 95);

        NodoE n1 = new NodoE();
        n1.setQ(e1);
        NodoE n2 = new NodoE();
        n2.setQ(e2);
        NodoE n3 = new NodoE();
        n3.setQ(e3);
        NodoE n4 = new NodoE();
        n4.setQ(e4);
        NodoE n5 = new NodoE();
        n5.setQ(e5);
        NodoE n6 = new NodoE();
        n6.setQ(e6);
        NodoE n7 = new NodoE();
        n7.setQ(e7);

        n1.setDer(n3);
        n1.setIzq(n2);
        n2.setIzq(n4);
        n2.setDer(n5);
        n3.setIzq(n6);
        n4.setIzq(n7);

        a.setRaiz(n1);
    }

    public static void main(String[] args) {
        ArbolE a = new ArbolE();
        llenar(a);
        a.niveles();
        System.out.println("\n--Inciso A--");
        incisoA(a.getRaiz());
        System.out.println("\n--Inciso B--");
        incisoB(a.getRaiz());
        System.out.println("\n--Inciso C--");
        incisoC(a.getRaiz());
    }

    public static void incisoA(NodoE a) {
        PilaE nivel = new PilaE();
        PilaE desc = new PilaE();
        nivel.adicionar(a);
        int may = mayorNota(a);
        int c = 0;
        while (!nivel.esvacia()) {//paso de nivel
            while (!nivel.esvacia()) {
                NodoE r = nivel.eliminar();
                if (r.getQ().getNota() == may) {
                    c++;
                }
                if (r.getIzq() != null) {
                    desc.adicionar(r.getIzq());
                }
                if (r.getDer() != null) {
                    desc.adicionar(r.getDer());
                }
            }
            nivel.vaciar(desc);
        }
        System.out.println("La cantidad de estudiantes que tienen la mejor onoota es: " + c);
    }

    public static int mayorNota(NodoE a) {
        PilaE nivel = new PilaE();
        PilaE desc = new PilaE();
        nivel.adicionar(a);
        int may = -1;
        while (!nivel.esvacia()) {//paso de nivel
            while (!nivel.esvacia()) {
                NodoE r = nivel.eliminar();
                if (may < r.getQ().getNota()) {
                    may = r.getQ().getNota();
                }
                if (r.getIzq() != null) {
                    desc.adicionar(r.getIzq());
                }
                if (r.getDer() != null) {
                    desc.adicionar(r.getDer());
                }
            }
            nivel.vaciar(desc);
        }
        return may;
    }

    public static void incisoB(NodoE a) {
        PilaE nivel = new PilaE();
        PilaE desc = new PilaE();
        nivel.adicionar(a);
        int may = mayorNota(a);
        int cont = 0;
        while (!nivel.esvacia()) {//paso de nivel
            while (!nivel.esvacia()) {
                NodoE r = nivel.eliminar();
                if (r.getQ().getNota() == may) {
                    System.out.println("El estudiante se encuentra en el nivel: " + cont);
                }
                if (r.getIzq() != null) {
                    desc.adicionar(r.getIzq());
                }
                if (r.getDer() != null) {
                    desc.adicionar(r.getDer());
                }
            }
            cont++;
            nivel.vaciar(desc);
        }
    }

    public static void incisoC(NodoE a) {
        if (contAprobados(a.getDer()) == contAprobados(a.getIzq())) {
            System.out.println("Sii, tienen la misma cantidad de aprobados ");
        } else {
            System.out.println("Noo, no tienen la misma cantidad de aprobados ");
        }
    }

    public static int contAprobados(NodoE a) {
        PilaE nivel = new PilaE();
        PilaE desc = new PilaE();
        nivel.adicionar(a);
        int cont = 0;
        while (!nivel.esvacia()) {//paso de nivel
            while (!nivel.esvacia()) {
                NodoE r = nivel.eliminar();
                if (r.getQ().getNota() > 50) {
                    cont++;
                }
                if (r.getIzq() != null) {
                    desc.adicionar(r.getIzq());
                }
                if (r.getDer() != null) {
                    desc.adicionar(r.getDer());
                }
            }
            nivel.vaciar(desc);
        }
        return cont;
    }

}
