/**
 * lettura di un file: cerco parola in un file CSV
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class LeggoCSV{
    public static void main(String args[]){
        //dichiarazione e inizializzazione variabili
        String pathname, parola;
        //leggo il nome del file
        do{
            pathname = JOptionPane.showInputDialog("Inserire il nome del file, estensione compresa. Nel caso in cui il file sia in una posizione diversa rispetto al programma, indicare l'indirizzo assoluto.");
            if((pathname.equals("")) || (pathname.equals(" "))){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while((pathname.equals("")) || (pathname.equals(" ")));
        //leggo la praola da cercare
        do{
            parola = JOptionPane.showInputDialog("Inserire la parola che si vuole cercare nel file");
            if((parola.equals("")) || (parola.equals(" "))){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while((parola.equals("")) || (parola.equals(" ")));
        
    }
}