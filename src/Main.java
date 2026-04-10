public class Main {
    public static void main() {
        //Objeto Libro 1

        Libro libro1 = new Libro("Harry Potter y la piedra filosofal ","J.K. Rowling",1997);

        //Objeto libro 2

        Libro libro2 = new Libro("El señor de los anillos ","J.R.R. Tolkien",1954);

        //Llamo a los metodos

        libro1.mostrarInformacionLibro();
        libro2.mostrarInformacionLibro();

        //Objeto Producto 1

        Producto p1 = new Producto();

        //Objeto Producto 2

        Producto p2 = new Producto("fijo");

        //Objeo Producto 3

        Producto p3 = new Producto("Pepsi",1.75,3);

        //Llamo a los metodos

        p1.mostarProducto();
        p2.mostarProducto();
        p3.mostarProducto();

        //Objeto CuentaBancaria

        CuentaBancaria cuenta1 = new CuentaBancaria("Erick Patiño",1000.00);

        //Llamo a los metodos

        cuenta1.mostarInformacion();
        cuenta1.depositar(1179);
        cuenta1.retirar(346);
        cuenta1.mostarInformacion();
    }
}