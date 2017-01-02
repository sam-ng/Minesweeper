public class Mines{ 
  int amountMines;
  
  public Mines(int am , int gr){
    super(gr);
    am = amountMines;
  }
  
  public int determineMines(){
    am = gr.length * gr[0].length * .18;
  }
  
  
  public int[][] createMines(){
    for(int i = 0; i<amountMines ; i++){
    gr[Math.random()*gr.length][Math.random()*gr[0].length] = '*';
    }
  }
}