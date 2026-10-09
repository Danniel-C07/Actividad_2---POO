package ejercicio25;


public class CuentaBancaria {
    public enum TipoCuenta { AHORROS, CORRIENTE }
    private final String nombres;
    private final String apellidos;
    private final String numeroCuenta;
    private final TipoCuenta tipoCuenta;
    private double saldo;

    public CuentaBancaria(String nombres, String apellidos, String numeroCuenta, TipoCuenta tipoCuenta) {
        if (nombres == null || nombres.isBlank() || apellidos == null || apellidos.isBlank() || numeroCuenta == null || numeroCuenta.isBlank())
            throw new IllegalArgumentException("Nombres, apellidos y número de cuenta son obligatorios.");
        if (tipoCuenta == null) throw new IllegalArgumentException("El tipo de cuenta es obligatorio.");
        this.nombres=nombres; this.apellidos=apellidos; this.numeroCuenta=numeroCuenta; this.tipoCuenta=tipoCuenta; this.saldo=0.0;
    }
    public void imprimir() {
        System.out.println("Titular: " + nombres + " " + apellidos);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.printf("Saldo: $%,.2f%n", saldo);
    }
    public double consultarSaldo() { return saldo; }
    public boolean consignar(double valor) {
        if (valor <= 0 || !Double.isFinite(valor)) return false;
        saldo += valor; return true;
    }
    public boolean retirar(double valor) {
        if (valor <= 0 || !Double.isFinite(valor) || valor > saldo) return false;
        saldo -= valor; return true;
    }
}
