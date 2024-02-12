package Domain;

import java.util.Random;

public abstract class Entity {

    private Integer id;

    Entity() {

        Random rand = new Random();

        id = rand.nextInt(9999 - 1000 + 1) + 1000;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof Entity)) {
            return false;
        }

        Entity entity = (Entity) o;

        return this.getId() == entity.getId();

    }

    public boolean equals(Integer id) {

        return this.getId() == id;
    }

}
