public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Nurakhmet Muktiyar", "A12345");
        Driver driver2 = new Driver("Lebron James", "B12345");

        Vehicle car = new Car("Toyota", 2020, driver1, 4, "Gasoline");
        Vehicle bike = new Motorcycle("BMW", 2018, driver2, false);
        Vehicle truck = new Truck("Mercedes", 2015, driver1, 12.5, 4);
        Vehicle[] vehicles = {car, bike, truck};

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
            System.out.println("------------");
        }
    }
}
