import thermos.Thermostat;

public class ThermosAdaptateur implements Appareil{
    private Thermostat thermos;

    public ThermosAdaptateur(){
        this.thermos = new Thermostat();
    }

    @Override
    public void allumer() {
        this.thermos.monterTemperature();
    }

    @Override
    public void eteindre() {
        this.thermos.baisserTemperature();
    }
}
