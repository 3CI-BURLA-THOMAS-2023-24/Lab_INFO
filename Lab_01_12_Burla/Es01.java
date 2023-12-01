/**
 * Letto il prezzo di una sciarpa, dire se è un prodotto economico (fino a 10 euro), regolare(superiore a 10 euro) o di lusso (superiore a 50 euro). 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.*;
public class Es01{
    public static void main(String args[]){
        //dichiarazione delle variabili
        double p;
        //inizializzazione delle variabili
        do{
            p = Double.parseDouble(JOptionPane.showInputDialog("Inserire il prezzo della sciarpa"));
            if(p <= 0){
                JOptionPane.showMessageDialog(null, "Errore, il prezzo di una sciarpa NON può essere negativo o nullo!");
            }
        }while(p <= 0);
        if(p <= 10){
            JOptionPane.showMessageDialog(null, "La sciarpa è economica");
        }else if((p > 10) && (p <= 50)){
            JOptionPane.showMessageDialog(null, "Il prezzo della sciarpa è regolare");
        }else{
            JOptionPane.showMessageDialog(null, "La sciarpa è di lusso");
        }
    }
}