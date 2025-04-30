package labtask7.interfaces;

public interface calculator {
default double add(int a,int b) {
	return a+b;
}
default double sub(int a,int b) {
	return a-b;
}
default double multi(int a,int b) {
	return a*b;
}
default double div(int a,int b) {
	return a/b;
}
}
