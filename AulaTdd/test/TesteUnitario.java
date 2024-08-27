/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import Model.Model;
import View.Login;
import java.lang.ModuleLayer.Controller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitario {

    @Test
    public void testSetAndGetLogin() {
        Model model = new Model();
        model.setLogin("usuario");
        assertEquals("usuario", model.getLogin(), "O login deveria ser 'usuario'");
    }

    @Test
    public void testSetAndGetSenha() {
        Model model = new Model();
        model.setSenha("senha123");
        assertEquals("senha123", model.getSenha(), "A senha deveria ser 'senha123'");
    }
}

public class LoginTest {

    @Test
    public void testCadastroESucessoNoLogin() {
        String usuario = "usuario";
        String senha = "senha";
        Controller cadastro = new Controller();
        cadastro.("usuario");
        cadastro.jTextField_senha.setText("senha123");
    }
}
