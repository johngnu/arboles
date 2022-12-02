/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author estudiante
 */
public class PilaE {
    private int max=50;
    private NodoE v[]=new NodoE[max+1];
    private int tope;
    
    PilaE()
    {
        tope=0;
    }
   
    boolean esvacia ()
    {
        if (tope == 0)
            return (true);
        return (false);
    }
    boolean esllena ()
    {
        if (tope == max)
            return (true);
        return (false);
    }
    int nroelem ()
    {
        return (tope);
    }
    void adicionar (NodoE elem)
    {
        if (!esllena ())
        {
            tope++;     //v[tope+1]=elem
            v [tope] = elem;  //tope++
        }
        else
            System.out.println ("Pila llena");
    }
    NodoE eliminar ()
    {
        NodoE elem = null;
        if (!esvacia ())
        {
            elem = v [tope];
            tope--;
        }
        else
            System.out.println ("Pila vacia");
        return (elem);
    }
//    void mostrar ()
//    {
//        if (esvacia ())
//            System.out.println ("Pila vacia");
//        else
//        {
//            System.out.println ("\n Linea de la Pila ");
//            PilaP aux = new PilaP ();
//            while (!esvacia ())
//            {
//                NodoP elem = eliminar ();
//                elem.mostrar();
//                aux.adicionar (elem);
//            }
//            vaciar(aux);
//        }
//    }
   
    void vaciar (PilaE a)
    {
        while (!a.esvacia ())
            adicionar (a.eliminar ());
    }
}
