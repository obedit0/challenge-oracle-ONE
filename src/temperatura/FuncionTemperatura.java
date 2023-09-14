package temperatura;

import alertas.Alerts;

public class FuncionTemperatura {
    Alerts miAlerts = new Alerts();

    public double celciusAfarenheit(double valor) {
        double farenheit = valor * 1.8 + 32;
        farenheit = (double) Math.round(farenheit * 100) / 100.0;
        miAlerts.messageAlerta(valor, "Grados Celcius", farenheit, "Grados Farenheit");
        return farenheit;
    }

    public void celciusAkelvin(double valor) {
        double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        miAlerts.messageAlerta(valor, "Grados Celcius", kelvin, "Kelvin");
    }

    public void farenheitAcelcius(double valor) {
        double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius * 100d) / 100;
        miAlerts.messageAlerta(valor, "Grados Farenhiet", celcius, "Grados Celcius");
    }

    public double kelvinAcelcius(double valor) {
        double kelvinCelcius = valor - 273.15;
        kelvinCelcius = (double) Math.round(kelvinCelcius * 100d) / 100;
        miAlerts.messageAlerta(valor, "Grados Kelvin", kelvinCelcius, "Grados Celcius");
        return kelvinCelcius;
    }

    public void kelvinAfarenheit(double valor) {
        double kelvinFarenheit = kelvinAcelcius(valor);
        kelvinFarenheit = celciusAfarenheit(kelvinFarenheit);
        kelvinFarenheit = (double) Math.round(kelvinFarenheit * 100d) / 100;
        miAlerts.messageAlerta(valor, "Grados Kelvin", kelvinFarenheit, "Celcius");
    }
}
