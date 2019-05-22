package poj1.hellomakapaka.ObjectsOnMap;

import poj1.hellomakapaka.Console;


public class Road extends MapElement
{ 
    private int _type = 2;
    public int GetElementType()
    {
        return _type;
    }
    
    private char _symbol = '#';
    public char GetSymbol()
    {
        return _symbol;
    }
    
    private String _fullName = "Road";
    public String GetFullName()
    {
        return _fullName;
    }
    
    public void PrintSymbol()
    {
        Console.PrintGreen(this.GetSymbol());
    }
    
    public boolean isInteractive = false;
}
