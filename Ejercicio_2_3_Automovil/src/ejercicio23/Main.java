package ejercicio23;

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", 2022, 2.0,
                Automovil.TipoCombustible.GASOLINA, Automovil.TipoAutomovil.SUV,
                5, 5, 180, Automovil.Color.AZUL, 60);
        auto.imprimir();
        auto.acelerar(30);
        System.out.println("Después de acelerar: " + auto.getVelocidadActual() + " km/h");
        auto.desacelerar(20);
        System.out.println("Después de desacelerar: " + auto.getVelocidadActual() + " km/h");
        System.out.printf("Tiempo para recorrer 100 km: %.2f horas%n", auto.calcularTiempoLlegada(100));
        auto.frenar();
        System.out.println("Después de frenar: " + auto.getVelocidadActual() + " km/h");
    }
}
