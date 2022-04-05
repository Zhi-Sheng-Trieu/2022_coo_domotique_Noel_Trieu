import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Lampe> lampes;

    public Telecommande() {
        lampes = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe lampe) {
        lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe) {
        lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        lampes.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        for (Lampe lampe : lampes) {
            lampe.allumer();
        }
    }

    public void desactiverTout() {
        for (Lampe lampe : lampes) {
            lampe.eteindre();
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
