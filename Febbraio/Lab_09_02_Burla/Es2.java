/**
 * Leggere due stringhe titolo_libro (es. “Saltatempo”), autore (es. “Benni”)
    • creare una stringa ottenuta dalla concatenazione delle stringhe con gli opportuni spazi e visualizzare la stringa “Titolo e autore del libro:  Saltatempo Benni”												0,5pt
    • creare una stringa contenente solo le vocali della stringa titolo_libro	1  pt
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es2{
    public static void main(String args[]){
        //dichiarazione variabili
        String titolo_libro, autore, concat, soloVocali, min;
        //inizializzazioen variabilix
        soloVocali = "";
        //leggo e controllo la stringa titolo_libro
        do{
            titolo_libro = JOptionPane.showInputDialog("Inserire il titolo del libro");
            if(titolo_libro.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota");
            }
        }while(titolo_libro.equals(""));
        //leggo e controllo la stringa autore
        do{
            autore = JOptionPane.showInputDialog("Inserire l'autore del libro");
            if(autore.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota");
            }
        }while(autore.equals(""));
        //creo la stringa con titolo e autore del libro
        concat = titolo_libro + " " + autore;
        //preparo una stringa ausiliaria per effettuare il confronto avendo tutte lettere minuscole
        min = titolo_libro.toLowerCase();
        //creo la stringa che contiene solo le vocali del titolo del libro
        for(int i = 0; i < titolo_libro.length(); i++){
            //preparo una stringa che contiene solo minuscole
            switch (min.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': soloVocali = soloVocali + titolo_libro.charAt(i);
            }
        }
        System.out.println("Titolo e autore libro: "+concat);
        System.out.println("Stringa del titolo di sole vocali: "+soloVocali);
    }
}