public class Mines/* extends MinesweeperGrid*/{ 
  private int amountMines;
  private String[][] gr;
  
  public Mines(String[][] g, /*int r, int c, */int am){
//    super(gr, r, c); I don't think inheritance is applicable here because it uses all of the superclass's args
    gr = g;
    amountMines = am;
  }
  
/*  public void determineMines(int amountMines, r, c) {    //we could always just directly call the number of mines in the set diff
    amountMines = (int)(r * c * .18);                      //amountMines is already instantiated to the constructor arg
  }*/
  
  public void createMines(){
    for(int i = 0; i < amountMines ; i++){
      if (gr[(int)(Math.random() * gr.length)][(int)(Math.random() * gr[0].length)] != "*")
        gr[(int)(Math.random() * gr.length)][(int)(Math.random() * gr[0].length)] = "*";
    }
  }
/*
  public void generateMines() {
    int mines = 0;
    Random rand = new Random();
    while (mines < amountMines) {
      int mineRow = rand.nextInt(r);                   //generates random numbers between 0 inclusive and row exclusive
      int mineColumn = rand.nextInt(c);
      if (grid[mineColumn][mineRow] != '*') {            //replaces corresponding element in grid with mine as long as there is not a mine already present
        grid[mineColumn][mineRow] = '*';
        mines++;
      }
    }
  }*/  
}