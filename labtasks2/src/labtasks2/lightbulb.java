package labtasks2;

public class lightbulb {
	private boolean ison;
    void turnon(){
        ison=true;
         return;
    }
  void turnoff(){
      ison=false;
      return;
  }
  void showstatus(){
     if(ison) {
          System.out.println("bulb is on");
     }else {
         System.out.println("bulb is off");
     }
     return;
  }
}
