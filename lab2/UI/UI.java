package UI;

import Domain.Car;
import Service.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UI {

    private static Scanner input = new Scanner(System.in);

    private static Service service = new Service();

    private static Car read_car() {

        String make;
        String model;

        System.out.print("Enter car make: ");
        make = input.nextLine();

        System.out.print("Enter car model: ");
        model = input.nextLine();

        return new Car(make, model);
    }

    private static Integer read_id() {

        Integer id;

        System.out.println("Enter id:");

        id = input.nextInt();

        return id;
    }

    private static void add_car() {

        service.add(read_car());
    }

    private static void del_car() {
        service.delete_car(read_id());
    }

    private static void update_car() {

        service.update(read_id(), read_car());
    }

    private static void get_car() {

        for (Object car : service.getAllCars()) {

            System.out.println(car.toString() + '\n');
        }
    }

    private static void print_menu() {

        System.out.printf("add_car - \n" +
                "del_car - \n" +
                "update_car - \n" +
                "print_car - \n" +
                "exit - yeet\n");
    }

    public static void run() {

        while (true) {

            print_menu();

            System.out.println("Choose option:");
            String option=input.nextLine();

            switch (option) {

                case "add_car":
                    add_car();
                    break;
                case "del_car":
                    del_car();
                    break;
                case "update_car":
                    update_car();
                    break;
                case "print_car":
                    get_car();
                    break;
                case "exit":
                    System.out.println("Cya!");
                    System.exit(0);

            }

        }
    }
}
