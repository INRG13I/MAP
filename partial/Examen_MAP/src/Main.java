import Domain.Building;
import Repository.AbstractRepository;
import Repository.MemoryRepository;
import Repository.TextRepository;
import Service.Service;
import User_Interface.ConsoleInterface;

import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws Exception {



        AbstractRepository<Building> repository = new TextRepository<>();

        Service service =new Service(repository);
        ConsoleInterface consoleInterface=new ConsoleInterface(service);

        consoleInterface.run();
    }
}