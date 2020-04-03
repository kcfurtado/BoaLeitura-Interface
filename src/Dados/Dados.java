 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Model.Cliente;
import java.sql.PreparedStatement;

/**
 *
 * @author kcfurtado
 */
public class Dados {
    Conexao con;
    public boolean inserirCliente(Cliente cliente) throws Exception{
       con= new Conexao();
       String SQL="inssert into cliente values(?,?,?,?,?,?,?,?,?,?,?)";
       PreparedStatement ps= (PreparedStatement) con.getConexao().prepareStatement(SQL); 
       
       ps.setString(1, cliente.getUsuario());
       ps.setString(2, cliente.getSenha());
       ps.setString(3, cliente.getConfirmaSenha());
       ps.setInt(4, cliente.getBi()); 
       ps.setString(5, cliente.getNome());
       ps.setInt(6, cliente.getNif()); 
       ps.setString(7, cliente.getPais());
       ps.setString(8, cliente.getCidade());
       ps.setString(9, cliente.getLocalidade());
       ps.setString(10, cliente.getEmail());
       ps.setInt(11, cliente.getTelefone()); 
       
       if(ps.executeUpdate()>0)       
        return true;
       else 
           return false;
    }
    
}
