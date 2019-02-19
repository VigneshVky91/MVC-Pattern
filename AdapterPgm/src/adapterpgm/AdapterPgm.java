package adapterpgm;
public class AdapterPgm 
{
    public static void main(String[] args) 
    {
        Charger iPhoneCharger=new AllChargerAdapter();// = new IPhoneCharger();
        //Charger iPhoneCharger = new IPhoneCharger();
        ConnectCharger cc = new ConnectCharger();
        
        cc.setCharger(iPhoneCharger);
        cc.connectCharger();
    }
}
