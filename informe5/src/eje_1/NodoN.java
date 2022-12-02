package eje_1;

public class NodoN {

    private int num;
    private NodoN izq, der;

    public NodoN() {
        izq = der = null;
    }

    public NodoN(int num) {
        izq = der = null;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public NodoN getIzq() {
        return izq;
    }

    public void setIzq(NodoN izq) {
        this.izq = izq;
    }

    public NodoN getDer() {
        return der;
    }

    public void setDer(NodoN der) {
        this.der = der;
    }

}
