import thermos.Thermostat;

import static java.lang.Thread.sleep;

public class MainThermos {

    public static void main(String[] args) throws InterruptedException {
        Telecommande telecommande = new Telecommande();
        ThermosAdaptateur adaptateur = new ThermosAdaptateur();
        sleep(2000);
        while(true) {
            for (int i = 0; i < 10; i++) {
                adaptateur.eteindre();
                sleep(100);
            }
            for (int i = 0; i < 10; i++) {
                adaptateur.allumer();
                sleep(100);
            }
        }
    }
}
