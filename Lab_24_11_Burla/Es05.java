/**
 * Calcolo della circonferenza e area del cerchio, con il tipo di dato opportuno per il raggio e il controllo sul valore espresso in input;
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.*;
public class Es05{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int x, y, s, i;
        //inizializzazione delle variabili
        x = 220;
        y = 284;
        s = 0;
        //elaborazione
        for(i = 1; i < y; i++){
            if((y % i) == 0){
                s = s + i;
            }
        }
        if(s == x){
            JOptionPane.showMessageDialog(null, "I due numeri sono amici");
        }else{
            JOptionPane.showMessageDialog(null, "I due numeri NON sono amici");
        }
    }
}