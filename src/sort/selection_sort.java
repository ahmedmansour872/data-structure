package sort;

public class selection_sort {

	public static void main(String[] args) {
	int x[]= {60,80,5,30,50,20,40,70,10,90};
	
	for(int i=0;i<10;i++)
		System.out.print(x[i]+"   ");
	System.out.println();
	
	for(int i=0;i<10;i++) {
		for(int j=0;j<9;j++) {
			if(x[i]<x[j]) {
				int temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}}}
	for(int i=0;i<10;i++)
		System.out.println(x[i]);
	}
}
