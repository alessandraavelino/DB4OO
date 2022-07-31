package Classes;

public class Motorista{
    private int codMot;
    private  double cpf;
    private String nome;
    private String endereco;

    public Motorista(int codMot, double cpf, String nome, String endereco) {
        this.codMot = codMot;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    Motorista() {
    }

    public int getCodMot() {
        return codMot;
    }

    public void setCodMot(int codMot) {
        this.codMot = codMot;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Motorista{" + "codMot=" + codMot + ", cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + '}';
    }

    


   
}