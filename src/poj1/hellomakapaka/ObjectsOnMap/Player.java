package poj1.hellomakapaka.ObjectsOnMap;

import Items.SmallHealthPotion;
import Items.Item;
import java.util.ArrayList;
import poj1.hellomakapaka.Console;
import poj1.hellomakapaka.Map;

public class Player extends MapElement
{
    public Map currentMap;
    
    private int _maxBackpackSize = 7;
    public int GetMaxBackpackSize()
    {
        return _maxBackpackSize;
    }
    
    private int _actualHP = 100;
    public int GetActualHP()
    {
        return _actualHP;
    }
    public void SetActualHP(int hp)
    {
         if(_actualHP + hp > GetMaxHP())
             _actualHP = GetMaxHP();
         else
             _actualHP += hp;
    }
    
    private int _maxHP = _actualHP + 1;
    public int GetMaxHP()
    {
        return _maxHP;
    }
    public void SetMaxHP(int maxHP)
    {
        _maxHP = maxHP;
    }
    
    private int _actualMana = 50;
    public int GetActualMana()
    {
        return _actualMana;
    }
    public void SetActualMana(int mana)
    {
        _actualMana = mana;
    }
    
    private int _maxMana = _actualMana;
    public int GetMaxMana()
    {
        return _maxMana;
    }
    public void SetMaxMana(int maxMana)
    {
        _maxMana = maxMana;
    }
    
    private int _money = 10;
    public int GetMoney()
    {
        return _money;
    }
    public void SetMoney(int money)
    {
        _money = money;  
    }
    
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
    
    public ArrayList<Item> allItems = new ArrayList<Item>();
    
    
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
            int _type = collidedObject.GetElementType();
            if(_type == 1)
                collidedObject = (Chest)collidedObject;
            
            
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
                if(collidedObject.IsInteractive())
                {
                    String msg = collidedObject.Interact(this);
                    if(_type == 1) // if it's chest destroy, meanwhile replace with road
                    {
                        this.currentMap.allCells[GetWidth() + width][GetHeight() + height] = new Road();
                    }
                    this.currentMap.SetComunicate(msg);
                }
                else
                {
                    this.currentMap.SetComunicate("Unreachable area - object: " + collidedObject.GetFullName());
                }      
            }
        }
        catch(Exception ex)
        {
            this.currentMap.SetComunicate("You can't go into the wall :x");
        }
        
        this.currentMap.PrintBoard();
    }   
}
