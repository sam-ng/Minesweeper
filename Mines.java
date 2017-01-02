public class Mines extends MinesweeperGrid{ 
  int amountMines;
  
  public Mines(int am , String gr){
    super(gr);
    am = amountMines;
  }
  
  public int determineMines(){    //we could always just directly call the number of mines in the set diff
    am = (int)(gr.length * gr[0].length * .18);
  }
  
  
  public void createMines(){
    for(int i = 0; i<amountMines ; i++){
      if (gr[(int)(Math.random()*gr.length)][(int)(Math.random()*gr[0].length)] != "*")
        gr[(int)(Math.random()*gr.length)][(int)(Math.random()*gr[0].length)] = "*";
    }
  }
/*
  public void generateMines(int totalMines, int row, int column) {
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
}