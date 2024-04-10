public class ClsObj1{
  public static void main(String[]args){

    //object 1.
    Student s1 = new Student();
    s1.Name = "Narayana";
    s1.Age = 21;
    //s1.Marks = 8.7;
    s1.Marks = 8.17f;
    s1.Gender = "Male";
    System.out.println("Hey there " +s1.Name + " You are " +s1.Age + " year old");
    System.out.println(s1.Gender);
    System.out.println(s1.Marks);
    
      
    
  }
}
class Student {
  String Name;
  int Age;
  //double Marks;
  float Marks;
  String Gender;
}

