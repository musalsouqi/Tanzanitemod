package musalsou.tanzanite;

public class TanzanitePickAxe extends TanzaniteToolMaterial{
    public static final TanzanitePickAxe INSTANCE = new TanzanitePickAxe();
    @Override
    public int getMiningLevel() {
        return 3;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }
}
