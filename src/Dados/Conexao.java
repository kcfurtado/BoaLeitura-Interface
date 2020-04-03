
package Dados;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {    
   
   private Connection conexao;
    public Conexao() throws Exception{
        
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        String url = "jdbc:jtds:sqlserver://KCAFURTADO/SQLEXPRESS:1433/BoaLeitura";
        conexao = DriverManager.getConnection(url,"boalei","123");
    }
    public Connection getConexao(){
        return conexao;
    }}  

