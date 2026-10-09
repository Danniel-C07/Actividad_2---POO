package ejercicio21;

/** Representa una persona y sus datos básicos. */
public class Persona {
    private final String nombre;
    private final String apellidos;
    private final String numeroDocumentoIdentidad;
    private final int anioNacimiento;

    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anioNacimiento) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("El nombre es obligatorio.");
        if (apellidos == null || apellidos.isBlank()) throw new IllegalArgumentException("Los apellidos son obligatorios.");
        if (numeroDocumentoIdentidad == null || numeroDocumentoIdentidad.isBlank()) throw new IllegalArgumentException("El documento es obligatorio.");
        if (anioNacimiento <= 0) throw new IllegalArgumentException("El año de nacimiento debe ser válido.");
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Documento de identidad: " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println();
    }
}
