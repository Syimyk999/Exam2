public abstract class AbstractRescuers {
    private String name;
    private int age;
    private String position;
    private Knapsack knapsack;

    public void AbstractRescuer() {
    }

    public AbstractRescuers(String name, int age, String position, Knapsack knapsack) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.knapsack = knapsack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Knapsack getKnapsack() {
        return knapsack;
    }

    public void setKnapsack(Knapsack knapsack) {
        this.knapsack = knapsack;
    }

    @Override
    public String toString() {
        return "AbstractRescuer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", knapsack=" + knapsack +
                '}';
    }
}
