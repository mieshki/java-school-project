package poj1.hellomakapaka;

import UIelements.PlayerInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import poj1.hellomakapaka.ObjectsOnMap.Chest;
import poj1.hellomakapaka.ObjectsOnMap.MapElement;
import poj1.hellomakapaka.ObjectsOnMap.Player;
import poj1.hellomakapaka.ObjectsOnMap.Road;
import poj1.hellomakapaka.ObjectsOnMap.Unreachable;
import poj1.hellomakapaka.UIinteractor.MainMenu;

public class Poj1Hellomakapaka 
{
    
    
    public static void main(String[] args) throws IOException 
    {   
        // test kolorow
        /*
        Console.PrintBlack("black");
        Console.PrintBlue("blue");
        Console.PrintCyan("cyan");
        Console.PrintGreen("green");
        Console.PrintPurple("purple");
        Console.PrintRed("red");
        Console.PrintWhite("white");
        Console.PrintYellow("yellow");
        */
        
        System.setProperty("java.net.preferIPv4Stack" , "true");//to avoid some weird message from compilator
        // 17 wysokosci na 80 szerokosci - domyslne okno git bash'a
        int mapWidth = 80;
        int mapHeight = 13;
        Map testMap = new Map(mapWidth, mapHeight);
        PlayerInfo testPlayerInfo = new PlayerInfo(mapWidth, mapHeight);
        testMap.InsertElement(4, 5, new Unreachable());
        testMap.InsertElement(2, 4, new Chest());
        testMap.PrintBoard();
        

        
        MainMenu.ChooseOptionFromMenu(testMap);
    }  
}
