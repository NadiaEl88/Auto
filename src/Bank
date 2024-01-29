public class Bank {

    private String Name;
    private String Vorname;
    private double Kontonummer;
    private double Kontostand;
    private double Limit;

    // Konstruktor
    public Bank (String Name, String Vorname, double Kontonummer, double Kontostand, double Limit){
        this.Name = Name;
        this.Vorname = Vorname;
        this.Kontonummer = Kontonummer;
        this.Kontostand = Kontostand;
        this.Limit = Limit;
}

    //Einzahlungsmethode
    public void einzahlen (double betrag) {
    Kontostand += betrag;
    System.out.println("Einzahlung abgeschlossen. Neuer Kontostand: " + Kontostand);
    }

    //Auszahlungsmethode
    public void auszahlen(double betrag) {
    if (Kontostand - betrag >= 0){
        Kontostand -= betrag;
        System.out.println("Auszahlung abgeschlossen. Neuer Kontostand: " + Kontostand);
    } else {
        System.out.println("Nicht genügend Geld auf dem Konto.");
    }
    }

    //Abfragemethode Kontostand
    public double KontostandAbfrgen() {
    return Kontostand;
    }

    //toString Methode für Ausgabe von Kontodaten
    public String toString(){
    return "Kontodaten: "+
            "\nName: " + Name +
            "\nVorname: " + Vorname +
            "\nKontonummer: " + Kontonummer +
            "\nKontostand: " + Kontostand +
            "\nLimit: " + Limit;
    }

    public static void main (String[] args) {
        Bank bank = new Bank("Faul", "Peter", 123789456, 2000.0, 1000.0);
        System.out.println(bank);

        bank.einzahlen(300.0);

        bank.auszahlen(200.0);

        double kontostand = bank.KontostandAbfrgen();
        System.out.println("Aktueller Kontostand: " + kontostand);
    }
    }
