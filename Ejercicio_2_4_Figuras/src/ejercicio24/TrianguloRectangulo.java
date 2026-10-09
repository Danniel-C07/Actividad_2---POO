package ejercicio24;

public class TrianguloRectangulo {
    public enum TipoTriangulo { EQUILATERO, ISOSCELES, ESCALENO }
    private final double base, altura;
    public TrianguloRectangulo(double base, double altura) { if (base <= 0 || altura <= 0) throw new IllegalArgumentException("Base y altura deben ser positivas."); this.base=base; this.altura=altura; }
    public double calcularHipotenusa() { return Math.hypot(base, altura); }
    public double calcularArea() { return base * altura / 2.0; }
    public double calcularPerimetro() { return base + altura + calcularHipotenusa(); }


    public TipoTriangulo determinarTipo() {
        double[] lados = {base, altura, calcularHipotenusa()};
        int iguales = 0;
        if (casiIgual(lados[0], lados[1])) iguales++;
        if (casiIgual(lados[0], lados[2])) iguales++;
        if (casiIgual(lados[1], lados[2])) iguales++;
        if (iguales == 3) return TipoTriangulo.EQUILATERO;
        if (iguales > 0) return TipoTriangulo.ISOSCELES;
        return TipoTriangulo.ESCALENO;
    }
    private boolean casiIgual(double a, double b) { return Math.abs(a-b) < 1e-9; }
}
