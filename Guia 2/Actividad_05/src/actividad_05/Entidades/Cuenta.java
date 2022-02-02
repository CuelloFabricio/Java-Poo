package actividad_05.Entidades;




public class Cuenta {
private long DNI;
private Integer numeroCuenta;
private double SaldoActual;

    public Cuenta() {
    }

    public Cuenta(long DNI, Integer numeroCuenta, double SaldoActual) {
        this.DNI = DNI;
        this.numeroCuenta = numeroCuenta;
        this.SaldoActual = SaldoActual;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

}

