import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Appareil> appareils;

    public Telecommande() {
        appareils = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Appareil appareil) {
        appareils.add(appareil);
    }

    public void activerAppareil(int indiceAppareil) {
        appareils.get(indiceAppareil).allumer();
    }


    public void desactiverAppareil(int indiceAppareil) {
        appareils.get(indiceAppareil).eteindre();
    }


    public void activerTout() {
        for (Appareil appareil : appareils) {
            appareil.allumer();
        }
    }

    public void desactiverTout() {
        for (Appareil appareil : appareils) {
            appareil.eteindre();
        }
    }

    @Override
    public String toString() {
        String res = "La telecommande controle : \n";
        for (Appareil appareil : appareils) {
            res += appareil+ "\n";
        }
        return res;
    }

    public ArrayList<Appareil> getAppareils() {
        return appareils;
    }

    public int getNombre() {
        return appareils.size();
    }
}
