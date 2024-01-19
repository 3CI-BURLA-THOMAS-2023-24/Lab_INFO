/**
 * Il programma legge tre numeri e dice se possono essere le lunghezze dei lati di un triangolo (perch� un triangolo possa essere tale la somma di ogni coppia lati deve essere maggiore dell�altro). 
   Se � un triangolo dire se il triangolo � scaleno, isoscele o equilatero
   (Nota bene, dice solo la tipologia pi� particolare, ovvero se � equilatero, dice solo che � equilatero e non anche che � isoscele)
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es5{
    public static void main(String args[]){
        //dichiarazione delle variabili
        double l1, l2, l3;
        //controllo dell'input siccome un lato non pu� essere a prescindere negativo o nullo
        do{
            l1 = Double.parseDouble(JOptionPane.showInputDialog("Inserire un numero per verificare se pu� essere il lato di un triangolo"));
            l2 = Double.parseDouble(JOptionPane.showInputDialog("Inserire un altro numero per verificare se pu� essere il lato di un triangolo"));
            l3 = Double.parseDouble(JOptionPane.showInputDialog("Inserire un ulteriore numero per verificare se pu� essere il lato di un triangolo"));
            //messaggio di errore
            if((l1 <= 0) || (l2 <= 0) || (l3 <= 0)){
                JOptionPane.showMessageDialog(null, "ERRORE! A prescindere, un lato non pu� essere negativo o nullo");
            }
        }while((l1 <= 0) || (l2 <= 0) || (l3 <= 0));
        //controllo se i lati sono validi
        if((l1 < (l2 + l3)) && (l2 < (l1 + l3)) && (l3 < (l1 + l2))){
            JOptionPane.showMessageDialog(null, "I numeri inseriti possono essere i lati di un triangolo");
            //controllo la tipologia di triangolo
            if((l1 == l2) || (l1 == l3) || (l2 == l3)){
                if((l1 == l2) && (l2 == l3)){
                    JOptionPane.showMessageDialog(null, "Il triangolo � equilatero");
                }else{
                    JOptionPane.showMessageDialog(null, "Il triangolo � isoscele");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Il triangolo � scaleno");
            }
        }else{
            JOptionPane.showMessageDialog(null, "I numeri inseriti NON possono essere i lati di un triangolo");
        }
    }
}