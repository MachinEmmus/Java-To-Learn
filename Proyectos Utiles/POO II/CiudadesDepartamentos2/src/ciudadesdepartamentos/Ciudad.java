
package ciudadesdepartamentos;


public class Ciudad {
  private String idCiudad;
  private String nombreCiudad;
  private String idDepartamento;

    public Ciudad(String idCiudad, String nombreCiudad, String idDepartamento) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
        this.idDepartamento = idDepartamento;
    }

    public Ciudad() {
        
    }

    public String getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(String idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
  
  
  
}
