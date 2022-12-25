class Car {
    final private String brand;
    final private String model;
    private double engineVolume;
    private String color;
    final private int year;
    final private String country;
    private String transmission;
    final private String bodyType;
    private String registrationNumber;
    final private int numberOfSeats;
    private boolean tires;

    public class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess){
            if (remoteEngineStart != true || remoteEngineStart != false)
                System.out.printf("Set correct remote Engine Start");
            else
                this.remoteEngineStart = remoteEngineStart;
            if (keylessAccess != true || keylessAccess != false)
                System.out.printf("Set correct keyless Access");
            else
                this.keylessAccess = keylessAccess;
        }

    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean tires) {
        if (engineVolume <= 0)
            this.engineVolume = 1.5;
        else
            this.engineVolume = engineVolume;
        if (year <= 0)
            this.year = 2000;
        else
            this.year = year;
        if (brand == null || brand.length() == 0)
            this.brand = "default";
        else
            this.brand = brand;
        if (model == null || model.length() == 0)
            this.model = "default";
        else
            this.model = model;
        if (country == null || country.length() == 0)
            this.country = "default";
        else
            this.country = country;
        if (color == null || color.length() == 0)
            this.color = "белый";
        else
            this.color = color;
        if (transmission == null || transmission.length() == 0)
            this.transmission = "default";
        else
            this.transmission = transmission;
        if (bodyType == null || bodyType.length() == 0)
            this.bodyType = "default";
        else
            this.bodyType = bodyType;
        if (registrationNumber == null || registrationNumber.length() == 0)
            this.registrationNumber = "default";
        else
            this.registrationNumber = registrationNumber;
        if (numberOfSeats == 0)
            this.numberOfSeats = 0;
        else
            this.numberOfSeats = numberOfSeats;
        if (tires != true || tires != false)
            System.out.printf("Set correct tires");
        else
            this.tires = tires;
    }

    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }

    public double getEngineVolume(){
        return this.engineVolume;
    }

    public void setEngineVolume(double engineVolume){
        this.engineVolume = engineVolume;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getYear(){
        return this.year;
    }
    public String getCountry(){
        return this.country;
    }

    public String getTransmission(){
        return this.transmission;
    }
    public void setTransmission(String transmission){
        this.transmission = transmission;
    }
    public String getBodyType(){
        return this.bodyType;
    }

    public String getRegistrationNumber(){
        return this.registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    public int getNumberOfSeats(){
        return this.numberOfSeats;
    }

    public boolean getTires(){
        return this.tires;
    }

    public void changeTires(boolean tires){
        this.tires = tires;
    }
    public String toString() {
        String type;
        if (this.tires == false)
        type = "зимняя";
                else
        type = "летняя";
        return ("Информация о машине: бренд " + this.brand + ", модель " + this.model + ", объем двигателя " + this.engineVolume + ", цвет  " + this.color+ ", год выпуска: " + this.year + ", страна производства: " + this.country + " коробка передач: " + this.transmission + "тип кузова: " + this.bodyType + "регистрационный номер: " + this.registrationNumber + "количество мест: " + this.numberOfSeats + "резина: " + type);
    }
}

