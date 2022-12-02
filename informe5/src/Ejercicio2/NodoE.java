package Ejercicio2;

public class NodoE {

    private Estudiantes q;
    private NodoE izq, der;

    NodoE() {
        izq = der = null;
    }

    public Estudiantes getQ() {
        return q;
    }

    public void setQ(Estudiantes q) {
        this.q = q;
    }

    public NodoE getIzq() {
        return izq;
    }

    public void setIzq(NodoE izq) {
        this.izq = izq;
    }

    public NodoE getDer() {
        return der;
    }

    public void setDer(NodoE der) {
        this.der = der;
    }

}
