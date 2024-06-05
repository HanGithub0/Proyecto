package unipacifico.edu.pasantias.logica;

public class Pasantia {
    private String codigo;
    private String nombreEmpresa;
    private String fechaInicio;
    private String fechaFinalizacion;
    private int numeroPasantes;
    private String descripcion;
    private String numeroConvenioM;
    private String estado;

    
    public Pasantia(String codigo, String nombreEmpresa, String fechaInicio, String fechaFinalizacion, int numeroPasantes, String descripcion, String numeroConvenioM, String estado) {
        this.codigo = codigo;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.numeroPasantes = numeroPasantes;
        this.descripcion = descripcion;
        this.numeroConvenioM = numeroConvenioM;
        this.estado = estado;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public int getNumeroPasantes() {
        return numeroPasantes;
    }

    public void setNumeroPasantes(int numeroPasantes) {
        this.numeroPasantes = numeroPasantes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumeroConvenioM() {
        return numeroConvenioM;
    }

    public void setNumeroConvenioM(String numeroConvenioM) {
         this.numeroConvenioM = numeroConvenioM;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
