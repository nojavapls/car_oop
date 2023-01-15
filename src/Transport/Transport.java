package Transport;

import Exceptions.DiagnosticsNotPassed;

public abstract class Transport implements Competing {
    private   String brand;
    private  String model;
    private  int engineVolume;
//    final private int year;
//    final private String country;
//    private String color;
//    private int maxSpeed;

    public Transport(String brand, String model, int engineVolume){
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
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return this.model;
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

}
