import java.util.List;

public class Driver {
    private String name;
    private String licenseNumber;
    private List<Vehicle> vehicles;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public void displayDriverInfo() {
        System.out.println("Driver: " + name + ", License: " + licenseNumber);
    }
}
