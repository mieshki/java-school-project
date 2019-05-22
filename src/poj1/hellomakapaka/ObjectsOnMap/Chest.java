package poj1.hellomakapaka.ObjectsOnMap;

import Items.SmallHealthPotion;
import poj1.hellomakapaka.Console;

public class Chest extends MapElement
{
    private int _type = 1;
    public int GetElementType()
    {
        return _type;
    }
    
    private char _symbol = 'C';
    public char GetSymbol()
    {
        return _symbol;
    }
    
    private String _fullName = "Chest";
    public String GetFullName()
    {
        return _fullName;
    }
   
    public void PrintSymbol()
    {
        Console.PrintPurple(this.GetSymbol()); 
    }
    
    private boolean _isInteractive = true;
    public boolean IsInteractive()
    {
        return _isInteractive;
    }
    
    
    public String Interact(Player player)
    {
        int itemCount = player.allItems.size();
        
        if(itemCount <= player.GetMaxBackpackSize())
        {
            player.allItems.add(new SmallHealthPotion());
            return "You found health potion!"; 
        }
        else
        {
            return "You found health potion, but your backpack is full.";
        }
    }
}
