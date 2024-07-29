//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Equipment equipment = new Equipment(" AVD ", 10);
        FirstAidKit firstAidKit = new FirstAidKit(" Медмарт ", 20);
        Knapsack knapsack = new Knapsack(" Green ", 10);

        Firefighter firefighter1 = new Firefighter(" Max ", 24, " пожарный охрана ", knapsack, equipment );
        Firefighter firefighter2 = new Firefighter("Ivan ", 23, "водитель", knapsack,equipment);
        Firefighter firefighter3 = new Firefighter(" Djek ", 26, " старший пожарный ", knapsack, equipment);

        Paramedics paramedics1 = new Paramedics(" Sasha ", 19, " помощник медика ", knapsack, firstAidKit);
        Paramedics paramedics2 = new Paramedics(" Kolya ", 29, " Медик ", knapsack,firstAidKit);

        Team  team = new Team();
        team.add(firefighter1);
        team.add(firefighter2);
        team.add(firefighter3);
        team.add(paramedics1);
        team.add(paramedics2);

        team.printInfo();

    }
}