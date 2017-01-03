import java.util.Scanner;
import java.util.Random;

public class Minesweeper {

    /*Scanner ms = new Scanner(System.in);
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
    String[][] g = new String[0][0];
    MinesweeperGrid grid = new MinesweeperGrid(g, 0, 0);
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
    Mines mines = new Mines(
    grid.printGrid();
    ms.close();
  }
}