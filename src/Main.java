import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Consumer> consumers = new ArrayList<>();
        Source SolarPanel = new Source(500);
        Storage Battery = new Storage(1000);

        Controller controller = new Controller(consumers,SolarPanel, Battery);
        Simulation solarpanelsimulation = new Simulation(controller);

        consumers.add(new Consumer(40,0.8));
        consumers.add(new SmartConsumer(100,1,controller,150,400));

        System.out.println("Stromversorgung-Simulation wird gestartet:");
        solarpanelsimulation.simulate(24);
        System.out.println("Stromversorgung-Simulation beendet.");
        System.out.println();

        ArrayList<Consumer> consumers2 = new ArrayList<Consumer>();
        Source rain = new Source(450);
        Storage watertank = new Storage(900);

        Controller controller2 = new Controller(consumers2,rain, watertank);
        Simulation simulation = new Simulation(controller2);

        consumers2.add(new Consumer(35,0.75));
        consumers2.add(new SmartConsumer(90,0.75,controller2,100,300));


        System.out.println("Gartengießanlage-Simulation wird gestartet:");
        simulation.simulate(24);
        System.out.println("Gartengießanlage-Simulation beendet.");

    }
}
