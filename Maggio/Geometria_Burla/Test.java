/**
 * La classe Test (main)
    -Creare 3 oggetti Punto
    -visualizzare le coordinate del punto1
    -dire se ci sono due punti coincidenti
    -...

    Implementare la classe Test contenente un menu
    -se si digita 1 Si chiedono i dati per istanziare un oggetto Punto, si modifica la coordinata x e si visualizzando le coordinate
    -se si digita 2 si chiedono i dati per istanziare un oggetto Quadrato e si visualizza perimetro e area
    -se si digita 3 si chiedono i dati per istanziare un oggetto Triangolo scaleno, e si visualizza P, A
    -se si digita 4 si chiedono i dati per istanziare un oggetto Triangolo isoscele, e si visualizza P, A
    -se si digita 5 si chiedono i dati per istanziare un oggetto Triangolo equilatero, e si visualizza P, A
    -se si digita 0 o qualsiasi altro valore intero si esce dal programma
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Test{
    public static void main(String args[]){
        //variabile di scelta dal menù
        int scelta = 0;
        //lati del triangolo (opzioni 3, 4 e 5)
        double lato1 = 0.0;
        double lato2 = 0.0;
        double lato3 = 0.0;
        //creo oggetti di classe Punto
        Punto p = new Punto(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto P")), Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto P")));
        Punto s = new Punto();
        Punto t = new Punto(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto T")), Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto T")));
        Circonferenza circonferenza1 = new Circonferenza();
        //imposto coordinate s
        s.setAscissa(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto S")));
        s.setOrdinata(Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto S")));
        //visualizzo coordinate punti
        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
        //controllo se vi sono due punti coincidenti
        if((p.getAscissa() == s.getAscissa()) && (p.getOrdinata() == s.getOrdinata())){
            JOptionPane.showMessageDialog(null, "Il punto P e il punto S sono coincidenti");
        }else if((p.getAscissa() == t.getAscissa()) && (p.getOrdinata() == t.getOrdinata())){
            JOptionPane.showMessageDialog(null, "Il punto T e il punto S sono coincidenti");
        }else if((s.getAscissa() == t.getAscissa()) && (s.getOrdinata() == t.getOrdinata())){
            JOptionPane.showMessageDialog(null, "Il punto T e il punto S sono coincidenti");
        }
        //calcolo equazione circonferenza passante per 3 punti
        JOptionPane.showMessageDialog(null, "I tre punti appartengono alla circonferenza di equazione: " + circonferenza1.calcolaEquazione(p, s, t));
        //menu a scelta
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Digitare 1 per istanziare un oggetto di classe Punto, modificando la coordinata x e visualizzando le sue coordinate.");
        System.out.println("Digitare 2 per istanziare un'oggetto di classe Quadrato, visualizzando perimetro e area.");
        System.out.println("Digitare 3 per istanziare un oggetto di classe Triangolo, tipo scaleno, visualizzando perimetro e area");
        System.out.println("Digitare 4 per istanziare un oggetto di classe Triangolo, tipo isoscele, visualizzando perimetro e area");
        System.out.println("Digitare 5 per istanziare un oggetto di classe Triangolo, tipo equilatero, visualizzando perimetro e area");
        scelta = tastiera.nextInt();
        tastiera.close();
        switch(scelta){
            //opzione1: Punto
            case 1: {
                        //creo punto W e visualizzo coordinate iniziali
                        Punto w = new Punto(Double.parseDouble(JOptionPane.showInputDialog("Inserire l'ascissa del punto W")), Double.parseDouble(JOptionPane.showInputDialog("Inserire l'ordinata del punto W")));
                        System.out.println(w);
                        //modifico ascissa W e visualizzo nuove coordinate
                        w.setAscissa(Double.parseDouble(JOptionPane.showInputDialog("Inserire la nuova ascissa di W")));
                        System.out.println(w);
                        break;
                    }
            //opzione2: Quadrato
            case 2: {
                        Quadrato abc = new Quadrato(Double.parseDouble(JOptionPane.showInputDialog("Inserire la lunghezza in centimetri del lato del quadrato.")));
                        System.out.println(abc.calcolaArea());
                        System.out.println(abc.calcolaPerimetro());
                        break;
                    }
            //opzione3: Traingolo scaleno
            case 3: {
                        //input lati
                        lato1 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il primo lato del triangolo"));
                        lato2 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il secondo lato del triangolo"));
                        lato3 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il terzo lato del triangolo"));
                        //controllo che il triangolo sia scaleno e che i lati abbiano un valore accettabile; successivamente calcolo perimetro e area
                        if(((lato1 > 0.0) && (lato2 > 0.0) && (lato3 > 0.0)) && ((lato1 != lato2) && (lato2 != lato3) && (lato3 != lato1))){
                            Triangolo scaleno = new Triangolo(lato1, lato2, lato3, Double.parseDouble(JOptionPane.showInputDialog("Inserire l'altezza del triangolo scaleno")));
                            System.out.println(scaleno.calcolaArea(JOptionPane.showInputDialog("Quale lato si vuole utilizzare come base, rispetto all'altezza indicata? Inserire solo lato1, lato2 o lato3")));
                            System.out.println(scaleno.calcolaPerimetro());
                        }else{
                            //messaggio di errore di input dei lati
                            JOptionPane.showMessageDialog(null, "ERRORE! Lati non validi", "Errore", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    }
            //opzione4: Triangolo isoscele
            case 4: {
                        //input lati
                        lato1 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il primo lato del triangolo"));
                        lato2 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il secondo lato del triangolo"));
                        lato3 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il terzo lato del triangolo"));
                        //controllo che il triangolo sia isoscele e che i lati abbiano un valore accettabile; successivamente calcolo perimetro e area
                        if(((lato1 > 0.0) && (lato2 > 0.0) && (lato3 > 0.0)) && (((lato1 == lato2) || (lato1 == lato3) || (lato2 == lato3)))){
                            Triangolo isoscele = new Triangolo(lato1, lato2, lato3, Double.parseDouble(JOptionPane.showInputDialog("Inserire l'altezza del triangolo isoscele")));
                            System.out.println(isoscele.calcolaArea(JOptionPane.showInputDialog("Quale lato si vuole utilizzare come base, rispetto all'altezza indicata? Inserire solo lato1, lato2 o lato3")));
                            System.out.println(isoscele.calcolaPerimetro());
                        }
                        break;
                    }
            case 5: {
                       //input lati
                       lato1 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il primo lato del triangolo"));
                       lato2 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il secondo lato del triangolo"));
                       lato3 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il terzo lato del triangolo"));
                       //controllo che il triangolo sia equilatero e che i lati abbiano un valore accettabile; successivamente calcolo perimetro e area
                       if(((lato1 > 0.0) && (lato2 > 0.0) && (lato3 > 0.0)) && (((lato1 == lato2) && (lato1 == lato3)))){
                           Triangolo equilatero = new Triangolo(lato1, lato2, lato3, Double.parseDouble(JOptionPane.showInputDialog("Inserire l'altezza del triangolo isoscele")));
                           System.out.println(equilatero.calcolaArea("lato1"));
                           System.out.println(equilatero.calcolaPerimetro());
                       }
                       break; 
                    }
        }
    }
}    
