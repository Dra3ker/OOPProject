public class Battery {

    private int maxCapacity;
    private int charge; // current avaible charge

    public Battery(int maxCapacity){
        this.maxCapacity = maxCapacity;
        charge = 0;
    }

    //reduces charge by vol and returns int if more charge is taken than stored. Returns the difference or 0 if enough charge is available
    public int reduceCharge(int vol){
        charge -= vol;
        if(charge < 0){
            int val = charge *-1;
            charge = 0;
            return val;
        }
        return 0;
    }
    //returns overcharge and charges battery
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

