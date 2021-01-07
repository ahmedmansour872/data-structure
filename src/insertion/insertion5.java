package insertion;

public class insertion5 {

	public static void main(String[] args) {
		  int a[]={2,6,5,7,1,0,8,9,4,11,21,13,17,3,4,15,44,69,55,75};
		  insertion7(a);
		  for (int i=0;i<a.length;i++) 
			  System.out.println(a[i]);
	}
public static void insertion7 (int x[]) {
int key;
for (int i=1;i<x.length;i++) {
	key=x[i];
	for(int j=i-1;j>=0 && x[j]>key;j=j+1-1) {
		x[j+1]=x[j];
		j=j-1;
		x[j+1]=key;
	}}}}
