/*
Ejercicio 1:
Crear una clase llamada Empleado con atributos privados como nombre, salario y cargo.
Implementar métodos públicos para aumentar el salario y mostrar la información del empleado.
Aplicar encapsulamiento ocultando los datos del empleado.
Controlar el cambio de salario (por ejemplo, que no sea negativo).
Usar métodos para modificar y mostrar la información en lugar de acceder directamente a los atributos.
 */

public class Empleado {
    //Atributos
    private String nombre;
    private double salario;
    private String cargo;

    //Constructor
    public Empleado(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    //Setter
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo");
        }
    }

    //Metodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("\n=============================================");

    }

    public void aumentarSalario(double aumento) {
        if (aumento > 0) {
            salario += aumento;
        } else {
            System.out.println("El aumento debe ser positivo");
        }
    }

}

