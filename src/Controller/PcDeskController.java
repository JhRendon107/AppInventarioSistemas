
package Controller;

import static Controller.MenuPrincipalController.ocultar;
import View.FrmPcDesk;


public class PcDeskController {
    
    public static FrmPcDesk desk = new FrmPcDesk();
    public static void mostrar (){ desk.setVisible(true); }
    public static void ocultar(){ desk.setVisible(false); }
    public static void botonSalir(){
        ocultar();
            
    }
    
}
