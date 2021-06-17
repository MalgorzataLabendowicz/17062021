public class Car {
    public String model;
    public String color;
    public String fuelType;
    public String makeYear;

    public Car(){
    }
    public Car(String model, String color, String fuelType, String makeYear){
        this.model = model;
        this.makeYear = makeYear;
        this.fuelType = fuelType;
        this.color =  color;
    }

    public Car(String model, String color, String fuelType) {
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
    }
//Metody//
    public void startEngine(){
        System.out.println("Silnik " + this.model + " został uruchomiony");
    }
}

