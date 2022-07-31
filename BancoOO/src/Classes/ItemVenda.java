package Classes;


public class ItemVenda {
    private double vUnitario;
    private int qtd;
    private Venda venda;
    private Produto produto;

    public ItemVenda() {
    }
    
    
    
    public ItemVenda(double vUnitario, int qtd, Venda venda, Produto produto) {
        this.vUnitario = vUnitario;
        this.qtd = qtd;
        this.venda = venda;
    }

   
    public double getvUnitario() {
        return vUnitario;
    }

    public void setvUnitario(double vUnitario) {
        this.vUnitario = vUnitario;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemVenda{" + "vUnitario=" + vUnitario + ", qtd=" + qtd + ", venda=" + venda + ", produto=" + produto + '}';
    }


}