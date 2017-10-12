import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Consumer> consumers = new ArrayList<Consumer>();
        Source source = new Source(500);
        Battery battery = new Battery(1000);

        Controller controller = new Controller(consumers,source,battery);
        Simulation simulation = new Simulation(controller);

        consumers.add(new Consumer(40,0.8));
        consumers.add(new SmartConsumer(100,1,controller,150,400));

        simulation.simulate(24);
    }
}
