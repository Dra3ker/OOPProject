public class Battery {

    private int maxCapacity;
    private int charge;

    public Battery(int maxCapacity){
        this.maxCapacity = maxCapacity;
        charge = 0;
    }

    //returns the charge that needs to be taken from another source
    public int reduceCharge(int vol){
        charge -= vol;
        if(charge < 0){
            return charge *-1;
        }
        return 0;
    }
    //returns overcharge
    public int increaseCharge(int vol){
        charge += vol;
        if(charge > maxCapacity){
            int dif = charge - maxCapacity;
            charge = maxCapacity;
            return dif;
        }
        return 0;
    }

    public int getCharge() {
        return charge;
    }
}

