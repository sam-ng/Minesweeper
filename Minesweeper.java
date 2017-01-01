import java.util.Scanner;
import java.util.Random;

public class Minesweeper {
  /*
  public static void generateMines(int totalMines, int row, int column) {
    int mines = 0;
    Random rand = new Random();
    while (mines < totalMines) {
      int mineRow = rand.nextInt(row);                   //generates random numbers between 0 inclusive and row exclusive
      int mineColumn = rand.nextInt(column);
      if (grid[mineColumn][mineRow] != '*') {            //replaces corresponding element in grid with mine as long as there is not a mine already present
        grid[mineColumn][mineRow] = '*';
        mines++;
      }
    }
  }*/
  
  public static void main(String[] args) {
    Scanner ms = new Scanner(System.in);
    System.out.println("Enter the difficulty level: Easy, Medium, Hard, or Custom.");
    String diff = ms.nextLine();
    if (diff.equals("Easy"))                               //user choice of difficulty
      createEasyGrid();
    else if (diff.equals("Medium"))
      createMediumGrid();
    else if (diff.equals("Hard"))
      createHardGrid();
    else if (diff.equals("Custom"))
      createCustomGrid();
    else {
      System.out.println("Error! Invalid difficulty level.");
      System.out.println("Enter the difficulty level: Easy, Medium, Hard, or Custom.");
      diff = ms.nextLine();
    }
    ms.close();
  }
}