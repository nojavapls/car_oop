class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;


    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
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
    }

    public String toString() {
        return ("Информация о машине: бренд " + this.brand + ", модель " + this.model + ", объем двигателя " + this.engineVolume + ", цвет  " + this.color+ ", год выпуска: " + this.year + ", страна производства: " + this.country);
    }
}

