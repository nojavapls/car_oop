public class Car extends Transport {
    private double engineVolume;

    private String transmission;
    final private String bodyType;
    private String registrationNumber;
    final private int numberOfSeats;
    private boolean tires;

    public class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
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


    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean tires, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        if (engineVolume <= 0)
            this.engineVolume = 1.5;
        else
            this.engineVolume = engineVolume;
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

    public double getEngineVolume(){
        return this.engineVolume;
    }

    public void setEngineVolume(double engineVolume){
        this.engineVolume = engineVolume;
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
    @Override
    public String toString() {
        String type;
        if (this.tires == false)
        type = "зимняя";
                else
        type = "летняя";
        return ("Информация о машине: бренд " + this.getBrand() + ", модель " + this.getModel() + ", объем двигателя " + this.engineVolume + ", цвет  " + this.getColor()+ ", год выпуска: " + this.getYear() + ", страна производства: " + this.getCountry() + " коробка передач: " + this.transmission + "тип кузова: " + this.bodyType + "регистрационный номер: " + this.registrationNumber + "количество мест: " + this.numberOfSeats + "резина: " + type + "максимальная скорость: " + this.getMaxSpeed() );
    }
}

