public class AppAuto {

    public static void main(String[] args) {


        // Erzeuge zwei Autos
        Auto auto1 = new Auto("ABC123", 0, 60.0,8.0, 30.0);
        Auto auto2 = new Auto( "DEF456", 0, 50.0, 10.0, 20.0);

        // Tanken und Fahren
        auto1.tanken(20.0);
        auto1.fahren(100.0);

        auto2.tanken(30.0);
        auto2.fahren(50.0);

        // Ausgabe der aktuellen Werte
        System.out.println("Auto 1 - Kilometerstand: " + auto1.getKilometerstand() +
                ", Kraftstoffmenge: " + auto1.getKraftstoffmenge());

        System.out.println("Auto 2 - Kilometerstand: " + auto2.getKilometerstand() +
                ", Kraftstoffmenge: " + auto2.getKraftstoffmenge());
    }
}


