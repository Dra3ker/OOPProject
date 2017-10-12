import java.util.Random;

public class Simulation {

    private Controller controller;
    private Random random;

    public Simulation(Controller controller){
        this.controller = controller;
        random = new Random();
    }
    //handles all the simulation stuff
    public void simulate(int time){
        for (int i = 0; i < time; i++) {
            System.out.println("Tick: " + i);
            controller.cycle(random.nextDouble());
            System.out.println("_____________________________________");
        }
    }
}
