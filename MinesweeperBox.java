public class MinesweeperBox {
  
  private boolean mine;
  private boolean flag;
  private boolean question;
  
  public MinesweeperBox (boolean m, boolean f, boolean q) {
    mine = m;
    flag = f;
    question = q;
  }
  
  public void appearMine() {
    mine = true;
  }
  
  public void appearFlag() {
    flag = true;
  }
  
  public void appearQuestion() {
    question = true;
  }
  
  public void disappearMine() {
    mine = false;
  }
  
  public void disappearFlag() {
    flag = false;
  }
  
  public void disappearQuestion() {
    question = false;
  }
  public String toString() {
    if (mine) {
      return "---" + "\n|*|\n" + "---";
    }
    else if (flag) {
      return "---" + "\n|#|\n" + "---";
    }
    else if (question) {
      return "---" + "\n|?|\n" + "---";
    }
    else {
      return "---" + "\n| |\n" + "---";
    }
  }
}