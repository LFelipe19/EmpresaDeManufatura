package model;

public class Operador extends Funcionario{
    private double valorHora;

    public Operador(int idFunc, String nome, String email, String documento, double valorHora) {
        super(idFunc, nome, email, documento);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("valorHora=").append(valorHora);
        return sb.toString();
    }
}
