
package View;

import Controller.UsuarioController;
import Model.Conexion;
import Model.ConsultasUsuario;
import Model.UsuarioModel;


public class FrmUsuario extends javax.swing.JInternalFrame {
    
        UsuarioModel mod = new UsuarioModel();
        ConsultasUsuario conM = new ConsultasUsuario();
        FrmUsuario frm = new FrmUsuario();
        
        UsuarioController ctrl = new UsuarioController(mod, conM, frm);
//        ctrl.iniciar();
    
        
   
    public FrmUsuario() {
        initComponents();
                    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txt_NombreUsuario = new javax.swing.JTextField();
        Txt_CelularUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_IdUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Txt_CedulaUsuario = new javax.swing.JTextField();
        Btn_BuscarUsuario = new javax.swing.JButton();
        Btn_ActualizarUsuario = new javax.swing.JButton();
        Btn_NuevoUsuario = new javax.swing.JButton();
        Btn_IngresarUsuario = new javax.swing.JButton();
        Btn_LimpiarUsuario = new javax.swing.JButton();
        Btn_SalirUsuario = new javax.swing.JButton();

        Txt_CelularUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CelularUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Celular");

        Txt_IdUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_IdUsuarioKeyTyped(evt);
            }
        });

        jLabel7.setText("Id de Usuario");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuarios.jpg"))); // NOI18N

        jLabel9.setText("Cedula");

        Btn_BuscarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        Btn_BuscarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        Btn_BuscarUsuario.setText("Buscar");
        Btn_BuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarUsuarioActionPerformed(evt);
            }
        });

        Btn_ActualizarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        Btn_ActualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ActualizarUsuario.setText("Actualizar");
        Btn_ActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarUsuarioActionPerformed(evt);
            }
        });

        Btn_NuevoUsuario.setBackground(new java.awt.Color(0, 0, 0));
        Btn_NuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        Btn_NuevoUsuario.setText("Nuevo");
        Btn_NuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoUsuarioActionPerformed(evt);
            }
        });

        Btn_IngresarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        Btn_IngresarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        Btn_IngresarUsuario.setText("Ingresar");
        Btn_IngresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IngresarUsuarioActionPerformed(evt);
            }
        });

        Btn_LimpiarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        Btn_LimpiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        Btn_LimpiarUsuario.setText("Limpiar");
        Btn_LimpiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarUsuarioActionPerformed(evt);
            }
        });

        Btn_SalirUsuario.setBackground(new java.awt.Color(0, 0, 0));
        Btn_SalirUsuario.setForeground(new java.awt.Color(255, 255, 255));
        Btn_SalirUsuario.setText("Salir");
        Btn_SalirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Txt_IdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(200, 200, 200)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_NombreUsuario)
                                .addComponent(Txt_CelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(Txt_CedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_BuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_LimpiarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_SalirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_ActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_NuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Btn_IngresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_IdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_CedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_CelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_ActualizarUsuario)
                    .addComponent(Btn_NuevoUsuario)
                    .addComponent(Btn_IngresarUsuario)
                    .addComponent(Btn_BuscarUsuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_LimpiarUsuario)
                    .addComponent(Btn_SalirUsuario))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_IdUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_IdUsuarioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
        
    }//GEN-LAST:event_Txt_IdUsuarioKeyTyped

    private void Btn_BuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarUsuarioActionPerformed

    }//GEN-LAST:event_Btn_BuscarUsuarioActionPerformed

    private void Btn_ActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarUsuarioActionPerformed

    }//GEN-LAST:event_Btn_ActualizarUsuarioActionPerformed

    private void Btn_NuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoUsuarioActionPerformed

  
    }//GEN-LAST:event_Btn_NuevoUsuarioActionPerformed

    private void Btn_IngresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarUsuarioActionPerformed


    }//GEN-LAST:event_Btn_IngresarUsuarioActionPerformed

    private void Btn_LimpiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarUsuarioActionPerformed

       
    }//GEN-LAST:event_Btn_LimpiarUsuarioActionPerformed

    private void Btn_SalirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirUsuarioActionPerformed
  
    }//GEN-LAST:event_Btn_SalirUsuarioActionPerformed

    private void Txt_CelularUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CelularUsuarioActionPerformed
        
    }//GEN-LAST:event_Txt_CelularUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_ActualizarUsuario;
    public javax.swing.JButton Btn_BuscarUsuario;
    public javax.swing.JButton Btn_IngresarUsuario;
    public javax.swing.JButton Btn_LimpiarUsuario;
    public javax.swing.JButton Btn_NuevoUsuario;
    public javax.swing.JButton Btn_SalirUsuario;
    public javax.swing.JTextField Txt_CedulaUsuario;
    public javax.swing.JTextField Txt_CelularUsuario;
    public javax.swing.JTextField Txt_IdUsuario;
    public javax.swing.JTextField Txt_NombreUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
