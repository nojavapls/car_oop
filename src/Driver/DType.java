package Driver;
import Exceptions.LicenceIssue;
import Transport.Truck;
import Transport.Transport;
import Transport.Competing;
public class DType extends Driver<Truck>{

    public DType(String driverName, String hasLicence, int yearsOfDriving) throws LicenceIssue {
        super(driverName, hasLicence, yearsOfDriving);
    }

//    @Override
//    public void startMove() {
//        super.startMove();
//    }
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

//    @Override
    public String toString() {
     return ("Карточка водителя. Имя: " + getDriverName() + ", " + "стаж: " + getYearsOfDriving());
}
}
