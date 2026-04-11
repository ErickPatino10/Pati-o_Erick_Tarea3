/*
Ejercicio 2:
Control de Asistencia Definición: Crear una clase llamada Asistencia con atributos privados como nombreEmpleado, diasAsistidos y diasFaltados.
Implementar métodos públicos para registrar asistencia y mostrar el resumen.
Proteger los datos usando encapsulamiento (private).
Controlar que los valores no sean negativos.
Modificar los datos únicamente mediante métodos (como registrar asistencia o falta).
 */

class Asistencia {
    // Atributos privados (encapsulamiento)
    private String nombreEmpleado;
    private int diasAsistidos;
    private int diasFaltados;

    // Constructor
    public Asistencia(String nombreEmpleado, int diasAsistidos, int diasFaltados) {
        this.nombreEmpleado = nombreEmpleado;
        if (diasAsistidos >= 0) {
            this.diasAsistidos = diasAsistidos;
        } else {
            this.diasAsistidos = 0;
        }
        if (diasFaltados >= 0) {
            this.diasFaltados = diasFaltados;
        } else {
            this.diasFaltados = 0;
        }
    }

    // Metodos propios
    public void registrarAsistencia() {
        diasAsistidos++;
    }

    public void registrarFalta() {
        diasFaltados++;
    }


    public void mostrarResumen() {
        System.out.println("Empleado: " + nombreEmpleado);
        System.out.println("Días asistidos: " + diasAsistidos);
        System.out.println("Días faltados: " + diasFaltados);
    }
}
