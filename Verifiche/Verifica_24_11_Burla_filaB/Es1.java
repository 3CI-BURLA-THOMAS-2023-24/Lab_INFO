/**
 * Letta una temperatura dire se c’è freddo (<10) fresco(tra 10 e minore di 20) caldo(tra 20 e 29) molto caldo (più di 29) . La temperatura non deve essere minore di -50 e maggiore di 50.
 * @author Thomas Burla 
 */
import javax.swing.*;
public class Es1{
    public static void main(String args[]){
        //dichiarazione delle variabili
        double T;
        //inizializzazione della variabile e controllo dell'input
        do{
            T = Double.parseDouble(JOptionPane.showInputDialog("Inserire una temperatura compresa tra -50 e 50"));
            if((T < -50) || (T > 50)){
                JOptionPane.showMessageDialog(null, "Errore! Inserire una temperatura seguendo le indicazioni.");
            }
        }while((T < -50) || (T > 50));
        //elaborazione e output
        if(T < 10){
            JOptionPane.showMessageDialog(null, "C'è freddo!");
        }else if((T >= 10) && (T < 20)){
            JOptionPane.showMessageDialog(null, "C'è fresco!");
        }else if((T >= 20) && (T <= 29)){
            JOptionPane.showMessageDialog(null, "C'è caldo!");
        }else{
            JOptionPane.showMessageDialog(null, "C'è molto caldo!");
        }
    }
}