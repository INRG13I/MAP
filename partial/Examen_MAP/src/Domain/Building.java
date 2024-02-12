package Domain;

public  abstract class Building {
    protected Integer constructionYear;

    public Building(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }

    public Integer getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }

    public abstract boolean mustBeRestored();
    public abstract boolean canBeDemolished();

    public abstract String toString();


}
