package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ArbolE {
    private NodoE raiz;
    
    ArbolE(){
        raiz = null;
    }
    //=================GETTERS AND SETTERS=================//

    public NodoE getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoE raiz) {
        this.raiz = raiz;
    }
    
    //========================================================//
    
//    public void crear(NodoE r){
//        Scanner edy= new Scanner(System.in);
//        if(r != null){
//            Estudiantes e= new Estudiantes(); 
//            r.setNum(j);
//            
//            System.out.println(j+" Tendra Izquierda? s/n");
//            String resp1 = edy.next();
//            if(resp1.equals("s")){
//                NodoE nuevo = new NodoE();
//                r.setIzq(nuevo);
//                crear(r.getIzq());
//            }
//            
//            System.out.println(j+" Tendra Izquierda? s/n");
//            resp1 = edy.next();
//            if(resp1.equals("s")){
//                NodoE nuevo = new NodoE();
//                r.setDer(nuevo);
//                crear(r.getDer());
//            }
//        }
//    }
    //nivel 
    public void niveles(){
        PilaE nivel= new PilaE();
        PilaE desc= new PilaE();
        nivel.adicionar(getRaiz());
        int c=0;
        while(!nivel.esvacia()){//paso de nivel
            System.out.println("Nivel: "+c+" >>");
            while(!nivel.esvacia()){
                
                NodoE r=nivel.eliminar();
                r.getQ().mostrar();
                if(r.getIzq()!=null){
                    desc.adicionar(r.getIzq());
                }
                if(r.getDer()!=null){
                    desc.adicionar(r.getDer());
                }
            }
            nivel.vaciar(desc);
            c++;
            System.out.println("");
        }
    }
    // preorden RID
    public void preorden(NodoE r){
        if(r != null){
            r.getQ().mostrar();
            preorden(r.getIzq());
            preorden(r.getDer());
        }
    }
    // Inorden IRD
    public void inorden(NodoE r) {
        if(r != null){
            inorden(r.getIzq());
            r.getQ().mostrar();
            inorden(r.getDer());
        }
    }
    // postorden IDR
    public void posorden(NodoE r) {
        if(r != null){
            posorden(r.getIzq());
            posorden(r.getDer());
            r.getQ().mostrar();
        }
    }   
}
