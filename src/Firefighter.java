public class Firefighter extends AbstractRescuers{
    private Equipment equipment;

    public Firefighter(String name, int age, String position, Knapsack knapsack, Equipment equipment) {
        super(name, age, position, knapsack);
        this.equipment = equipment;
    }


    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Firefighter{" +
                "equipment=" + equipment +
                '}';
    }

    public void fireFighter()  {
        System.out.println(" Пожарные может тушить пожар ");
    }
}
