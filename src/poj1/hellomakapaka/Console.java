package poj1.hellomakapaka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console 
{
  public static final String ANSI_RESET  = "\u001B[0m";

  // FOREGROUND START
  public static final String ANSI_BLACK  = "\u001B[30m";
  public static final String ANSI_RED    = "\u001B[31m";
  public static final String ANSI_GREEN  = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE   = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN   = "\u001B[36m";
  public static final String ANSI_WHITE  = "\u001B[37m";

  public static final String ANSI_BRIGHT_BLACK  = "\u001B[90m";
  public static final String ANSI_BRIGHT_RED    = "\u001B[91m";
  public static final String ANSI_BRIGHT_GREEN  = "\u001B[92m";
  public static final String ANSI_BRIGHT_YELLOW = "\u001B[93m";
  public static final String ANSI_BRIGHT_BLUE   = "\u001B[94m";
  public static final String ANSI_BRIGHT_PURPLE = "\u001B[95m";
  public static final String ANSI_BRIGHT_CYAN   = "\u001B[96m";
  public static final String ANSI_BRIGHT_WHITE  = "\u001B[97m";
  // FOREGROUND STOP
  
  // BACKGROUND START
  public static final String ANSI_BG_BLACK  = "\u001B[40m";
  public static final String ANSI_BG_RED    = "\u001B[41m";
  public static final String ANSI_BG_GREEN  = "\u001B[42m";
  public static final String ANSI_BG_YELLOW = "\u001B[43m";
  public static final String ANSI_BG_BLUE   = "\u001B[44m";
  public static final String ANSI_BG_PURPLE = "\u001B[45m";
  public static final String ANSI_BG_CYAN   = "\u001B[46m";
  public static final String ANSI_BG_WHITE  = "\u001B[47m";

  public static final String ANSI_BRIGHT_BG_BLACK  = "\u001B[100m";
  public static final String ANSI_BRIGHT_BG_RED    = "\u001B[101m";
  public static final String ANSI_BRIGHT_BG_GREEN  = "\u001B[102m";
  public static final String ANSI_BRIGHT_BG_YELLOW = "\u001B[103m";
  public static final String ANSI_BRIGHT_BG_BLUE   = "\u001B[104m";
  public static final String ANSI_BRIGHT_BG_PURPLE = "\u001B[105m";
  public static final String ANSI_BRIGHT_BG_CYAN   = "\u001B[106m";
  public static final String ANSI_BRIGHT_BG_WHITE  = "\u001B[107m";
  // BACKGROUND STOP
  
  
    public static String ReadLine() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
    
    /* COLOR PRINTS */
    
    public static void PrintBlack(String msg)
    {
        System.out.print(ANSI_BLACK + ANSI_BG_CYAN + msg + ANSI_RESET);
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
