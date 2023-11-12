import java.lang.invoke.VarHandle;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();

        int in;
        do {
            System.out.println("1. Rent a car");
            System.out.println("2. Rent a bike");
            System.out.println("3. Rent a truck");
            System.out.println("4. View rented vehicles");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            in = input.nextInt();

            switch (in) {
                case 1:
                    String model = input.nextLine();
                    System.out.print("Enter Car Model: ");
                    model = input.nextLine();
                    System.out.println(" ");
                    System.out.print("Enter Rental Days: ");
                    int days = input.nextInt();
                    car = new Car(model,days);
                    rentedVehicles.add(car);
                    break;

                case 2:
                    String brand = input.nextLine();
                    System.out.print("Enter Bike Brand: ");
                    brand = input.nextLine();
                    System.out.println(" ");
                    System.out.print("Enter Rental Hours: ");
                    int hours = input.nextInt();
                    bike = new Bike(brand,hours);
                    rentedVehicles.add(bike);
                    break;

                case 3:
                    String type = input.nextLine();
                    System.out.print("Enter Truck Type: ");
                    type = input.nextLine();
                    System.out.println(" ");
                    System.out.print("Enter Rental Weeks: ");
                    int weeks = input.nextInt();
                    truck = new Truck(type,weeks);
                    rentedVehicles.add(truck);
                    break;

                case 4:
                    for (Vehicle v: rentedVehicles) {
                        v.displayDetails();
                        v.calculateRentalCost();
                }
                    break;
            }

        }while (in != 5);

    }
}