package model;

public class Secretaria extends Funcionario{
    private String telefone;
    private String ramal;

    public Secretaria(int idFunc, String nome, String email, String documento, String telefone, String ramal) {
        super(idFunc, nome, email, documento);
        this.telefone = telefone;
        this.ramal = ramal;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("telefone=").append(telefone).append("\n");
        sb.append("ramal=").append(ramal).append("\n");
        return sb.toString();
    }
}
