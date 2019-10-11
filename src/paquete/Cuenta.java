package paquete;
public class Cuenta {
    private int numCuenta;
    private double saldo;
    private Persona propietario;
    public Cuenta(int numCuenta, double saldo, Persona propietario) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }
    public Cuenta() {}
    @Override
    public String toString() {
        return "Cuenta{" +
                "numCuenta=" + numCuenta +
                ", saldo=" + saldo +
                ", propietario=" + propietario +
                '}';
    }
    public  void ingresar(double cantidad){
        System.out.println("Ha elegido: INGRESAR");
        saldo = this.saldo;
        saldo += cantidad;
        setSaldo(saldo);
        System.out.println("Tu saldo actual es ->> "+saldo+"€");
    }
    public void retirar(double cantidad){
        if(cantidad>this.saldo){
            System.out.println("No tiene dinero suficiente en la cuenta!!");
        }else {
            System.out.println("Ha elegido: RETIRAR");
            saldo = this.saldo;
            saldo -= cantidad;
            setSaldo(saldo);
            System.out.println("Tu saldo actual es ->> " + saldo + "€");
        }
    }
    public void alertSaldo(double saldo){
        saldo = this.saldo;
        if(saldo<200){
            System.out.println("Atencion!! el saldo de la cuenta se esta agotando!! Qedan:--> "+saldo);
        }
    }
    public int getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Persona getPropietario() {
        return propietario;
    }
    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
}
