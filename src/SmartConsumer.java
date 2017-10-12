public class SmartConsumer extends Consumer {

    private Controller controller;
    private int sourceThreshold;
    private int batteryThreshold;


    public SmartConsumer(int baseCharge, double activePos, Controller controller, int sourceThreshold, int batteryThreshold) {
        super(baseCharge, activePos);
        this.controller = controller;
        this.batteryThreshold = batteryThreshold;
        this.sourceThreshold = sourceThreshold;
    }

    //smarter version of Consumers getReqCharge method, which uses Data of Source and Battery
    @Override
    public int getReqCharge() {
        if(random.nextDouble() < activePos){
            int reqCharge = baseCharge;
            if(controller.getSource().getCharge(controller.getSourceEff()) > sourceThreshold){
                reqCharge += baseCharge;
            }
            if(controller.getBattery().getCharge() > batteryThreshold){
                reqCharge += baseCharge;
            }
            return reqCharge;
        }
        return 0;
    }
}
