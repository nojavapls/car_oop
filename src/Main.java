public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada",  "Granta", 1.7, "желтый", 2015, "Россия", "автомат", "хэтчбек", "A666МР", 4, false);
        Car car2 = new Car("Audi",  "A8 50 L TDI quattro", 3.0, null, 2020, "Германия", "автомат", "хэтчбек", "A126МР", 4, true);
        Car car3 = new Car("BMW",  "Z8", 2021, null, 2015, "Германия", "автомат", "хэтчбек", "A001МР", 4, false);
        Car car4 = new Car("Kia",  null, 2.4, "красный", 2018, "Южная Корея", "автомат", "хэтчбек", "A012МР", 4, true);
        Car car5 = new Car("Hyundai",  "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "автомат", "пикап", "A777МР", 4, false);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
        car5.changeTires(true);
        System.out.println(car5.getTires());
    }
}