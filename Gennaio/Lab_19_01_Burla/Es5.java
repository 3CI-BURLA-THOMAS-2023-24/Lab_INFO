/**
 * Presi un nome ed un cognome, creare l’indirizzo email del marconi, formato dalla prima lettera del nome e dalle prime quattro del cognome, seguiti da @studenti.marconiverona.edu.it (mario rossi:mross@ studenti.marconiverona.edu.it )
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
import java.io.*;
public class Es5{
    public static void main(String args[]) throws IOException{
        //dichiarazione delle variabili
        String nome, nomemail, cognome, cognomemail, mail;
        boolean errore;
        nomemail = "";
        cognomemail = "";
        //preparo file di output
        FileWriter fw = new FileWriter("Es5-6.txt");
        //controllo che la stringa del nome non sia vuota
        do{
            errore = false;
            nome = JOptionPane.showInputDialog("Inserire il nome.");
            //messaggio di errore
            if(nome.equals("")){
                errore = true;
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota.");
            }
        }while(errore == true);
        //controllo che la stringa del cognome non sia vuota
        do{
            errore = false;
            cognome = JOptionPane.showInputDialog("Inserire il cognome.");
            //messaggio di errore
            if(cognome.equals("")){
                errore = true;
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota.");
            }
        }while(errore == true);
        //preparo il nome
        nomemail = nomemail + nome.charAt(0);
        //preparo il cognome
        for(int i = 0; i < 4; i++){
            cognomemail = cognomemail + cognome.charAt(i);
        }
        //preparo la mail completa, assicurandomi di avere solo lettere minuscole
        mail = nomemail.toLowerCase() + "." + cognomemail.toLowerCase() + "@studenti.marconiverona.edu.it";
        //output su file
        fw.write(mail);
        fw.close();
    }
}