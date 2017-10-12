public class Source {

    private int baseGen;

    public Source(int baseGen){
        this.baseGen = baseGen;
    }

    //calculates charge based on source efficiency
    public int getCharge(double sourceEff){
        return (int) (baseGen*sourceEff);
    }
}
