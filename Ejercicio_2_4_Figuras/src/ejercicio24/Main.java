package ejercicio24;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);
        Rectangulo rectangulo = new Rectangulo(5.0, 2.0);
        Cuadrado cuadrado = new Cuadrado(4.0);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3.0, 4.0);
        System.out.printf("Círculo — área: %.2f cm², perímetro: %.2f cm%n", circulo.calcularArea(), circulo.calcularPerimetro());
        System.out.printf("Rectángulo — área: %.2f cm², perímetro: %.2f cm%n", rectangulo.calcularArea(), rectangulo.calcularPerimetro());
        System.out.printf("Cuadrado — área: %.2f cm², perímetro: %.2f cm%n", cuadrado.calcularArea(), cuadrado.calcularPerimetro());
        System.out.printf("Triángulo rectángulo — hipotenusa: %.2f cm, área: %.2f cm², perímetro: %.2f cm, clasificación: %s%n",
                triangulo.calcularHipotenusa(), triangulo.calcularArea(), triangulo.calcularPerimetro(), triangulo.determinarTipo());
    }
}
