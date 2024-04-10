public class Constructor {
  public static void main(String[]args){
    Human obj1 = new Human();
    System.out.println(obj1.Age);
    System.out.println(obj1.Eyes);
    System.out.println(obj1.Limbs);
    System.out.println(obj1.Gender);
    //System.out.println(obj1.Limbs + obj1.Eyes + obj1.Age + obj1.Gender);
    // Human obj2 = new Human(2,3,4,"Male");
    // System.out.println("Humans has "+ obj2.Limbs + " Limbs " + obj2.Eyes + " Eyes " + "& " + obj2.Age + " year old "+ "with sex is " + obj2.Gender);

    Human obj3 = new Human();
    
  }
}
class Human{
  int Limbs;
  int Eyes;
  int Age;
  String Gender;

  //1]
  Human(){
    // System.out.println("Constructor is Called");
       //THIS IS NON-PARAMETERIZED CONSTRUDTOR
        this.Limbs = 4;
        this.Eyes = 2;
        this.Age = 6;
        this.Gender = "Mael";
  }   

  //2]
    Human(int Limbs, int Eyes, int Age, String Gender){
      this.Limbs = 4;
      this.Eyes = 2;
      this.Age = 6;
      this.Gender = "Mael";
    }
  
}
