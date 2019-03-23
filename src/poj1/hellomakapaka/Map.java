package poj1.hellomakapaka;

import poj1.hellomakapaka.ObjectsOnMap.MapElement;
import poj1.hellomakapaka.ObjectsOnMap.Player;
import poj1.hellomakapaka.ObjectsOnMap.Road;

public class Map 
{
    public Player player;
    int width = 4;
    int height = 4;
    public MapElement[][] allCells; //[width][height]

    Map()
    {
        CreateMapAndFillWitHashs();
    }
    Map(int size)
    {
        this.width = size;
        this.height = size;
        CreateMapAndFillWitHashs();
    }
    Map(int width, int height)
    {
        
        this.width = width;
        this.height = height;
        CreateMapAndFillWitHashs();
    }
    private void InitializePlayer(int _width, int _height)
    {
        this.player = new Player(_width, _height, this);
        this.allCells[_width][_height] = player;
    }
    private void CreateMapAndFillWitHashs()
    {
        allCells = new MapElement[width][height];
        
        InitializePlayer(3, 6);
        
        for(int h = 0; h < height; h++)
        {
            for(int w = 0; w < width; w++)
            {
                if(this.player.GetWidth() == w && this.player.GetHeight() == h) 
                    continue;
                else
                    this.allCells[w][h] = new Road();
            }
        } 
    }
    
    public void PrintBoard()
    {
        for(int h = 0; h < height; h++)
        {
            for(int w = 0; w < width; w++)
            {
                allCells[w][h].PrintSymbol();
            }
            System.out.print("\n");
        }
    }
    
    public void InsertElement(int width, int height, MapElement newElement)
    {
        allCells[width][height] = newElement;
    }
    
}
