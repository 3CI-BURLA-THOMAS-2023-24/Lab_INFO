/**
 * lettura di un file: carico in una matrice i voti degli studenti e in un array il loro nome file CSV
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class LeggoCSV{
    public static void main(String args[]){
        //dichiarazione e inizializzazione variabili
        String pathname;
        String riga[];
        ArrayList <String> nomi = new ArrayList <String>();
        ArrayList <double[]> voti = new ArrayList <double[]>();
        double votiInput[];
        //leggo il nome del file
        do{
            pathname = JOptionPane.showInputDialog("Inserire il nome del file, estensione compresa. Nel caso in cui il file sia in una posizione diversa rispetto al programma, indicare l'indirizzo assoluto.");
            if((pathname.equals("")) || (pathname.equals(" "))){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while((pathname.equals("")) || (pathname.equals(" ")));
        try{
            //preparo lettura
            File f = new File(pathname);
            FileReader fr = new FileReader(f);
            Scanner leggo = new Scanner(fr);
            //leggo righe da file
            while(leggo.hasNextLine()){
                riga = (leggo.nextLine()).split(",");
                //alloco array dei voti del singolo studente
                votiInput = new double[(riga.length) - 1];
                //salvo nella lista dei nomi il nome dello studente, che si trova nella prima posizione
                nomi.add(riga[0]);
                //riempio un array con i voti del suddetto studente, dopo aver convertito in double i voti salvati nel vettore riga
                for(int i = 1; i < riga.length;i++){
                    votiInput[i - 1] = Double.parseDouble(riga[i]);
                }
                //salvo array dei voti dello studente sulla matrice dinamica che conterrà tutti i voti
                voti.add(votiInput);
            }
            //chiudo flusso
            leggo. close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERRORE di I/O, file NON raggiungibile", "Errore di I/O", JOptionPane.ERROR_MESSAGE);
        }
    }
}