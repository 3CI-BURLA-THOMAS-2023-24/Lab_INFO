/**
 * Generare in modo casuale un numero tra 1 e 100. L’utente ha 5 tentativi per indovinarlo. Se l’utente indovina, bisogna scrivere a video “Bravo, hai indovinato!” E il programma termina, altrimenti si danno indicazioni del tipo “Il numero da indovinare è più basso” oppure “Il numero da indovinare è più alto”. Se, al termine dei 5 tentativi, l’utente non ha indovinato, bisogna comunicare qual era il numero da indovinare.
 * @author Thomas Burla 
 */
import javax.swing.*;
public class Es5{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int randomNumber, num, tent;
        //inizializzazione delle variabili
        randomNumber = (int)(Math.random()*100);
        //elaborazione
        for(tent = 1; tent <= 5; tent++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Indovina il numero, compreso tra 1 e 100"));
            //output
            if(num == randomNumber){
                JOptionPane.showMessageDialog(null, "Bravo,hai indovinato!");
                tent = 6;
            }else if(num > randomNumber){
                JOptionPane.showMessageDialog(null, "Il numero da indovinare è più basso");
            }else{
                JOptionPane.showMessageDialog(null, "Il numero da indovinare è più alto");
            }
            if(tent == 5){
                JOptionPane.showMessageDialog(null, "Hai esaurito i tentativi!");
            }
        }
    }
}