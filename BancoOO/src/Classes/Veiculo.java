package Classes;

public class Veiculo {
    private String placa;
    private int capacidade;

    public Veiculo() {
    }
    
    
    public Veiculo(String placa, int capacidade) {
        this.placa = placa;
        this.capacidade = capacidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
}



