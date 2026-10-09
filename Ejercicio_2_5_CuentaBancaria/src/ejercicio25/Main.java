package ejercicio25;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Ana María", "Gómez Pérez", "00123456789", CuentaBancaria.TipoCuenta.AHORROS);
        cuenta.imprimir();
        System.out.println("Consignación de $250000: " + (cuenta.consignar(250000) ? "exitosa" : "rechazada"));
        System.out.println("Consignación de $50000: " + (cuenta.consignar(50000) ? "exitosa" : "rechazada"));
        System.out.printf("Saldo consultado: $%,.2f%n", cuenta.consultarSaldo());
        System.out.println("Retiro de $100000: " + (cuenta.retirar(100000) ? "exitoso" : "rechazado"));
        System.out.println("Retiro de $500000: " + (cuenta.retirar(500000) ? "exitoso" : "rechazado por saldo insuficiente"));
        cuenta.imprimir();
    }
}
