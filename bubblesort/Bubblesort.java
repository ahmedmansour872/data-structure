 
package bubblesort; 
public class Bubblesort { 
       public static void main(String[] args) {
              int arr[]={2,6,5,7,1,0,8,9,4,11,21,13,17,3};
              System.out.println("before     ");
              for(int y =0 ; y< arr.length;y++)
              {
                     System.out.print(arr[y]+"  ");
              
              } 
              bubblesort( arr);
               System.out.println("\nafter     ");
              for(int y =0 ; y< arr.length;y++)
              {
                     System.out.print(arr[y]+"  ");
              }  
       }
       public static void bubblesort(int arr[]){
           int n=arr.length;
              int item =0 ;
              for(int i =0 ; i<n;i++){
               for(int j = 1 ;j<(n-i);j++){
               if(arr[j-1]>arr[j]){
                   item =arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=item;
                           }
                 }
               }
       }
}
