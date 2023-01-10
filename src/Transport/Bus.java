package Transport;
import Driver.Driver;
public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, int engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " pit stopped.");
    }


    @Override
    public void maxSpeed(int speed) {
        System.out.println(this.getBrand() + " " + "max speed: " + speed);
    }

    @Override
    public void bestTime(int time) {
        System.out.println(this.getBrand() + " " + "best time: " + time);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}