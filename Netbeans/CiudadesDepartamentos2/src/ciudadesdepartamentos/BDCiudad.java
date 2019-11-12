
package ciudadesdepartamentos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;



public class BDCiudad extends Conexion {

    public  void insertarCiudad(Ciudad c1) {
        
        String q1="insert into ciudad values (?,?,?);";
        try {
          
             Conectar();
             PreparedStatement pst= con.prepareStatement(q1);
             pst.setString(1, c1.getIdCiudad());
             pst.setString(2, c1.getNombreCiudad());
             pst.setString(3, c1.getIdDepartamento());
             pst.executeUpdate();
        } catch (Exception e) {
            
        } finally {
          cerrarConexion();
        }     
    }

    public  DefaultTableModel getCiudades() {
       
        DefaultTableModel modeloCiudades = new DefaultTableModel();
		 
        String q = "SELECT * FROM ciudad ";
		
        try {
            Conectar();
            ResultSet rs = st.executeQuery( q );
            DefaultTableModel modelo= new DefaultTableModel();
            
            modelo.addColumn("id_ciudad");
            modelo.addColumn("ciudad");
            modelo.addColumn("id_departamento");
                   
            while (rs.next()) {
                Object [] obje =new Object[3];
                  for (int i=0;i<3;i++) {
                        obje[i]=rs.getObject(i+1);
                      
                    } 
                     modelo.addRow(obje);                
                                     
            }
            
           
                modeloCiudades=modelo;
                rs.close();
               
        } catch (Exception e) {
            System.out.println("Mensaaje 2 "+e.getMessage());
        } finally {
              cerrarConexion();
        }
      return modeloCiudades;
    }

    public  void editarCiudad(Ciudad c1) {
        
	String q;
        q = "UPDATE ciudad  set nombre= '"+c1.getNombreCiudad()+"',id_departamento='"+c1.getIdDepartamento()+"' WHERE id_ciudad= '"+c1.getIdCiudad()+"'";		

        try {
           Conectar();                    
           st.executeUpdate( q );
          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
             cerrarConexion();
        }
    
    
    }
    

public void buscarCiudad(String txtIdciudad) throws SQLException 
{
    String q = "SELECT * FROM ciudad WHERE id_ciudad = '" + txtIdciudad+"'";
    String str = "";
    
    Conectar();
    ResultSet rs = st.executeQuery( q );
    
    while (rs.next())
    {
        str += rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+"\n";
    }    
    System.out.println( str );
    
  
}



    public  void deleteCiudad(String txtIdCiudad) {
      
	String q;
	q = "DELETE FROM ciudad WHERE id_ciudad = '" + txtIdCiudad+"'";			
		
        try {
            Conectar();
            st.executeUpdate( q );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
           cerrarConexion();
        }
        
    }
    
    
    
    
}
