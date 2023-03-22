package conversor_de_monedas;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conversor_de_Monedas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Se definen variables y se asignan los valores correspondientes.
        float resultadoConversion, valorPrincipal;
        int repetir;
        Component frame = null;
        String[] seleccionConversor = {" ", "Conversor de moneda", "Conversor de temperatura"};
        String[] monedaPrincipal = {" ", "Peso Colombiano", "Dolar", "Euro", "Libra Esterlina", "Yen Japones", "Won sul-coreano "};
        String[] monedaSecundaria = {" ", "Peso Colombiano", "Dolar", "Euro", "Libra Esterlina", "Yen (Japones)", "Won (sul-coreano) "};

        //Saludo Inicial por utilizar el Software.
        JOptionPane.showMessageDialog(frame, "Bienvenidos al Conversor Mundial.", "Bienvenidos", JOptionPane.INFORMATION_MESSAGE, null);

        //Se solicita hacer selección del tipo de conversión que desea realizar.
        Object tipoConversor = JOptionPane.showInputDialog(frame, "Elija de las opciones: ", "Hacer seleccion",
                JOptionPane.INFORMATION_MESSAGE, null, seleccionConversor, null);

        if (tipoConversor == "Conversor de moneda") {

            //Se solicita elegir el tipo de la moneda que quiere convertir.
            Object deMonedaPrincipal = JOptionPane.showInputDialog(frame, "Tipo de moneda de la que quiere convertir: ", "Moneda Principal", JOptionPane.PLAIN_MESSAGE, null, monedaPrincipal, monedaPrincipal);

            //Se solicita digitar el valor que desea convertir segun el tipo de moneda principal elegido.
            valorPrincipal = Float.parseFloat(JOptionPane.showInputDialog(frame, "Digite el valor a convertir: ", "Valor a convertir", -1));

            //Se solicita elegir el tipo de la moneda a la que quiere convertir.
            Object aMonedaSecundaria = JOptionPane.showInputDialog(frame, "Tipo de moneda a la que quiere convertir", "Moneda Secundaria", JOptionPane.PLAIN_MESSAGE, null, monedaSecundaria, monedaSecundaria);
            


        }

    }

}
