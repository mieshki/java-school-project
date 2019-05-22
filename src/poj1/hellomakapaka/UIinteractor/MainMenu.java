package poj1.hellomakapaka.UIinteractor;

import Items.SmallHealthPotion;
import Items.Item;
import java.io.IOException;
import poj1.hellomakapaka.Console;
import poj1.hellomakapaka.Map;
import poj1.hellomakapaka.ObjectsOnMap.Player;

public abstract class MainMenu 
{
    public static void PrintMenu(Map map, String title, String... options)
    {
        Console.PrintWhite(title);
        for(int i = 0; i < 7; i++)
        {
            try
            {
                Console.PrintRed(i + 1 + ". " + options[i]);
            }
            catch(Exception exc)
            {
                Console.PrintRed(".\n");
            }
        }
        Player player = map.player;
        Console.PrintRed("HP: " + player.GetActualHP() + "/" + player.GetMaxHP() + " | Mana: " + player.GetActualMana() + "/" + player.GetMaxMana() + " | Money: " + player.GetMoney() + "\n");
        Console.PrintRed("9. Quit | Your input: ");
    }
    
    private static void TryUseItemFromMenu(Map map, int id) throws IOException
    {
        try
        {
            map.player.allItems.get(id - 1).UseItem(map.player);
        }
        catch(Exception exc){}
        map.PrintBoard();
        ChooseOptionFromMenu(map);
    }
    
    public static void PrintBackpack(Map actualMap) throws IOException
    {
        Item _item = new Item();
        Console.PrintWhite("*** YOUR BACKPACK ***\n");
        for(int i = 0; i < 8; i++)
        {
            try
            {
                _item = actualMap.player.allItems.get(i);
                int itemType = _item.GetItemType();
                if(itemType == 1) // health potion
                    _item = (SmallHealthPotion)_item;
                
                Console.PrintRed(i + 1 + ". " + _item.GetName() + " - " + _item.GetShortDesc() + "\n");
            }
            catch(Exception exc)
            {
                Console.PrintRed(".\n");
            }
        }
        Console.PrintRed("9. Back to main menu | Your input: ");
        
        
        try
        {
            String input = Console.ReadLine();
            int selectedNumber = Integer.parseInt(input);
            
            
            
            switch (selectedNumber) 
            {
                case 1: 
                {
                    TryUseItemFromMenu(actualMap, 1);
                    break;
                }
                case 2:
                {
                    TryUseItemFromMenu(actualMap, 2);
                    break;
                }
                case 3:
                {
                    TryUseItemFromMenu(actualMap, 3);
                    break;
                }
                case 4:
                {
                    TryUseItemFromMenu(actualMap, 4);
                    break;
                }
                case 5:
                {
                    TryUseItemFromMenu(actualMap, 5);
                    break;
                }
                case 6:
                {
                    TryUseItemFromMenu(actualMap, 6);
                    break;
                }
                case 7:
                {
                    TryUseItemFromMenu(actualMap, 7);
                    break;
                }
                case 8:
                {
                    TryUseItemFromMenu(actualMap, 8);
                    break;
                }
                case 9:
                {
                    actualMap.PrintBoard();
                    ChooseOptionFromMenu(actualMap);
                    break;
                }
                default: 
                {
                    Console.PrintRed("Wrong option choosed\n");
                    actualMap.PrintBoard();
                    break;
                }
            }
        }
        catch(NumberFormatException nfe)
        {
            Console.PrintRed("Invalid Format!\n");
            actualMap.PrintBoard();
        }
    }
    
    public static void RefreshGUIinfo(Map map)
    {
        MainMenu.PrintMenu(map, "*** MOVE PLAYER ***\n", "Move up\n", "Move right\n", "Move down\n", "Move left\n", "Show backpack\n");
    }
    
    public static void ChooseOptionFromMenu(Map testMap) throws IOException
    {
        try
        {
            RefreshGUIinfo(testMap);
            String input = Console.ReadLine();
            int selectedNumber = Integer.parseInt(input);
            
            switch (selectedNumber) 
            {
                case 1: 
                {
                    testMap.player.MoveUp();
                    ChooseOptionFromMenu(testMap);
                    break;
                }
                case 2:
                {
                    testMap.player.MoveRight();
                    ChooseOptionFromMenu(testMap);
                    break;
                }
                case 3:
                {
                    testMap.player.MoveDown();
                    ChooseOptionFromMenu(testMap);
                    break;
                }
                case 4:
                {
                    testMap.player.MoveLeft();
                    ChooseOptionFromMenu(testMap);
                    break;
                }
                case 5:
                {
                    testMap.PrintBoard();
                    PrintBackpack(testMap);
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
                    ChooseOptionFromMenu(testMap);
                    break;
                }
            }
        }
        catch(NumberFormatException nfe)
        {
            Console.PrintRed("Invalid Format!\n");
            testMap.PrintBoard();
            ChooseOptionFromMenu(testMap);
        }
    }
}
