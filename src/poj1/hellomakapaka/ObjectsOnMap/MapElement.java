package poj1.hellomakapaka.ObjectsOnMap;

import poj1.hellomakapaka.Console;

public class MapElement 
{
    private int _type;
    public int GetElementType()
    {
        return _type;
    }
    
    private char _symbol;
    public char GetSymbol()
    {
        return _symbol;
    }
    
    private String _fullName;
    public String GetFullName()
    {
        return _fullName;
    }
    
    public void PrintSymbol()
    {
        Console.PrintBlack(GetSymbol());
    }
    
    private boolean _isInteractive;
    public boolean IsInteractive()
    {
        return _isInteractive;
    }
    
    public String Interact(Player player){ return "test interact with mapelement, shouldn't be shown"; }
}
