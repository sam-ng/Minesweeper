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

  public void printGrid(int x, int y, int choice) {
    MinesweeperBox box = new MinesweeperBox(false, false, false);
    if (choice == 0) {
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
          grid[i][j] = "" + box;
          System.out.print(grid[i][j]);
        }
        System.out.println();
      }
    }
//    if (choice == 1) {
      
      
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