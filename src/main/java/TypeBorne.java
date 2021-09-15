public class TypeBorne {
    private Long id;
    private String codeTypeBorne;
    private int dureeRevision;
    private int nbJoursEntreRevisions;
    private int nbUnitesEntreRevisions;

    public TypeBorne(Long id, String codeTypeBorne, int dureeRevision, int nbJoursEntreRevisions, int nbUnitesEntreRevisions) {
        this.id = id;
        this.codeTypeBorne = codeTypeBorne;
        this.dureeRevision = dureeRevision;
        this.nbJoursEntreRevisions = nbJoursEntreRevisions;
        this.nbUnitesEntreRevisions = nbUnitesEntreRevisions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeTypeBorne() {
        return codeTypeBorne;
    }

    public void setCodeTypeBorne(String codeTypeBorne) {
        this.codeTypeBorne = codeTypeBorne;
    }

    public int getDureeRevision() {
        return dureeRevision;
    }

    public void setDureeRevision(int dureeRevision) {
        this.dureeRevision = dureeRevision;
    }

    public int getNbJoursEntreRevisions() {
        return nbJoursEntreRevisions;
    }

    public void setNbJoursEntreRevisions(int nbJoursEntreRevisions) {
        this.nbJoursEntreRevisions = nbJoursEntreRevisions;
    }

    public int getNbUnitesEntreRevisions() {
        return nbUnitesEntreRevisions;
    }

    public void setNbUnitesEntreRevisions(int nbUnitesEntreRevisions) {
        this.nbUnitesEntreRevisions = nbUnitesEntreRevisions;
    }

    @Override
    public String toString() {
        return "TypeBorne{" +
                "id=" + id +
                ", codeTypeBorne='" + codeTypeBorne + '\'' +
                ", dureeRevision=" + dureeRevision +
                ", nbJoursEntreRevisions=" + nbJoursEntreRevisions +
                ", nbUnitesEntreRevisions=" + nbUnitesEntreRevisions +
                '}';
    }
}
