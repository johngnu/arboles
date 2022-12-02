package Eje_2;

public class NodoA {

    private int anio;
    private ABUsoMaterial pared;
    private ABUsoMaterial techo;
    private ABUsoMaterial piso;
    private NodoA ant, sig;

    public NodoA() {
        ant = sig = null;
    }

    public NodoA(int anio, ABUsoMaterial pared, ABUsoMaterial techo, ABUsoMaterial piso) {
        super();
        this.anio = anio;
        this.pared = pared;
        this.techo = techo;
        this.piso = piso;
        ant = sig = null;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public ABUsoMaterial getPared() {
        return pared;
    }

    public void setPared(ABUsoMaterial pared) {
        this.pared = pared;
    }

    public ABUsoMaterial getTecho() {
        return techo;
    }

    public void setTecho(ABUsoMaterial techo) {
        this.techo = techo;
    }

    public ABUsoMaterial getPiso() {
        return piso;
    }

    public void setPiso(ABUsoMaterial piso) {
        this.piso = piso;
    }

    public NodoA getAnt() {
        return ant;
    }

    public void setAnt(NodoA ant) {
        this.ant = ant;
    }

    public NodoA getSig() {
        return sig;
    }

    public void setSig(NodoA sig) {
        this.sig = sig;
    }

    public void mostrar() {
        System.out.println("\nA�O DE LISTA: " + anio);
        System.out.println("Material para Pared");
        pared.preorden(pared.getR());
        System.out.println("Material para Techo");
        techo.preorden(techo.getR());
        System.out.println("Material para Piso");
        piso.preorden(piso.getR());
    }
}
