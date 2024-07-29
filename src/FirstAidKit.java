public class FirstAidKit {
    private String name;
    private double countItem;

    public FirstAidKit() {
    }

    public FirstAidKit(String name, double volume) {
        this.name = name;
        this.countItem = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCountItem() {
        return countItem;
    }

    @Override
    public String toString() {
        return "FirstAidKit{" +
                "name='" + name + '\'' +
                ", countItem=" + countItem +
                '}';
    }

    public void setCountItem(double countItem) {
        this.countItem = countItem;
    }

}

