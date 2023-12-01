/**
 * Stampare i multipli di 3 tra 1 e n inserito dall'utente, n>3;
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.*;
public class Es04{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int n;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Fino a quale numero si vogliono visualizzare i multipli di 3 a partire da 1? Inserire un numero m,aggiore di 3"));
            if(n <= 3){
                JOptionPane.showMessageDialog(null, "Errore! Inserire un valore maggiore di 3");
            }
        }while(n <= 3);
        for(int i = 1; i <= n; i++){
            if((i % 3) == 0){
                System.out.println(i);
            }
        }
    }
}