public class Encapsulation{
  public static void main(String[]args){
    BobUser1 bob = new BobUser1();
    bob.Name = "Narayana";
    bob.Branch = "BankofBaroda";
    //bob.Amount = 45678;   //u can not accecs it directly 
    //here how u can acces the private fields 
    int amount = bob.getAmount();
    bob.setamount(1223);
    System.out.println(amount);
      
  }
}


class Bank{
  public String Name;
  public String Branch;
  protected int Rank;
  private int Amount=234434;

  public int getAmount(){
    return Amount;
  }
  public void setamount(int amt){
    Amount= amt;
  }
  
}
class BobUser1 extends Bank {
  public void accOne(){
    System.out.println("I have an account in BOB");
  }
}
