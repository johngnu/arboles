package eje_1;

public class Main {

    public static void main(String[] args) {
        ArbolBN B = new ArbolBN();
        B.setRaiz(new NodoN());
        B.crear();
        B.niveles();
        System.out.println("a) Verificar si es un árbol binario completo");
        B.Verifica(B.getRaiz());
        System.out.println("b) Mostrar cual es el mayor nivel en el cual el árbol recién es un árbol binario completo");
        B.mostrar(B.getRaiz());
        System.out.println("c) Mostrar el mayor número de cada nivel");
        B.mayor(B.getRaiz());
    }
}
