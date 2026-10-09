package ejercicio22;


public class Planeta {
    public enum TipoPlaneta { GASEOSO, TERRESTRE, ENANO }

    private final String nombre;
    private final int cantidadSatelites;
    private final double masa;       // kg
    private final double volumen;    // km³
    private final int diametro;      // km
    private final int distanciaSol;  // millones de km
    private final TipoPlaneta tipo;
    private final boolean observable;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen,
                   int diametro, int distanciaSol, TipoPlaneta tipo, boolean observable) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("El nombre es obligatorio.");
        if (cantidadSatelites < 0 || masa <= 0 || volumen <= 0 || diametro <= 0 || distanciaSol < 0)
            throw new IllegalArgumentException("Los datos numéricos del planeta no son válidos.");
        if (tipo == null) throw new IllegalArgumentException("Debe especificarse el tipo de planeta.");
        this.nombre = nombre; this.cantidadSatelites = cantidadSatelites; this.masa = masa;
        this.volumen = volumen; this.diametro = diametro; this.distanciaSol = distanciaSol;
        this.tipo = tipo; this.observable = observable;
    }

    public double calcularDensidad() { return masa / volumen; }


    public boolean esPlanetaExterior() { return distanciaSol > 227.9; }

    public void imprimir() {
        System.out.println("Planeta: " + nombre);
        System.out.println("Satélites: " + cantidadSatelites);
        System.out.println("Masa (kg): " + masa);
        System.out.println("Volumen (km³): " + volumen);
        System.out.println("Diámetro (km): " + diametro);
        System.out.println("Distancia al Sol (millones de km): " + distanciaSol);
        System.out.println("Tipo: " + tipo);
        System.out.println("Observable: " + (observable ? "Sí" : "No"));
    }
}
