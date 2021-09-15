import java.time.LocalDate;

public class Borne {
    private Long id;
    private LocalDate dateDerniereRevision;
    private int indiceCompteurUnites;
    private TypeBorne leType;

    public Borne(Long id, LocalDate dateDerniereRevision, int indiceCompteurUnites, TypeBorne leType) {
        this.id = id;
        this.dateDerniereRevision = dateDerniereRevision;
        this.indiceCompteurUnites = indiceCompteurUnites;
        this.leType = leType;
    }

    public int getDureeRevision() {
        return this.leType.getDureeRevision();
    }

    public Boolean estAReviser() {
        LocalDate dateProchaineRevision = dateDerniereRevision.plusDays(this.leType.getNbJoursEntreRevisions());
        return this.indiceCompteurUnites >= this.leType.getNbUnitesEntreRevisions() || dateProchaineRevision.isBefore(LocalDate.now());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDerniereRevision() {
        return dateDerniereRevision;
    }

    public void setDateDerniereRevision(LocalDate dateDerniereRevision) {
        this.dateDerniereRevision = dateDerniereRevision;
    }

    public int getIndiceCompteurUnites() {
        return indiceCompteurUnites;
    }

    public void setIndiceCompteurUnites(int indiceCompteurUnites) {
        this.indiceCompteurUnites = indiceCompteurUnites;
    }

    public TypeBorne getLeType() {
        return leType;
    }

    public void setLeType(TypeBorne leType) {
        this.leType = leType;
    }

    @Override
    public String toString() {
        return "Borne{" +
                "id=" + id +
                ", dateDerniereRevision=" + dateDerniereRevision +
                ", indiceCompteurUnites=" + indiceCompteurUnites +
                ", leType=" + leType +
                '}';
    }
}
