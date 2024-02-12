package User_Interface;

import Domain.Block;
import Domain.Building;
import Domain.House;
import Service.Service;

import java.util.Scanner;

public class ConsoleInterface {

    Service service;

    Scanner input = new Scanner(System.in);

    public ConsoleInterface(Service service) {
        this.service = service;
    }

    private void printMenu() {
        System.out.print("""
                1. AddBlock\s
                2. AddHouse
                3. ShowBuildings
                4. MustBeRestoredBuildings
                5. Exit
                \s""");
    }

    private Block readBlock() {
        Integer constructionYear;
        System.out.println("Construction year:");
        constructionYear = input.nextInt();

        Integer totalApartments;
        System.out.println("Total apartments:");
        totalApartments = input.nextInt();

        Integer occupiedApartments;
        System.out.println("Occupied apartments:");
        occupiedApartments = input.nextInt();

        return new Block(constructionYear, totalApartments, occupiedApartments);

    }

    private House readHouse() {
        Integer constructionYear;
        System.out.println("Construction year:");
        constructionYear = input.nextInt();

        boolean isHistoric;
        System.out.println("Is historic(true/false):");
        isHistoric = input.nextBoolean();

        return new House(constructionYear, isHistoric);
    }

    private void addHouse() {
        service.add(readHouse());
    }


    private void addBlock() {
        service.add(readBlock());
    }


    private void showAllEntities() {
        for (Building entity : service.getAll()) {
            System.out.println(entity.toString() + "\n");
        }
    }

    private void showBuildsToRestore() {
        for (Building entity : service.mustBeRestored()) {
            System.out.println(entity.toString() + "\n");
        }
    }

    public void run() {
        Integer option;

        while (true) {

            printMenu();

            System.out.println("Option:");

            option = input.nextInt();

            switch (option) {
                case 1:
                    addBlock();
                    break;
                case 2:
                    addHouse();
                    break;
                case 3:
                    showAllEntities();
                    break;
                case 4:
                    showBuildsToRestore();
                    break;
                case 5:
                    return;
            }
        }
    }


}
