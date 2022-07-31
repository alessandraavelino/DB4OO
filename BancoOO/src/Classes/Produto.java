package Classes;

public class Produto {
    private int codPro;
    private double custo;
    private String descricao;
    private int preco;
    private String nome;
    
    public Produto(int codPro, double custo, String descricao, int preco, String nome) {
        this.codPro = codPro;
        this.custo = custo;
        this.descricao = descricao;
        this.preco = preco;
        this.nome = nome;
    }

    Produto() {
      
    }

    


    public int getCodPro() {
        return codPro;
    }

    public void setCodPro(int codPro) {
        this.codPro = codPro;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" + "codPro=" + codPro + ", custo=" + custo + ", descricao=" + descricao + ", preco=" + preco + ", nome=" + nome + '}';
    }
    
    

}