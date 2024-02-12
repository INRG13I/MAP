//package User_Interface;
//
//
//import Domain.Car;
//import Domain.Rent;
//import Service.Service;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//public class ConsoleInterface {
//
//    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//
//    private Service service;
//
//    private Scanner input = new Scanner(System.in);
//
//    public ConsoleInterface(Service service) {
//        this.service = service;
//    }
//
//    private void printMenu() {
//        System.out.print("""
//                1. Add car\s
//                2. Add rent
//                3. Delete car
//                4. Delete rent
//                5. Update car
//                6. Update rent
//                7. Show cars
//                8. Show rents
//                9. Get most rented cars
//                10. Nr. of rents per month in year
//                11. LongestRents
//                12. Exit
//                \s""");
//    }
//
//    private void addCar() {
//        Integer id;
//        String make;
//        String model;
//
//        System.out.println("Enter car id: ");
//        id = input.nextInt();
//        input.nextLine();
//        System.out.println("Enter car make: ");
//        make = input.nextLine();
//        System.out.println("Enter car model: ");
//        model = input.nextLine();
//
//        service.addCar(new Car(id, make, model));
//
//    }
//
//
//    private void deleteCar() {
//        Integer id;
//
//        System.out.println("Enter car id: ");
//        id = input.nextInt();
//        input.nextLine();
//
//        service.deleteCar(id);
//
//    }
//
//
//
//    private void updateCar() {
//        Integer idToUpdate;
//        Integer id;
//        String make;
//        String model;
//        System.out.println("Enter id of car to update: ");
//        idToUpdate = input.nextInt();
//        input.nextLine();
//        System.out.println("Enter new car id: ");
//        id = input.nextInt();
//        input.nextLine();
//        System.out.println("Enter new car make: ");
//        make = input.nextLine();
//        System.out.println("Enter new car model: ");
//        model = input.nextLine();
//
//        service.updateCar(idToUpdate, new Car(id, make, model));
//    }
//
//
//
//    private void showAllCars() {
//        for (Car car : service.getAllCars()) {
//            System.out.println(car.toString());
//        }
//    }
//
//
//
//
//
//
//
//    public void run() {
//        Integer option;
//
//        while (true) {
//
//            printMenu();
//
//            System.out.println("Choose an option: ");
//
//            option = input.nextInt();
//            input.nextLine();
//
//            switch (option) {
//                case 1:
//                    addCar();
//                    break;
//
//                case 3:
//                    deleteCar();
//                    break;
//
//                case 5:
//                    updateCar();
//                    break;
//
//                case 7:
//                    showAllCars();
//                    break;
//
//                case 12:
//                    return;
//            }
//        }
//    }
//}
