
import javax.swing.JOptionPane;

import alertas.Alerts;
import monedas.menuMonedas;
import temperatura.MenuTemperatura;

public class App {

    public static void main(String[] args) throws Exception {
        menuMonedas miMenuMonedas = new menuMonedas();
        MenuTemperatura miMenuTemperatura = new MenuTemperatura();
        Alerts mialerta = new Alerts();
        String message ="";
        while (message!="salir") {
        Object miMessage = (JOptionPane.showInputDialog(null, "seleccione una opción", "Menu", 0, null,
                new Object[] { "conversor de monenda", "conversor de temperatura" }, "seleccion"));
        if (miMessage == null) {
            message = "salir";
        } else {
            message = miMessage.toString();
        }
        
            switch (message) {
                case "conversor de monenda":
                    String value;
                    do {
                        value = JOptionPane.showInputDialog("ingresa la cantidad de dinero que desee convertir: ");
                        if (value == null) {
                            break;
                        }
                    } while (!ValidarNumero(value));
                    if (value == null) {
                        break;
                    }
                    miMenuMonedas.convert(value);
                    break;
                case "conversor de temperatura":
                    do {
                        value = JOptionPane.showInputDialog("ingresa la cantidad de Temperatura que desee convertir: ");
                        if (value == null) {
                            break;
                        }
                    } while (!ValidarNumero(value));
                    if (value == null) {
                        break;
                    }
                    miMenuTemperatura.convertTemperature(value);
                    break;
    
                
            }
        if (message!="salir"&&mialerta.messageConfirm()==0) {
            
        }
        else{
            message="salir";
        }
        }
        mialerta.messageFinish();

    }

    public static boolean ValidarNumero(String input) {
        Alerts miAlerta = new Alerts();
        try {

            double num = Double.parseDouble(input);
            if (num >= 0 || num < 0) {
                return true;
            }

            return false;
        } catch (NumberFormatException e) {
            miAlerta.messageValueError();

            return false;
        }
    }
}