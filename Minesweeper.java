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
    if (diff.equals("Easy")) {
      grid.setEasy();
//      grid.getRow();
    }
    else if (diff.equals("Medium")) {
      grid.setMedium();
    }
    else if (diff.equals("Hard")) {
      grid.setHard();

    }
//    grid.getRow();
    Mines mines = new Mines(g, (int)(grid.getArea() * .18));
/*    else if (diff.equals("Custom"))
      createCustomGrid();*/
//    System.out.println(grid);
//    mines.determineMines();
    mines.createMines();
//    mines.generateMines(g, 9, 9);
    grid.printGrid(); //either print works
//    System.out.print(grid);
    ms.close();
  }
}