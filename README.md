Práctica 1: Clase Libro
Objetivo: Crear una clase con atributos, constructor y método para mostrar información.

Descripción:
• Crear la clase Libro con atributos: titulo, autor, anioPublicacion.
• Crear un constructor.
• Crear un método mostrarInformacion() que imprima los datos del libro.
• Crear 2 objetos de tipo Libro y mostrar su información.

Tarea práctica
Objetivo: Comprender y aplicar los tipos de constructores en Java.

Indicaciones:

1. Explica con tus propias palabras qué es un constructor.
2. Crea una clase llamada Producto con tres atributos: nombre, precio, cantidad.
3. Implementa los tres tipos de constructores: uno con parámetros, uno con valores fijos, y uno vacío.
4. Crea tres objetos usando cada tipo de constructor.
5. Muestra los datos de cada objeto en consola.

Actividad: Simulación básica de una cuenta bancaria

Objetivo:
Aplicar los conceptos básicos de Programación Orientada a Objetos (POO) creando una clase con atributos privados, constructor público y tres métodos propios públicos.

Enunciado:
Imagina que estás desarrollando un programa sencillo para un banco. Cada cliente puede abrir una cuenta, consultar su saldo, depositar dinero y retirar dinero.

Tu tarea es crear una clase llamada CuentaBancaria que permita reutilizar la información del cliente y realizar acciones mediante métodos propios.

Requisitos técnicos:
6. Crear la clase CuentaBancaria con los siguientes atributos privados:

* nombreTitular (String)
* saldo (double)

7. Crear un constructor público que permita inicializar los datos del titular y el saldo inicial.

8. Implementar los siguientes métodos propios públicos:

* mostrarInformacion(): Muestra el nombre del titular y el saldo actual.
* depositar(double monto): Aumenta el saldo.
* retirar(double monto): Disminuye el saldo si hay suficiente dinero.

9. En la clase principal (Main):

* Crear un objeto de tipo CuentaBancaria.
* Llamar a los tres métodos en orden lógico.
* Mostrar cómo se reutiliza la información del objeto en cada acción.

¿Qué acciones realiza el objeto?

El objeto creado a partir de la clase CuentaBancaria puede realizar acciones a través de sus métodos propios. Estas acciones son:

* mostrarInformacion(): muestra los datos almacenados en el objeto.
* depositar(): modifica el saldo sumando un monto.
* retirar(): modifica el saldo restando un monto si hay fondos suficientes.

Estas acciones se ejecutan desde la clase principal usando el objeto. Por ejemplo:

CuentaBancaria cuenta1 = new CuentaBancaria("Lucía", 100.0);


Ejercicio 1:

Definición:
Crear una clase llamada Empleado con atributos privados como nombre, salario y cargo.

Requisitos:

Implementar métodos públicos para aumentar el salario y mostrar la información del empleado.
Aplicar encapsulamiento ocultando los datos del empleado.
Controlar el cambio de salario (por ejemplo, que no sea negativo).
Usar métodos para modificar y mostrar la información en lugar de acceder directamente a los atributos.

Ejercicio 2: 

Definición:
Crear una clase llamada Asistencia con atributos privados como nombreEmpleado, diasAsistidos y diasFaltados.

Requisitos:

Implementar métodos públicos para registrar asistencia y mostrar el resumen.
Proteger los datos usando encapsulamiento (private).
Controlar que los valores no sean negativos.
Modificar los datos únicamente mediante métodos (como registrar asistencia o falta).
cuenta1.mostrarInformacion();
cuenta1.depositar(50.0);
cuenta1.retirar(30.0);

