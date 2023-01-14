import Driver.Driver;
import Driver.DType;
import Driver.CType;
import Driver.BType;
import Exceptions.DiagnosticsNotPassed;
import Exceptions.LicenceIssue;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;
public class Main {
    public static void main(String[] args) throws DiagnosticsNotPassed, LicenceIssue {
        Bus bus = new Bus("IKA", "RUS", 100, Bus.Capacity.LARGE);
        Car car2 = new Car("Lada", "Vesta", 900, Car.BodyType.CROSSOVER);
        Truck truck = new Truck("UAZ", "PATRIOT", 300, Truck.LoadCapacity.Small);
        Car car = new Car("LAMBO", "FERRA", 200, Car.BodyType.HATCHBACK);
        System.out.println(truck.toString());
        System.out.println(bus.toString());
        System.out.println(car2.toString());
        System.out.println(car.toString());
        bus.pitStop();
        bus.printType();
        car.pitStop();
        truck.pitStop();
        truck.maxSpeed(300);
        bus.bestTime(19);
        car.diagnostics();
        car.maxSpeed(200);
        BType millie = new BType("Millie", "P", 10);
        millie.startMove(car);
        millie.endMove(car);
        millie.refuelCar();
//        millie.checkDriver(car);
        CType willie = new CType("Willie", "C", 100);
        willie.startMove(bus);
        willie.endMove(bus);
        willie.refuelCar();
//        willie.checkDriver(bus);
        DType dillie = new DType("Dillie", "D", 20);
        dillie.startMove(truck);
        dillie.endMove(truck);
        dillie.refuelCar();
//        dillie.checkDriver(truck);
    }
}