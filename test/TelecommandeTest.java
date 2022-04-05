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
        telecommande.ajouterLampe(lampe);

        assertEquals(lampe, telecommande.getLampes().get(0));
    }
}
