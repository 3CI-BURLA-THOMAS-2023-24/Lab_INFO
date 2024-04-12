/**
 * lettura di un file di testo carattere per carattere: cerco parola in un file
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import java.io.*;
import javax.swing.JOptionPane;
public class LeggoChar{
    public static void main(String args[]){
        //dichiarazione e inizializzazione variabili
        String pathname, parola;
        int leggo = 0;
        String parolaInput;
        boolean trovata = false;
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
        try{
            //preparo file di lettura
            File f = new File(pathname);
            FileReader fr = new FileReader(f);
            do{
                //variabile che legge le parole dal file, resettata ogni volta
                parolaInput = "";
                //concateno il prossimo carattere finchè non trovo spazio(in ascii = 32)
                do{
                    leggo = fr.read();
                    if(leggo != 32){
                        parolaInput+= (char)leggo;
                    }
                }while((leggo != 32) && (leggo != -1));
                //confronto se le parole sono uguali
                if(parolaInput.equals(parola)){
                    trovata = true;
                }
            }while((leggo != -1) && (trovata == false));
            //output
            if(trovata == true){
                JOptionPane.showMessageDialog(null, "Parola trovata!");
            }else{
                JOptionPane.showMessageDialog(null, "Parola NON trovata");
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERRORE di I/O", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }
}