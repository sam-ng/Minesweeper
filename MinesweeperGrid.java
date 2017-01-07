public class MinesweeperGrid {
  
  private String[][] grid;
  private int row;
  private int col;
//  private String diff;
  
  public MinesweeperGrid(int r, int c/*, String d*/) {
    row = r;
    col = c;
//    diff = d;
  }
  
/*  public void changeDiff(String d) {
    diff = d;
  }*/
  public void setEasy() {
    row = 9;
    col = 9;
    
    grid = new String[row][col];
    
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        grid[i][j] = "";
      }
    }
  }
  
  public void setMedium() {
    row = 16;
    col = 16;
    
    grid = new String[row][col];
    
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        grid[i][j] = "";
      }
    }
  }
  
  public void setHard() {
    row = 16;
    col = 30;
    
    grid = new String[row][col];
    
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        grid[i][j] = "";
      }
    }
  }
  
/*  public int getRow() {
    return row;
  }*/
  
  public int getArea() {
    return row * col;
  }
  
  public String[][] getGrid() {
    return grid;
  }
  
  public void clearCheck(int i, int j, int mineAround){
    MinesweeperBox box = new MinesweeperBox(false, false, false, false);
    if (mineAround == 0){
      box.appearClear();
      grid[i][j] = "" + box;
      clearCheck(i-1, j-1, mineAround);
      clearCheck(i, j-1, mineAround);
      clearCheck(i+1, j-1, mineAround);
      clearCheck(i-1, j, mineAround);
      clearCheck(i+1, j, mineAround);
      clearCheck(i-1, j+1, mineAround);
      clearCheck(i, j+1, mineAround);
      clearCheck(i+1, j+1, mineAround);
    }
  }

/*  public String toString() {
    String stringGrid = "";
    grid = new String[row][col];
    MinesweeperBox box = new MinesweeperBox(false, false, false);
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        grid[i][j] = "" + box;
        stringGrid += grid[i][j];
      }
      stringGrid += "\n";
    }
    return stringGrid;
  }*/ //either one works

  public void printGrid(int x, int y, int choice, int m) {
    MinesweeperBox box = new MinesweeperBox(false, false, false, false);
    if (choice == 0) {
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
          grid[i][j] = "" + box;
          System.out.print(grid[i][j]);
        }
        System.out.println();
      }
    }
    if (choice == 1) {
      box.disappearQuestion();
      box.disappearFlag();
      clearCheck(x, y, m);
      if (m > 0)
        grid[x][y] = "[" + m + "]";
      else {
        box.appearClear();
        grid[x][y] = "" + box;
      }
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
          System.out.print(grid[i][j]);
        }
        System.out.println();
      }
    }
    if (choice == 2) {
      box.disappearQuestion();
      box.appearFlag();
      grid[x][y] = "" + box;
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {      
          System.out.print(grid[i][j]);
        }
        System.out.println();
      }
    }
    if (choice == 3) {
      box.disappearFlag();
      box.appearQuestion();
      grid[x][y] = "" + box;
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {      
          System.out.print(grid[i][j]);
        }
        System.out.println();
      }
    }
    if (choice == 4) {                     //number of death, the choice in which the user loses
      box.disappearFlag();
      box.disappearQuestion();
      box.appearMine();
      grid[x][y] = "" + box;
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {      
          System.out.print(grid[i][j]);
        }
        System.out.println();
      }
    }
  }
}
/*  
  public void changeBox(int x, int y, int choice) {
    MinesweeperBox box = new MinesweeperBox(false, false, false);
    if (choice == 2) {
      box.disappearQuestion();
      box.appearFlag();
    }
    if (choice == 3) {
      box.disappearFlag();
      box.appearQuestion();
    }
    grid[x][y] = "" + box;
  }
}*/