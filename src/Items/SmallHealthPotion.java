package Items;

import poj1.hellomakapaka.Console;
import poj1.hellomakapaka.ObjectsOnMap.Player;

public class SmallHealthPotion extends Item
{
    private int _type = 1;
    public int GetItemType()
    {
        return _type;
    }
    
    private String _name = "Small HP potion";
    public String GetName()
    {
        return _name;
    }
    
    public void SetName(String name)
    {
        _name = name;
    }
    
    private int HPtoAdd = 20;
    private String _shortDesc = "It gives you " + HPtoAdd + " HP";
    
    public String GetShortDesc()
    {
        return _shortDesc;
    }
    public void SetShortDesc(String shortDesc)
    {
        _shortDesc = shortDesc;
    }
    
    public void UseItem(Player player)
    {
        int HPtoAdd = 20;
        if(player.GetActualHP() == player.GetMaxHP())
            player.currentMap.SetComunicate("Your HP is full.");
        else
        {
            player.SetActualHP(HPtoAdd);
            player.allItems.remove(this);
            player.currentMap.SetComunicate("You have restored " + HPtoAdd + " HP.");
        }
    }
}
