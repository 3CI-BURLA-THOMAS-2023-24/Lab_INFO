
/**
 * Esercizio di I/O file: prendere in ingresso i nomi degli studenti in un array di stringhe e i voti di informatica in una matrice di double caricandoli da un file che ha " " come separatore e salvarli su un file che invece ha ";" come separatore. 
   Assegnare ad ogni studente una riga della matrice con un numero che gli corrisponde.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class Voti{
    public static void main(String args[]){
        //dichiarazione variabili
        ArrayList <String> nomi = new ArrayList<String>();
        double voti[][];
        int k = 0, nvoti[], i = 0;
        String conta[];
        try{
            //preparo i due file da cui leggere
            File read1 = new File("D:/scuola/INI/3_INFORMATICA_2023_24/VotiStudenti/nomi.txt");
            Scanner nomi1 = new Scanner(read1);
            File read2 = new File("D:/scuola/INI/3_INFORMATICA_2023_24/VotiStudenti/voti.txt");
            Scanner voti1 = new Scanner(read2);
            //scrivo in un array di stringhe i nomi
            while(nomi1.hasNextLine()){
                nomi.add(nomi1.next());
            }
            //array per salvare il numero di voti di ogni studente
            nvoti = new int[nomi.size()];
            //chiudo e riapro il flusso per resettare il puntatore
            nomi1.close();
            Scanner nomi2 = new Scanner(read1);
            //individuo il numero più grande di voti fra tutti gli studenti
            while(i < nomi.size()){
                conta = (voti1.nextLine()).split(" ");
                if(conta.length > k){
                    k = conta.length;
                }
                nvoti[i] = conta.length;
                i++;
            }
            //chiudo e riapro il flusso per resettare il puntatore
            voti1.close();
            Scanner voti2 = new Scanner(read2);
            voti2.useDelimiter(" ");
            //alloco e riempio matrice
            voti = new double[nomi.size()][k];
            for(int r = 0; r < nomi.size(); r++){
                for(int c = 0; c < nvoti[r]; c++){
                    voti[r][c] = Double.parseDouble(voti2.next());
                }
            }
            //preparo file su cui scrivere
            File write = new File("D:/scuola/INI/3_INFORMATICA_2023_24/VotiStudenti/csv.txt");
            FileWriter fw = new FileWriter(write);
            PrintWriter pw = new PrintWriter(fw);
            for(int n = 0; n < i; n++){
                pw.print(nomi.get(n) + ";");
                for(int v = 0; v < nvoti[n]; v++){
                    pw.print(voti[n][v] + ";");
                    if(v == (nvoti[n] - 1)){
                        pw.println("");
                    }
                }
            }


            voti2.close();
            nomi2.close();
            pw.close();
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"ERRORE! File di lettura non trovato :(" , "Errore di lettura", JOptionPane.ERROR_MESSAGE);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"ERRORE! Qualcosa è andato storto nella scrittura :(" , "Errore di scrittura", JOptionPane.ERROR_MESSAGE);}
    }
}