package eje_1;

public class PilaN {

    private int max = 50;
    private NodoN v[] = new NodoN[max + 1];
    private int tope;

    PilaN() {
        tope = 0;
    }

    boolean esvacia() {
        if (tope == 0) {
            return (true);
        }
        return (false);
    }

    boolean esllena() {
        if (tope == max) {
            return (true);
        }
        return (false);
    }

    int nroelem() {
        return (tope);
    }

    void adicionar(NodoN elem) {
        if (!esllena()) {
            tope++;     //v[tope+1]=elem
            v[tope] = elem;  //tope++
        } else {
            System.out.println("Pila llena");
        }
    }

    NodoN eliminar() {
        NodoN elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void vaciar(PilaN a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

}
