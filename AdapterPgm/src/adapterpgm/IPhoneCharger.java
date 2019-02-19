package adapterpgm;
public class IPhoneCharger implements Charger
{
    @Override
    public void putCharge() 
    {
        System.out.println("iPhone charger Connected...");
    }
}
