public class HybridCar {

    public static void main(String[] args) {
        Hybrid aHybrid = new Hybrid();

        double miles = 300;
        aHybrid.setElectricMiles(miles);
        aHybrid.setTotalkWh(70.0);

        double MPGe = aHybrid.calcMPGe();
        System.out.println("MPGe: " + MPGe);

        aHybrid.setMilesfromGas(120.0);
        aHybrid.setGallonsfromGas(6.0);
        double MPG = aHybrid.calcGasMPG();
        System.out.println("MPG: " + MPG);

        double average = (MPGe + MPG) / 2;
        System.out.println("Average MPG in hybrid mode: " + average);
    }
}
