package Items;

import poj1.hellomakapaka.Console;
import poj1.hellomakapaka.ObjectsOnMap.Player;

public class Item 
{
    private int _type;
    public int GetItemType()
    {
        return _type;
    }
    
    private String _name;
    public String GetName()
    {
        return _name;
    }
    
    private String _shortDesc;
    public String GetShortDesc()
    {
        return _shortDesc;
    }
    
    public void UseItem(Player player) 
    {
        Console.PrintRed("NIE DZIALAM");
    };
    
}
