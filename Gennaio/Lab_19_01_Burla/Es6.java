/**
 * Dato un indirizzo email, estrarre il dominio, cioè tutto ciò che segue il simbolo @ ( mross@ studenti.marconiverona.edu.it ? studenti.marconiverona.edu.it )
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class Es6 {
    public static void main(String args[]) throws FileNotFoundException{
        //dichiarazione variabili
        String mail, dominio;
        int scelta;
        //inizializzazione variabili
        dominio = "";
        boolean controllo = false;
        //scelta di input da tastiera o da file precedente
        Scanner inp = new Scanner(System.in);
        do{
            System.out.println("Per scrivere a mano il dominio, digita 1. Per estrarlo dall'output di Es5.java, digita 2");
            scelta = inp.nextInt();
            if((scelta != 1) && (scelta != 2)){
                JOptionPane.showMessageDialog(null, "ERRORE! Inserire 1 o 2");
            }
        }while((scelta != 1) && (scelta != 2));
        //leggo mail
        if(scelta == 1){
            System.out.println("Inserire una mail");
            mail = inp.next();
        }else{
            File file= new File("Es5-6.txt");
            Scanner f = new Scanner(file);
            mail = f.next();
            f.close();
        }
        //scrivo il dominio
        for(int i = 0; i < mail.length(); i++){
            if(mail.charAt(i) == '@'){
                controllo =  true;
            }
            if(((mail.charAt(i)) != '@') && controllo == true){
                dominio = dominio + mail.charAt(i);
            }
        }
        System.out.println(dominio);
        inp.close();

    }
}
