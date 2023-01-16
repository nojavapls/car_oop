import Driver.Driver;
import Driver.DType;
import Driver.CType;
import Driver.BType;
import Exceptions.DiagnosticsNotPassed;
import Exceptions.LicenceIssue;
import ServiceStation.ServiceStation;
import Transport.Bus;
import Transport.Car;
import Transport.Transport;
import Transport.Truck;
import Mechanic.Mechanic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws DiagnosticsNotPassed, LicenceIssue {

        Mechanic dane = new Mechanic("Dane", "SMART AUTO");
        Mechanic chuck = new Mechanic("Chuck", "LIGHT");
        Mechanic stan = new Mechanic("Stan", "SPORT");
        Mechanic jack = new Mechanic("Jack", "ROSE");
        Mechanic kyle = new Mechanic("Kyle", "BLAST");

        List<Mechanic> mechanicsTeam1 = new ArrayList<>();

        mechanicsTeam1.add(dane);
        mechanicsTeam1.add(chuck);
        mechanicsTeam1.add(stan);

        List<Mechanic> mechanicsTeam2 = new ArrayList<>();

        mechanicsTeam2.add(jack);
        mechanicsTeam2.add(kyle);

        BType millie = new BType("Millie", "B", 10);
        CType willie = new CType("Willie", "C", 100);
        DType dillie = new DType("Dillie", "D", 20);


        List<Transport> allTransport = new ArrayList<>();

        Bus bus = new Bus("IKA", "RUS", 100, mechanicsTeam1, willie, Bus.Capacity.LARGE);
        Car car2 = new Car("Lada", "Vesta", 900, mechanicsTeam1, millie, Car.BodyType.CROSSOVER);
        Truck truck = new Truck("UAZ", "PATRIOT", 300, mechanicsTeam2, dillie, Truck.LoadCapacity.Small);
        Car car = new Car("LAMBO", "FERRA", 200, mechanicsTeam2, millie, Car.BodyType.HATCHBACK);

        allTransport.add(car2);
        allTransport.add(bus);
        allTransport.add(car);
        allTransport.add(truck);

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


        millie.startMove(car);
        millie.endMove(car);
        millie.refuelCar();

        willie.startMove(bus);
        willie.endMove(bus);
        willie.refuelCar();

        dillie.startMove(truck);
        dillie.endMove(truck);
        dillie.refuelCar();

        //всякое со список водителей
        List<Driver> allDrivers = new ArrayList<>();
        allDrivers.add(millie);
        allDrivers.add(willie);
        allDrivers.add(dillie);



        chuck.fixing(car2);
        dane.maintenance(truck);
        stan.fixing(bus);


        car.getMechanicsInfo();
        truck.getMechanicsInfo();
        bus.getMechanicsInfo();
        car2.getDriverInfo();


        //ЗАДАНИЯ НА ОЧЕРЕДЬ - тяжко
        Queue<Transport> queue = new LinkedList<Transport>();
        System.out.println(allTransport.size());
        ServiceStation.createServiceStation(allTransport, queue);
        Car car3 = new Car("Mazda", "CX5", 700, mechanicsTeam1, millie, Car.BodyType.HATCHBACK);
        ServiceStation.addAuto(car3, queue);
        System.out.println(allTransport.size());
        System.out.println(queue.size());
        ServiceStation.getService(queue);
    }
}