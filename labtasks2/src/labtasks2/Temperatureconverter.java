package labtasks2;

public class Temperatureconverter {
	 private double ctemp=0.0,ftemp=0.0;
	    void setCelsius(double value){
	     ctemp=value;
	         return;
	    }
	  void setfarenheit(double value){
	     ftemp=value;
	      return;
	  }
	  void tocelsius(){
	    ctemp=(ftemp-32)*5/9;
	     return;
	  }
	   void tofarenheit(){
	    ftemp=(ctemp*9/5)+32;
	     return;
	  }
	  void showtemperature(){
	       System.out.println("temperature in farenheit"+ftemp);
	       System.out.println("temperature in celsius"+ctemp);
	       return;
	  }
}
