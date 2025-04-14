import java.util.Scanner;

public class Car {
    public String model;
    public String brand;
    public int year;
    public String color;
    boolean engine = false;

    void turnOnOffEngine(String model){
        if(engine){
            engine = false;
            System.out.println("Your " + model + " engine is off");
        }
        else{
            engine = true;
            System.out.println("Your " + model + " engine is on");
            System.out.println("Vruum vruum*");
        }
    }

    void createNewCar(Scanner scan){
        scan.nextLine(); // Clear the last line, 'cause nextInt auto adds a \n after it

        System.out.println("Car model:");
        model = scan.nextLine();

        System.out.println("Car brand:");
        brand = scan.nextLine();

        System.out.println("Car year:");
        year = scan.nextInt();
        scan.nextLine(); // Again

        System.out.println("Car color:");
        color = scan.nextLine();

        engine = false;
    }

    void info() {
        System.out.println("Your car model is: " + model);
        System.out.println("Your car brand is: " + brand);
        System.out.println("Your car year is: " + year);
        System.out.println("Your car color is: " + color);
    }
}
