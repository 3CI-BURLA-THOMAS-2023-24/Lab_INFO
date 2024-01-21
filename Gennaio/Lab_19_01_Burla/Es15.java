/**
 * Prese due parole, dire quale delle due ha più vocali.
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es15{
    public static void main(String args[]){
        //dichiarazione delle variabili
        String parola1, parola2;
        boolean errore;
        int counter1, counter2;
        counter1 = 0;
        counter2 = 0;
        //controllo che venga inserita solo una parola nella stringa parola1 e che non sia vuota
        do{
            errore = false;
            parola1 = JOptionPane.showInputDialog("Inserire una parola.");
            //controllo che la stringa parola1 non sia vuota
            if(parola1.equals("")){
                errore = true;
            }else{
                //ripeto le operazioni finche non ho letto tutti i carattteri della stringa
                for(int j = 0; j < parola1.length(); j++){
                    //se il carattere in posizione j è uno spazio, metto a true errore.
                    if((parola1.charAt(j)) == ' '){
                        errore = true;
                    }
                }
            }
            //messaggio di avviso in caso di errore
            if(errore == true){
                JOptionPane.showMessageDialog(null, "ERRORE! Inserire solo una parola");
            }
        }while(errore == true);
        //controllo che venga inserita solo una parola nella stringa parola2 e che non sia vuota
        do{
            errore = false;
            parola2 = JOptionPane.showInputDialog("Inserire una parola per confrontare la quantità di vocali rispetto alla prima parola inserita.");
            //controllo che la stringa parola2 non sia vuota
            if(parola2.equals("")){
                errore = true;
            }else{
                //ripeto le operazioni finche non ho letto tutti i carattteri della stringa
                for(int j = 0; j < parola2.length(); j++){
                    //se il carattere in posizione j è uno spazio, metto a true errore.
                    if(((parola2.charAt(j)) == ' ')){
                        errore = true;
                    }
                }
            }
            //messaggio di avviso in caso di errore
            if(errore == true){
                JOptionPane.showMessageDialog(null, "ERRORE! Inserire solo una parola");
            }
        }while(errore == true);
        //ripeto le operazioni finche non ho letto tutti i carattteri della stringa parola1
        for(int k = 0; k < parola1.length(); k++){
            //se il carattere in posizione i è una vocale incremento il counter1
            if(((parola1.charAt(k)) == 'a') || ((parola1.charAt(k)) == 'A') || ((parola1.charAt(k)) == 'e') || ((parola1.charAt(k)) == 'E') || ((parola1.charAt(k)) == 'i') || ((parola1.charAt(k)) == 'I') || ((parola1.charAt(k)) == 'o') || ((parola1.charAt(k)) == 'O') || ((parola1.charAt(k)) == 'u') || ((parola1.charAt(k)) == 'U')){
                counter1++;
            }
        }
        //ripeto le operazioni finche non ho letto tutti i carattteri della stringa parola1
        for(int b = 0; b < parola2.length(); b++){
            if(((parola2.charAt(b)) == 'a') || ((parola2.charAt(b)) == 'A') || ((parola2.charAt(b)) == 'e') || ((parola2.charAt(b)) == 'E') || ((parola2.charAt(b)) == 'i') || ((parola2.charAt(b)) == 'I') || ((parola2.charAt(b)) == 'o') || ((parola2.charAt(b)) == 'O') || ((parola2.charAt(b)) == 'u') || ((parola2.charAt(b)) == 'U')){
                counter2++;
            }
        }
        //output
        if(counter1 == counter2){
            JOptionPane.showMessageDialog(null, "Le parole hanno la stessa quantità di vocali");
        }else if(counter1 > counter2){
            JOptionPane.showMessageDialog(null, "La prima parola ha più vocali");
        }else{
            JOptionPane.showMessageDialog(null, "La seconda parola ha più vocali");
        }
    }
}