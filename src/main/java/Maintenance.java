import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Maintenance {
    private static List<Visite> visites = new ArrayList<Visite>();
    private static List<Technicien> techniciens = new ArrayList<Technicien>();
    private static List<Station> stations = new ArrayList<Station>();

    public static List<Visite> getVisites() {
        return visites;
    }

    public static void setVisites(List<Visite> visites) {
        Maintenance.visites = visites;
    }

    public static List<Technicien> getTechniciens() {
        return techniciens;
    }

    public static void setTechniciens(List<Technicien> techniciens) {
        Maintenance.techniciens = techniciens;
    }

    public static List<Station> getStations() {
        return stations;
    }

    public static void setStations(List<Station> stations) {
        Maintenance.stations = stations;
    }

    public static void addVisite(Visite visite) {
        visites.add(visite);
    }

    public static void addTechnicien(Technicien technicien) {
        techniciens.add(technicien);
    }

    public static void addStation(Station station) {
        stations.add(station);
    }

    public static void reviser() {
        for (Station station : stations) {
            station.getVisiteAFaire().ifPresent(visite -> {
                if (visite.getEtat().equals("p")) {
                    visites.add(visite);
                }
            });
        }
    }

    public static List<Technicien> affecterVisites() {
        List<Visite> lesVisites = visites;
        List<Technicien> lesTechniciens = techniciens;

        // Tri de la collection lesVisites du plus grand au plus petit
        lesVisites.sort(Comparator.comparing(Visite::getDureeTotal));
        Collections.reverse(lesVisites);

        // Tri de la collection lesTechniciens du plus petit au plus grand
        lesTechniciens.sort(Comparator.comparing(Technicien::getTempsTotal));

        for (Visite visite : lesVisites) {
            visite.setEtat("a");
            lesTechniciens.get(0).addTechnicienVisite(visite);
            lesTechniciens.sort(Comparator.comparing(Technicien::getTempsTotal));
        }

        return lesTechniciens;
    }
}
