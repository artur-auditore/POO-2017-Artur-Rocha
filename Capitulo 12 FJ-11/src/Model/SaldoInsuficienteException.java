package Model;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(double valor){
        super("Saldo Insuficiente para sacar o valor de: " + valor);
    }

}
