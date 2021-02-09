package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Cliente;

public class ClienteDAO {
    
    
    public void create(Cliente c) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (nome, rua, bairro, numero, telefone) VALUES(?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getRua());
            stmt.setString(3, c.getBairro());
            stmt.setInt(4, c.getNumero());
	    stmt.setInt(5, c.getTelefone());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
        
}
