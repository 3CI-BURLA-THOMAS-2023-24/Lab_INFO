/**
 * Leggere un valore n compreso tra 1 e 8						                                                         0,5 pt
        ? leggere un vettore di n valori double 			      			                                                 0,5 pt
        ? visualizzare il vettore					      			                                                 0,5 pt
        ? sommare i valori in posizione pari e calcolare e visualizzare la media	                                                         1 pt
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es3{
    public static void main(String args[]){
        //dichiarazione variabili
        int n;
        double v[], somma, media;
        //inizializzazione variabili
        somma = 0.0;
        //leggo e controllo n
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Quanti valori deve contenere il vettore? Almeno 2 e massimo 7"));
            if((n <= 1) || (n >= 8)){
                JOptionPane.showMessageDialog(null, "ERRORE! Valore non valido");
            }
        }while((n <= 1) || (n >= 8));
    }
}