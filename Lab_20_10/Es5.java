/**
 * Dato in ingresso il lato di un triangolo equilatero, visualizzare il suo perimetro.
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.*;
public class Es5{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int lato;
        int perimetro;
        //inizializzazione delle variabili ed elaborazione
        lato = Integer.parseInt(JOptionPane.showInputDialog("Dammi il lato del triangolo equilatero. Accettati solo numeri interi positivi"));
        perimetro = lato*3;
        //output
        System.out.println("Il perimetro del triangolo è: "+perimetro);
    }
}