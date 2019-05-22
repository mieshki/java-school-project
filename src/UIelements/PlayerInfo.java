package UIelements;

import poj1.hellomakapaka.ObjectsOnMap.MapElement;
import poj1.hellomakapaka.ObjectsOnMap.Player;
import poj1.hellomakapaka.ObjectsOnMap.Road;
import poj1.hellomakapaka.ObjectsOnMap.Unreachable;

public class PlayerInfo 
{
    public int width = 4;
    public int height = 4;
    
    public MapElement[][] allCells; //[width][height]

    PlayerInfo()
    {
        CreateMapAndFillWitHashs();
    }
    PlayerInfo(int size)
    {
        this.width = size;
        this.height = size;
        CreateMapAndFillWitHashs();
    }
    public PlayerInfo(int width, int height)
    {
        
        this.width = width;
        this.height = height;
        CreateMapAndFillWitHashs();
    }

    private void CreateMapAndFillWitHashs()
    {
        allCells = new MapElement[width][height];

        for(int h = 0; h < height; h++)
        {
            for(int w = 0; w < width; w++)
            {
                this.allCells[w][h] = new Unreachable();
            }
        } 
    }
}
