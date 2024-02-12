package Repository;

import Domain.Building;

import java.io.*;

public class TextRepository<T extends Building> extends MemoryRepository<T> {

    String fileName;



    private void saveFile() {
        sort();
        try (BufferedWriter mustBeRestored = new BufferedWriter(new FileWriter("mustBeRestored.txt"))) {
            for (T entity : entityList) {
                if (entity.mustBeRestored()) {
                    mustBeRestored.write(entity.toString() + "\n");
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            try {
                new File(fileName).createNewFile();
            } catch (IOException ioException) {

            }

        } catch (IOException ioException) {

        }
        try (BufferedWriter canBeDemolished = new BufferedWriter(new FileWriter("canBeDemolished.txt"))) {
            for (T entity : entityList) {
                if (entity.canBeDemolished()) {
                    canBeDemolished.write(entity.toString() + "\n");
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            try {
                new File(fileName).createNewFile();
            } catch (IOException ioException) {

            }

        } catch (IOException ioException) {

        }
    }

    @Override
    public void add(T entity) {
        super.add(entity);
        saveFile();
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
        saveFile();
    }

    @Override
    public void update(Integer id, T entity) {
        super.update(id, entity);
        saveFile();
    }
}
