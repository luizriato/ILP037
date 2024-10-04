package banco.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import banco.Dao.Clientes;
import java.beans.Statement;
import java.sql.DriverManager;

public class connectDAO {

    Connection con;
    String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;encrypt=true;trustServerCertificate=true;";
    String usuario = "sa";
    String senha = ".";

    public Connection connectDB() throws ClassNotFoundException {
        JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");

        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
        }
        return con;
        // con.close();
    }

    public void insereRegistroJFBD(String banco, Clientes novo_cliente) {
        String banco2 = "CLIENTES";
        if (banco.equals(banco2)) {
            try {
                con = DriverManager.getConnection(caminho, usuario, senha);
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
            }
            Statement stmt;
            try {
                stmt = (Statement) con.createStatement();
        String sql = "INSERT INTO dbo.Clientes (idCli, nomeCli, endeCli, numeCli, complCli, bairCli, cidaCli, ufCli, cepCli, foneCli, cpfCli, dataNasc, cnpjCli) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            } catch (SQLException) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
            }
        }
    }
}
