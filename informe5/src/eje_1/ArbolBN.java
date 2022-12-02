package eje_1;

public class ArbolBN {

    private NodoN raiz;

    ArbolBN() {
        raiz = null;
    }

    public NodoN getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoN raiz) {
        this.raiz = raiz;
    }

    public void crear() {
        PilaN nivel = new PilaN();
        PilaN desc = new PilaN();
        System.out.println("Datos:");
        setRaiz(new NodoN());
        getRaiz().setNum(Leer.datoInt());
        nivel.adicionar(getRaiz());
        while (!nivel.esvacia()) {   //PASO DE NIVEL
            while (!nivel.esvacia()) {    //PROCESA UN NIVEL
                NodoN r = nivel.eliminar();
                System.out.println(r.getNum() + " Tendra Izq? s/n");
                String resp = Leer.dato();
                if (resp.equals("s")) {
                    NodoN nue = new NodoN();
                    nue.setNum(Leer.datoInt());
                    r.setIzq(nue);
                    desc.adicionar(r.getIzq());
                }
                System.out.println(r.getNum() + " Tendra Der? s/n");
                resp = Leer.dato();
                if (resp.equals("s")) {
                    NodoN nue = new NodoN();
                    nue.setNum(Leer.datoInt());
                    r.setDer(nue);
                    desc.adicionar(r.getDer());
                }
            }
            nivel.vaciar(desc);
        }
    }

    public void crear2(NodoN r) {
        if (r != null) {
            System.out.println("Ingresar Datos:");
            r.setNum(Leer.datoInt());
            System.out.println(r.getNum() + " Tendra Izquierda? s/n");
            String resp = Leer.dato();
            if (resp.equals("s")) {
                NodoN nue = new NodoN();
                r.setIzq(nue);
                crear2(r.getIzq());
            }
            System.out.println(r.getNum() + " Tendra Derecha? s/n");
            String res = Leer.dato();
            if (res.equals("s")) {
                NodoN nue = new NodoN();
                r.setDer(nue);
                crear2(r.getDer());
            }
        }
    }

    public void niveles() {
        PilaN nivel = new PilaN();
        PilaN desc = new PilaN();
        nivel.adicionar(getRaiz());
        int c = 0;
        while (!nivel.esvacia()) {   //PASO DE NIVEL
            System.out.println("Nivel: " + c + " >>");
            while (!nivel.esvacia()) {
                NodoN r = nivel.eliminar();
                System.out.print("[" + r.getNum() + "]");
                if (r.getIzq() != null) {
                    desc.adicionar(r.getIzq());
                }
                if (r.getDer() != null) {
                    desc.adicionar(r.getDer());
                }
            }
            nivel.vaciar(desc);
            c++;
            System.out.println("");
        }
    }

    public void Verifica(NodoN r) {
        PilaN nivel = new PilaN();
        PilaN desc = new PilaN();
        nivel.adicionar(getRaiz());
        int sw = 0;
        while (!nivel.esvacia()) {   //PASO DE NIVEL                
            while (!nivel.esvacia()) {
                r = nivel.eliminar();
                if (r.getIzq() != null && r.getDer() != null) {
                    sw = 1;
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
        System.out.println("Verificacion: " + sw);
        if (sw == 1) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    public void mostrar(NodoN r) {
        PilaN nivel = new PilaN();
        PilaN desc = new PilaN();
        nivel.adicionar(getRaiz());
        int c = 0;
        while (!nivel.esvacia()) {   //PASO DE NIVEL

            while (!nivel.esvacia()) {
                r = nivel.eliminar();
                if (r.getIzq() != null && r.getDer() != null) {
                    System.out.println("Nivel: " + c);
                }
                if (r.getIzq() != null) {
                    desc.adicionar(r.getIzq());
                }
                if (r.getDer() != null) {
                    desc.adicionar(r.getDer());
                }
            }
            nivel.vaciar(desc);
            c++;
        }
    }

    public void mayor(NodoN r) {
        PilaN nivel = new PilaN();
        PilaN desc = new PilaN();
        nivel.adicionar(getRaiz());
        int may = 0;
        int c = 0;
        while (!nivel.esvacia()) {
            System.out.print("Nivel: " + c + " >> ");
            while (!nivel.esvacia()) {
                r = nivel.eliminar();
                if (r.getNum() > may) {
                    may = r.getNum();
                }
                if (r.getIzq() != null) {
                    desc.adicionar(r.getIzq());
                }
                if (r.getDer() != null) {
                    desc.adicionar(r.getDer());
                }
            }
            nivel.vaciar(desc);
            c++;
            System.out.println("Mayor: " + may);
            may = 0;
        }
    }
}
