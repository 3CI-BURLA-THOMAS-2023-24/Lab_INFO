/**
 * Scrivere un programma che legga un carattere finché l’utente digita ‘s’ oppure ‘n’. In questo caso stampa OK.
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es7{
    public static void main(String args[]){
        //dichiarazione delle variabili
        String carattere;
        //controllo dell'input
        do{
            carattere = JOptionPane.showInputDialog("Inserire un carattere. Per far terminare il programma, digitare s oppure n");
            if((carattere.equals("s")) || (carattere.equals("n"))){
                JOptionPane.showMessageDialog(null, "OK");
            }
        }while((carattere.equals("s")) || (carattere.equals("n")));
    }
}