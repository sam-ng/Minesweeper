public class MinesweeperGrid {
  
  private String grid;
  private int row;
  private int col;
  private int diff;
  
  public MinesweeperGrid(char g) {
    grid = g;
  }
  
  public static char createEasyGrid() {
    char[][] grid = new char[5][5];
    return grid;
  }

  public static char createMediumGrid() {
    char[][] grid = new char[10][10];
    return grid;
  }
  
  public static char createHardGrid() {
    char[][] grid = new char[15][15];
    return grid;
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
    return grid;
  }

  public static void printGrid(char grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; i < grid[0].length; i++) {
        String box = "|" + grid[i][j] + "|";
        System.out.print(' -- ');
        System.out.print("\n");
        System.out.print(box.charAt(0));
        System.out.print("\n");
        System.out.print(' -- ');
      }
    }
  }
}
    