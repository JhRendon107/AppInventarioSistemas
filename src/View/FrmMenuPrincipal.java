
package View;

import Controller.MenuPrincipalController;
import Controller.PcDeskController;
import Controller.UsuarioController;
import Model.ConsultasUsuario;
import Model.UsuarioModel;
import java.awt.Color;
import java.awt.Image;


/**
 *
 * @author SISTEMAS_2
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    
    private Image cooreo;
    
    public FrmMenuPrincipal() {
        initComponents();
        
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblLogo = new javax.swing.JLabel();
        MenuBarPrincipal = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        ArchivoInicio = new javax.swing.JMenuItem();
        MenuNuevo_MAR = new javax.swing.JMenuItem();
        MenuBuscar_MAR = new javax.swing.JMenuItem();
        MenuSalir_MAR = new javax.swing.JMenuItem();
        MenuHardware = new javax.swing.JMenu();
        HardwareCpu = new javax.swing.JMenuItem();
        HardwareMonitores = new javax.swing.JMenuItem();
        HardwareEqPortatil = new javax.swing.JMenuItem();
        HardwareImpresoras = new javax.swing.JMenuItem();
        HardwareTelefonos = new javax.swing.JMenuItem();
        HardwareMovimientos = new javax.swing.JMenuItem();
        MenuSoftware = new javax.swing.JMenu();
        SoftwareWindows = new javax.swing.JMenuItem();
        SoftwareOffice = new javax.swing.JMenuItem();
        SoftwareAntivirus = new javax.swing.JMenuItem();
        SoftwareOLicencias = new javax.swing.JMenuItem();
        SoftwareMovimientos = new javax.swing.JMenuItem();
        MenuToner = new javax.swing.JMenu();
        TonerReferencia = new javax.swing.JMenuItem();
        TonerAsignaciones = new javax.swing.JMenuItem();
        MenuBodega = new javax.swing.JMenu();
        MenuUsuarios = new javax.swing.JMenu();
        MenuUsuarios_MU = new javax.swing.JMenuItem();
        MenuSedes = new javax.swing.JMenu();
        MenuNuevaSede = new javax.swing.JMenuItem();
        MenuActas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(cooreo);

        LblLogo.setIcon(new javax.swing.ImageIcon("S:\\SISTEMAS\\DESARROLLO DE MACROS-BORRADOR\\IMAGENES\\logo consultel S.A.S negro.jpg")); // NOI18N

        MenuArchivo.setText("Archivo");

        ArchivoInicio.setText("Inicio");
        ArchivoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoInicioActionPerformed(evt);
            }
        });
        MenuArchivo.add(ArchivoInicio);

        MenuNuevo_MAR.setText("Nuevo");
        MenuNuevo_MAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNuevo_MARActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuNuevo_MAR);

        MenuBuscar_MAR.setText("Buscar");
        MenuArchivo.add(MenuBuscar_MAR);

        MenuSalir_MAR.setText("Salir");
        MenuSalir_MAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalir_MARActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuSalir_MAR);

        MenuBarPrincipal.add(MenuArchivo);

        MenuHardware.setText("Hardware");

        HardwareCpu.setText("Cpu");
        HardwareCpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardwareCpuActionPerformed(evt);
            }
        });
        MenuHardware.add(HardwareCpu);

        HardwareMonitores.setText("Monitores");
        HardwareMonitores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardwareMonitoresActionPerformed(evt);
            }
        });
        MenuHardware.add(HardwareMonitores);

        HardwareEqPortatil.setText("Equipos portatil");
        HardwareEqPortatil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardwareEqPortatilActionPerformed(evt);
            }
        });
        MenuHardware.add(HardwareEqPortatil);

        HardwareImpresoras.setText("Impresoras");
        HardwareImpresoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardwareImpresorasActionPerformed(evt);
            }
        });
        MenuHardware.add(HardwareImpresoras);

        HardwareTelefonos.setText("Telefonos IP");
        MenuHardware.add(HardwareTelefonos);

        HardwareMovimientos.setText("Movimientos");
        MenuHardware.add(HardwareMovimientos);

        MenuBarPrincipal.add(MenuHardware);

        MenuSoftware.setText("Software");

        SoftwareWindows.setText("Windows");
        MenuSoftware.add(SoftwareWindows);

        SoftwareOffice.setText("Office");
        MenuSoftware.add(SoftwareOffice);

        SoftwareAntivirus.setText("Antivirus");
        MenuSoftware.add(SoftwareAntivirus);

        SoftwareOLicencias.setText("Otras licencias");
        MenuSoftware.add(SoftwareOLicencias);

        SoftwareMovimientos.setText("Movimientos");
        MenuSoftware.add(SoftwareMovimientos);

        MenuBarPrincipal.add(MenuSoftware);

        MenuToner.setText("Toner");

        TonerReferencia.setText("Referencia");
        MenuToner.add(TonerReferencia);

        TonerAsignaciones.setText("Asignaciones");
        TonerAsignaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TonerAsignacionesActionPerformed(evt);
            }
        });
        MenuToner.add(TonerAsignaciones);

        MenuBarPrincipal.add(MenuToner);

        MenuBodega.setText("Bodega");
        MenuBarPrincipal.add(MenuBodega);

        MenuUsuarios.setText("Usuarios");

        MenuUsuarios_MU.setText("Usuario");
        MenuUsuarios_MU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuarios_MUActionPerformed(evt);
            }
        });
        MenuUsuarios.add(MenuUsuarios_MU);

        MenuBarPrincipal.add(MenuUsuarios);

        MenuSedes.setText("Sedes");

        MenuNuevaSede.setText("Nueva Sede");
        MenuNuevaSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNuevaSedeActionPerformed(evt);
            }
        });
        MenuSedes.add(MenuNuevaSede);

        MenuBarPrincipal.add(MenuSedes);

        MenuActas.setText("Actas");

        jMenuItem1.setText("Asignaciones");
        MenuActas.add(jMenuItem1);

        jMenuItem2.setText("Devoluciones");
        MenuActas.add(jMenuItem2);

        jMenuItem3.setText("Movimientos");
        MenuActas.add(jMenuItem3);

        MenuBarPrincipal.add(MenuActas);

        jMenu1.setText("Correos");
        MenuBarPrincipal.add(jMenu1);

        setJMenuBar(MenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(812, Short.MAX_VALUE)
                .addComponent(LblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(508, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSalir_MARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalir_MARActionPerformed
        MenuPrincipalController.botonSalir();
        
    }//GEN-LAST:event_MenuSalir_MARActionPerformed

    private void ArchivoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoInicioActionPerformed
       
        
    }//GEN-LAST:event_ArchivoInicioActionPerformed

    private void HardwareEqPortatilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardwareEqPortatilActionPerformed
       
        
    }//GEN-LAST:event_HardwareEqPortatilActionPerformed

    private void HardwareCpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardwareCpuActionPerformed
        PcDeskController.mostrar();
        
    }//GEN-LAST:event_HardwareCpuActionPerformed

    private void HardwareMonitoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardwareMonitoresActionPerformed
            
    }//GEN-LAST:event_HardwareMonitoresActionPerformed

    private void HardwareImpresorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardwareImpresorasActionPerformed
       
    }//GEN-LAST:event_HardwareImpresorasActionPerformed

    private void TonerAsignacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TonerAsignacionesActionPerformed
     
    }//GEN-LAST:event_TonerAsignacionesActionPerformed

    private void MenuNuevo_MARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNuevo_MARActionPerformed
                
    }//GEN-LAST:event_MenuNuevo_MARActionPerformed

    private void MenuUsuarios_MUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuarios_MUActionPerformed
        UsuarioController.mostrar();
    }//GEN-LAST:event_MenuUsuarios_MUActionPerformed

    private void MenuNuevaSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNuevaSedeActionPerformed
        
        
    }//GEN-LAST:event_MenuNuevaSedeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
                
        java.awt.EventQueue.invokeLater(() -> {
            new FrmMenuPrincipal().setVisible(true);
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ArchivoInicio;
    private javax.swing.JMenuItem HardwareCpu;
    private javax.swing.JMenuItem HardwareEqPortatil;
    private javax.swing.JMenuItem HardwareImpresoras;
    private javax.swing.JMenuItem HardwareMonitores;
    private javax.swing.JMenuItem HardwareMovimientos;
    private javax.swing.JMenuItem HardwareTelefonos;
    private javax.swing.JLabel LblLogo;
    private javax.swing.JMenu MenuActas;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenuBar MenuBarPrincipal;
    private javax.swing.JMenu MenuBodega;
    private javax.swing.JMenuItem MenuBuscar_MAR;
    private javax.swing.JMenu MenuHardware;
    private javax.swing.JMenuItem MenuNuevaSede;
    private javax.swing.JMenuItem MenuNuevo_MAR;
    private javax.swing.JMenuItem MenuSalir_MAR;
    private javax.swing.JMenu MenuSedes;
    private javax.swing.JMenu MenuSoftware;
    private javax.swing.JMenu MenuToner;
    private javax.swing.JMenu MenuUsuarios;
    private javax.swing.JMenuItem MenuUsuarios_MU;
    private javax.swing.JMenuItem SoftwareAntivirus;
    private javax.swing.JMenuItem SoftwareMovimientos;
    private javax.swing.JMenuItem SoftwareOLicencias;
    private javax.swing.JMenuItem SoftwareOffice;
    private javax.swing.JMenuItem SoftwareWindows;
    private javax.swing.JMenuItem TonerAsignaciones;
    private javax.swing.JMenuItem TonerReferencia;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
