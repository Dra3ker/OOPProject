public class Source {

    private int baseGen;

    public Source(int baseGen){
        this.baseGen = baseGen;
    }

    //calculates output based on source efficiency
    public int getOutput(double sourceEff){
        return (int) (baseGen*sourceEff);
    }
}
