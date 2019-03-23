package poj1.hellomakapaka.ObjectsOnMap;

import poj1.hellomakapaka.Console;

public class MapElement 
{
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
    };
    
    public boolean isInteractive;
    
    public void Interact(){Console.PrintBlack("test");};
}
