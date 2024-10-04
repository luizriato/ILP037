/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.Dao;

/**
 *
 * @author Alunos
 */
public class Clientes {
    private int idCli;
    private String nomeCli;
    private String endeCli;
    private String numeCli;
    private String complCli;
    private String bairCli;
    private String cidaCli;
    private String ufCli;
    private String cepCli;
    private String foneCli;
    private String cpfCli;
    private java.util.Date dataNasc; // Pode usar java.sql.Date ou LocalDate
    private String cnpjCli;

    // Getters e Setters
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getEndeCli() {
        return endeCli;
    }

    public void setEndeCli(String endeCli) {
        this.endeCli = endeCli;
    }

    public String getNumeCli() {
        return numeCli;
    }

    public void setNumeCli(String numeCli) {
        this.numeCli = numeCli;
    }

    public String getComplCli() {
        return complCli;
    }

    public void setComplCli(String complCli) {
        this.complCli = complCli;
    }

    public String getBairCli() {
        return bairCli;
    }

    public void setBairCli(String bairCli) {
        this.bairCli = bairCli;
    }

    public String getCidaCli() {
        return cidaCli;
    }

    public void setCidaCli(String cidaCli) {
        this.cidaCli = cidaCli;
    }

    public String getUfCli() {
        return ufCli;
    }

    public void setUfCli(String ufCli) {
        this.ufCli = ufCli;
    }

    public String getCepCli() {
        return cepCli;
    }

    public void setCepCli(String cepCli) {
        this.cepCli = cepCli;
    }

    public String getFoneCli() {
        return foneCli;
    }

    public void setFoneCli(String foneCli) {
        this.foneCli = foneCli;
    }

    public String getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(String cpfCli) {
        this.cpfCli = cpfCli;
    }

    public java.util.Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(java.util.Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCnpjCli() {
        return cnpjCli;
    }

    public void setCnpjCli(String cnpjCli) {
        this.cnpjCli = cnpjCli;
    }
    
    public Clientes(){
        
    }
}
