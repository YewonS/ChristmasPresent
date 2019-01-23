package ChristmasPresentItem;

public class ChristmasGift {

    private String gift;
    private String name;

    public ChristmasGift(String name, String gift){
        this.name = name;
        this.gift = gift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }
}
