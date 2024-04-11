public class Encapsulation{
  public static void main(String[]args){
    BobUser bob = new BobUser();
    bob.Name = "Narayana";
    bob.Branch = "BankofBaroda";
    bob.Amount = 45678;
    bob.accOne();
      
  }
}


class Bank{
  public String Name;
  public String Branch;
  protected int Rank;
  private int Amount;
  
}
class BobUser1 extends Bank {
  public void accOne(){
    System.out.println("I have an account in BOB")
  }
}
