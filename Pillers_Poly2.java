class Father{
  public void phones(){
    System.out.println("i have a nokia 6600");
  }
}
class Son extends Father{
  public void phones(){
    System.out.println("i have a nokia blueberry");
  }
}

public class Pillers_Poly2{
  public static void main(String[]args){
    Son son = new Son();
    son.phones();

  }
}

