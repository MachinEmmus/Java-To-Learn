
package ciudadesdepartamentos;

import java.sql.*;
import javax.swing.JOptionPane;



public class Conexion {
    
    public String db = "colombia";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "";
    public static Connection con= null;
    public static Statement st=null;

    public Connection Conectar() {
       
        try {
            //Cargamos el Driver MySQL
            Class.forName("com.mysql.jdbc.Driver");
            //Creamos un enlace hacia la base de datos
            con = DriverManager.getConnection(this.url, this.user, this.pass);
            if (con!=null){           
                st=con.createStatement();
            }
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;  
    }  
    
    
    public void cerrarConexion() {
        try {
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
        }
    }
    
    
}
