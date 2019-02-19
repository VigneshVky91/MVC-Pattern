package adapterpgm;
public class AllChargerAdapter implements Charger
{
    SamsungCharger sch = new SamsungCharger();
    @Override
    public void putCharge() 
    {
        sch.connectSamsungCharger();
    }
    
}
