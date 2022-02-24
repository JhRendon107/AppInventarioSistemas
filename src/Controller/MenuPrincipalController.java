/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.FrmMenuPrincipal;


public class MenuPrincipalController {
    
    public static FrmMenuPrincipal menu = new FrmMenuPrincipal();
    public static void mostrar (){ menu.setVisible(true); }
    public static void ocultar(){ menu.setVisible(false); }
    
    public static void botonSalir(){
        ocultar();
        LoginController.mostrar();
    
    }
    
//    public static void botonSalir(){
//    
//    }
//    
//    public static void botonSalir(){
//    
//    }
    
    
}
