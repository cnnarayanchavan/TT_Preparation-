public class Constructor {
  public static void main(String[]args){
    Human obj1 = new Human();
    System.out.println(obj1);
    
  }
}
class Human{
  int Limbs;
  int Eyes;
  int Age;
  String Gender;

  //1]
  Human(){
    System.out.println("Constructor is Called");   //THIS IS NON-PARAMETERIZED CONSTRUDTOR
  }   

  //2]
    Human(int Limbs, int Eyes, int Age, String Gender){
      this.Limbs = 4;
      this.Eyes = 2;
      this.Age = 6;
      this.Gender = "Male";
    }
  
}
