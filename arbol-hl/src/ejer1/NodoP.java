package ejer1;

public class NodoP {

    private String nom, con;
    private int ext;
    private NodoP der, izq;

    public NodoP() {
        izq = der = null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
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
