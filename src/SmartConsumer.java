public class SmartConsumer extends Consumer {

    private Controller controller;
    private int sourceThreshold;
    private int storageThreshold;


    public SmartConsumer(int baseCharge, double activePos, Controller controller, int sourceThreshold, int storageThreshold) {
        super(baseCharge, activePos);
        this.controller = controller;
        this.storageThreshold = storageThreshold;
        this.sourceThreshold = sourceThreshold;
    }

    //smarter version of Consumers getReq method, which uses Data of Source and Storage
    @Override
    public int getReq() {
        if(random.nextDouble() < activePos){
            int req = baseReq;
            if(controller.getSource().getOutput(controller.getSourceEff()) > sourceThreshold){
                req += baseReq;
            }
            if(controller.getStorage().getStatus() > storageThreshold){
                req += baseReq;
            }
            return req;
        }
        return 0;
    }
}
