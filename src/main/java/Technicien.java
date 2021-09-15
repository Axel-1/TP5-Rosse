import java.util.HashSet;
import java.util.Set;

public class Technicien {
    private Long id;
    private String nom;
    private String prenom;
    private Set<Visite> lesVisites = new HashSet<Visite>();

    public Technicien(Long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        Maintenance.addTechnicien(this);
    }

    public int getTempsTotal() {
        if (lesVisites.isEmpty()) {
            return 0;
        } else {
            int tempsTotal = 0;
            for (Visite visite : lesVisites) {
                tempsTotal += visite.getDureeTotal();
            }
            return tempsTotal;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Set<Visite> getLesVisites() {
        return lesVisites;
    }

    public void setLesVisites(Set<Visite> lesVisites) {
        this.lesVisites = lesVisites;
    }

    public void addTechnicienVisite(Visite visite) {
        this.lesVisites.add(visite);
    }

    @Override
    public String toString() {
        return "Technicien{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", lesVisites=" + lesVisites +
                '}';
    }
}
