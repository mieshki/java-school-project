package poj1.hellomakapaka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console 
{
    public static String ReadLine() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
    
    
    private static String ANSI_RESET = "\u001B[0m";
    private static String ANSI_BLACK = "\u001B[30m";
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_YELLOW = "\u001B[33m";
    private static String ANSI_BLUE = "\u001B[34m";
    private static String ANSI_PURPLE = "\u001B[35m";
    private static String ANSI_CYAN = "\u001B[36m";
    private static String ANSI_WHITE = "\u001B[37m";
    
    public static void PrintBlack(String msg)
    {
        System.out.print(ANSI_BLACK + msg + ANSI_RESET);
    } 
    public static void PrintBlack(char msg)
    {
        System.out.print(ANSI_BLACK + msg + ANSI_RESET);
    } 
 
    public static void PrintRed(String msg)
    {
        System.out.print(ANSI_RED + msg + ANSI_RESET);
    }
    public static void PrintRed(char msg)
    {
        System.out.print(ANSI_RED + msg + ANSI_RESET);
    }
    
    public static void PrintGreen(String msg)
    {
        System.out.print(ANSI_GREEN + msg + ANSI_RESET);
    }
    public static void PrintGreen(char msg)
    {
        System.out.print(ANSI_GREEN + msg + ANSI_RESET);
    }
    
    public static void PrintYellow(String msg)
    {
        System.out.print(ANSI_YELLOW + msg + ANSI_RESET);
    }
    public static void PrintYellow(char msg)
    {
        System.out.print(ANSI_YELLOW + msg + ANSI_RESET);
    }
    
    public static void PrintBlue(String msg)
    {
        System.out.print(ANSI_BLUE + msg + ANSI_RESET);
    }
    public static void PrintBlue(char msg)
    {
        System.out.print(ANSI_BLUE + msg + ANSI_RESET);
    }
    
    public static void PrintPurple(String msg)
    {
        System.out.print(ANSI_PURPLE + msg + ANSI_RESET);
    }
    public static void PrintPurple(char msg)
    {
        System.out.print(ANSI_PURPLE + msg + ANSI_RESET);
    }
    
    public static void PrintCyan(String msg)
    {
        System.out.print(ANSI_CYAN + msg + ANSI_RESET);
    }
    public static void PrintCyan(char msg)
    {
        System.out.print(ANSI_CYAN + msg + ANSI_RESET);
    }
    
    public static void PrintWhite(String msg)
    {
        System.out.print(ANSI_WHITE + msg + ANSI_RESET);
    }
    public static void PrintWhite(char msg)
    {
        System.out.print(ANSI_WHITE + msg + ANSI_RESET);
    }
}
