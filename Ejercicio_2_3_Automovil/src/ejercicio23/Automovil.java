package ejercicio23;

public class Automovil {
    public enum TipoCombustible { GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL }
    public enum TipoAutomovil { CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV }
    public enum Color { BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA }

    private String marca;
    private int modelo;
    private double motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private Color color;
    private int velocidadActual;

    public Automovil(String marca, int modelo, double motor, TipoCombustible combustible,
                     TipoAutomovil tipo, int puertas, int asientos, int velocidadMaxima,
                     Color color, int velocidadActual) {
        setMarca(marca); setModelo(modelo); setMotor(motor); setTipoCombustible(combustible);
        setTipoAutomovil(tipo); setNumeroPuertas(puertas); setCantidadAsientos(asientos);
        setVelocidadMaxima(velocidadMaxima); setColor(color); setVelocidadActual(velocidadActual);
    }
    public String getMarca() { return marca; }
    public void setMarca(String v) { if (v == null || v.isBlank()) throw new IllegalArgumentException("Marca obligatoria."); marca=v; }
    public int getModelo() { return modelo; }
    public void setModelo(int v) { if (v < 1886) throw new IllegalArgumentException("Modelo no válido."); modelo=v; }
    public double getMotor() { return motor; }
    public void setMotor(double v) { if (v <= 0) throw new IllegalArgumentException("El cilindraje debe ser positivo."); motor=v; }
    public TipoCombustible getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(TipoCombustible v) { if (v == null) throw new IllegalArgumentException("Combustible obligatorio."); tipoCombustible=v; }
    public TipoAutomovil getTipoAutomovil() { return tipoAutomovil; }
    public void setTipoAutomovil(TipoAutomovil v) { if (v == null) throw new IllegalArgumentException("Tipo obligatorio."); tipoAutomovil=v; }
    public int getNumeroPuertas() { return numeroPuertas; }
    public void setNumeroPuertas(int v) { if (v < 1) throw new IllegalArgumentException("Número de puertas no válido."); numeroPuertas=v; }
    public int getCantidadAsientos() { return cantidadAsientos; }
    public void setCantidadAsientos(int v) { if (v < 1) throw new IllegalArgumentException("Cantidad de asientos no válida."); cantidadAsientos=v; }
    public int getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(int v) { if (v < 1) throw new IllegalArgumentException("Velocidad máxima no válida."); velocidadMaxima=v; if (velocidadActual > v) velocidadActual=v; }
    public Color getColor() { return color; }
    public void setColor(Color v) { if (v == null) throw new IllegalArgumentException("Color obligatorio."); color=v; }
    public int getVelocidadActual() { return velocidadActual; }
    public void setVelocidadActual(int v) { if (v < 0 || v > velocidadMaxima) throw new IllegalArgumentException("La velocidad debe estar entre 0 y la máxima."); velocidadActual=v; }

    public void acelerar(int incremento) { if (incremento < 0) throw new IllegalArgumentException("Incremento negativo."); velocidadActual=Math.min(velocidadMaxima, velocidadActual+incremento); }
    public void desacelerar(int decremento) { if (decremento < 0) throw new IllegalArgumentException("Decremento negativo."); velocidadActual=Math.max(0, velocidadActual-decremento); }
    public void frenar() { velocidadActual=0; }
    public double calcularTiempoLlegada(double distanciaKm) {
        if (distanciaKm < 0) throw new IllegalArgumentException("La distancia no puede ser negativa.");
        if (velocidadActual == 0) throw new IllegalStateException("El automóvil debe estar en movimiento.");
        return distanciaKm / velocidadActual;
    }
    public void imprimir() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Motor: " + motor + " L");
        System.out.println("Combustible: " + tipoCombustible + " | Tipo: " + tipoAutomovil + " | Color: " + color);
        System.out.println("Puertas: " + numeroPuertas + " | Asientos: " + cantidadAsientos);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h | Velocidad actual: " + velocidadActual + " km/h");
    }
}
