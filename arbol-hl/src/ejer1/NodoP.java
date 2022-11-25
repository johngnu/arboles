package ejer1;

public class NodoP {

    private String nombre;
    private int edad;
    private NodoP der, izq;

    public NodoP() {
        izq = der = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
