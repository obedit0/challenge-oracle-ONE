package monedas;


import alertas.Alerts;

public class monedas {
    Alerts miAlerta = new Alerts();
    public void solAdolar(double input){
        double monedaDolar= input/3.70;
        monedaDolar=Math.round(monedaDolar*100)/100.0;
        miAlerta.messageAlerta(input, "soles", monedaDolar, "Dólares");
    }
    public void solAeuro(double input){
        double monedaEuro= input/3.98;
        monedaEuro=Math.round(monedaEuro*100)/100.0;
        miAlerta.messageAlerta(input, "soles", monedaEuro, "Euros");

    }
    public void solAlibra(double input){
        double monedaLibra= input*0.2165;
        monedaLibra=Math.round(monedaLibra*100)/100.0;
        miAlerta.messageAlerta(input, "soles", monedaLibra, "Libras");

    }
    public void solAyen(double input){
        double monedaYen= input*39.86;
        monedaYen=Math.round(monedaYen*100)/100.0;
        miAlerta.messageAlerta(input, "soles", monedaYen, "Yenes");

    }
    public void solAwoncoreano(double input){
        double monedaWon= input*358.39;
        monedaWon=Math.round(monedaWon*100)/100.0;
        miAlerta.messageAlerta(input, "soles", monedaWon, "Won Coreanos");

    }
    /*----------------------------------------- */
    public void dolarAsol(double input){
        double monedaSol= input*3.70;
        monedaSol=Math.round(monedaSol*100)/100.0;
        miAlerta.messageAlerta(input, "Dólares", monedaSol, "Soles");

    }
    public void euroAsol(double input){
        double monedaSol= input*3.98;
        monedaSol=Math.round(monedaSol*100)/100.0;
        miAlerta.messageAlerta(input, "Euros", monedaSol, "Soles");

    }
    public void libraAsol(double input){
        double monedaSol= input/0.2165;
        monedaSol=Math.round(monedaSol*100.0)/100.0;
        miAlerta.messageAlerta(input, "Libras", monedaSol, "Soles");

    }
    public void yenAsol(double input){
        double monedaSol= input/39.77;
        monedaSol=Math.round(monedaSol*1000)/1000.0;
        miAlerta.messageAlerta(input, "Yenes", monedaSol, "Soles");

    }
    public void woncoreanoAsol(double input){
        double monedaSol= input/358.39;
        monedaSol=Math.round(monedaSol*10000)/10000.0;
        miAlerta.messageAlerta(input, "Won coreanos", monedaSol, "Soles");

    }

}
