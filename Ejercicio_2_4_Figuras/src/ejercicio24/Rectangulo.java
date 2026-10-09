package ejercicio24;

public class Rectangulo {
    protected final double base, altura;
    public Rectangulo(double base, double altura) { if (base <= 0 || altura <= 0) throw new IllegalArgumentException("Base y altura deben ser positivas."); this.base=base; this.altura=altura; }
    public double calcularArea() { return base * altura; }
    public double calcularPerimetro() { return 2 * (base + altura); }
}
