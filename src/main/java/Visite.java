import java.util.ArrayList;
import java.util.List;

public class Visite {
    private Long id;
    private String etat;
    private int dureeTotal;
    private Station laStation;
    private List<Borne> lesBornes = new ArrayList<Borne>();

    public Visite(List<Borne> lesBornesAVisiter, Station uneStation) {
        this.etat = "p";
        this.lesBornes = lesBornesAVisiter;
        this.laStation = uneStation;
        int total = 0;
        for (Borne borneAVisiter : lesBornesAVisiter) {
            total += borneAVisiter.getDureeRevision();
        }
        this.dureeTotal = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getDureeTotal() {
        return dureeTotal;
    }

    public void setDureeTotal(int dureeTotal) {
        this.dureeTotal = dureeTotal;
    }

    public Station getLaStation() {
        return laStation;
    }

    public void setLaStation(Station laStation) {
        this.laStation = laStation;
    }

    public List<Borne> getLesBornes() {
        return lesBornes;
    }

    public void setLesBornes(List<Borne> lesBornes) {
        this.lesBornes = lesBornes;
    }

    public void addVisiteBorne(Borne borne) {
        this.lesBornes.add(borne);
    }

    @Override
    public String toString() {
        return "Visite{" +
                "id=" + id +
                ", etat='" + etat + '\'' +
                ", dureeTotal=" + dureeTotal +
                ", laStation=" + laStation +
                ", lesBornes=" + lesBornes +
                '}';
    }
}
