import java.util.HashMap;
public class sote
{
    public static void main(String [] args)
    {
        System.out.println(" we are learning java object oriented programming language");
        HashMap<String, String> ob = new HashMap<String, String>();
        ob.put("c++", "programming langauge");
        ob.put(" html", " hyoertext langauge");
        ob.put("bible", " holy book");
        System.out.println(ob.get("bible"));
        
    }
}