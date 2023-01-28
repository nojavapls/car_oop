package Driver;
import Exceptions.LicenceIssue;
import Transport.Bus;
import Transport.Transport;
import Transport.Competing;
public class CType extends Driver<Bus>{

    public CType(String driverName, String hasLicence, int yearsOfDriving) throws LicenceIssue {
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
    public String toString() {
        return ("Карточка водителя. Имя: " + getDriverName() + ", " + "стаж: " + getYearsOfDriving());
    }
}