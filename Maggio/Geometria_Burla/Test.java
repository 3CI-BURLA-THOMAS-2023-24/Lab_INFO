/**
 * La classe Test (main)
    -Creare 3 oggetti Punto
    -visualizzare le coordinate del punto1
    -dire se ci sono due punti coincidenti
    -...
    
    Implementare la classe Test contenente un menu
    -se si digita 1 Si chiedono i dati per istanziare un oggetto Punto, si modifica la coordinata x e si visualizzando le coordinate
    -se si digita 2 si chiedono i dati per istanziare un oggetto Quadrato e si visualizza perimetro e area
    -se si digita 3 si chiedono i dati per istanziare un oggetto Triangolo equilatero, e si visualizza P, A
    -se si digita 4 si chiedono i dati per istanziare un oggetto Triangolo isoscele, e si visualizza P, A
    -se si digita 5 si chiedono i dati per istanziare un oggetto Triangolo equilatero, e si visualizza P, A
    -se si digita 0 o qualsiasi altro valore intero si esce dal programma
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Test{
    public static void main(String args[]){
        //coefficienti per calcolare l'equazione della circonferenza
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double coefficientiCirconferenza[][] = new double[3][3];
        double terminiNoti[][] = new double[3][1];
        double detA = 0.0;
        double detB = 0.0;
        double detC = 0.0;
        double determinante = 0.0;
        String circonferenza = "";
        //creo oggetti di classe Punto
        //Punto p = new Punto(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto P")), Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto P")));
        //Punto s = new Punto();
        //Punto t = new Punto(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto T")), Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto T")));
        Punto p = new Punto(-1.0, 0.0);
        Punto s = new Punto(2.0 , 0.0);
        Punto t = new Punto(1.0, 1.0);
        //imposto coordinate s
        //s.setAscissa(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto S")));
        //s.setOrdinata(Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto S")));
        //visualizzo coordinate p
        //JOptionPane.showMessageDialog(null, p);
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
        //definisco matrice dei coefficienti per ricercare l'equazione della circonferenza (risolvo sistema con metodo di Cramer)
        coefficientiCirconferenza[0][0] = p.getAscissa();
        coefficientiCirconferenza[0][1] = p.getOrdinata();
        coefficientiCirconferenza[1][0] = s.getAscissa();
        coefficientiCirconferenza[1][1] = s.getOrdinata();
        coefficientiCirconferenza[2][0] = t.getAscissa();
        coefficientiCirconferenza[2][1] = t.getOrdinata();
        for(int r = 0; r < 3; r++){
            coefficientiCirconferenza[r][2] = 1.0;
        }
        //definisco matrice dei termini noti per ricercare l'equazione della circonferenza
        terminiNoti[0][0] = -((p.getAscissa() * p.getAscissa()) + (p.getOrdinata() * p.getOrdinata()));
        terminiNoti[1][0] = -((s.getAscissa() * s.getAscissa()) + (s.getOrdinata() * s.getOrdinata()));
        terminiNoti[2][0] = -((t.getAscissa() * t.getAscissa()) + (t.getOrdinata() * t.getOrdinata()));
        //calcolo determinante
        determinante = (coefficientiCirconferenza[0][0] * ((coefficientiCirconferenza[1][1] * coefficientiCirconferenza[2][2]) - (coefficientiCirconferenza[2][1] * coefficientiCirconferenza[1][2]))) - (coefficientiCirconferenza[0][1] * ((coefficientiCirconferenza[1][0] * coefficientiCirconferenza[2][2]) - (coefficientiCirconferenza[2][0] * coefficientiCirconferenza[1][2]))) + (coefficientiCirconferenza[0][2] * ((coefficientiCirconferenza[1][0] * coefficientiCirconferenza[2][1]) - (coefficientiCirconferenza[2][0] * coefficientiCirconferenza[1][1])));
        System.out.println(determinante);
        //calcolo coefficiente a della circonferenza
        detA = (terminiNoti[0][0] * ((coefficientiCirconferenza[1][1] * coefficientiCirconferenza[2][2]) - (coefficientiCirconferenza[2][1] * coefficientiCirconferenza[1][2]))) - (coefficientiCirconferenza[0][1] * ((terminiNoti[1][0] * coefficientiCirconferenza[2][2]) - (terminiNoti[2][0] * coefficientiCirconferenza[1][2]))) + (coefficientiCirconferenza[0][2] * ((terminiNoti[1][0] * coefficientiCirconferenza[2][1]) - (terminiNoti[2][0] * coefficientiCirconferenza[1][1])));
        a = detA / determinante;
        System.out.println(a);
        //calcolo coefficiente b della circonferenza
        detB = (coefficientiCirconferenza[0][0] * ((terminiNoti[1][0] * coefficientiCirconferenza[2][2]) - (terminiNoti[2][0] * coefficientiCirconferenza[1][2]))) - (terminiNoti[0][0] * ((coefficientiCirconferenza[1][0] * coefficientiCirconferenza[2][2]) - (coefficientiCirconferenza[2][0] * coefficientiCirconferenza[1][2]))) + (coefficientiCirconferenza[0][2] * ((coefficientiCirconferenza[1][0] * terminiNoti[2][0]) - (coefficientiCirconferenza[2][0] * terminiNoti[1][0])));
        b = detB / determinante;
        System.out.println(b);
        //calcolo coefficiente c della circonferenza
        detC = (coefficientiCirconferenza[0][0] * ((coefficientiCirconferenza[1][1] * terminiNoti[2][0]) - (coefficientiCirconferenza[2][1] * terminiNoti[1][0]))) - (coefficientiCirconferenza[0][1] * ((coefficientiCirconferenza[1][0] * terminiNoti[2][0]) - (coefficientiCirconferenza[2][0] * terminiNoti[1][0]))) + (terminiNoti[0][0] * ((coefficientiCirconferenza[1][0] * coefficientiCirconferenza[2][1]) - (coefficientiCirconferenza[2][0] * coefficientiCirconferenza[1][1])));
        c = detC / determinante;
        System.out.println(c);
        //scrivo equazione della circonferenza
        circonferenza = "x^2 + y^2 + " + a + "x + " + b + "y + " + c + " = 0";
        JOptionPane.showMessageDialog(null, "I tre punti appartengono alla circonferenza di equazione: " + circonferenza);
        
    }
}