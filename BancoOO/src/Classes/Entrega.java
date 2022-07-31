package Classes;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Entrega {
    private String hora;
    private String date;
    private int numVen;
    private String placa;
    private Motorista motorista;

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumVen() {
        return numVen;
    }

    public void setNumVen(int numVen) {
        this.numVen = numVen;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "Entrega{" + "hora=" + hora + ", date=" + date + ", numVen=" + numVen + ", placa=" + placa + ", motorista=" + motorista + '}';
    }

    
    
    
    
    
}
