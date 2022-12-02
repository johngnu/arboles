/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author USUARIO
 */
public class Estudiantes {
    private String nombre;
    private int ci,nota;
    Estudiantes(){
        
    }
    Estudiantes(int a, String b,int c){
        ci=a;
        nombre=b;
        nota=c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    public void mostrar(){
        System.out.println("--Estudiante--");
        System.out.println("Ci: "+ci);
        System.out.println("Nombre: "+nombre);
        System.out.println("Nota: "+nota);
    }
}
