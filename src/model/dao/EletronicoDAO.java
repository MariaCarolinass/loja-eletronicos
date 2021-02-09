package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Eletronico;

public class EletronicoDAO {
    
    
    public void create(Eletronico e) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        
        try {
            stmt = con.prepareStatement("INSERT INTO eletronico (preco, tipo, garantia, marca) VALUES(?,?,?,?)");
            stmt.setInt(1, e.getPreco());
            stmt.setString(2, e.getTipo());
            stmt.setInt(3, e.getGarantia());
            stmt.setString(4, e.getMarca());
	  
            
    
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
        
}
