import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * classe de test permettant de tester la classe Telecommande
 */
public class TelecommandeTest {

    @Test
    /**
     * test ajout d'une lampe à une télécommande vide
     */
    public void test_ajoutLampe(){
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("lampe");
        telecommande.ajouterAppareil(lampe);

        assertEquals(lampe, telecommande.getAppareils().get(0));
    }

    @Test
    /**
     * test d'ajout d'une lampe à une télécommande avec 1 élément
     */
    public void test_ajoutLampe1Element(){
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("l2");
        telecommande.ajouterAppareil(new Lampe("l1"));
        telecommande.ajouterAppareil(lampe);

        assertEquals(lampe, telecommande.getAppareils().get(1));
    }

    @Test
    /**
     * test activation d'une lampe existante en position 0
     */
    public void test_activationLampePos0(){
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("lampe");
        telecommande.ajouterAppareil(lampe);
        telecommande.activerAppareil(0);

        assertEquals(true, lampe.isAllume());
    }

    @Test
    /**
     * test activation d'une lampe existante en position 1
     */
    public void test_activationLampePos1(){
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("l2");
        telecommande.ajouterAppareil(new Lampe("l1"));
        telecommande.ajouterAppareil(lampe);
        telecommande.activerAppareil(1);

        assertEquals(true, lampe.isAllume());
    }

    @Test
    /**
     * test activation d'une lampe inexistante
     */
    public void test_activationLampeInexistante(){
        Telecommande telecommande = new Telecommande();
        boolean ok = false;
        try {
            telecommande.activerAppareil(0);
        } catch(IndexOutOfBoundsException e){
            ok = true;
        }

        assertEquals(true, ok);

    }

    @Test
    /**
     * test activation d'une cheminée
     */
    public void test_activationChemineeHerite(){
        Telecommande telecommande = new Telecommande();
        ChemineeAdaptateur cheminee = new ChemineeAdaptateur();
        telecommande.ajouterAppareil(cheminee);
        telecommande.activerAppareil(0);

        assertEquals(10, cheminee.getLumiere());
    }

    @Test
    /**
     * test pour éteindre une cheminée
     */
    public void test_eteindreChemineeHerite(){
        Telecommande telecommande = new Telecommande();
        ChemineeAdaptateur cheminee = new ChemineeAdaptateur();
        telecommande.ajouterAppareil(cheminee);
        telecommande.activerAppareil(0);
        telecommande.desactiverAppareil(0);

        assertEquals(0, cheminee.getLumiere());
    }

    @Test
    /**
     * test activation d'une cheminée
     */
    public void test_activationChemineeAttribut(){
        Telecommande telecommande = new Telecommande();
        Cheminee cheminee = new Cheminee();
        ManipuleChemineeAttribut chemineeAdapt = new ManipuleChemineeAttribut(cheminee);
        telecommande.ajouterAppareil(chemineeAdapt);
        telecommande.activerAppareil(0);

        assertEquals(10, chemineeAdapt.getCheminee().getLumiere());
    }

    @Test
    /**
     * test pour éteindre une cheminée
     */
    public void test_eteindreChemineeAttribut(){
        Telecommande telecommande = new Telecommande();
        Cheminee cheminee = new Cheminee();
        ManipuleChemineeAttribut chemineeAdapt = new ManipuleChemineeAttribut(cheminee);
        telecommande.ajouterAppareil(chemineeAdapt);
        telecommande.activerAppareil(0);
        telecommande.desactiverAppareil(0);

        assertEquals(0, chemineeAdapt.getCheminee().getLumiere());
    }
}
