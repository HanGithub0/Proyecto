package unipacifico.edu.pasantias.logica;

public class Pasantia {
    int codigo;
    String nombreEmpresa;
    String fechaInicio;
    String fechaFinalizacion;
    int numPasantesRequeridos;
    String descripcion;
    int numeroConvenioMacro;
    String estado;

    public int getCodigo() {
        return codigo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public int getNumPasantesRequeridos() {
        return numPasantesRequeridos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroConvenioMacro() {
        return numeroConvenioMacro;
    }

    public String getEstado() {
        return estado;
    }
    

    public Pasantia(int codigo, String nombreEmpresa, String fechaInicio, String fechaFinalizacion,
                    int numPasantesRequeridos, String descripcion, int numeroConvenioMacro, String estado) {
        this.codigo = codigo;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.numPasantesRequeridos = numPasantesRequeridos;
        this.descripcion = descripcion;
        this.numeroConvenioMacro = numeroConvenioMacro;
        this.estado = estado;
    }

    public void modificarInformacion(int codigo, String nombreEmpresa, String fechaInicio, String fechaFinalizacion,
                                      int numPasantesRequeridos, String descripcion, int numeroConvenioMacro, String estado) {
        this.codigo = codigo;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.numPasantesRequeridos = numPasantesRequeridos;
        this.descripcion = descripcion;
        this.numeroConvenioMacro = numeroConvenioMacro;
        this.estado = estado;
    }

    
}
