public class Pillers_Poly{
  public static void main(String[]args){
    Calculator cal1 = new Calculator();
    System.out.println(cal1.calcOperation(34.2,34.3));
  }
}
class Calculator{
  public int calcOperation(int num1, int num2){
    return num1+num2;
  }
  public int calcOperation(int num1, int num2, int num3){
    return (num1*num2)+num3;
  }
  public double calcOperation(double num1, double num2){
      return num1 - num2;
  }
  public float calcOperation(float num1, float num2 ){
    return num1/num2;
  }
}
  
  
