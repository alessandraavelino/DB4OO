package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Vendedor {
    private int codVdd;
    private double cpf;
    private double comissao;
    private String nome;
    private String endereco;

    public Vendedor() {
    }

    public Vendedor(int codVdd, double cpf, double comissao, String nome, String endereco) {
        this.codVdd = codVdd;
        this.cpf = cpf;
        this.comissao = comissao;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    

    public int getCodVdd() {
        return codVdd;
    }

    public void setCodVdd(int codVdd) {
        this.codVdd = codVdd;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
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
        return "Vendedor{" + "codVdd=" + codVdd + ", cpf=" + cpf + ", comissao=" + comissao + ", nome=" + nome + ", endereco=" + endereco + '}';
    }
    
    


    
    
}
