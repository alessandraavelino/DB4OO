package Classes;


public class Venda {
    private int numVen;
    private double valorTotal;
    private Cliente cliente;
    private Vendedor vendedor;

    public Venda() {
    }
    
       
    
    public Venda(int numVen, double valorTotal, Cliente cliente, Vendedor vendedor) {
        this.numVen = numVen;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

   
    public int getNumVen() {
        return numVen;
    }

    public void setNumVen(int numVen) {
        this.numVen = numVen;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Venda{" + "numVen=" + numVen + ", valorTotal=" + valorTotal + ", cliente=" + cliente + ", vendedor=" + vendedor + '}';
    }

   

}