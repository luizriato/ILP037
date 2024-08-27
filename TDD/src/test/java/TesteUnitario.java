/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Controller.Controller;
import Model.Model;
/**
 *
 * @author luiz-riato
 */
public class TesteUnitario {
    
@Test
    public void testCadastroESucessoNoLogin() {
        Controller cadastro = new Controller();
        cadastro.cadastrar("usuario", "password123");
        assertEquals("usuario", cadastro.getLogin());
        assertEquals("password123", cadastro.getSenha());
    }
    
}
