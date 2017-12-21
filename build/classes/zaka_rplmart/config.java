/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaka_rplmart;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author nindra
 */
public class config {
    Connection connect;
    private final String driver   = "com.mysql.jdbc.Driver";
    private final String url      = "jdbc:mysql://localhost:3306/db_poszaka_xiirpl1";
    private final String user     = "root";
    private final String pw       = "";
    
    public void koneksi ()
    {
        try 
        {
            Class.forName(driver);
            connect = DriverManager.getConnection(url, user, pw);
            System.out.println("Koneksi Berhasil");
        }
        catch (Exception e)
        {
            System.out.println("Koneksi Gagal");
        }
        
    }
    
    public void aksi(String sql)
    {
        try
        {
            Statement st = connect.createStatement();
            st.executeUpdate(sql);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public ResultSet ambildata(String sql)
    {
        try
        {
            Statement st = connect.createStatement();
            return st.executeQuery(sql);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
