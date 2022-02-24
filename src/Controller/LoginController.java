/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import javax.swing.JOptionPane;

public class LoginController {
    
    public static FrmLogin formularioLogin = new FrmLogin();
    public static void mostrar() { formularioLogin.setVisible(true);}
    public static void ocultar() { formularioLogin.setVisible(false);}
    
    public static void eventoIngresarLogin(){
        
          String usuario = formularioLogin.getTxt_UsuarioLogin().getText();
          String contraseña= formularioLogin.getPass_ContraseñaLogin().getText();

          
       
           if (usuario.equals("Sistemas")&& contraseña.equals("123")){
               ocultar();

               MenuPrincipalController.mostrar();
            }
        
            else {
                 
               System.out.println();
               JOptionPane.showMessageDialog( null,"usuario o contraseña Incorrecta");
                 
                            
            }
        
   
    }
    
}
