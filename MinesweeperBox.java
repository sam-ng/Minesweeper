public class MinesweeperBox {
  
  private boolean mine;
  private boolean flag;
  private boolean question;
  private boolean clear;
  
  public MinesweeperBox (boolean m, boolean f, boolean q, boolean c) {
    mine = m;
    flag = f;
    question = q;
    clear = c;
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
  
  public void appearClear() {
    clear = true;
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
  
  public void disappearClear() {
    clear = false;
  }
  
  public String toString() {
    if (mine) {
      return "[*]";
    }
    else if (flag) {
      return "[F]";
    }
    else if (question) {
      return "[?]";
    }
    else if (clear) {
      return "[.]";
    }
    else {
      return "[ ]";
    }
  }
}