/**
 * Scrivere un programma che legge da tastiera una lista di nomi e cognomi e li scrive su un file html in una tabella
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import java.io.*;
import javax.swing.JOptionPane;
public class Nomi{
    public static void main(String args[]){
        //dichiarazione variabili
        String nome, cognome, scrivo, file;
        nome = "vuoto";
        cognome = "vuoto";
        char apici = '"';
        int finito;
        try{
            //chiedo nome del file in cui salvare e lo controllo
            do{
                file = JOptionPane.showInputDialog("Come vuoi chiamare il file html in cui salvare i nomi?");
                if((nome.equals("")) && (nome.equals(" "))){
                    JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota" , "Errore" , JOptionPane.ERROR_MESSAGE);
                }
            }while((nome.equals("")) && (nome.equals(" ")));
            file = file + ".html";
            File f = new File(file);
            //creo file se non esiste
            if(f.createNewFile()){
                JOptionPane.showMessageDialog(null, "File non esistente, lo sto creando..." , "Creazione file" , JOptionPane.WARNING_MESSAGE);
            }
            FileWriter fr = new FileWriter(f, true);
            PrintWriter out = new PrintWriter(fr);
            //preparo lo "scheletro" di html
            scrivo = "<!DOCTYPE html> \n <style> \n table,th,td { \n border: 2px solid black; \n background-color: white; \n text-align: center; \n} \n th { \n font-size: 50px; \n } \n table { \n width: 100%; \n } \n th { \n color: rgb(255, 160, 0); \n } \n td { \n width: 50% \n } </style> \n <body> \n <table><tr><th colspan=" + apici + "2" + apici + ">Nomi e cognomi</th></tr> \n <tr style=" + apici + "color:rgb(135, 66, 255); font-size: 30px" + apici + "><td>Nome</td><td font-size: 30px>Cognome</td></tr>";
            out.println(scrivo);
            //chiedo nomi finchè l'utente non clicca "NO"
            do{
                //leggo e controllo sia nome che cognome
                do{
                    nome = JOptionPane.showInputDialog("Inserire il nome");
                    cognome = JOptionPane.showInputDialog("Inserire il cognome");
                    if((nome.equals("")) && (nome.equals(" ")) && (cognome.equals("")) && (cognome.equals(" "))){
                        JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota" , "Errore" , JOptionPane.ERROR_MESSAGE);
                    }
                }while((nome.equals("")) && (nome.equals(" ")) && (cognome.equals("")) && (cognome.equals(" ")));
                //scrivo su file
                scrivo = "<tr><td>" + nome + "</td><td>" + cognome + "</td></tr>";
                out.println(scrivo);
                //chiedo se l'utente vuole inserire altro
                finito = JOptionPane.showConfirmDialog(null, "Hai altri nomi da inserire?" , "Scrivi" , JOptionPane.YES_NO_OPTION);
            }while(finito == JOptionPane.YES_OPTION);
            //chiudo html
            JOptionPane.showMessageDialog(null, "File creato" , "Fine" , JOptionPane.WARNING_MESSAGE);
            scrivo = "</table>";
            out.println(scrivo);
            scrivo = "</body>";
            out.println(scrivo);
            out.flush();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERRORE FATALE di output" , "Errore fatale" , JOptionPane.ERROR_MESSAGE);
        }
    }
}