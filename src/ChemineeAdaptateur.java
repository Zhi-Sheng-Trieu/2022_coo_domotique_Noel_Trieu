public class ChemineeAdaptateur extends Cheminee implements Appareil {

    public void allumer(){
        this.changerIntensite(this.getLumiere() + 10);
    }

    public void eteindre(){
        this.changerIntensite(0);
    }

}
