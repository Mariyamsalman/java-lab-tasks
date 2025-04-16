package labtasks6;

public class javaarrays {
void sum() {
	int sum1=0;
	int array[]= {1,2,3,4,5};
	for(int i=0;i<=4;i++) {
		sum1=sum1+array[i];
	}
	System.out.println("this is the sum of five integers:"+sum1);
	return;
}
void maximum() {
	int array[]= {1,2,3,4,5,6};
	int max=array[0];
	for(int i=1;i<=5;i++) {
		if(max<array[i]) {
			max=array[i];
		}
	}
		System.out.println("this is the max of six integers:"+max);
		return;
	}

void reverse() {
	int array[]= {1,2,3,4,5};
	System.out.println("this is the reverse order of array:");
	for(int i=4;i>=0;i--) {
		System.out.println(array[i]);
	}
	return;
}

 void even() {
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("these are the even numbers:");
		for(int i=0;i<=9;i++) {
			if(array[i]%2==0) {
				System.out.println(array[i]);
			}
		}
		return;
 }

}
