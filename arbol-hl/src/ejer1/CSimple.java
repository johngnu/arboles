package ejer1;

public class CSimple {

    private int ini, fin, max = 50;
    private NodoP[] v = new NodoP[max + 1];

    CSimple() {
        ini = fin = 0;
    }

    boolean esvacio() {
        return (ini == 0 && fin == 0);
    }

    boolean eslleno() {
        return fin == max;
    }

    public void adicionar(NodoP x) {
        if (!eslleno()) {
            fin++;
            v[fin] = x;
        } else {
            System.out.println("Cola llena");
        }
    }

    public NodoP eliminar() {
        NodoP elem = null;
        if (!esvacio()) {
            ini++;
            elem = v[ini];
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola vacia");
        }
        return elem;
    }

    void vaciar(Cola x) {
        while (!x.esvacio()) {
            adicionar(x.eliminar());
        }
    }

    public int nroElem() {
        return fin - ini;
    }
}
