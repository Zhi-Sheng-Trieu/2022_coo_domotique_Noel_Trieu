import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Lampe> lampes;
    private ArrayList<Hifi> hifis;

    public Telecommande() {
        lampes = new ArrayList<Lampe>();
        hifis = new ArrayList<Hifi>();
    }

    public void ajouterLampe(Lampe lampe) {
        lampes.add(lampe);
    }

    public void ajouterHifi(Hifi hifi) {
        hifis.add(hifi);
    }

    public void activerLampe(int indiceLampe) {
        lampes.get(indiceLampe).allumer();
    }

    public void activerHifi(int indiceHifi) {
        hifis.get(indiceHifi).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        lampes.get(indiceLampe).eteindre();
    }

    public void desactiverHifi(int indiceHifi) {
        hifis.get(indiceHifi).eteindre();
    }

    public void activerTout() {
        for (Lampe lampe : lampes) {
            lampe.allumer();
        }
        for (Hifi hifi : hifis) {
            hifi.allumer();
        }
    }

    public void desactiverTout() {
        for (Lampe lampe : lampes) {
            lampe.eteindre();
        }
        for (Hifi hifi : hifis) {
            hifi.eteindre();
        }
    }

    @Override
    public String toString() {
        String res = "La telecommande controle : \n";
        for (Lampe lampe : lampes) {
            res += lampe+ "\n";
        }
        return res;
    }

    public ArrayList<Lampe> getLampes() {
        return lampes;
    }
}
