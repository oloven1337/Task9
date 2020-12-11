package pg;

public class pg1 {
    private String name;
    private long numberTIN;

    public pg1(String name, long numberTIN) {
        this.name = name;
        this.numberTIN = numberTIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumberTIN() {
        return numberTIN;
    }

    public void setNumberTIN(long numberTIN) {
        this.numberTIN = numberTIN;
    }
}