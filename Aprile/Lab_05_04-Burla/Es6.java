/**
 * Scrivere un file di testo, leggere una parola, dire se la parola è presente nel file di testo
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Es6 {
    public static void main(String args[]){
        //dichiarazione variabili
        String pathname, parola, paroleRiga[], posizione;
        boolean trovato = false;
        int k = 0, counter = 0;
        //inizializzazione variabili
        posizione = "";
        //leggo nome del file da cui leggere
        do{
            pathname = JOptionPane.showInputDialog("Inserire il nome del file da cui leggere e la relativa estensione. Se il file non si trova nella stessa directory del programma attuale, specificare l'indirizzo assoluto");
            if((pathname.equals(" ")) || (pathname.equals(""))){
                JOptionPane.showMessageDialog(null, "ERRORE stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while((pathname.equals(" ")) || (pathname.equals("")));
        try{
            //preparo file di lettura
            File f = new File(pathname);
            FileReader fr = new FileReader(f);
            Scanner leggoFile = new Scanner(fr);
            //leggo la parola da cercare
            do{
                parola = JOptionPane.showInputDialog("Inserire la parola che si desidera cercare nel file indicato in precedenza");
                if((parola.equals(" ")) || (parola.equals(""))){
                    JOptionPane.showMessageDialog(null, "ERRORE stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
                }
            }while((parola.equals(" ")) || (parola.equals("")));
            //leggo il file finchè ci sonoi righe
            while(leggoFile.hasNextLine()){
                trovato = false;
                //contatore per tenere conto della riga a cui sono arrivato
                k++;
                //divido la riga da leggere in un array
                paroleRiga = (leggoFile.nextLine()).split(" ");
                //cerco la parola nell'array ottenuto precedentemente
                for(int i = 0; (i < paroleRiga.length) && (trovato == false); i++){
                    if((paroleRiga[i].equals(parola)) || (paroleRiga[i].equals(parola + ",")) || (paroleRiga[i].equals(parola + ";")) || (paroleRiga[i].equals(parola + ":")) || (paroleRiga[i].equals(parola + "!")) || (paroleRiga[i].equals(parola + "?"))){
                        trovato = true;
                        counter++;  //tengo conto di quante volte ho trovato la parola data
                        //semplice ciclo per evitare che la prima volta si stampi il ";" davanti al numero di riga
                        if(counter == 1){
                            posizione+= k;
                        }else{
                            posizione+= ";" + k;
                        }
                    }
                }
            }
            //output
            if(!(posizione.equals(""))){
                JOptionPane.showMessageDialog(null, "La parola compare alla/e riga/he: "+posizione);
            }
            leggoFile.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERRORE di I/O, file NON raggiungibile", "Errore di I/O", JOptionPane.ERROR_MESSAGE);
        }
    }
}
