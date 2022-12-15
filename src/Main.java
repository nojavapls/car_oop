public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada",  "Granta", 1.7, "желтый", 2015, "Россия");
        Car car2 = new Car("Audi",  "A8 50 L TDI quattro", 3.0, null, 2020, "Германия");
        Car car3 = new Car("BMW",  "Z8", 2021, null, 2015, "Германия");
        Car car4 = new Car("Kia",  null, 2.4, "красный", 2018, "Южная Корея");
        Car car5 = new Car("Hyundai",  "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
    }
}