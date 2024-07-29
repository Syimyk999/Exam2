public class Team {
    AbstractRescuers[] rescuers = new AbstractRescuers[5];
    private int count = 0;
    public void add(AbstractRescuers rescuer) {
        if (count< rescuers.length) {
            rescuers[count] = rescuer;
            count++;
        }
    }
    public void printInfo() {
        for (int i = 0; i < rescuers.length; i++) {
            if (rescuers[i] != null) {
                System.out.println(rescuers[i]);
            }
        }
    }
}
