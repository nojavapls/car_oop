package Driver;
import Transport.Car;
import Transport.Transport;
import Transport.Competing;
public class BType extends Driver<Car>{

    public BType(String driverName, boolean hasLicence, int yearsOfDriving) {
        super(driverName, hasLicence, yearsOfDriving);
    }

//        @Override
//        public void startMove() {
//            super.startMove();
//        }
@Override
public void startMove(Transport transport) {
    System.out.println(getDriverName() + " started moving");
}

    @Override
    public void endMove(Transport transport) {
        System.out.println(getDriverName() + " stopped.");
    }

        @Override
        public void refuelCar() {
            System.out.println(getDriverName() + " refueling!");
        }

}
