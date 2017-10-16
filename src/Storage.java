public class Storage {

    private int maxCapacity;
    private int status; // current available stored content

    public Storage(int maxCapacity){
        this.maxCapacity = maxCapacity;
        status = 0;
    }

    //reduces status by vol and returns int if more is taken than stored. Returns the difference or 0 if enough is available
    public int reduce(int vol){
        status -= vol;
        if(status < 0){
            int val = status *-1;
            status = 0;
            return val;
        }
        return 0;
    }
    //returns overflow and increases storage
    public int increase(int vol){
        status += vol;
        if(status > maxCapacity){
            int dif = status - maxCapacity;
            status = maxCapacity;
            return dif;
        }
        return 0;
    }

    public int getStatus() {
        return status;
    }
}

