public class ChemineeAdaptateur extends Cheminee implements Appareil {

    public ChemineeAdaptateur(){
        super();
    }

    public void allumer(){
        changerIntensite(getLumiere() + 10);
    }

    public void eteindre(){
        changerIntensite(0);
    }

}
