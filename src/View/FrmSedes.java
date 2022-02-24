
package View;

import Model.Conexion;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmSedes extends javax.swing.JInternalFrame {

     PreparedStatement ps;
     Resultset rs;
    
    private void Limpiartextos(){
    
    //Txt_IdSede.setText (null);
    //Txt_IdSede.setText (null);
    //Txt_IdSede.setText (null);
    //Txt_IdSede.setText (null);
    //Txt_IdSede.setText (null);
    
    }
     
    public FrmSedes() {
        initComponents();
        
        mostrardatos("");
        
//        this.Tabla_Sedes.setModel(modelo);
//        this.modelo.addColumn("Id");
//        this.modelo.addColumn("Nombre");
//        this.modelo.addColumn("Codigo Contrato");
//        this.modelo.addColumn("Direccion");
//        this.modelo.addColumn("Observacion");
        
    }

     void mostrardatos(String valor){
         
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Id");
    modelo.addColumn("Nombre");
    modelo.addColumn("Codigo Contrato");
    modelo.addColumn("Direccion");
    modelo.addColumn("Observacion");
    
    Tabla_Sedes.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM sedes";
    }
    else{
        sql="SELECT * FROM sedes WHERE Id_Sede='"+valor+"'";
    }
 
//    String []datos = new String [5];
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while(rs.next()){
//                datos[0]=rs.getString(1);
//                datos[1]=rs.getString(2);
//                datos[2]=rs.getString(3);
//                datos[3]=rs.getString(4);
//                datos[4]=rs.getString(5);
//                modelo.addRow(datos);
//            }
//            Tabla_Sedes.setModel(modelo);
//        } catch (SQLException ex) {
//            Logger.getLogger(FrmSedes.class.getName()).log(Level.SEVERE, null, ex);
//        }
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Btn_IngresarSede = new javax.swing.JButton();
        Btn_ModificarSede = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Txt_ObservacionSede = new javax.swing.JTextField();
        Txt_CodigoContratoSede = new javax.swing.JTextField();
        Btn_EliminarSede = new javax.swing.JButton();
        Txt_NombreSede = new javax.swing.JTextField();
        Txt_DireccionSede = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Btn_LimpiarSede = new javax.swing.JButton();
        Btn_SalirSede = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Sedes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Txt_IdSede = new javax.swing.JTextField();

        jLabel4.setText("Direccion");

        Btn_IngresarSede.setText("Ingresar");
        Btn_IngresarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IngresarSedeActionPerformed(evt);
            }
        });

        Btn_ModificarSede.setText("Modificar");
        Btn_ModificarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModificarSedeActionPerformed(evt);
            }
        });

        jLabel14.setText("Observacion");

        Btn_EliminarSede.setText("Eliminar");
        Btn_EliminarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarSedeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Sede");

        jLabel3.setText("Codigo del contrato");

        Btn_LimpiarSede.setText("Limpiar");
        Btn_LimpiarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarSedeActionPerformed(evt);
            }
        });

        Btn_SalirSede.setText("Salir");
        Btn_SalirSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirSedeActionPerformed(evt);
            }
        });

        Tabla_Sedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Sedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_SedesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Sedes);

        jLabel5.setText("Id Sede");

        Txt_IdSede.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_ObservacionSede, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_NombreSede, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Txt_DireccionSede, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_CodigoContratoSede, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(Txt_IdSede, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_ModificarSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_IngresarSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_LimpiarSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_EliminarSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_SalirSede, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_IngresarSede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_LimpiarSede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_ModificarSede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_EliminarSede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_SalirSede))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_IdSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_NombreSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Txt_CodigoContratoSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_DireccionSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_ObservacionSede, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//    DefaultTableModel modelo = new DefaultTableModel();
    
    private void Btn_IngresarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarSedeActionPerformed
     
            
//      try { 
//      
//            ps = cn.prepareStatement("INSERT INTO sedes ( Nombre_Sede, Codigo_Contrato, Direccion, Observacion) VALUES(?,?,?,?) ");
//            ps.setString(1, Txt_NombreSede.getText());
//            ps.setString(2, Txt_CodigoContratoSede.getText());
//            ps.setString(3, Txt_DireccionSede.getText());
//            ps.setString(4, Txt_ObservacionSede.getText());
//            
//             int res = ps.executeUpdate();
//             
//                        
//             mostrardatos("");
//                          
//             if(res > 0){
//               JOptionPane.showMessageDialog(null, "Datos Guerdados"); 
//             } else{
//               JOptionPane.showMessageDialog(null, "no se guardaron los datos");
//             }          
//            
//             cn.close();
//             
//        } catch (Exception e){         
//            System.err.println(e);
//            
//      } 
        
     
    }//GEN-LAST:event_Btn_IngresarSedeActionPerformed

    private void Btn_LimpiarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarSedeActionPerformed
        
    Txt_IdSede.setText("");
    Txt_NombreSede.setText("");
    Txt_CodigoContratoSede.setText("");
    Txt_DireccionSede.setText("");
    Txt_ObservacionSede.setText("");
      
    }//GEN-LAST:event_Btn_LimpiarSedeActionPerformed

    private void Btn_SalirSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirSedeActionPerformed
        
    Txt_IdSede.setText("");
    Txt_NombreSede.setText("");
    Txt_CodigoContratoSede.setText("");
    Txt_DireccionSede.setText("");
    Txt_ObservacionSede.setText("");
        
        dispose();
        
    }//GEN-LAST:event_Btn_SalirSedeActionPerformed

    private void Btn_ModificarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarSedeActionPerformed
        
//         try {
//        PreparedStatement pst = cn.prepareStatement("UPDATE sedes SET Nombre_Sede='"+Txt_NombreSede.getText()+"',Codigo_Contrato='"+Txt_CodigoContratoSede.getText()+"',Direccion='"+Txt_DireccionSede.getText()+"',Observacion='"+Txt_ObservacionSede.getText()+"' WHERE Id_Sede='"+Txt_IdSede.getText()+"'");
//                      
//        pst.executeUpdate();
//        mostrardatos("");
//        
//    } catch (Exception e) {
//        System.out.print(e.getMessage());  
//    }
        
    }//GEN-LAST:event_Btn_ModificarSedeActionPerformed

    private void Tabla_SedesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_SedesMouseClicked
        int fila= Tabla_Sedes.getSelectedRow();
        if(fila>=0){
        Txt_IdSede.setText(Tabla_Sedes.getValueAt(fila, 0).toString());
        Txt_NombreSede.setText(Tabla_Sedes.getValueAt(fila, 1).toString());
        Txt_CodigoContratoSede.setText(Tabla_Sedes.getValueAt(fila, 2).toString());
        Txt_DireccionSede.setText(Tabla_Sedes.getValueAt(fila, 3).toString());
        Txt_ObservacionSede.setText(Tabla_Sedes.getValueAt(fila, 4).toString());
    }
    else{
    JOptionPane.showMessageDialog(null,"no seleciono fila");
    }
    }//GEN-LAST:event_Tabla_SedesMouseClicked

    private void Btn_EliminarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarSedeActionPerformed
//     int fila = Tabla_Sedes.getSelectedRow();
//    String id="";
//    id=Tabla_Sedes.getValueAt(fila, 0).toString();
//    
//    try {
//        PreparedStatement pst = cn.prepareStatement("DELETE FROM sedes WHERE  Id_Sede='"+id+"'");
//        pst.executeUpdate();
//        mostrardatos("");
//    } catch (Exception e) {
//    }
    }//GEN-LAST:event_Btn_EliminarSedeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_EliminarSede;
    private javax.swing.JButton Btn_IngresarSede;
    private javax.swing.JButton Btn_LimpiarSede;
    private javax.swing.JButton Btn_ModificarSede;
    private javax.swing.JButton Btn_SalirSede;
    private javax.swing.JTable Tabla_Sedes;
    private javax.swing.JTextField Txt_CodigoContratoSede;
    private javax.swing.JTextField Txt_DireccionSede;
    private javax.swing.JTextField Txt_IdSede;
    private javax.swing.JTextField Txt_NombreSede;
    private javax.swing.JTextField Txt_ObservacionSede;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

//     Conectar con = new Conectar();
//     //INVOCAMOS AL METODO CONEXION
//     Connection cn = con.Conectar(); 


}
