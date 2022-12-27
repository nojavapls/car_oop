public class Transport {
    final private String brand;
    final private String model;
    final private int year;
    final private String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed){
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
        if (maxSpeed <= 0)
            this.maxSpeed = 100;
        else
            this.maxSpeed = maxSpeed;
    }

    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
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
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public String toString() {

        return ("Информация о машине: бренд " + this.brand + ", модель " + this.model  + ", цвет  " + this.color+ ", год выпуска: " + this.year + ", страна производства: " + this.country + "максимальная скорость: " + this.maxSpeed );
    }
}
