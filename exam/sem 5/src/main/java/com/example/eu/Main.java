package com.example.eu;

import Domain.Car;
import Domain.CarFactory;
import Domain.Rent;
import Domain.RentFactory;
import Repository.*;
import Service.Service;
//import User_Interface.ConsoleInterface;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {


        try {
            new File("config.properties").createNewFile();
        } catch (IOException ioException) {

        }

        java.util.Properties p = new java.util.Properties();

        p.load(new FileReader("config.properties"));

        String repo = p.getProperty("Repository");
        String product = p.getProperty("Product");



        AbstractRepository<Car> carRepository = null;
        AbstractRepository<Rent> rentRepository = null;


        carRepository = new BinaryRepository<>(product);



        // Service service = new Service(carRepository, rentRepository);
        //ConsoleInterface consoleInterface = new ConsoleInterface(service);


        // consoleInterface.run();
    }
}