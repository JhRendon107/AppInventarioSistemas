package View;



/**
 * @author SISTEMAS
 */
public class FrmPcDesk extends javax.swing.JInternalFrame {
    
    public FrmPcDesk() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lbl_FechaEq = new javax.swing.JLabel();
        Lbl_NFacturaEq = new javax.swing.JLabel();
        Lbl_ObservacionEq = new javax.swing.JLabel();
        Txt_CodigoEq = new javax.swing.JTextField();
        Txt_ProcesadorEq = new javax.swing.JTextField();
        Txt_IdEq = new javax.swing.JTextField();
        Lbl_CodigoEq = new javax.swing.JLabel();
        Lbl_IdEq = new javax.swing.JLabel();
        Lbl_SerialEq = new javax.swing.JLabel();
        Txt_SerialEq = new javax.swing.JTextField();
        Lbl_MarcaEq = new javax.swing.JLabel();
        Txt_MarcaEq = new javax.swing.JTextField();
        Lbl_ModeloEq = new javax.swing.JLabel();
        Txt_ModeloEq = new javax.swing.JTextField();
        Lbl_RamEq = new javax.swing.JLabel();
        Txt_RamEq = new javax.swing.JTextField();
        Txt_DiscoduroEq = new javax.swing.JTextField();
        Lbl_DiscoduroEq = new javax.swing.JLabel();
        Lbl_ProcesadorEq = new javax.swing.JLabel();
        Txt_ProveedorEq = new javax.swing.JTextField();
        Cmb_EstadoEq = new javax.swing.JComboBox<>();
        Lbl_ProveedorEq = new javax.swing.JLabel();
        Lbl_EstadoEq = new javax.swing.JLabel();
        Txt_NFacturaEq = new javax.swing.JTextField();
        jDateChooser1 = new org.netbeans.modules.form.InvalidComponent();
        Lbl_WindowsEq = new javax.swing.JLabel();
        Cmb_WindowsEq = new javax.swing.JComboBox<>();
        Lbl_OfficeEq = new javax.swing.JLabel();
        Cmb_OfficeEq = new javax.swing.JComboBox<>();
        Lbl_AntivirusEq = new javax.swing.JLabel();
        Cmb_AntivirusEq = new javax.swing.JComboBox<>();
        Lbl_OLicenciasEq = new javax.swing.JLabel();
        Cmb_OLicenciasEq = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxA_ObservacionEq = new javax.swing.JTextArea();
        Btn_BuscarEq = new javax.swing.JButton();
        Btn_ActualizarEq = new javax.swing.JButton();
        Btn_NuevoEq = new javax.swing.JButton();
        Btn_IngresarEq = new javax.swing.JButton();
        Btn_LimpiarEq = new javax.swing.JButton();
        Btn_SalirEq = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setTitle("Equipos de Escritorio");

        Lbl_FechaEq.setText("Fecha de Compra");

        Lbl_NFacturaEq.setText("Nro Factura");

        Lbl_ObservacionEq.setText("Observacion");

        Lbl_CodigoEq.setText("Codigo Equipo");

        Lbl_IdEq.setText("Id Equipo");

        Lbl_SerialEq.setText("Serial");

        Lbl_MarcaEq.setText("Marca");

        Lbl_ModeloEq.setText("Modelo ");

        Lbl_RamEq.setText("Memoria Ram");

        Lbl_DiscoduroEq.setText("Disco Duro");

        Lbl_ProcesadorEq.setText("Procesador");

        Cmb_EstadoEq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Nuevo", "Bueno", "Malo" }));
        Cmb_EstadoEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_EstadoEqActionPerformed(evt);
            }
        });

        Lbl_ProveedorEq.setText("Proveedor");

        Lbl_EstadoEq.setText("Estado del equipo");

        Lbl_WindowsEq.setText("Windows");

        Cmb_WindowsEq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Nuevo", "Bueno", "Malo" }));

        Lbl_OfficeEq.setText("Office");

        Cmb_OfficeEq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Nuevo", "Bueno", "Malo" }));

        Lbl_AntivirusEq.setText("Antivirus");

        Cmb_AntivirusEq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Nuevo", "Bueno", "Malo" }));

        Lbl_OLicenciasEq.setText("Otras Licencias");

        Cmb_OLicenciasEq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Nuevo", "Bueno", "Malo" }));

        TxA_ObservacionEq.setColumns(20);
        TxA_ObservacionEq.setRows(5);
        jScrollPane1.setViewportView(TxA_ObservacionEq);

        Btn_BuscarEq.setBackground(new java.awt.Color(0, 0, 0));
        Btn_BuscarEq.setForeground(new java.awt.Color(255, 255, 255));
        Btn_BuscarEq.setText("Buscar");
        Btn_BuscarEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarEqActionPerformed(evt);
            }
        });

        Btn_ActualizarEq.setBackground(new java.awt.Color(0, 0, 0));
        Btn_ActualizarEq.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ActualizarEq.setText("Actualizar");
        Btn_ActualizarEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarEqActionPerformed(evt);
            }
        });

        Btn_NuevoEq.setBackground(new java.awt.Color(0, 0, 0));
        Btn_NuevoEq.setForeground(new java.awt.Color(255, 255, 255));
        Btn_NuevoEq.setText("Nuevo");
        Btn_NuevoEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoEqActionPerformed(evt);
            }
        });

        Btn_IngresarEq.setBackground(new java.awt.Color(0, 0, 0));
        Btn_IngresarEq.setForeground(new java.awt.Color(255, 255, 255));
        Btn_IngresarEq.setText("Ingresar");
        Btn_IngresarEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IngresarEqActionPerformed(evt);
            }
        });

        Btn_LimpiarEq.setBackground(new java.awt.Color(0, 0, 0));
        Btn_LimpiarEq.setForeground(new java.awt.Color(255, 255, 255));
        Btn_LimpiarEq.setText("Limpiar");
        Btn_LimpiarEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarEqActionPerformed(evt);
            }
        });

        Btn_SalirEq.setBackground(new java.awt.Color(0, 0, 0));
        Btn_SalirEq.setForeground(new java.awt.Color(255, 255, 255));
        Btn_SalirEq.setText("Salir");
        Btn_SalirEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirEqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_IdEq, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_IdEq, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_CodigoEq, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_CodigoEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_MarcaEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_MarcaEq, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_ModeloEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_ModeloEq, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_FechaEq, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_RamEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_RamEq, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_DiscoduroEq, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_DiscoduroEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_NFacturaEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_NFacturaEq, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_OfficeEq, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cmb_OfficeEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Lbl_OLicenciasEq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cmb_OLicenciasEq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_ProcesadorEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbl_ProveedorEq, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Txt_SerialEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_ProveedorEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_AntivirusEq, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cmb_AntivirusEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Lbl_SerialEq, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbl_EstadoEq, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmb_EstadoEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbl_ProcesadorEq, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Lbl_WindowsEq, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cmb_WindowsEq, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_ObservacionEq, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_BuscarEq, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_ActualizarEq, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_NuevoEq, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Btn_IngresarEq, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_LimpiarEq, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_SalirEq, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_IdEq)
                    .addComponent(Lbl_CodigoEq)
                    .addComponent(Lbl_SerialEq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_CodigoEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_IdEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_SerialEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_MarcaEq)
                    .addComponent(Lbl_ModeloEq)
                    .addComponent(Lbl_ProcesadorEq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_MarcaEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ModeloEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ProcesadorEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_RamEq)
                            .addComponent(Lbl_DiscoduroEq)
                            .addComponent(Lbl_EstadoEq))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_RamEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_DiscoduroEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Cmb_EstadoEq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_FechaEq)
                            .addComponent(Lbl_NFacturaEq))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Lbl_ProveedorEq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_NFacturaEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_ProveedorEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_WindowsEq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cmb_WindowsEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_OfficeEq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cmb_OfficeEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_AntivirusEq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cmb_AntivirusEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbl_OLicenciasEq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cmb_OLicenciasEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbl_ObservacionEq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_ActualizarEq)
                    .addComponent(Btn_NuevoEq)
                    .addComponent(Btn_IngresarEq)
                    .addComponent(Btn_LimpiarEq)
                    .addComponent(Btn_SalirEq)
                    .addComponent(Btn_BuscarEq))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cmb_EstadoEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_EstadoEqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cmb_EstadoEqActionPerformed

    private void Btn_BuscarEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarEqActionPerformed

        

    }//GEN-LAST:event_Btn_BuscarEqActionPerformed

    private void Btn_ActualizarEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarEqActionPerformed

//        ProyectosVO c = (ProyectosVO) Cmb_ProyectoCargo.getSelectedItem();
//        CargoVO carg = new CargoVO();
//        Integer p_carg = c.getId_proyecto();
//
//        carg.setNombre_cargo(Txt_NombreCargo.getText());
//        carg.setId_proyecto(p_carg);
//        carg.setProposito(Txta_PropositoCargo.getText());
//        carg.setDependencia(Txt_DependenciaCargo.getText());
//        carg.setId_cargo(Integer.parseInt(Txt_IdCargo.getText()));
//
//        String resp = CargoDAO.actualizarCargo(carg);
//
//        JOptionPane.showMessageDialog(null,resp);
//
//        Limpiar();
//        mostrarcargos();
    }//GEN-LAST:event_Btn_ActualizarEqActionPerformed

    private void Btn_NuevoEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoEqActionPerformed

//        Txt_NombreCargo.setEnabled(true);
//        Txta_PropositoCargo.setEnabled(true);
//        Txt_DependenciaCargo.setEnabled(true);
//        Btn_IngresarEq.setEnabled(true);
//        Btn_BuscarCargo.setEnabled(false);
//        Btn_NuevoEq.setEnabled(false);
//
//        generar_codigo();

    }//GEN-LAST:event_Btn_NuevoEqActionPerformed

    private void Btn_IngresarEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarEqActionPerformed

////        ProyectosVO c = (ProyectosVO) Cmb_ProyectoCargo.getSelectedItem();
//        PcEscritorioVO pc = new PcEscritorioVO();
////        Integer p_carg = c.getId_proyecto();
//        pc.setId_eq(Integer.parseInt(Txt_IdEq.getText()));
//        pc.setCodigo_eq(Txt_CodigoEq.getText());
//        pc.setSerial_eq(Txt_SerialEq.getText());
//        pc.setMarca_eq(Txt_MarcaEq.getText());
//        pc.setModelo_eq(Txt_ModeloEq.getText());
//        pc.setProcesador_eq(Txt_ProcesadorEq.getText());
//        pc.setRam_eq(Txt_RamEq.getText());
//        pc.setDiscoduro_eq(Txt_DiscoduroEq.getText());
//        pc.setEstado_eq(Cmb_EstadoEq.getSelectedItem());
//        
//
//        String resp = CargoDAO.registrarCargo(carg);
//
//        JOptionPane.showMessageDialog(null,resp);
//        mostrarcargos();

    }//GEN-LAST:event_Btn_IngresarEqActionPerformed

    private void Btn_LimpiarEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarEqActionPerformed

//        Limpiar();

    }//GEN-LAST:event_Btn_LimpiarEqActionPerformed

    private void Btn_SalirEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirEqActionPerformed

//        Limpiar();
//        dispose();
    }//GEN-LAST:event_Btn_SalirEqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ActualizarEq;
    private javax.swing.JButton Btn_BuscarEq;
    private javax.swing.JButton Btn_IngresarEq;
    private javax.swing.JButton Btn_LimpiarEq;
    private javax.swing.JButton Btn_NuevoEq;
    private javax.swing.JButton Btn_SalirEq;
    private javax.swing.JComboBox<String> Cmb_AntivirusEq;
    private javax.swing.JComboBox<String> Cmb_EstadoEq;
    private javax.swing.JComboBox<String> Cmb_OLicenciasEq;
    private javax.swing.JComboBox<String> Cmb_OfficeEq;
    private javax.swing.JComboBox<String> Cmb_WindowsEq;
    private javax.swing.JLabel Lbl_AntivirusEq;
    private javax.swing.JLabel Lbl_CodigoEq;
    private javax.swing.JLabel Lbl_DiscoduroEq;
    private javax.swing.JLabel Lbl_EstadoEq;
    private javax.swing.JLabel Lbl_FechaEq;
    private javax.swing.JLabel Lbl_IdEq;
    private javax.swing.JLabel Lbl_MarcaEq;
    private javax.swing.JLabel Lbl_ModeloEq;
    private javax.swing.JLabel Lbl_NFacturaEq;
    private javax.swing.JLabel Lbl_OLicenciasEq;
    private javax.swing.JLabel Lbl_ObservacionEq;
    private javax.swing.JLabel Lbl_OfficeEq;
    private javax.swing.JLabel Lbl_ProcesadorEq;
    private javax.swing.JLabel Lbl_ProveedorEq;
    private javax.swing.JLabel Lbl_RamEq;
    private javax.swing.JLabel Lbl_SerialEq;
    private javax.swing.JLabel Lbl_WindowsEq;
    private javax.swing.JTextArea TxA_ObservacionEq;
    private javax.swing.JTextField Txt_CodigoEq;
    private javax.swing.JTextField Txt_DiscoduroEq;
    private javax.swing.JTextField Txt_IdEq;
    private javax.swing.JTextField Txt_MarcaEq;
    private javax.swing.JTextField Txt_ModeloEq;
    private javax.swing.JTextField Txt_NFacturaEq;
    private javax.swing.JTextField Txt_ProcesadorEq;
    private javax.swing.JTextField Txt_ProveedorEq;
    private javax.swing.JTextField Txt_RamEq;
    private javax.swing.JTextField Txt_SerialEq;
    private org.netbeans.modules.form.InvalidComponent jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
