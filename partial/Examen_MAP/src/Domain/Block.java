package Domain;

public class Block extends Building {

    private Integer totalApartments;
    private Integer occupiedApartments;

    public Block(Integer constructionYear,Integer totalApartments, Integer occupiedApartments) {
        super(constructionYear);
        this.totalApartments = totalApartments;
        this.occupiedApartments = occupiedApartments;
    }

    public Integer getTotalApartments() {
        return totalApartments;
    }

    public void setTotalApartments(Integer totalApartments) {
        this.totalApartments = totalApartments;
    }

    public Integer getOccupiedApartments() {
        return occupiedApartments;
    }

    public void setOccupiedApartments(Integer occupiedApartments) {
        this.occupiedApartments = occupiedApartments;
    }

    @Override
    public boolean mustBeRestored() {
        Integer years = 2023 - constructionYear;
        Float occupationPercent = (float) ((occupiedApartments*1.0/totalApartments)*100);
        return years>40 && occupationPercent>80;
    }

    @Override
    public boolean canBeDemolished() {
        Float occupationPercent = (float) ((occupiedApartments*1.0/totalApartments)*100);
        return occupationPercent<5;
    }

    @Override
    public String toString() {
        return "Block{" +
                "totalApartments=" + totalApartments +
                ", occupiedApartments=" + occupiedApartments +
                ", constructionYear=" + constructionYear +
                ", mustBeRestored=" + mustBeRestored() +
                ", canBeDemolished=" + canBeDemolished() +
                '}';
    }
}
