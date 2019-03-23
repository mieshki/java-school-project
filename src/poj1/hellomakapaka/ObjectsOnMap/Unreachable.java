package poj1.hellomakapaka.ObjectsOnMap;

import poj1.hellomakapaka.Console;

public class Unreachable extends MapElement
{
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
    
    public boolean isInteractive = true;
}
