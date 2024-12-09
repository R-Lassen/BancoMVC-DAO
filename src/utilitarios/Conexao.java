
package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 44966
 */
public class Conexao {

    public static void main(String[] args) {
        // Testando conexao
        obterConexao();
        System.out.println("Conectado com sucesso");
}
    static Connection con = null;
    //Configurações para a conexão com o mysql
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/ideal";
    static String usuario = "root";
    static String senha = "root";
    
    private static Connection obterConexao() {
        try {
            if (con == null){
                //carregar o drive do mysql
                Class.forName(driver);
                //conectar ao banco de dados
                con = DriverManager.getConnection(url, usuario, senha);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver não encontrado", e);
        } catch (SQLException e) {
            throw new RuntimeException("Erro de conexao com o banco de dados", e);
        }
        return con;
    }
}
