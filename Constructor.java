public class Constructor {
  public static void main(String[]args){
    Human obj1 = new Human();
  }
}
class Human{
  int Limbs;
  int Eyes;
  int Age;
  String Gender;
  Human(){
    System.out.println("Constructor is Called");   //THIS IS NON-PARAMETERIZED CONSTRUDTOR
  }   
}
