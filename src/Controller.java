import java.util.ArrayList;

public class Controller {

    private ArrayList<Consumer> consumers;
    private Source source;
    private Battery battery;

    public Controller(ArrayList<Consumer> consumers, Source source, Battery battery){
        this. consumers = consumers;
        this.battery = battery;
        this.source = source;
    }

    public void cycle(double sourceEff){
        chargeBattery(sourceEff);
        consume(sourceEff);
    }

    private void chargeBattery(double sourceEff){
        int toNetwork = battery.increaseCharge(source.getCharge(sourceEff));
        System.out.println("Charge to network: " + toNetwork);
    }
    private void consume(double sourceEff){
        int fromNetwork = 0;
        for (Consumer consumer:consumers) {
            fromNetwork += battery.reduceCharge(consumer.getReqCharge());
        }
        System.out.println("Charge from network: " + fromNetwork);
    }
}
