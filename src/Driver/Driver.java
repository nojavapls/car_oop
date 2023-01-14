package Driver;

import Exceptions.LicenceIssue;
import Transport.Transport;
import Transport.Competing;

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
        try {
            if (hasLicence != null && !hasLicence.isEmpty() && !hasLicence.isBlank() && (hasLicence.contains("D") || hasLicence.contains("C") || hasLicence.contains("B") )) {
                this.hasLicence = hasLicence;
            }} catch (Exception e) {
            throw new LicenceIssue("Необходимо указать тип прав!");
        }
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

}

