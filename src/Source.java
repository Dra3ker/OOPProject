public class Source {

    private int baseGen;

    public Source(int baseGen){
        this.baseGen = baseGen;
    }

    public int getCharge(double sourceEff){
        return (int) (baseGen*sourceEff);
    }
}
