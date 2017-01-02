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
  }
  
      Scanner ms = new Scanner(System.in);
    System.out.println("Enter the number of rows.");
    int r = ms.nextInt();
    System.out.println("Enter the numbers of columns.");
    int c = ms.nextInt();
    System.out.println("Enter the number of mines.");
    int m = ms.nextInt();
  */
  
  public static void main(String[] args) {
    Scanner ms = new Scanner(System.in);
    System.out.println("Enter the difficulty level: Easy, Medium, Hard, or Custom.");
    String diff = ms.nextLine();
    MinesweeperGrid grid = new MinesweeperGrid(0, 0);
    while (!(diff.equals("Easy") || diff.equals("Medium") || diff.equals("Hard") || diff.equals("Custom"))) {
      System.out.println("Error! Invalid difficulty level.");
      System.out.println("Enter the difficulty level: Easy, Medium, Hard, or Custom.");
      diff = ms.nextLine();
    }
    if (diff.equals("Easy"))
      grid.setEasy();
    else if (diff.equals("Medium"))
      grid.setMedium();
    else if (diff.equals("Hard"))
      grid.setHard();
/*    else if (diff.equals("Custom"))
      createCustomGrid();*/
//    System.out.println(grid);
    grid.printGrid();
    ms.close();
  }
}