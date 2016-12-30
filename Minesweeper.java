import java.util.Scanner;

public class Minesweeper {
  
  public static void createEasyGrid() {
    int[][] grid = new int[5][5];
  }
  
  public static void createMediumGrid() {
    int[][] grid = new int[10][10];
  }
  
  public static void createHardGrid() {
    int[][] grid = new int[15][15];
  }
  
  public static void createImpossibleGrid() {
    int[][] grid = new int[20][20];
  }
  
  public static void createCustomGrid() {
    Scanner ms = new Scanner(System.in);
    System.out.println("Enter the number of rows.");
    int r = ms.nextInt();
    System.out.println("Enter the numbers of columns.");
    int c = ms.nextInt();
    int[][] grid = new int[r][c];
  }
    
  public static void main(String[] args) {
    Scanner ms = new Scanner(System.in);
    System.out.println("Enter the difficulty level: Easy, Medium, Hard, Impossible, or Custom.");
    String diff = ms.nextLine();
    if (diff.equals("Easy"))
      createEasyGrid();
    else if (diff.equals("Medium"))
      createMediumGrid();
    else if (diff.equals("Hard"))
      createHardGrid();
    else if (diff.equals("Impossible"))
      createImpossibleGrid();
    else if (diff.equals("Custom"))
      createCustomGrid();
    else {
      System.out.println("Error! Invalid difficulty level.");
      System.out.println("Enter the difficulty level: Easy, Medium, Hard, Impossible, or Custom.");
      diff = ms.nextLine();
    }
    ms.close();
  }
}