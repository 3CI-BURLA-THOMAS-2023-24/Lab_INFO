/**
 * Un palindromo è un numero che, da sinistra a destra e da destra verso sinistra, si legge nello stesso modo. Scrivere un programma che dato un intero determini se si tratta o no di un palindromo.
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es9{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int num;
        String parole = "";
        boolean palindromo = true;
        //inizializzazione variabili
        num = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero intero in cifre per visualizzare se è palindormo"));
        //rendo il numero sempre positivo
        if(num < 0){
            num = -num;
        }
        parole = parole + num;
        for(int i = 0, j = parole.length() - 1; i <= j; i++, j--){
            if((parole.charAt(i)) != (parole.charAt(j))){
                palindromo = false;
            }
        }
        if(palindromo == true){
            JOptionPane.showMessageDialog(null, "Il numero inserito è palindromo");
        }else{
            JOptionPane.showMessageDialog(null, "Il numero inserito NON è palindromo");
        }
    }
}