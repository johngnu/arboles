package ejer1;

public class NodoP {

    private int ext;
    private NodoP der, izq;

    public NodoP() {
        izq = der = null;
    }

    public int getExt() {
        return ext;
    }

    public void setExt(int ext) {
        this.ext = ext;
    }

    public NodoP getDer() {
        return der;
    }

    public void setDer(NodoP der) {
        this.der = der;
    }

    public NodoP getIzq() {
        return izq;
    }

    public void setIzq(NodoP izq) {
        this.izq = izq;
    }
}
