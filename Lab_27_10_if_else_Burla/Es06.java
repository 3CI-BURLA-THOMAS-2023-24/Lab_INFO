/**
 * Stabilire se tre numeri presi in ingresso possono essere le misure dei lati di un triangolo.
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.*;
public class Es06{
    public static void main(String args[]){
        //dichiarazione delle variabili
        double l1;
        double l2;
        double l3;
        //inizializzazione delle avriabili
        l1 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il primo lato del triangolo"));
        l2 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il secondo lato del triangolo"));
        l3 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il tero lato del triangolo"));
        //elaborazione
        if(l1<0&&l2<0&&l3<0){
            System.out.println("I valori dati NON possono corrispondere ai lati di un triangolo");
            }
            else if(((l1+l2)>l3)&&((l2+l3)>l1)&&((l1+l3)>l2)){
                System.out.println("I valori dati possono corrispondere ai lati di un triangolo");
            }
            else{
            System.out.println("I valori dati NON possono corrispondere ai lati di un triangolo");
        }
    }
}