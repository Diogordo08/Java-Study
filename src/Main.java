import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Car newCar = new Car();

        System.out.println("Car manager 2000");

        boolean exit = false;
        do
        {
            System.out.println("Menu");
            System.out.println("1- Create new car");
            System.out.println("2- Start engine");
            System.out.println("3- Close");
            int choose = scanf.nextInt();
            switch (choose){
                case 1:
                    scanf.nextLine(); // Clear the last line, 'cause nextInt auto adds a \n after it

                    System.out.println("Car model:");
                    newCar.model = scanf.nextLine();

                    System.out.println("Car brand:");
                    newCar.brand = scanf.nextLine();

                    System.out.println("Car year:");
                    newCar.year= scanf.nextInt();
                    scanf.nextLine(); // Again

                    System.out.println("Car color:");
                    newCar.color = scanf.nextLine();
                break;

                case 2:
                    if(newCar.model.isEmpty()){
                        System.out.println("You don't have a car");
                    }
                    else{
                        newCar.turnOnEngine(newCar.model);
                    }
                break;

                case 3:
                    System.out.println("Closing...");
                    exit = true;
                break;
            }
        }
        while(!exit);
    }
}