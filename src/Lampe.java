public class Lampe {
    private String nom;
    private boolean allume;


    public Lampe(String nom) {
        this.nom = nom;
        this.allume = false;
    }

    public String getNom() {
        return this.nom;
    }

    public void allumer() {
        this.allume = true;
    }

    public void eteindre() {
        this.allume = false;
    }

    public boolean estAllume() {
        return this.allume;
    }

    public String toString() {
        return this.nom + " est " + (this.allume ? "allumée" : "éteinte");
    }

}
