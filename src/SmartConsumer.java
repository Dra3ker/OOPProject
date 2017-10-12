public class SmartConsumer extends Consumer {

    private Controller controller;
    private int sourceTreshhold;
    private int batteryTreshold;


    public SmartConsumer(int baseCharge, double activePos,Controller controller,int sourceTreshhold, int batteryTreshold) {
        super(baseCharge, activePos);
        this.controller = controller;
        this.batteryTreshold = batteryTreshold;
        this.sourceTreshhold = sourceTreshhold;
    }

    @Override
    public int getReqCharge() {
        if(random.nextDouble() < activePos){
            int reqCharge = baseCharge;
            if(controller.getSource().getCharge(controller.getSourceEff()) > sourceTreshhold){
                reqCharge += baseCharge;
            }
            if(controller.getBattery().getCharge() > batteryTreshold){
                reqCharge += baseCharge;
            }
            return baseCharge;
        }
        return 0;
    }
}
