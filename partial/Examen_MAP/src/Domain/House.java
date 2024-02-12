package Domain;

public class House extends Building {

    private boolean isHistorical;

    public House(Integer constructionYear, boolean isHistorical) {
        super(constructionYear);
        this.isHistorical = isHistorical;
    }

    public boolean isHistorical() {
        return isHistorical;
    }

    public void setHistorical(boolean historical) {
        isHistorical = historical;
    }

    @Override
    public boolean mustBeRestored() {
        Integer years = 2023 - constructionYear;
        return years > 100 && isHistorical;
    }

    @Override
    public boolean canBeDemolished() {
        return !isHistorical;
    }

    @Override
    public String toString() {
        return "House{" +
                "isHistorical=" + isHistorical +
                ", constructionYear=" + constructionYear +
                ", mustBeRestored=" + mustBeRestored() +
                ", canBeDemolished=" + canBeDemolished() +
                '}';
    }
}
