

 class Auto {

     private String KFZKennzeichen;
     private int Kilometerstand;
     private double Tankvolumen;
     private double Kraftstoffverbrauch;
     private double Kraftstoffmenge;

      public Auto(String KFZKennzeichen, int Kilometerstand, double Tankvolumen, double Kraftstoffverbrauch, double Kraftstoffmenge) {
            this.KFZKennzeichen = KFZKennzeichen;
            this.Kilometerstand = Kilometerstand;
            this.Tankvolumen = Tankvolumen;
            this.Kraftstoffverbrauch = Kraftstoffverbrauch;
            this.Kraftstoffmenge = Kraftstoffmenge;
        }

     // Tanken-Methode
     public void tanken(double menge) {
         if (Kraftstoffmenge + menge <= Tankvolumen) {
             Kraftstoffmenge += menge;
             System.out.println("Tanken abgeschlossen. Neue Kraftstoffmenge: " + Kraftstoffmenge);
         } else {
             System.out.println("Tankvolumen überschritten.");
         }
     }
     // Fahren-Methode
     public void fahren(double strecke) {
         if (strecke * Kraftstoffverbrauch <= Kraftstoffmenge) {
             Kilometerstand += strecke;
             Kraftstoffmenge -= strecke * Kraftstoffverbrauch;
             System.out.println("Auto ist " + strecke + " Kilometer gefahren.");
         } else {
             System.out.println("Nicht genug Kraftstoff für die angegebene Strecke.");
         }
     }
     public String getKFZKennzeichen() {
         return KFZKennzeichen;
     }

     public double getKraftstoffmenge() {
         return Kraftstoffmenge;
     }

     public double getKilometerstand () {
         return Kilometerstand;
     }
    }

