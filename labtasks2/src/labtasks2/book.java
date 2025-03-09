package labtasks2;

public class book {
	 private String author="nemrah ahmed";
	    private String title="haalim";
	    private int isissued;
	    void issueBook(){
	    isissued=1;
	    return;
	    }    
	    
	    void returnBook(){
	         isissued=0;
	         return;
	    }
	  void showStatus(){
	      if (isissued==0){
	          System.out.println("available");
	      }
	      else
	      {
	          System.out.println(" not available");
	      }
	      return;
	  }
}
