import java.util.Random;

public class Consumer {

    protected int baseCharge;
    protected double activePos;
    protected Random random;


    public Consumer(int baseCharge, double activePos){
        this.baseCharge = baseCharge;
        this.activePos = activePos;
        random = new Random();
    }

    public int getReqCharge(){
        if(random.nextDouble() < activePos){
            return baseCharge;
        }
        return 0;
    }
}
