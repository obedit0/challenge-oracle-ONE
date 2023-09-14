package temperatura;

import javax.swing.JOptionPane;

public class MenuTemperatura {
    FuncionTemperatura miFuncionTemperature = new FuncionTemperatura();

    public void convertTemperature(String value) {
        Double input = Double.parseDouble(value);
        String[] myMatriz = { "Grados Celcius a Grados Farenheit",
                "Grados Celcius a Kelvin",
                "Grados Farenheit a Grados Celcius",
                "Kelvin a Grados Celcius",
                "Kelvin a Grados Farenheit" };
        String opcion = "";
        Object miopcion = JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura",
                JOptionPane.PLAIN_MESSAGE, null, myMatriz, "Seleccion");
        if (miopcion == null) {
        } else {
            opcion = miopcion.toString();
        }
        switch (opcion) {
            case "Grados Celcius a Grados Farenheit":
                miFuncionTemperature.celciusAfarenheit(input);
                break;
            case "Grados Celcius a Kelvin":
                miFuncionTemperature.celciusAkelvin(input);
                break;
            case "Grados Farenheit a Grados Celcius":
                miFuncionTemperature.farenheitAcelcius(input);
                break;
            case "Kelvin a Grados Celcius":
                miFuncionTemperature.kelvinAcelcius(input);
                break;
            case "Kelvin a Grados Farenheit":
                miFuncionTemperature.kelvinAfarenheit(input);
                break;
        }

    }
}
