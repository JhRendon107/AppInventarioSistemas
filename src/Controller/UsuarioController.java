
package Controller;


import Model.ConsultasUsuario;
import Model.UsuarioModel;

import View.FrmUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class UsuarioController implements ActionListener{
    
    public static FrmUsuario usuario = new FrmUsuario();
    public static void mostrar (){ usuario.setVisible(true); }
    
    
    
    private UsuarioModel mod;
    private ConsultasUsuario conM;
    private FrmUsuario frm;
    
    public UsuarioController (UsuarioModel mod, ConsultasUsuario conM, FrmUsuario frm) {
    
        this.mod = mod;
        this.conM = conM;
        this.frm = frm;
        this.frm.Btn_BuscarUsuario.addActionListener(this);
        this.frm.Btn_ActualizarUsuario.addActionListener(this);
        this.frm.Btn_NuevoUsuario.addActionListener(this);
        this.frm.Btn_IngresarUsuario.addActionListener(this);
        this.frm.Btn_LimpiarUsuario.addActionListener(this);
    }
    
    public void iniciar(){
        frm.setTitle("Usuarios");
//        frm.setLocationRelativeTo(null);
//        frm.Txt_IdUsuario.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
        if (e.getSource() == frm.Btn_IngresarUsuario){
            
            mod.setId_Usuario(Integer.parseInt(frm.Txt_IdUsuario.getText()));
            mod.setCedula ( Long.parseLong(frm.Txt_CedulaUsuario.getText()));
            mod.setNombre(frm.Txt_NombreUsuario.getText());
            mod.setCelular(Integer.parseInt(frm.Txt_CedulaUsuario.getText()));
            
            if(conM.registrar(mod)){
            
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else{
            
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.Btn_ActualizarUsuario){
            
            mod.setId_Usuario(Integer.parseInt(frm.Txt_IdUsuario.getText()));
            mod.setCedula ( Long.parseLong(frm.Txt_CedulaUsuario.getText()));
            mod.setNombre(frm.Txt_NombreUsuario.getText());
            mod.setCelular(Integer.parseInt(frm.Txt_CedulaUsuario.getText()));
            
            if(conM.modificar(mod)){
            
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else{
            
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.Btn_BuscarUsuario){
            
            mod.setCedula ( Long.parseLong(frm.Txt_CedulaUsuario.getText()));
            
            
            if(conM.buscar(mod)){
            
                frm.Txt_IdUsuario.setText(String.valueOf(mod.getId_Usuario()));
                frm.Txt_NombreUsuario.setText(mod.getNombre());
                frm.Txt_CelularUsuario.setText(String.valueOf(mod.getId_Usuario()));
                                
            } else{
            
                JOptionPane.showMessageDialog(null, "No se encontro el registro");
                limpiar();
            }
        }
        
         if (e.getSource() == frm.Btn_LimpiarUsuario){
             
             limpiar();
         }
    }
    
    
    public void limpiar(){
    
        frm.Txt_IdUsuario.setText(null);
        frm.Txt_CedulaUsuario.setText(null);
        frm.Txt_NombreUsuario.setText(null);
        frm.Txt_CelularUsuario.setText(null);
    }
    
}
