import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TypeBorne typeBorne1 = new TypeBorne(1L, "ABC", 45, 34, 110);
        TypeBorne typeBorne2 = new TypeBorne(2L, "DEF", 30, 21, 80);

        Borne borne1 = new Borne(1L, LocalDate.parse("2021-09-08"), 101, typeBorne1);
        Borne borne2 = new Borne(2L, LocalDate.parse("2021-08-28"), 60, typeBorne2);
        Borne borne3 = new Borne(3L, LocalDate.parse("2021-07-08"), 50, typeBorne1);

        Borne borne4 = new Borne(4L, LocalDate.parse("2021-09-01"), 82, typeBorne1);
        Borne borne5 = new Borne(5L, LocalDate.parse("2021-09-10"), 201, typeBorne2);

        Borne borne6 = new Borne(6L, LocalDate.parse("2021-09-12"), 8, typeBorne2);
        Borne borne7 = new Borne(7L, LocalDate.parse("2021-08-30"), 21, typeBorne2);

        ArrayList<Borne> stationBorne1 = new ArrayList<Borne>();
        stationBorne1.add(borne1);
        stationBorne1.add(borne2);
        stationBorne1.add(borne3);

        ArrayList<Borne> stationBorne2 = new ArrayList<Borne>();
        stationBorne2.add(borne4);
        stationBorne2.add(borne5);

        ArrayList<Borne> stationBorne3 = new ArrayList<Borne>();
        stationBorne2.add(borne6);
        stationBorne2.add(borne7);

        Station station1 = new Station(1L, "Paris 1", stationBorne1);
        Station station2 = new Station(2L, "Paris 5", stationBorne2);
        Station station3 = new Station(3L, "Paris 12", stationBorne3);

        Technicien tech1 = new Technicien(1L, "Nom1", "Prenom1");
        Technicien tech2 = new Technicien(2L, "Nom2", "Prenom2");

        Maintenance.reviser();
        System.out.println(Maintenance.affecterVisites());
    }
}
