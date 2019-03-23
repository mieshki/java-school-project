package poj1.hellomakapaka.UIinteractor;

import java.io.IOException;
import poj1.hellomakapaka.Console;
import poj1.hellomakapaka.Map;

public abstract class MainMenu 
{
    public static void PrintMenu()
    {
        Console.PrintBlack("*** MENU ***\n");
        Console.PrintBlack("1. Move up\n");
        Console.PrintBlack("2. Move right\n");
        Console.PrintBlack("3. Move down\n");
        Console.PrintBlack("4. Move left\n");
        
        Console.PrintBlack("9. wyjscie\n");
    }
    
    public static void ChooseOptionFromMenu(Map testMap) throws IOException
    {
        try
        {
            MainMenu.PrintMenu();
            String input = Console.ReadLine();
            int selectedNumber = Integer.parseInt(input);
            
            switch (selectedNumber) 
            {
                case 1: 
                {
                    testMap.player.MoveUp();
                    break;
                }
                case 2:
                {
                    testMap.player.MoveRight();
                    break;
                }
                case 3:
                {
                    testMap.player.MoveDown();
                    break;
                }
                case 4:
                {
                    testMap.player.MoveLeft();
                    break;
                }
                case 9:
                {
                    Console.PrintBlack("See ya later aligejter\n"); 
                    System.exit(1);
                    break;
                }
                default: 
                {
                    Console.PrintRed("Wrong option choosed\n");
                    testMap.PrintBoard();
                    break;
                }
            }
        }
        catch(NumberFormatException nfe)
        {
            Console.PrintRed("Invalid Format!\n");
            testMap.PrintBoard();
        }
        
        ChooseOptionFromMenu(testMap);
    }
}
