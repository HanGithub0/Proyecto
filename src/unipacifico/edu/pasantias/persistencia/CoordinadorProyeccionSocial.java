
package unipacifico.edu.pasantias.persistencia;

import java.util.Scanner;
import unipacifico.edu.pasantias.logica.ConvenioMacro;
import unipacifico.edu.pasantias.logica.Pasantia;

public class CoordinadorProyeccionSocial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos para el convenio macro:");
        System.out.print("Numero de convenio: ");
        int numeroConvenio = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fecha de inicio (dd/mm/yyyy): ");
        String fechaInicio = scanner.nextLine();
        System.out.print("Fecha de finalizacion (dd/mm/yyyy): ");
        String fechaFinalizacion = scanner.nextLine();
        System.out.print("Nombre de la empresa: ");
        String nombreEmpresa = scanner.nextLine();
        System.out.print("Correo del representante: ");
        String correoRepresentante = scanner.nextLine();
        System.out.print("Nombre del representante: ");
        String representante = scanner.nextLine();
        System.out.print("Archivo del convenio: ");
        String archivoConvenio = scanner.nextLine();

        ConvenioMacro convenio = new ConvenioMacro(numeroConvenio, fechaInicio, fechaFinalizacion, nombreEmpresa,
                correoRepresentante, representante, archivoConvenio);

        System.out.println("\nIngrese los datos para la pasantia:");
        System.out.print("Codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nombre de la empresa: ");
        String nombreEmpresaPasantia = scanner.nextLine();
        System.out.print("Fecha de inicio (dd/mm/yyyy): ");
        String fechaInicioPasantia = scanner.nextLine();
        System.out.print("Fecha de finalizacion (dd/mm/yyyy): ");
        String fechaFinalizacionPasantia = scanner.nextLine();
        System.out.print("Numero de pasantes requeridos: ");
        int numPasantesRequeridos = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Descripcion: ");
        String descripcion = scanner.nextLine();
        System.out.print("Numero de convenio macro: ");
        int numeroConvenioMacro = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();

        Pasantia pasantia = new Pasantia(estado, nombreEmpresa, fechaInicio, fechaFinalizacion, numeroConvenio, descripcion, archivoConvenio, estado);

        System.out.println("\nDatos del convenio macro:");
        System.out.println(convenio.getNumeroConvenio());
        System.out.println(convenio.getFechaInicio());
        System.out.println(convenio.getFechaFinalizacion());
        System.out.println(convenio.getNombreEmpresa());
        System.out.println(convenio.getCorreoRepresentante());
        System.out.println(convenio.getRepresentante());
        System.out.println(convenio.getArchivoConvenio());

        System.out.println("\nDatos de la pasantia:");
        System.out.println(pasantia.getCodigo());
        System.out.println(pasantia.getNombreEmpresa());
        System.out.println(pasantia.getFechaInicio());
        System.out.println(pasantia.getFechaFinalizacion());        
        System.out.println(pasantia.getDescripcion());
        System.out.println(pasantia.getEstado());
        
        scanner.close();
    }

    
}
