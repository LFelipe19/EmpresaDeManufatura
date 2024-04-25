package model;

public abstract class Funcionario {
    private int idFunc;
    private String nome;
    private String email;
    private String documento;

    public Funcionario(int idFunc, String nome, String email, String documento) {
        this.idFunc = idFunc;
        this.nome = nome;
        this.email = email;
        this.documento = documento;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dados do funcionário: \n");
        sb.append("ID do Funcionário=").append(idFunc).append("\n");
        sb.append("Nome=").append(nome).append("\n");
        sb.append("E-mail=").append(email).append("\n");
        sb.append("Documento=").append(documento).append("\n");
        return sb.toString();
    }
}
