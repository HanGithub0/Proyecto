
package unipacifico.edu.pasantias.logica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import unipacifico.edu.pasantias.logica.Pasantia;

public class PasantiaManager extends JFrame {
    private JTextField codigoField;
    private JTextField nombreEmpresaField;
    private JTextField fechaInicioField;
    private JTextField fechaFinalizacionField;
    private JTextField numeroPasantesField;
    private JTextField descripcionField;
    private JTextField numeroConvenioMField;
    private JTextField estadoField;
    private JButton publicarButton;
    private JButton modificarButton;
    private JButton inactivarButton;
    private JList<Pasantia> pasantiaList;
    private DefaultListModel<Pasantia> pasantiaListModel;

    private ArrayList<Pasantia> pasantias;

    public PasantiaManager() {
        pasantias = new ArrayList<>();
        pasantiaListModel = new DefaultListModel<>();

        setTitle("--Gestión de Pasantía--");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        JLabel codigoLabel = new JLabel("Código:");
        codigoLabel.setBounds(10, 10, 100, 25);
        add(codigoLabel);

        codigoField = new JTextField();
        codigoField.setBounds(120, 10, 200, 25);
        add(codigoField);

        JLabel nombreEmpresaLabel = new JLabel("Nombre de la Empresa:");
        nombreEmpresaLabel.setBounds(10, 40, 100, 25);
        add(nombreEmpresaLabel);

        nombreEmpresaField = new JTextField();
        nombreEmpresaField.setBounds(120, 40, 200, 25);
        add(nombreEmpresaField);

        JLabel fechaInicioLabel = new JLabel("Fecha de inicio:");
        fechaInicioLabel.setBounds(10, 70, 100, 25);
        add(fechaInicioLabel);

        fechaInicioField = new JTextField();
        fechaInicioField.setBounds(120, 70, 200, 25);
        add(fechaInicioField);

        JLabel fechaFinalizacionLabel = new JLabel("Fecha de finalización:");
        fechaFinalizacionLabel.setBounds(10, 100, 100, 25);
        add(fechaFinalizacionLabel);

        fechaFinalizacionField = new JTextField();
        fechaFinalizacionField.setBounds(120, 100, 200, 25);
        add(fechaFinalizacionField);

        JLabel numeroPasantesLabel = new JLabel("Numero Pasante:");
        numeroPasantesLabel.setBounds(10, 130, 100, 25);
        add(numeroPasantesLabel);

        numeroPasantesField = new JTextField();
        numeroPasantesField.setBounds(120, 130, 200, 25);
        add(numeroPasantesField);

        JLabel descripcionLabel = new JLabel("Descripción:");
        descripcionLabel.setBounds(10, 160, 100, 25);
        add(descripcionLabel);

        descripcionField = new JTextField();
        descripcionField.setBounds(120, 160, 200, 25);
        add(descripcionField);

        JLabel numeroConvenioMacroLabel = new JLabel("Numero del Convenio Macro:");
        numeroConvenioMacroLabel.setBounds(10, 190, 100, 25);
        add(numeroConvenioMacroLabel);

        numeroConvenioMField = new JTextField();
        numeroConvenioMField.setBounds(120, 190, 200, 25);
        add(numeroConvenioMField);

        JLabel estadoLabel = new JLabel("Estado:");
        estadoLabel.setBounds(10, 220, 100, 25);
        add(estadoLabel);

        estadoField = new JTextField();
        estadoField.setBounds(120, 220, 200, 25);
        add(estadoField);

        publicarButton = new JButton("Publicar");
        publicarButton.setBounds(10, 260, 100, 25);
        add(publicarButton);

        modificarButton = new JButton("Modificar");
        modificarButton.setBounds(120, 260, 100, 25);
        add(modificarButton);

        inactivarButton = new JButton("Inactivar");
        inactivarButton.setBounds(230, 260, 100, 25);
        add(inactivarButton);

        pasantiaList = new JList<>(pasantiaListModel);
        JScrollPane scrollPane = new JScrollPane(pasantiaList);
        scrollPane.setBounds(330, 10, 240, 275);
        add(scrollPane);

        // Listener para el botón Publicar
        publicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = codigoField.getText();
                String nombreEmpresa = nombreEmpresaField.getText();
                String fechaInicio = fechaInicioField.getText();
                String fechaFinalizacion = fechaFinalizacionField.getText();
                int numeroPasantes = Integer.parseInt(numeroPasantesField.getText());
                String descripcion = descripcionField.getText();
                String numeroConvenioM = numeroConvenioMField.getText();
                String estado = estadoField.getText();

                Pasantia nuevaPasantia = new Pasantia(codigo, nombreEmpresa, fechaInicio, fechaFinalizacion, numeroPasantes, descripcion, numeroConvenioM, estado);
                pasantias.add(nuevaPasantia);
                pasantiaListModel.addElement(nuevaPasantia);

                clearFields();
            }
        });

        // Listener para el botón Modificar
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = pasantiaList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Pasantia pasantiaSeleccionada = pasantiaListModel.getElementAt(selectedIndex);
                    pasantiaSeleccionada.setNombreEmpresa(nombreEmpresaField.getText());
                    pasantiaSeleccionada.setFechaInicio(fechaInicioField.getText());
                    pasantiaSeleccionada.setFechaFinalizacion(fechaFinalizacionField.getText());
                    pasantiaSeleccionada.setNumeroPasantes(Integer.parseInt(numeroPasantesField.getText()));
                    pasantiaSeleccionada.setDescripcion(descripcionField.getText());
                    pasantiaSeleccionada.setNumeroConvenioM(numeroConvenioMField.getText());
                    pasantiaSeleccionada.setEstado(estadoField.getText());

                    pasantiaList.repaint();
                    clearFields();
                }
            }
        });

        // Listener para el botón Inactivar
        inactivarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = pasantiaList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Pasantia pasantiaSeleccionada = pasantiaListModel.getElementAt(selectedIndex);
                    pasantiaSeleccionada.setEstado("Inactivo");

                    pasantiaList.repaint();
                }
            }
        });
    }

    private void clearFields() {
        codigoField.setText("");
        nombreEmpresaField.setText("");
        fechaInicioField.setText("");
        fechaFinalizacionField.setText("");
        numeroPasantesField.setText("");
        descripcionField.setText("");
        numeroConvenioMField.setText("");
        estadoField.setText("");
    }

}
