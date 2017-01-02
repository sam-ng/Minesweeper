public class MinesweeperGrid {
  
//  private String[][] grid;
  private int row;
  private int col;
//  private String diff;
  
  public MinesweeperGrid(/*String[][] g,*/int r, int c/*, String d*/) {
//    grid = g;
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
  }
  
  public void setMedium() {
    row = 16;
    col = 16;
  }
  
  public void setHard() {
    row = 16;
    col = 30;
  }

  public String toString() {
/*    if (diff.equals("Easy")) {
      row = 9;
      col = 9;
    }
    if (diff.equals("Medium")) {
      row = 16;
      col = 16;
    }
    if (diff.equals("Hard")) {
      row = 16;
      col = 30;
    }*/
    String[][] grid = new String[row][col];
    MinesweeperBox box = new MinesweeperBox(false, false, false);
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        grid[i][j] = "" + box;
      }
    }
    return "" + grid;
  }
}
    