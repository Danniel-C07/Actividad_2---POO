package ejercicio22;

public class Main {
    public static void main(String[] args) {
        Planeta planeta = new Planeta("Júpiter", 95, 1.898e27, 1.4313e15, 139820,
                778, Planeta.TipoPlaneta.GASEOSO, true);
        planeta.imprimir();
        System.out.printf("Densidad: %.4e kg/km³%n", planeta.calcularDensidad());
        System.out.println("¿Es planeta exterior?: " + (planeta.esPlanetaExterior() ? "Sí" : "No"));
    }
}
