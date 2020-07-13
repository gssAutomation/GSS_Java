package br_com_gss_secao11;


/**
 * Conta
 */
public class Conta {

    int numero;
    private float saldo;
    float limite;
    Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo + limite;
        this.limite = limite;
        this.cliente = cliente;
    }


    /**
     * 100
     *  50
     * this.saldo = this.saldo - valor
     * 50
     */
    public void sacar(float valor){
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(float valor){
        this.saldo = this.saldo + valor;
    }

    public float getSaldo() {
        return this.saldo;
    }
}