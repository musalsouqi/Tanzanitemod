package musalsou.tanzanite;


public class TanzaniteAxe extends TanzaniteToolMaterial {
    public static final TanzaniteAxe INSTANCE = new TanzaniteAxe();


    public float getMiningSpeedMultiplier(){
        return 10.0f;
    }
}
