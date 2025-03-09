package labtasks2;

public class PasswordManager {
	private int password=123;
    void changePassword(int oldpass,int newpass){
         if (oldpass==password){
         password=newpass;
      }
      else
      {
          System.out.println(" incorrect password");
      }
         return;
    }
  void validatePassword(int inputPass){
      if (inputPass==password){
          System.out.println("correct");
      }
      else
      {
          System.out.println(" incorrect");
      }
      return;
  }
}
