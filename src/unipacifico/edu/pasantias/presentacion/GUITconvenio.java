/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipacifico.edu.pasantias.presentacion;

/**
 *
 * @author 57315
 */
public class GUITconvenio extends javax.swing.JPanel {

    /**
     * Creates new form GUITconvenio
     */
    public GUITconvenio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConvenios = new javax.swing.JPanel();
        etiquetaNumeroConvenio = new javax.swing.JLabel();
        etiquetaFechaInicio = new javax.swing.JLabel();
        etiquetaFechaFinalizacion = new javax.swing.JLabel();
        etiquetaNombreEmpresa = new javax.swing.JLabel();
        etiquetaCorreo = new javax.swing.JLabel();
        etiquetaRepresentante = new javax.swing.JLabel();
        etiquetaArchivoConvenio = new javax.swing.JLabel();
        campoNumeroConvenio = new javax.swing.JTextField();
        campoFechaInicio = new javax.swing.JTextField();
        campoFechaFinalizacion = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        campoRepresentante = new javax.swing.JTextField();
        campoArchivoConvenio = new javax.swing.JTextField();
        botonCrear = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonInactivar = new javax.swing.JButton();
        ListaConvenios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConvenios = new javax.swing.JTable();

        PanelConvenios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Convenios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 13), new java.awt.Color(51, 153, 255))); // NOI18N
        PanelConvenios.setMinimumSize(new java.awt.Dimension(0, 0));
        PanelConvenios.setPreferredSize(new java.awt.Dimension(541, 353));

        etiquetaNumeroConvenio.setText("Numero Convenio");

        etiquetaFechaInicio.setText("Fecha Inicio");

        etiquetaFechaFinalizacion.setText("Fecha Finalizacion");

        etiquetaNombreEmpresa.setText("Nombre Empresa");

        etiquetaCorreo.setText("Correo");

        etiquetaRepresentante.setText("Representante");

        etiquetaArchivoConvenio.setText("Archivo Convenio");

        campoNumeroConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroConvenioActionPerformed(evt);
            }
        });

        botonCrear.setText("Crear");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");

        botonInactivar.setText("Inactivar");

        javax.swing.GroupLayout PanelConveniosLayout = new javax.swing.GroupLayout(PanelConvenios);
        PanelConvenios.setLayout(PanelConveniosLayout);
        PanelConveniosLayout.setHorizontalGroup(
            PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConveniosLayout.createSequentialGroup()
                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConveniosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelConveniosLayout.createSequentialGroup()
                                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaNumeroConvenio)
                                    .addComponent(etiquetaFechaInicio))
                                .addGap(79, 79, 79)
                                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNumeroConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelConveniosLayout.createSequentialGroup()
                                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaNombreEmpresa)
                                    .addComponent(etiquetaArchivoConvenio)
                                    .addComponent(etiquetaRepresentante)
                                    .addComponent(etiquetaCorreo)
                                    .addComponent(etiquetaFechaFinalizacion))
                                .addGap(76, 76, 76)
                                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoFechaFinalizacion)
                                    .addComponent(campoCorreo)
                                    .addComponent(jTextField4)
                                    .addComponent(campoRepresentante)
                                    .addComponent(campoArchivoConvenio)))))
                    .addGroup(PanelConveniosLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(botonCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonInactivar)))
                .addGap(0, 90, Short.MAX_VALUE))
        );
        PanelConveniosLayout.setVerticalGroup(
            PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConveniosLayout.createSequentialGroup()
                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNumeroConvenio)
                    .addComponent(campoNumeroConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaFechaInicio)
                    .addComponent(campoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaFechaFinalizacion)
                    .addComponent(campoFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombreEmpresa)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCorreo)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaRepresentante)
                    .addComponent(campoRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaArchivoConvenio)
                    .addComponent(campoArchivoConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(PanelConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrear)
                    .addComponent(botonModificar)
                    .addComponent(botonInactivar))
                .addContainerGap())
        );

        ListaConvenios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado Convenios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 13), new java.awt.Color(51, 153, 255))); // NOI18N
        ListaConvenios.setMinimumSize(new java.awt.Dimension(0, 0));

        TablaConvenios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nuevo Convenio", "Fecha Inicio", "Fecha Finalizacion", "Nombre Empresa", "Correo", "Representante", "Archivo Convenio"
            }
        ));
        jScrollPane1.setViewportView(TablaConvenios);

        javax.swing.GroupLayout ListaConveniosLayout = new javax.swing.GroupLayout(ListaConvenios);
        ListaConvenios.setLayout(ListaConveniosLayout);
        ListaConveniosLayout.setHorizontalGroup(
            ListaConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaConveniosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
        ListaConveniosLayout.setVerticalGroup(
            ListaConveniosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaConveniosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelConvenios, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListaConvenios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(PanelConvenios, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListaConvenios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoNumeroConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroConvenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumeroConvenioActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ListaConvenios;
    private javax.swing.JPanel PanelConvenios;
    private javax.swing.JTable TablaConvenios;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonInactivar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField campoArchivoConvenio;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoFechaFinalizacion;
    private javax.swing.JTextField campoFechaInicio;
    private javax.swing.JTextField campoNumeroConvenio;
    private javax.swing.JTextField campoRepresentante;
    private javax.swing.JLabel etiquetaArchivoConvenio;
    private javax.swing.JLabel etiquetaCorreo;
    private javax.swing.JLabel etiquetaFechaFinalizacion;
    private javax.swing.JLabel etiquetaFechaInicio;
    private javax.swing.JLabel etiquetaNombreEmpresa;
    private javax.swing.JLabel etiquetaNumeroConvenio;
    private javax.swing.JLabel etiquetaRepresentante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
