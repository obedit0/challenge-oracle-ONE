package alertas;

import javax.swing.JOptionPane;

public class Alerts {
    public void messageAlerta(double input,String moneyIni,double output,String moneyEnd){
        JOptionPane.showMessageDialog(null, input +" "+ moneyIni +" es igual a : " + output +" "+ moneyEnd, "Message", 1);
    }
    public void messageFinish(){
        JOptionPane.showMessageDialog(null, "Programa Terminado", "Message", 0);
    }
    public void messageValueError(){
        JOptionPane.showMessageDialog(null, "Valor inválido", "Message", 0);
    }
    public int messageConfirm(){
        return JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
       // JOptionPane.showConfirmDialog(null, new Object[]{"Yes","No"}, "Selecciona una opción", 0);
    }
    
}
