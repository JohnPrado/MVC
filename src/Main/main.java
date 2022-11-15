
package Main;

import controlador.controlador;
import Modelo.modelo;
import Vista.vista;


public class main {
    
    
    public static void main(String[] args) {
        
        modelo model = new modelo();
        vista view = new vista();
        
        controlador ctrl = new controlador(view,model);
        ctrl.Iniciar();
        view.setVisible(true);
        
    }
    
}
