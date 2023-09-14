package monedas;

import javax.swing.JOptionPane;

import alertas.Alerts;

public class menuMonedas {
    Alerts miAlerts = new Alerts();
    monedas monedas = new monedas();

    public void convert(String value) {

        Double input = Double.parseDouble(value);
        String[] matrizOpMoStrings = { "De Sol a dólar",
                "De Sol a Euro",
                "De Sol a Libra",
                "De Sol a Yen",
                "De Sol a Won Coreano",
                "De dólar a Sol",
                "De Euro a Sol",
                "De Libra a Sol",
                "De Yen a Sol",
                "De Won Coreano a Sol",
        };

        String optionConversor="";
        Object mioptionConversor = JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero", "Monedas", -1, null, matrizOpMoStrings,
                "seleccion");
        if (mioptionConversor == null) {
        } else {
            optionConversor = mioptionConversor.toString();
        }
        switch (optionConversor) {
            case "De Sol a dólar":
                monedas.solAdolar(input);
                break;
            case "De Sol a Euro":
                monedas.solAeuro(input);
                break;
            case "De Sol a Libra":
                monedas.solAlibra(input);
                break;
            case "De Sol a Yen":
                monedas.solAyen(input);
                break;
            case "De Sol a Won Coreano":
                monedas.solAwoncoreano(input);
                break;
            case "De dólar a Sol":
                monedas.dolarAsol(input);
                break;
            case "De Euro a Sol":
                monedas.euroAsol(input);
                break;
            case "De Libra a Sol":
                monedas.libraAsol(input);
                break;
            case "De Yen a Sol":
                monedas.yenAsol(input);
                break;
            case "De Won Coreano a Sol":
                monedas.woncoreanoAsol(input);
                break;

        }

    }
}
