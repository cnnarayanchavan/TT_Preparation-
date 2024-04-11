class Father{
  public void phones(){
    System.out.println("i have a nokia 6600")
  }
}
class Son extendes Father{
  public void phones(){
    System.out.println("i have a nokia blueberry")
  }
}

public class Pillers_Abs{
  public static void main(String[]args){
    Son son = new Son();
    System.out.println(son.phones());
  }
}

