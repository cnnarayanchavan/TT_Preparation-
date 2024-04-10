public class Pillers_Poly{
  public static void main(String[]args){
    Calculator cal1 = new Calculator();
    int ans = cal1.calcOperation(cal1.15,cal2.15);
    System.out.println(ans);
  }
}
class Calculator{
  int Number1;
  int Number2;
  int Number3;

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
  public void calcOperation(String Name){
    System.out.print("Hey there" + Name + "thank you for using Calculator")
  }
  
  
