import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Station {
    private Long id;
    private String libelleEmplacement;
    private List<Borne> lesBornes = new ArrayList<Borne>();

    public Station(Long id, String libelleEmplacement, List<Borne> lesBornes) {
        this.id = id;
        this.libelleEmplacement = libelleEmplacement;
        this.lesBornes = lesBornes;
        Maintenance.addStation(this);
    }

    public Optional<Visite> getVisiteAFaire() {
        List<Borne> lesBornesAReviser = new ArrayList<Borne>();
        for (Borne borne : this.lesBornes) {
            if (borne.estAReviser()) {
                lesBornesAReviser.add(borne);
            }
        }
        if (lesBornesAReviser.isEmpty()) {
            return Optional.empty();
        } else {
            Visite visite = new Visite(lesBornesAReviser, this);
            return Optional.of(visite);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelleEmplacement() {
        return libelleEmplacement;
    }

    public void setLibelleEmplacement(String libelleEmplacement) {
        this.libelleEmplacement = libelleEmplacement;
    }

    public List<Borne> getLesBornes() {
        return lesBornes;
    }

    public void setLesBornes(List<Borne> lesBornes) {
        this.lesBornes = lesBornes;
    }

    public void addBorne(Borne borne) {
        this.lesBornes.add(borne);
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", libelleEmplacement='" + libelleEmplacement + '\'' +
                ", lesBornes=" + lesBornes +
                '}';
    }
}
