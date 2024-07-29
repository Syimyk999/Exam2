public class Equipment {
    private String eqName;
    private double eqVolume;

    public Equipment() {
    }


    public Equipment(String eqname, double eqvolume) {
        this.eqName = eqname;
        this.eqVolume = eqvolume;
    }

    public String getEqName() {
        return eqName;
    }

    public void setEqName(String eqName) {
        this.eqName = eqName;
    }

    public double getEqVolume() {
        return eqVolume;
    }

    public void setEqVolume(double eqVolume) {
        this.eqVolume = eqVolume;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "eqName='" + eqName + '\'' +
                ", eqVolume=" + eqVolume +
                '}';
    }
}


