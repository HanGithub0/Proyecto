
package unipacifico.edu.pasantias.logica;
import java.util.Scanner;
public class ConvenioMacro {
    int numeroConvenio;
    String fechaInicio;
    String fechaFinalizacion;
    String nombreEmpresa;
    String correoRepresentante;
    String representante;
    String archivoConvenio;
    boolean activo;

    public int getNumeroConvenio() {
        return numeroConvenio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getCorreoRepresentante() {
        return correoRepresentante;
    }

    public String getRepresentante() {
        return representante;
    }

    public String getArchivoConvenio() {
        return archivoConvenio;
    }

    public boolean isActivo() {
        return activo;
    }
    
    

    public ConvenioMacro(int numeroConvenio, String fechaInicio, String fechaFinalizacion, String nombreEmpresa,
                         String correoRepresentante, String representante, String archivoConvenio) {
        this.numeroConvenio = numeroConvenio;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.nombreEmpresa = nombreEmpresa;
        this.correoRepresentante = correoRepresentante;
        this.representante = representante;
        this.archivoConvenio = archivoConvenio;
        this.activo = true;
    }

    public void modificarInformacion(String correoRepresentante, String representante) {
        this.correoRepresentante = correoRepresentante;
        this.representante = representante;
    }

    public void desactivarConvenio() {
        this.activo = false;
    }

}
