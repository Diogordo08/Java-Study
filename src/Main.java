import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car newCar = new Car();

        System.out.println("Car manager 2000");

        boolean exit = false;
        do
        {
            System.out.println("---");
            System.out.println("Menu");
            System.out.println("1- Add car");
            System.out.println("2- On/Off engine");
            System.out.println("3- My car info");
            System.out.println("4- Close");
            int choose = scan.nextInt();
            switch (choose){
                case 1:
                    newCar.createNewCar(scan);
                break;

                case 2:
                    if(newCar.model == null){
                        System.out.println("You don't have a car");
                    }
                    else{
                        newCar.turnOnOffEngine(newCar.model);
                    }
                break;

                case 3:
                    if(newCar.model == null){
                        System.out.println("You don´t have a car");
                    }
                    else{
                        newCar.info();
                    }
                break;

                case 4:
                    System.out.println("Closing...");
                    exit = true;
                break;
            }
        }
        while(!exit);
    }
}