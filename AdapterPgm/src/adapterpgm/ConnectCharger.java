package adapterpgm;
public class ConnectCharger 
{
    Charger charger;

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }
    
    public void connectCharger()
    {
        charger.putCharge();
    }
}
