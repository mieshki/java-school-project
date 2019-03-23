package poj1.hellomakapaka.ObjectsOnMap;

import poj1.hellomakapaka.Console;

public class Chest extends MapElement
{
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
    
    public boolean isInteractive = true;
    
    public void Interact()
    {
        Console.PrintCyan("You found hidden sword!\n");
    }
}
