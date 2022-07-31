package Classes;

public class Cliente {
    private int codCli;
    private String nome;
    private String tel;
    private String endereco;
    private double cpf;
    private String email;

    public Cliente() {
    }
    
    
    
    public Cliente(int codCli, String nome, String tel, String endereco, double cpf, String email) {
        this.codCli = codCli;
        this.nome = nome;
        this.tel = tel;
        this.endereco = endereco;
        this.cpf = cpf;
        this.email = email;
    }

    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 

    @Override
    public String toString() {
        return "Cliente{" + "codCli=" + codCli + ", nome=" + nome + ", tel=" + tel + ", endereco=" + endereco + ", cpf=" + cpf + ", email=" + email + '}';
    }
    
    
    
}