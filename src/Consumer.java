import java.util.Random;

public class Consumer {

    protected int baseCharge;
    protected double activePos; // possibility that consumer consumes
    protected Random random;


    public Consumer(int baseCharge, double activePos){
        this.baseCharge = baseCharge;
        this.activePos = activePos;
        random = new Random();
    }

    // calculates if and how much a consumer consumes and returns the demanded value
    public int getReqCharge(){
        if(random.nextDouble() < activePos){
            return baseCharge;
        }
        return 0;
    }
}
