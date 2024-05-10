public class Radio {
    private boolean eingeschaltet;
    private int lautstaerke;
    private double frequenz;

    // Konstruktor ohne Parameter
    public Radio() {
        this.eingeschaltet = false;
        this.lautstaerke = 0;
        this.frequenz = 99.9; // Standardfrequenz, falls keine Frequenz festgelegt ist
    }

    // Konstruktor mit Parametern
    public Radio(boolean istAn, int lautstaerke, double frequenz) {
        this.eingeschaltet = istAn;
        this.lautstaerke = Math.max(0, Math.min(lautstaerke, 10)); // Lautstärke im Bereich von 0 bis 10 begrenzen
        this.frequenz = (frequenz >= 85.0 && frequenz <= 110.0) ? frequenz : 99.9; // Frequenz im erlaubten Bereich festlegen
    }

    // Methode zum lauter machen
    public void lauter() {
        if (eingeschaltet && lautstaerke < 10) {
            lautstaerke++;
        }
    }

    // Methode zum leiser machen
    public void leiser() {
        if (eingeschaltet && lautstaerke > 0) {
            lautstaerke--;
        }
    }

    // Methode zum Einschalten des Radios
    public void an() {
        eingeschaltet = true;
    }

    // Methode zum Ausschalten des Radios
    public void aus() {
        eingeschaltet = false;
    }

    // Methode zum Wählen des Senders
    public void waehleSender(double frequenz) {
        this.frequenz = (frequenz >= 85.0 && frequenz <= 110.0) ? frequenz : 99.9;
    }

    // Überschreiben der toString-Methode
    @Override
    public String toString() {
        return "Radio an: " + "Freq: " + frequenz + ", Laut=" + lautstaerke;
    }
}
