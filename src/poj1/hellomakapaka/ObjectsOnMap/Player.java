package poj1.hellomakapaka.ObjectsOnMap;

import poj1.hellomakapaka.Console;
import poj1.hellomakapaka.Map;

public class Player extends MapElement
{
    Map currentMap;
    
    private int _widthPos;
    public int GetWidth()
    {
        return _widthPos;
    }
    
    int _heightPos;
    public int GetHeight()
    {
        return _heightPos;
    }
    
    public Player(int widthPos, int heightPos, Map currentMap)
    {
        this._widthPos = widthPos;
        this._heightPos = heightPos;
        this.currentMap = currentMap;
    }
    
    private char _symbol = 'P';
    public char GetSymbol()
    {
        return _symbol;
    }
    
    private String _fullName = "Player";
    public String GetFullName()
    {
        return _fullName;
    }
    
    public void PrintSymbol()
    {
        Console.PrintBlue(GetSymbol());
    }

    public void MoveUp()
    {
        MovePlayer(0, -1);
    }
    
    public void MoveRight()
    {
        MovePlayer(1, 0);
    }
    
    public void MoveDown()
    {
        MovePlayer(0, 1);
    }
    
    public void MoveLeft()
    {
        MovePlayer(-1, 0);
    }
    
    public void MovePlayer(int width, int height)
    {
        try
        {
            MapElement collidedObject = this.currentMap.allCells[GetWidth() + width][GetHeight() + height];
            
            if(collidedObject != null && collidedObject.GetSymbol() == new Road().GetSymbol())
            {
                this.currentMap.allCells[GetWidth()][GetHeight()] = collidedObject; // replace with object above

                this.currentMap.allCells[GetWidth() + width][GetHeight() + height] = this;
                this._widthPos += width;
                this._heightPos += height;
            }
            else
            {
                //Console.PrintBlack(collidedObject.isInteractive + " :(");
                Console.PrintRed("Unreachable area - object: " + collidedObject.GetFullName() + "\n");
            }
        }
        catch(Exception ex)
        {
            Console.PrintRed("You can't go into the wall :x\n");
        }
        
        this.currentMap.PrintBoard();
    }   
}
