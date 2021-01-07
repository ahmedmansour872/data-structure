package puble_sort;

public class Buble {
	 public static void main(String[] args) {
         int arr[]={2,6,5,7,1,0,8,9,4,11,21,13,17,3};
         bubblesort( arr);
         for(int y =0 ; y< arr.length;y++)       
                System.out.print(arr[y]+"  ");}
	
  public static void bubblesort(int x[]){
   for(int i=0;i<x.length;i++) {
	   for(int j=1;j<x.length-i;j++) {
		   if(x[j-1]>x[j]) {
			   int temp=x[j-1];
			   x[j-1]=x[j];
			   x[j]=temp;
		   }
	   }
   }
	  
	  /*    for(int i=0;i<x.length;i++) {
    	   for(int j=0;j<x.length-1-i;j++) {
    		   if(x[j]>x[j+1]) {
    		   int temp=x[j];
    		   x[j]=x[j+1];
    		   x[j+1]=temp;
    		   }
    	   }
       }*/
    	   
    	   }}
