public class AppAuto {

    public static void main(String[] args) {


        // Erzeuge zwei Autos
        Auto auto1 = new Auto("ABC123", 0, 60, 8, 30);
        Auto auto2 = new Auto( "DEF456", 0, 50, 10, 20);

        // Tanken und Fahren
        auto1.tanken(20);
        auto1.fahren(100);

        auto2.tanken(25);
        auto2.fahren(50);

        // Ausgabe der aktuellen Werte
        System.out.println("Auto 1 - Kilometerstand: " + auto1.getKilometerstand() +
                ", Kraftstoffmenge: " + auto1.getKraftstoffmenge());

        System.out.println("Auto 2 - Kilometerstand: " + auto2.getKilometerstand() +
                ", Kraftstoffmenge: " + auto2.getKraftstoffmenge());
    }
}


