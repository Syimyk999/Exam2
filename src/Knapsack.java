public class Knapsack {
    private String color;
    private double volume;

    public Knapsack() {
    }

    public Knapsack(String color, double volume) {
        this.color = color;
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Knapsack{" +
                "color='" + color + '\'' +
                ", volume=" + volume +
                '}';
    }
}
