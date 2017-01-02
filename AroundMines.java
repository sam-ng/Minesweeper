
public class AroundMines{
  
  public AroundMines(int[][] gr ,){
    super(gr);
  }
  
  public int[][] numberMines(){
    for(int i = 0; i<gr.length ; i++){
      for(int j = 0; j<gr[0].length; j++){
        if(gr[i-1][j] != '*'){
          gr[i][j] += 1;
        }
        else{
        }
        if(gr[i+1][j] != '*'){
          gr[i-1][j-1] += 1;
        }
        else{
        }
        if(gr[i-1][j+1] != '*'){
          gr[i][j] += 1;
        }
        else{
        }
        if(gr[i][j+1] != '*'){
          gr[i][j] += 1;
        }
        else{
        }
        if(gr[i+1][j] != '*'){
          gr[i][j] += 1;
        }
        else{
        }
        if(gr[i-1][j-1] != '*'){
          gr[i][j] += 1;
        }
        else{
        }
        if(gr[i][j-1] != '*'){
          gr[i][j] += 1;
        }
        else{
        }
        if(gr[i+1][j-1] != '*'){
          gr[i][j] += 1;
        }
        else{
        }
      }
    }
  }
}
          
