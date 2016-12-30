import java.util.Scanner;
import java.util.Random;

public class Minesweeper {
  
  public static void createEasyGrid() {
    char[][] grid = new char[5][5];
    generateMines(10, 5, 5);
  }
  
  public static void createMediumGrid() {
    char[][] grid = new char[10][10];
    generateMines(20, 10, 10);
  }
  
  public static void createHardGrid() {
    char[][] grid = new char[15][15];
    generateMines(40, 15, 15);
  }
  
  public static void createImpossibleGrid() {
    char[][] grid = new char[20][20];
    generateMines(80, 20, 20);
  }
  
  public static void createCustomGrid() {
    Scanner ms = new Scanner(System.in);
    System.out.println("Enter the number of rows.");
    int r = ms.nextInt();
    System.out.println("Enter the numbers of columns.");
    int c = ms.nextInt();
    System.out.println("Enter the number of mines.");
    int m = ms.nextInt();
    char[][] grid = new char[c][r];
    generateMines(m, r, c);
  }
  
  public static void generateMines(int totalMines, int row, int column) {
    int mines = 0;
    Random rand = new Random();
    while (mines < totalMines) {
      int mineRow = rand.nextInt(row);
      int mineColumn = rand.nextInt(column);
      if (grid[mineColumn][mineRow] != '*') {
        grid[mineColumn][mineRow] = '*';
        mines++;
      }
    }
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