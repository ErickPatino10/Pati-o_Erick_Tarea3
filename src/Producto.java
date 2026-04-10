/*
1.	Explica con tus propias palabras qué es un constructor.
2.	Crea una clase llamada Producto con tres atributos: nombre, precio, cantidad.
3.	Implementa los tres tipos de constructores: uno con parámetros, uno con valores fijos, y uno vacío.
4.	Crea tres objetos usando cada tipo de constructor.
5.	Muestra los datos de cada objeto en consola.
*/

public class Producto {
    //Atributos
    String nombre;
    double precio;
    int cantidad;

    //Constructor vacio
    public Producto() {
    }

    //Constructor con valores fijos
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Construtor con parametros
    public Producto(String valoresFijos) {
        this.nombre = "Coca Cola";
        this.precio = 1.50;
        this.cantidad = 12;
    }

    //Metodo
    public void mostarProducto(){
        System.out.println("\nNombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
    }
}
