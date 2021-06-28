

public class Kugel
{
    private int zahl;
    private String farbe;
    private boolean halb; 

    public Kugel(int pZahl, String pFarbe, boolean pHalb)
    {
        zahl = pZahl;
        farbe = pFarbe; 
        halb = pHalb;
    }
    
    public int getZahl(){
        return zahl;
    }
    
    public String getFarbe(){
        return farbe;
    }
    
    public boolean getHalb(){
        return halb;
    }
}
