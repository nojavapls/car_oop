package Transport;

import Exceptions.DiagnosticsNotPassed;
import Mechanic.Mechanic;
import Driver.Driver;

import javax.sound.midi.Soundbank;
import java.util.List;

public abstract class Transport implements Competing {
    private   String brand;
    private  String model;
    private  int engineVolume;
    public List<Mechanic> mechanics;
    private Driver driver;

    public Transport(String brand, String model, int engineVolume, List<Mechanic> mechanics, Driver driver){
        if (brand == null || brand.length() == 0)
            this.brand = "default";
        else
            this.brand = brand;
        if (model == null || model.length() == 0)
            this.model = "default";
        else
            this.model = model;
        if (engineVolume <= 0)
            this.engineVolume = 100;
        else
            this.engineVolume = engineVolume;
        if (mechanics != null)
            this.mechanics = mechanics;
        else
            System.out.println("У авто нет команды механиков");
        if (driver != null)
            this.driver = driver;
        else
            System.out.println("У авто нет водителя.");
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return this.model;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getEngineVolume(){
        return this.engineVolume;
    }


    public void startMove() {
        System.out.println(this.brand + " " + this.model + " started moving");
    }

    public void endMove() {
        System.out.println(brand + " " + model + " stopped.");
    }

    public String toString() {
        return brand + " "+ model + " " + engineVolume;
    }

    @Override
    public void pitStop() {
        System.out.println("pit stopped.");
    }


    @Override
    public void maxSpeed(int speed) {
        System.out.println(this.getBrand() + " " + "max speed: " + speed);
    }

    @Override
    public void bestTime(int time) {
        System.out.println(this.getBrand() + " " + "best time: " + time);
    }
    public abstract void printType();

    public abstract void diagnostics() throws DiagnosticsNotPassed;

    public  void getMechanicsInfo() {
        System.out.println("Список механиков автомобиля " + getBrand() + " " + getModel() + ":");
        if (mechanics.size() != 0) {
            for (int i = 0; i != mechanics.size(); i++) {
                System.out.println(mechanics.get(i).getMechanicName());
            }
        }
    }

    public void getDriverInfo(){
        System.out.println("Водитель авто " + getBrand()+ " " + getModel()+ ": " + driver.getDriverName());
    }

}
