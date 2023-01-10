package Driver;

import Transport.Transport;

public interface Driving {
//    public void startMove();

    void startMove(Transport transport);

    public void endMove(Transport transport);

    public default void refuelCar() {
        System.out.println("Refueling!");
    }
}