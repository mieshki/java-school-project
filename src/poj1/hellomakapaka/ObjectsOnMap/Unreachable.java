package poj1.hellomakapaka.ObjectsOnMap;

import poj1.hellomakapaka.Console;

public class Unreachable extends MapElement
{
    private int _type = 3;
    public int GetElementType()
    {
        return _type;
    }
    
    private char _symbol = 'X';
    public char GetSymbol()
    {
        return _symbol;
    }
    
    private String _fullName = "Wall";
    public String GetFullName()
    {
        return _fullName;
    }
    
    public void PrintSymbol()
    {
        Console.PrintRed(this.GetSymbol());
    }
    
    private boolean _isInteractive = true;
    public boolean IsInteractive()
    {
        return _isInteractive;
    }
    
    public String Interact(Player player){ return "test interact with unreachable element, example: wall"; }
}
