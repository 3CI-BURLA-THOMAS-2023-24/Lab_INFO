/**
 * 1. Scrivi un programma che legge un array di n valori interi (n>4) e ne stampa:
    • il contenuto
    • il valore max.
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es1{
    public static void main(String args[]){
        //dichiaro e inizializzo variabili
        int array[];
        int n;
        //leggo e controllo n
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Inserire la dimensione dell'array che deve essere maggiore di 4"));
            if(n <= 4){
                JOptionPane.showMessageDialog(null, "ERRORE di input!", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while(n <= 4);
        //alloco e leggo array
        array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire il valore nell'array"));
        }
        //output
        System.out.println("L'array contiene i seguenti valori:");
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
    }
}