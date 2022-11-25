package ejer1;

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
