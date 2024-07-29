public class Paramedics extends AbstractRescuers{
    private FirstAidKit firstAidKit;

    public Paramedics(String name, int age, String position, Knapsack knapsack, FirstAidKit firstAidKit) {
        super(name, age, position, knapsack);
        this.firstAidKit = firstAidKit;
    }

    public FirstAidKit getFirstAidKit() {
        return firstAidKit;
    }

    public void setFirstAidKit(FirstAidKit firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    public void firstHelp () {
        System.out.println(" Парамедики может окозывать первую помощь");

    }

}


