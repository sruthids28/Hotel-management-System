package project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sruthi
 */
public class InsertUpdateDelete {
    public static void setData(String Query,String msg)
    {
        Connection con=null;
        Statement st=null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null,msg);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
         }
        finally
        {
            try
            {}
            catch(Exception e)
            {}
                    
        }
        
    }
}

