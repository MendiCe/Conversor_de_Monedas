
package conversor_de_monedas;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conversor_de_Monedas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Se definen variables y se asignan los valores correspondientes.
        int seleccionCambio;
        Component frame = null;
        String [] seleccionConversor = {" ","Conversor de moneda", "Conversor de temperatura"};
        
        //Saludo Inicial por utilizar el Software.
        JOptionPane.showMessageDialog(frame, "Bienvenidos al Conversor Mundial.", "Bienvenidos", JOptionPane.INFORMATION_MESSAGE, null);
        
        //Se solicita hacer selección del tipo de conversión que desea realizar.
        Object opcionElegida = JOptionPane.showInputDialog(frame, "Elija de las opciones: ", "Hacer seleccion"
                , JOptionPane.INFORMATION_MESSAGE,null, seleccionConversor,null);
        
        
                
    }

}
