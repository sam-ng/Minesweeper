import java.util.Scanner;
//import java.util.Random;

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
    MinesweeperGrid grid = new MinesweeperGrid(0, 0);
    while (!(diff.equals("Easy") || diff.equals("Medium") || diff.equals("Hard") || diff.equals("Custom"))) {
      System.out.println("Error! Invalid difficulty level.");
      System.out.println("Enter the difficulty level: Easy, Medium, Hard, or Custom.");
      diff = ms.nextLine();
    }
    if (diff.equals("Easy")) {
      System.out.println("All set! This is a 9x9 grid.");
      grid.setEasy();
//      grid.getRow();
    }
    else if (diff.equals("Medium")) {
      System.out.println("All set! This is a 16x16 grid.");
      grid.setMedium();
    }
    else if (diff.equals("Hard")) {
      System.out.println("All set! This is a 16x30 grid.");
      grid.setHard();

    }
//    grid.getRow();
    int amountMines = (int)(grid.getArea() * .18);
    Mines mines = new Mines(grid.getGrid(), amountMines);
/*    else if (diff.equals("Custom"))
      createCustomGrid();*/
//    System.out.println(grid);
//    mines.determineMines();
    boolean[][] mineGrid = mines.createMines();

    //testing mineGrid (should be hidden from user)
/*    int mineCount = 0;
    for (int i = 0; i < mineGrid.length; i++) {
      for (int j = 0; j < mineGrid[0].length; j++) {
        System.out.print(mineGrid[i][j]);
        if (mineGrid[i][j])
          mineCount++;
        }
      System.out.println();
    }
    System.out.println(mineCount);*/
    //testing if mines are actually there
/*    int m = 0;
    for (int i = 0; i < grid.getGrid().length; i++) {
      for (int j = 0; j < grid.getGrid()[0].length; j++) {
        if (grid.getGrid()[i][j].equals("*")) {
          m++;
          System.out.println(i);
          System.out.println(j);
        }
      }
    }*/
    grid.printGrid(0, 0, 0, 0);
    System.out.println("There are " + amountMines + " mines.");
    
        //prompt for input

    int cleared = 0;
    while(cleared != grid.getGrid().length * grid.getGrid()[0].length - amountMines){
      System.out.println("Please enter a row.");
      int x = ms.nextInt();
      while (!(x > -1 && x < grid.getGrid().length)) {
        System.out.println("Invalid row. Please enter a row.");
        x = ms.nextInt();
      }
      System.out.println("Please enter a column.");
      int y = ms.nextInt();
      while (!(y > -1 && y < grid.getGrid()[0].length)) {
        System.out.println("Invalid column. Please enter a column.");
        y = ms.nextInt();
      }
        
      System.out.println("Type in 1 to clear, 2 to flag, and 3 to question mark.");
      int choice = ms.nextInt();
      while (choice != 1 && choice != 2 && choice != 3) {
        System.out.println("Invalid choice. Please enter 1 to clear, 2 to flag, and 3 to question mark.");
        choice = ms.nextInt();
      }
      if (choice == 1){
        /* clear method classname.clear */
        if (mineGrid[x][y]) {
          grid.printGrid(x, y, 4, 0);
          System.out.println("OOPS! You tripped a mine. You lose.");
          System.exit(0);
        }
        else {
          grid.printGrid(x, y, choice, 0/*aroundMines(x, y, mineGrid)*/);
        }
      }
      if (choice == 2){
      /*flag classname.flag */
        grid.printGrid(x, y, choice, 0);
      }
      if (choice == 3){
        //questionmark* classname.questionmark
        grid.printGrid(x, y, choice, 0);
      }
      System.out.println("CONGRATULATIONS! YOU WIN!");
    }
    
    ms.close();
  }
/*      public static int aroundMines(int userR, int userC, boolean[][] mineGrid) {
      int m = 0;
      for (int i = 1; i < mineGrid.length; i++) {
        for (int j = 1; j < mineGrid[0].length; j++) {
          if (userR == 0 && userC == 0) {
            if (mineGrid[userR+1][userC])
              m++;
            if (mineGrid[userR][userC+1])
              m++;
            if (mineGrid[userR+1][userC+1])
              m++;
          }
          if (userR == 8 && userC == 0) {
            if (mineGrid[userR-1][userC])
              m++;
            if (mineGrid[userR-1][userC+1])
              m++;
            if (mineGrid[userR][userC+1])
              m++;
          }
          if (userR == 0 && userC == 8) {
            if (mineGrid[userR][userC-1])
              m++;
            if (mineGrid[userR+1][userC-1])
              m++;
            if (mineGrid[userR+1][userC])
              m++;
          }
          if (userR == 8 && userC == 8) {
            if (mineGrid[userR-1][userC-1])
              m++;
            if (mineGrid[userR][userC-1])
              m++;
            if (mineGrid[userR-1][userC])
              m++;
          }
          if (userR > 0 && userR < 8 && userC == 0) {
            if (mineGrid[userR-1][userC])
              m++;
            if (mineGrid[userR-1][userC+1])
              m++;
            if (mineGrid[userR][userC+1])
              m++;
            if (mineGrid[userR-1][userC])
              m++;
            if (mineGrid[userR-1][userC+1])
              m++;
          }
          if (userR = 0 && userC > 0 && userC < 0) {
            if (mineGrid[userR][userC])
              m++;
            if (mineGrid[userR][userC])
              m++;
            if (mineGrid[userR][userC])
              m++;
            if (mineGrid[userR][userC])
              m++;
            if (mineGrid[userR][userC])
              m++;
        }
      }
      return m;
    }*/
}