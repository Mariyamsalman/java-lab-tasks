package labtask7.interfaces;

public interface shape {
default double area1(double l,double w) {
	double area;
area=l*w;
return area;
}
default double area2(double r) {
	double area;
area=2*3.147*r;
return area;
}

}
