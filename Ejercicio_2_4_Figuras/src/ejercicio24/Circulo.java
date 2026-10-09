package ejercicio24;

public class Circulo {
    private final double radio;
    public Circulo(double radio) { if (radio <= 0) throw new IllegalArgumentException("El radio debe ser positivo."); this.radio=radio; }
    public double calcularArea() { return Math.PI * radio * radio; }
    public double calcularPerimetro() { return 2 * Math.PI * radio; }
}
