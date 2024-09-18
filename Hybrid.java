public class Hybrid implements ElectricInterface, GasolineInterface {

    private double gasMPG;
    private double MPGe;
    private double miles;
    private double gallons;
    private double kWh;

    private final double MPG_E = 33.7;

    @Override
    public double calcGasMPG() {
        gasMPG = miles / gallons;
        return gasMPG;
    }

    @Override
    public double calcMPGe() {
        MPGe = (miles / kWh) * MPG_E;
        return MPGe;
    }

    @Override
    public void setMilesfromGas(double miles) {
        this.miles = miles;
    }

    @Override
    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }

    @Override
    public void setElectricMiles(double totalElectricMiles) {
        this.miles = totalElectricMiles;
    }

    @Override
    public void setTotalkWh(double totalkWh) {
        this.kWh = totalkWh;
    }
}
