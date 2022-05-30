class Kauravas extends Pandavas
{
    void fight()
    {
      System.out.println("Kauravas were skilled fighters");  
    };
    
    
}


public class bharatvanshi
{
    public static void main(String[] args)
    {
        Pandavas pd = new Pandavas();
        Kauravas kv = new Kauravas();
        kv.fight();
        pd.fight();
        pd.obey();
        pd.kind();
        
    }
}