public class ClsObj1{
  public static void main(String[]args){

    //object 1.
    Student s1 = new Student();
    s1.Name = "Narayana";
    s1.Age = 21;
    s1.Marks = 8.7;
    s1.Gender = "Male";
    System.out.println("Hey there " +s1.Name + " You are " +s1.Age + "year old");
      
    
  }
}
class Student {
  String Name;
  int Age;
  float Marks;
  String Gender;
}

