/*
Requisitos técnicos:
6.	Crear la clase CuentaBancaria con los siguientes atributos privados:
-	nombreTitular (String)
-	saldo (double)
7.	Crear un constructor público que permita inicializar los datos del titular y el saldo inicial.
8.	Implementar los siguientes métodos propios públicos:
-	mostrarInformacion(): Muestra el nombre del titular y el saldo actual.
-	depositar(double monto): Aumenta el saldo.
-	retirar(double monto): Disminuye el saldo si hay suficiente dinero.
9.	En la clase principal (Main):
-	Crear un objeto de tipo CuentaBancaria.
-	Llamar a los tres métodos en orden lógico.
-	Mostrar cómo se reutiliza la información del objeto en cada acción.

¿Qué acciones realiza el objeto?
El objeto creado a partir de la clase CuentaBancaria puede realizar acciones a través de sus métodos propios. Estas acciones son:
-	mostrarInformacion(): muestra los datos almacenados en el objeto.
-	depositar(): modifica el saldo sumando un monto.
-	retirar(): modifica el saldo restando un monto si hay fondos suficientes.

Estas acciones se ejecutan desde la clase principal usando el objeto. Por ejemplo:

CuentaBancaria cuenta1 = new CuentaBancaria("Lucía", 100.0); cuenta1.mostrarInformacion();
cuenta1.depositar(50.0); cuenta1.retirar(30.0);
 */

public class CuentaBancaria {
    //Atributos
    private String nombreTitular;
    private double saldo;

    //Constructor
    public CuentaBancaria(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    //Metodo Mostar Informacion

    public void mostarInformacion(){
        System.out.println("==================");
        System.out.println("Nombre: "+nombreTitular);
        System.out.println("Saldo: "+saldo);
        System.out.println("==================");

    }
    //Metodo Depositar
    public void depositar(double monto){
    saldo+= monto;
    System.out.println("Deposito realizado: $ "+monto);

    }
    //Metodo Retirar
    public void retirar(double monto){
        if (saldo>= monto){
            saldo -= monto;
            System.out.println("Retiro: "+monto);
        }else
            System.out.println("Fondos insuficientes");
    }

}
