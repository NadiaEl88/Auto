public class Punkt {

    // Eigenschaften eines Punktes: Punktnummer, X- und Y-Koordinaten.
    int punktNummer;
    double x_Koordinate;
    double y_Koordinate;

    // Ein Konstruktor, der einen neuen Punkt mit angegebenen Werten erstellt.
    Punkt(int punktNummer, double x_Koordinate, double y_Koordinate) {
        this.punktNummer = punktNummer;
        this.x_Koordinate = x_Koordinate;
        this.y_Koordinate = y_Koordinate;
    }

    // Eine Methode, die eine lesbare Beschreibung des Punktes zurückgibt.
    public String toString() {
        return "Punktnummer: " + punktNummer + ", X: " + x_Koordinate + ", Y: " + y_Koordinate;
    }

    // Eine Methode, um den Abstand des Punktes zum Ursprung zu berechnen (Satz des Pythagoras Wurzel aus x^2+x^2). 
    public double abstandZumUrsprung() {
        return Math.sqrt(x_Koordinate * x_Koordinate + y_Koordinate * y_Koordinate);
    }

    // Methoden für Spiegelungen des Punktes an den Achsen und am Ursprung.
    public Punkt spiegelungAnX() {
        return new Punkt(punktNummer, x_Koordinate, -y_Koordinate);
    }
    public Punkt spiegelungAnY() {
        return new Punkt(punktNummer, -x_Koordinate, y_Koordinate);
    }
    public Punkt spiegelungAmUrsprung() {
        return new Punkt(punktNummer, -x_Koordinate, -y_Koordinate);
    }

    // Eine Methode, um den Abstand zwischen zwei Punkten zu berechnen.
    public double abstandZu(Punkt p) {
        double deltaX = p.x_Koordinate - this.x_Koordinate;
        double deltaY = p.y_Koordinate - this.y_Koordinate;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

// Eine Testklasse, um die Funktionalität der "Punkt"-Klasse zu zeigen.
public class PunktTest {
    public static void main(String[] args) {
        // Erzeugen von zwei Punkten.
        Punkt punkt1 = new Punkt(1, 10, -8);
        Punkt punkt2 = new Punkt(2, 12, -6);
        
        // Ausgabe der Informationen über die Punkte.
        System.out.println("Punkt 1: " + punkt1);
        System.out.println("Punkt 2: " + punkt2);
        
        // Berechnung des Abstands zwischen den beiden Punkten.
        System.out.println("Abstand zwischen den Punkten: " + punkt1.abstandZu(punkt2));
        
        System.out.println("Spiegelung von Punkt 1 an der X-Achse: " + punkt1.spiegelungAnX());
        System.out.println("Spiegelung von Punkt 1 an der Y-Achse: " + punkt1.spiegelungAnY());
        System.out.println("Spiegelung von Punkt 1 am Ursprung: " + punkt1.spiegelungAmUrsprung());
    }
}
