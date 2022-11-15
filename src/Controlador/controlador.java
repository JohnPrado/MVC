
package controlador;

import java.awt.event.*;
import Modelo.modelo;
import Vista.vista;



public class controlador implements ActionListener{

    public vista vista;
    public modelo modelo;

        
    public controlador(vista vista, modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnSuma.addActionListener(this);
        this.vista.btnResta.addActionListener(this);
        this.vista.btnMultiplicar.addActionListener(this);
        this.vista.btnDividir.addActionListener(this);

    }

    public void Iniciar() {
        vista.setLocationRelativeTo(null);
        vista.txtNumeroUno.setText(String.valueOf(modelo.getNumeroDos()));
        vista.txtNumeroDos.setText(String.valueOf(modelo.getNumeroDos()));
        vista.txtResultado.setText(String.valueOf(modelo.getOperador()));
    }

    public void actionPerformed(ActionEvent e) {
        modelo.setNumeroUno(Integer.parseInt(vista.txtNumeroUno.getText()));
        modelo.setNumeroDos(Integer.parseInt(vista.txtNumeroDos.getText()));
        if (e.getSource() == vista.btnSuma) {
            modelo.setOperador("+");
        }
        if (e.getSource() == vista.btnResta) {
            modelo.setOperador("-");
        }
        if (e.getSource() == vista.btnMultiplicar) {
            modelo.setOperador("*");
        }
        if (e.getSource() == vista.btnDividir) {
            modelo.setOperador("/");
        }
        vista.txtResultado.setText(String.valueOf(modelo.operacion()));
    }

}

