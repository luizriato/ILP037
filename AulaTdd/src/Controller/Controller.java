/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model;

/**
 *
 * @author luiz-riato
 */
public class Controller {

    private String login;
    private String senha;
    Model cadastrar = new Model();

    public void cadastrar(String login_cadastro, String senha_cadastro) {
        this.login = login_cadastro;
        this.senha = senha_cadastro;
        cadastrar.setLogin(login_cadastro);
        cadastrar.setSenha(senha_cadastro);
    }

    public boolean login() {
        return login.equals(cadastrar.getLogin()) && senha.equals(cadastrar.getSenha());
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
