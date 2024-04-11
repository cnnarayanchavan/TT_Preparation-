pubcli class Abstraction{
  public static void main(String[]Args){
    
  }
}
abstract class Vehical{
  int numoftires;
  String engineType;
  abstract void views();
  publci void view2(){
    System.out.println("Hey there");
  }
}

class Car extends Vehical{
  public void carName(){
    System.out.println("Hey there i am fourwheeler");
  }
}

class Motorbike extends Vehical{
  public void motorName(){
       System.out.println("Hey there i am towwheeler")
  }
}
