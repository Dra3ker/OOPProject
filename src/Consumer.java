import java.util.Random;

public class Consumer {

    protected int baseReq;
    protected double activePos; // possibility that consumer consumes
    protected Random random;


    public Consumer(int baseReq, double activePos){
        this.baseReq = baseReq;
        this.activePos = activePos;
        random = new Random();
    }

    // calculates if and how much a consumer consumes and returns the demanded value
    public int getReq(){
        if(random.nextDouble() < activePos){
            return baseReq;
        }
        return 0;
    }
}
