package Ejercicio2;

public class Cuenta {

private int saldo;
private int saldoInicial;

public Cuenta(int saldo){
    this.saldoInicial=saldo;
    this.saldo=saldo;
}
public synchronized void hacerMovimiento(int cantidad){
    this.saldo = this.saldo+cantidad;
}
public boolean esSimulacionCorrecta(){
    if (this.saldo==this.saldoInicial) return true;
    return false;
}
public int getSaldo(){
    return this.saldo;
}
}