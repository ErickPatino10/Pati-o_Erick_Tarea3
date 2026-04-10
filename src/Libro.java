/*
Práctica 1: Clase Libro
Objetivo: Crear una clase con atributos, constructor y método para mostrar información.
Descripción:
• Crear la clase Libro con atributos: titulo, autor, anioPublicacion.
• Crear un constructor.
• Crear un método mostrarInformacion() que imprima los datos del libro.
• Crear 2 objetos de tipo Libro y mostrar su información.
 */

public class Libro {
    //Atributos
    String titulo;
    String autor;
    int anioPublicacion;

    //Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    //Metodo
    void mostrarInformacionLibro(){
        System.out.println("\nTitulo del libro: "+autor);
        System.out.println("Autor: "+autor);
        System.out.println("Anio de publicacion: "+anioPublicacion);
        System.out.println("\n=============================================");
    }
}
