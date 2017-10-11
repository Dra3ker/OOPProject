public class SmartConsumer extends Consumer {

    Controller controller;

    public SmartConsumer(int baseCharge, double activePos,Controller controller) {
        super(baseCharge, activePos);
        this.controller = controller;
    }

    @Override
    public int getReqCharge() {
        if(random.nextDouble() < activePos){
            //do smart stuff with controller
            return baseCharge;
        }
        return 0;
    }
}
