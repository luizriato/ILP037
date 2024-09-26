/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author Alunos
 */
public class Movimentacao {
    private int numAge;
    private long numCc;
    private java.util.Date dataMov; // Pode usar java.sql.Date ou LocalDate
    private String numDocto;
    private char debitoCredito;
    private int idHis;
    private String complHis;
    private double valor;
    private double saldo;

    // Getters e Setters
    public int getNumAge() {
        return numAge;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public long getNumCc() {
        return numCc;
    }

    public void setNumCc(long numCc) {
        this.numCc = numCc;
    }

    public java.util.Date getDataMov() {
        return dataMov;
    }

    public void setDataMov(java.util.Date dataMov) {
        this.dataMov = dataMov;
    }

    public String getNumDocto() {
        return numDocto;
    }

    public void setNumDocto(String numDocto) {
        this.numDocto = numDocto;
    }

    public char getDebitoCredito() {
        return debitoCredito;
    }

    public void setDebitoCredito(char debitoCredito) {
        this.debitoCredito = debitoCredito;
    }

    public int getIdHis() {
        return idHis;
    }

    public void setIdHis(int idHis) {
        this.idHis = idHis;
    }

    public String getComplHis() {
        return complHis;
    }

    public void setComplHis(String complHis) {
        this.complHis = complHis;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
