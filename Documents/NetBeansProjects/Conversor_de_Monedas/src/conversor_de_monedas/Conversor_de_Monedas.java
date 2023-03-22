package conversor_de_monedas;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;

public class Conversor_de_Monedas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Se definen variables y se asignan los valores correspondientes.
        float resultadoConversion, valorPrincipal;
        int repetir = 3;
        Component frame = null;
        String[] seleccionConversor = {" ", "Conversor de moneda", "Conversor de temperatura"};
        String[] monedaPrincipal = {" ", "Peso Colombiano", "Dolar", "Euro", "Libra Esterlina", "Yen (Japones)", "Won (sul-coreano)"};
        String[] monedaSecundaria = {" ", "Peso Colombiano", "Dolar", "Euro", "Libra Esterlina", "Yen (Japones)", "Won (sul-coreano)"};

        //Saludo Inicial por utilizar el Software.
        JOptionPane.showMessageDialog(frame, "Bienvenidos al Conversor Mundial.", "Bienvenidos", JOptionPane.INFORMATION_MESSAGE, null);
        do {
            //Se solicita hacer selección del tipo de conversión que desea realizar.
            Object tipoConversor = JOptionPane.showInputDialog(frame, "Elija de las opciones: ", "Tipo de Conversor",
                    JOptionPane.INFORMATION_MESSAGE, null, seleccionConversor, null);

            if (tipoConversor == null) {
                break;
            }
            if (tipoConversor == "Conversor de moneda") {

                //Se solicita elegir el tipo de la moneda que quiere convertir.
                Object deMonedaPrincipal = JOptionPane.showInputDialog(frame, "Tipo de moneda de la que quiere convertir: ", "Moneda Principal", JOptionPane.PLAIN_MESSAGE, null, monedaPrincipal, monedaPrincipal);
                if (deMonedaPrincipal == null) {
                    break;
                }
                //Se solicita digitar el valor que desea convertir segun el tipo de moneda principal elegido.
                valorPrincipal = Float.parseFloat(JOptionPane.showInputDialog(frame, "Digite el valor a convertir: ", "Valor a convertir", -1));

                //Se solicita elegir el tipo de la moneda a la que quiere convertir.
                Object aMonedaSecundaria = JOptionPane.showInputDialog(frame, "Tipo de moneda a la que quiere convertir", "Moneda Secundaria", JOptionPane.PLAIN_MESSAGE, null, monedaSecundaria, monedaSecundaria);

                //Se realiza la conversión de acuerdo a las opciones elegidas.
                // Peso Colombiano.
                if (deMonedaPrincipal == "Peso Colombiano" && aMonedaSecundaria == "Dolar") {
                    resultadoConversion = Math.round((valorPrincipal / 4816.98f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " USD.");
                } else if (deMonedaPrincipal == "Peso Colombiano" && aMonedaSecundaria == "Euro") {
                    resultadoConversion = Math.round((valorPrincipal / 5183.81f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " EUR.");
                } else if (deMonedaPrincipal == "Peso Colombiano" && aMonedaSecundaria == "Libra Esterlina") {
                    resultadoConversion = Math.round((valorPrincipal / 5910.17f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " GBP.");
                } else if (deMonedaPrincipal == "Peso Colombiano" && aMonedaSecundaria == "Yen (Japones)") {
                    resultadoConversion = Math.round((valorPrincipal / 36.32f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " JPY.");
                } else if (deMonedaPrincipal == "Peso Colombiano" && aMonedaSecundaria == "Won (sul-coreano)") {
                    resultadoConversion = Math.round((valorPrincipal / 3.68f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " KRW.");
                } // Dolar.
                else if (deMonedaPrincipal == "Dolar" && aMonedaSecundaria == "Peso Colombiano") {
                    resultadoConversion = Math.round((valorPrincipal * 4813.43f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " COP.");
                } else if (deMonedaPrincipal == "Dolar" && aMonedaSecundaria == "Euro") {
                    resultadoConversion = Math.round((valorPrincipal * 0.93f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " EUR.");
                } else if (deMonedaPrincipal == "Dolar" && aMonedaSecundaria == "Libra Esterlina") {
                    resultadoConversion = Math.round((valorPrincipal * 0.81f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " GBP.");
                } else if (deMonedaPrincipal == "Dolar" && aMonedaSecundaria == "Yen (Japones)") {
                    resultadoConversion = Math.round((valorPrincipal * 132.42f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " JPY.");
                } else if (deMonedaPrincipal == "Dolar" && aMonedaSecundaria == "Won (sul-coreano)") {
                    resultadoConversion = Math.round((valorPrincipal * 1305.56f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " KRW.");
                }// Euro.
                else if (deMonedaPrincipal == "Euro" && aMonedaSecundaria == "Peso Colombiano") {
                    resultadoConversion = Math.round((valorPrincipal * 5191.14f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " COP.");
                } else if (deMonedaPrincipal == "Euro" && aMonedaSecundaria == "Dolar") {
                    resultadoConversion = Math.round((valorPrincipal * 1.08f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " USD.");
                } else if (deMonedaPrincipal == "Euro" && aMonedaSecundaria == "Libra Esterlina") {
                    resultadoConversion = Math.round((valorPrincipal * 0.88f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " GBP.");
                } else if (deMonedaPrincipal == "Euro" && aMonedaSecundaria == "Yen (Japones)") {
                    resultadoConversion = Math.round((valorPrincipal * 142.94f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " JPY.");
                } else if (deMonedaPrincipal == "Euro" && aMonedaSecundaria == "Won (sul-coreano)") {
                    resultadoConversion = Math.round((valorPrincipal * 1408.82f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " KRW.");
                } // Libra Esterlina.
                else if (deMonedaPrincipal == "Libra Esterlina" && aMonedaSecundaria == "Peso Colombiano") {
                    resultadoConversion = Math.round((valorPrincipal * 5913.30f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " COP.");
                } else if (deMonedaPrincipal == "Libra Esterlina" && aMonedaSecundaria == "Dolar") {
                    resultadoConversion = Math.round((valorPrincipal * 1.23f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " USD.");
                } else if (deMonedaPrincipal == "Libra Esterlina" && aMonedaSecundaria == "Euro") {
                    resultadoConversion = Math.round((valorPrincipal * 1.14f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " EUR.");
                } else if (deMonedaPrincipal == "Libra Esterlina" && aMonedaSecundaria == "Yen (Japones)") {
                    resultadoConversion = Math.round((valorPrincipal * 162.75f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " JPY.");
                } else if (deMonedaPrincipal == "Libra Esterlina" && aMonedaSecundaria == "Won (sul-coreano)") {
                    resultadoConversion = Math.round((valorPrincipal * 1605.57f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " KRW.");
                }// Yen Japones.
                else if (deMonedaPrincipal == "Yen (Japones)" && aMonedaSecundaria == "Peso Colombiano") {
                    resultadoConversion = Math.round((valorPrincipal * 36.29f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " COP.");
                } else if (deMonedaPrincipal == "Yen (Japones)" && aMonedaSecundaria == "Dolar") {
                    resultadoConversion = Math.round((valorPrincipal * 0.0075f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " USD.");
                } else if (deMonedaPrincipal == "Yen (Japones)" && aMonedaSecundaria == "Euro") {
                    resultadoConversion = Math.round((valorPrincipal * 0.0070f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " EUR.");
                } else if (deMonedaPrincipal == "Yen (Japones)" && aMonedaSecundaria == "Libra Esterlina") {
                    resultadoConversion = Math.round((valorPrincipal * 0.0061f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " GBP.");
                } else if (deMonedaPrincipal == "Yen (Japones)" && aMonedaSecundaria == "Won (sul-coreano)") {
                    resultadoConversion = Math.round((valorPrincipal * 9.83f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " KRW.");
                }// Won Sul Coreano.
                else if (deMonedaPrincipal == "Won (sul-coreano)" && aMonedaSecundaria == "Peso Colombiano") {
                    resultadoConversion = Math.round((valorPrincipal * 3.69f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " COP.");
                } else if (deMonedaPrincipal == "Won (sul-coreano)" && aMonedaSecundaria == "Dolar") {
                    resultadoConversion = Math.round((valorPrincipal * 0.00077f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " USD.");
                } else if (deMonedaPrincipal == "Won (sul-coreano)" && aMonedaSecundaria == "Euro") {
                    resultadoConversion = Math.round((valorPrincipal * 0.00071f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " EUR.");
                } else if (deMonedaPrincipal == "Won (sul-coreano)" && aMonedaSecundaria == "Libra Esterlina") {
                    resultadoConversion = Math.round((valorPrincipal * 0.00062f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " GBP.");
                } else if (deMonedaPrincipal == "Won (sul-coreano)" && aMonedaSecundaria == "Yen (Japones)") {
                    resultadoConversion = Math.round((valorPrincipal * 0.10f) * 100) / 100f;
                    JOptionPane.showMessageDialog(frame, "El resultado de la conversión a "+aMonedaSecundaria+" es: " + resultadoConversion + " JPY.");
                }

                repetir = JOptionPane.showConfirmDialog(frame, "¿Desea continuar?", "Seleccione", YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);

            }
        } while (repetir == 0);
    }
}
