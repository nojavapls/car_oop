package Driver;

import Exceptions.LicenceIssue;
import Transport.Transport;
import Transport.Competing;

import java.util.Objects;

import static Transport.Transport.*;

public abstract class Driver<T extends Transport & Competing>  implements Driving {
    private String driverName;
    private String hasLicence;
    private int yearsOfDriving;

    public Driver(String driverName, String hasLicence, int yearsOfDriving) throws LicenceIssue {
        if (driverName == null || driverName.length() == 0) {
            this.driverName = "Joe Doe";
        } else {
            this.driverName = driverName;
        }
//        try {
//            if (hasLicence != null && !hasLicence.isEmpty() && !hasLicence.isBlank() && (hasLicence.contains("D") || hasLicence.contains("C") || hasLicence.contains("B") )) {
//                this.hasLicence = hasLicence;
//            }} catch (Exception e) {
//            throw new LicenceIssue("Необходимо указать тип прав!");

            if (hasLicence == null || hasLicence.isEmpty() || hasLicence.isBlank())
                throw new LicenceIssue("Необходимо указать тип прав!");
            else
                this.hasLicence = hasLicence;
//        }
        if (yearsOfDriving < 0) {
            this.yearsOfDriving = Math.abs(yearsOfDriving);
        } else {
            this.yearsOfDriving = yearsOfDriving;
        }
    }

    public int getYearsOfDriving() {
        return yearsOfDriving;
    }

    public String getDriverName() {
        return driverName;
    }

//    public String checkLicence() {
//        if (hasLicence == true) {
//            return "ok";
//        } else
//            return "discarded";
//    }

    @Override
    public void startMove(Transport transport) {
        System.out.println(driverName + " started moving");
    }

    @Override
    public void endMove(Transport transport) {
        System.out.println(driverName + " stopped.");
    }

//    public void checkDriver(T transport) {
//        if (hasLicence != null || !hasLicence.isEmpty() || !hasLicence.isBlank() && (hasLicence.contains("D") ||hasLicence.contains("C") || hasLicence.contains("B") )) {
//            System.out.println("Driver " + getDriverName() +
//                    " runs auto " + transport.getBrand() +
//                    " and will compete in a race!");
//        } else {
//            System.out.println("Driver " + getDriverName() +
//                    " attempts to drive  " + transport.getBrand() +
//                    " with no license. Call the police!");
//        }
//    }


    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Driver other = (Driver) obj;
        if (driverName == null) {
            if (other.driverName != null)
                return false;
        } else if (!driverName.equals(other.driverName) || !hasLicence.equals(other.hasLicence) || yearsOfDriving != other.yearsOfDriving)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverName, hasLicence, yearsOfDriving);
    }

    public void toString(Driver driver) {
        System.out.println(driverName + hasLicence + yearsOfDriving);
    }
}

